package com.br.viniciusalexandre.helpdesk.api.service;

import org.springframework.data.domain.Page;

import com.br.viniciusalexandre.helpdesk.api.entity.User;

public interface UserService {
	
	
	User findByEmail (String email);
	User createOrUpdate (User user);
	User findById(String id);
	void delete (String id);
	Page<User> FindAll (int page, int count);

	
	
	

}
