package com.security.oauth.RestSec;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	@Autowired
	private UserRegistrationService userservice;

	 @GetMapping("test")
	 public String test() {
		   System.out.println("Test Test ...");
		   return "DATATAATT";
	 }
	 
	 @GetMapping("/user/me")
	    public Principal user(Principal principal) {
	        return principal;
	    }
	 @PostMapping("registerUser")
		public ResponseEntity<UserDeatailsimpl> registerUser(@RequestBody UserDeatailsimpl userdetails){
			
			
			userservice.register(userdetails);
			
			
			
			return ResponseEntity.ok(userdetails);
			
		}
	 
	
}
