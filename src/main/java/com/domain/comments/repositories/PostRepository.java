package com.domain.comments.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.domain.comments.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
