package com.security.oauth.RestSec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsServiceimpl userdetailsservice;

	
	  @Override protected void configure(AuthenticationManagerBuilder auth) throws
	  Exception { 
		  /*auth.inMemoryAuthentication().withUser("a")
	  .password("{noop}p").roles("admin");*/
		  auth.userDetailsService( userdetailsservice);
	  
	  }
	  @Override
	    public void configure(WebSecurity web) throws Exception {
	        web
	                .ignoring()
	                .antMatchers("/registerUser","/v2/api-docs", "/configuration/ui",  "/webjars/*");

	  }
	 
	 
	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	/*
	 * @Bean public PasswordEncoder passwordEncoder(){ PasswordEncoder encoder = new
	 * BCryptPasswordEncoder(); return encoder; }
	 */
}
