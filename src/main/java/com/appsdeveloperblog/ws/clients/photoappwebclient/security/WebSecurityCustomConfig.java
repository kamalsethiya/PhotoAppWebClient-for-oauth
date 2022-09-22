package com.appsdeveloperblog.ws.clients.photoappwebclient.security;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;


//
////@Configuration
//public class WebSecurityCustomConfig {
//
////	@Bean
////	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
////		return http.build();
////	}
//}

//IMP: IMP: Spring oauth client uses session to store the initial auth request (response type = code & state = something ) so that in second request it can compare the 
//state request parameter to prevent CSRF attack.  Currently we can disbale session because Unfortunately there is no out of the box implementation from spring yet which 
//does not use session to store initial request, there is an open issue to get another repository added https://github.com/spring-projects/spring-security/issues/6374 
//Basically you need to create a custom AuthorizationRequestRepository that stores and retrieves the authorization request somehow. 
//You could use a non session cookie to store the auth request and use the repository to retrieve it from there, or a database or some custom in memory solution. You can add it.
//Altrernate solution is to use redis cache to make our service stateless in case multiple instances are running - refer : https://spring.io/projects/spring-session
//(Spring Session makes it trivial to support clustered sessions without being tied to an application container specific solution. We can use Redis , JBDC and Hazelcast
//- https://docs.spring.io/spring-session/reference/guides/boot-redis.html)

//> https://stackoverflow.com/questions/64518586/spring-boot-login-using-facebook-throws-authorization-request-not-found (use cookie to store initial auth request - 
//refer a sample implementation here; 
//https://github.com/naturalprogrammer/spring-lemon/blob/1.0.0.M4/spring-lemon-jpa/src/main/java/com/naturalprogrammer/spring/lemon/security/HttpCookieOAuth2AuthorizationRequestRepository.java)
//> https://dzone.com/articles/spring-security-5-oauth-20-login-and-signup-in-sta
//> https://github.com/spring-projects/spring-security/issues/7889

	
//@EnableWebSecurity
//public class WebSecurityCustomConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//    	http
//            .authorizeRequests(authorizeRequests ->
//                authorizeRequests
//                    .anyRequest().authenticated()
//            )
//            .oauth2Login(withDefaults());
//    }
//}