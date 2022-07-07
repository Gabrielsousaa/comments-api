package com.domain.comments.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.comments.domain.Post;
import com.domain.comments.repositories.PostRepository;
import com.domain.comments.services.exception.ObjectNotFoundException;

@Service
public class PostService {

  @Autowired
  private PostRepository repo;

  public Post findById(String id) {

    Optional<Post> obj = repo.findById(id);
    return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
  }

}
