package com.domain.comments.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.domain.comments.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
