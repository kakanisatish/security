package com.security.oauth.RestSec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {
	@Autowired
	private useri user;
	
	
	public void register(UserDeatailsimpl userdetails) {
		user.save(userdetails);
		
	}

}
