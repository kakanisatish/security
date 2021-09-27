package com.security.oauth.RestSec;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsServiceimpl implements UserDetailsService {

	@Autowired
	private useri impl;

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {

		Collection<GrantedAuthorityimpl> roles = impl.getRolesByUserName(arg0);
		UserDeatailsimpl user = impl.getUserByUserName(arg0);

		user.setAuthorities(roles);
		user.setPassword("{noop}"+user.getPassword());

		/*
		 * UserDeatailsimpl impl= new UserDeatailsimpl();
		 * impl.setAccountNonExpired(true); impl.setAccountNonLocked(true);
		 * List<GrantedAuthorityimpl> authorities= new
		 * ArrayList<GrantedAuthorityimpl>(); impl.setAuthorities(authorities);
		 * impl.setCredentialsNonExpired(true); impl.setEnabled(true);
		 * impl.setUsername(arg0); impl.setPassword("{noop}chinna");
		 */

		return user;
	}

}
