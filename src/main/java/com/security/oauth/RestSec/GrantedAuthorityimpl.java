package com.security.oauth.RestSec;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
@Entity
public class GrantedAuthorityimpl implements GrantedAuthority {
	@Id
	@GeneratedValue
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String authority;

	@Override
	public String getAuthority() {
		
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
