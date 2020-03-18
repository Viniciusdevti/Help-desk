package com.br.viniciusalexandre.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.viniciusalexandre.helpdesk.api.entity.User;

public interface UserRepository  extends MongoRepository<User, String>{
	
	
	User findByEmail( String email);


	

}
