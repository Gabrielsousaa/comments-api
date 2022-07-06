package com.domain.comments.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.domain.comments.domain.Post;
import com.domain.comments.domain.User;
import com.domain.comments.repositories.PostRepository;
import com.domain.comments.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

  @Autowired
  private PostRepository postRepository;

  @Autowired
  private UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

    userRepository.deleteAll();

    User maria = new User(null, "Maria Brown", "maria@gmail.com");
    User alex = new User(null, "Alex Green", "alex@gmail.com");
    User bob = new User(null, "Bob Grey", "bob@gmail.com");

    userRepository.saveAll(Arrays.asList(maria, alex, bob));

    Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu Viagem", "Vou viajar para SP", maria);
    Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje", maria);
    postRepository.saveAll(Arrays.asList(post1, post2));

  }

}
