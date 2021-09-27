package com.security.oauth.RestSec;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface useri extends JpaRepository<UserDeatailsimpl,Integer> {
	
	
	@Query("select a from UserDeatailsimpl u join u.authorities a where u.username=?1")
	public Collection<GrantedAuthorityimpl> getRolesByUserName(String userName);
	
	 @Query("from UserDeatailsimpl u where  u.username=?1")
	 public UserDeatailsimpl getUserByUserName(String userName);

}
