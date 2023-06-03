package com.login.capg.capgassignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.login.capg.capgassignment.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
