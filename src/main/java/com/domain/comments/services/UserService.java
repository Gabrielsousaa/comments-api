package com.domain.comments.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.comments.domain.User;
import com.domain.comments.dto.UserDTO;
import com.domain.comments.repositories.UserRepository;
import com.domain.comments.services.exception.ObjectNotFoundException;

@Service
public class UserService {

  @Autowired
  private UserRepository repo;

  public List<User> findAll() {
    return repo.findAll();
  }

  public User findById(String id) {

    Optional<User> obj = repo.findById(id);
    return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
  }

  public User create(User user) {
    return repo.insert(user);
  }

  public User fromDTO(UserDTO objDTO) {
    return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
  }

  public void delete(String id) {
    findById(id);
    repo.deleteById(id);
  }
}
