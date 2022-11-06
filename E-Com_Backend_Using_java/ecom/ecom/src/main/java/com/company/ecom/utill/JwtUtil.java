package com.company.ecom.utill;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	
	private static final String SECRET_KEY="Umakant_Tukaram+Shinde";
	private static final int TOKEN_VALIDITY=3600*5;
	public String getUserNameFromToken(String token) {
		return getClaimFromToken(token,Claims::getSubject);
		
	}
private <T> T getClaimFromToken(String token,Function<Claims, T>claimResolver) {
final Claims claims= 	getAllClaimsFromToken(token);
return  claimResolver.apply(claims);}


private  Claims getAllClaimsFromToken(String token) {
	return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();}



public boolean validateToken(String token,UserDetails userDetails) {
	String username=getUserNameFromToken(token);
	return(username.equals(userDetails.getUsername()) && !isTokenExpired(token));
}
private boolean isTokenExpired(String token) {
final  Date  expirationDate=	getExpirationsDateFromToken( token);
return expirationDate.before(new Date(0));
}

public Date getExpirationsDateFromToken(String token) {
	return  (Date) getClaimFromToken(token, Claims::getExpiration);
	
}
public String generateToken(UserDetails userDetails) {

    Map<String, Object> claims = new HashMap<>();

    return Jwts.builder()
            .setClaims(claims)
            .setSubject(userDetails.getUsername())
            .setIssuedAt(new Date(System.currentTimeMillis()))
            .setExpiration(new Date(System.currentTimeMillis() + TOKEN_VALIDITY * 1000))
            .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
            .compact();
}
}

