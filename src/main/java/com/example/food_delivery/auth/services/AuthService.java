package com.example.food_delivery.auth.services;

import java.util.*;
import org.springframework.stereotype.Service;
import com.example.food_delivery.auth.dto.SignupRequest;
import com.example.food_delivery.auth.dto.SignupResponse;
import com.example.food_delivery.auth.models.Users;
import com.example.food_delivery.auth.repositories.AuthRepository;

@Service
public class AuthService {

  private final AuthRepository authRepository;

  public AuthService(AuthRepository authRepository) {
    this.authRepository = authRepository;
  }

  public SignupResponse signUpService(SignupRequest body) {
    UUID uuid = UUID.randomUUID();

    Users user = new Users();
    user.setId(uuid);
    user.setFirstName(body.getFirstName());
    user.setLastName(body.getLastName());
    user.setPassword(body.getPassword());
    user.setEmail(body.getEmail());
    user.setAge(body.getAge());
    user.setRole(body.getRole());

    Users savedUser = authRepository.save(user);

    SignupResponse signupResponse = new SignupResponse();
    signupResponse.setId(savedUser.getId());
    signupResponse.setFirstName(savedUser.getFirstName());
    signupResponse.setLastName(savedUser.getLastName());
    signupResponse.setEmail(savedUser.getEmail());
    signupResponse.setAge(savedUser.getAge());
    signupResponse.setRole(savedUser.getRole());

    return signupResponse;

  }

}
