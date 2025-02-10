package com.gymbroz.DBService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gymbroz.DBService.model.User;

public interface UserRepository extends MongoRepository<User, String>{
    
}