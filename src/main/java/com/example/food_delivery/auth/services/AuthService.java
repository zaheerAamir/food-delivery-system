package com.example.food_delivery.auth.services;

import java.util.*;
import org.springframework.stereotype.Service;
import com.example.food_delivery.auth.dto.SignupRequest;
import com.example.food_delivery.auth.dto.SignupResponse;
import com.example.food_delivery.auth.utils.NameUtility;

@Service
public class AuthService {

  public SignupResponse signUpService(SignupRequest body) {
    UUID uuid = UUID.randomUUID();

    String[] names = {body.getFirstName(), body.getLastName()};

    String[] sanitizeName = NameUtility.sanitizeName(names);

    SignupResponse signupResponse = new SignupResponse();
    signupResponse.setId(uuid);
    signupResponse.setFirstName(sanitizeName[0]);
    signupResponse.setLastName(sanitizeName[1]);
    signupResponse.setEmail(body.getEmail());
    signupResponse.setAge(body.getAge());
    signupResponse.setRole(body.getRole());

    return signupResponse;

  }

}
