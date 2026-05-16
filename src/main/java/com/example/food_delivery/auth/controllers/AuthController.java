package com.example.food_delivery.auth.controllers;

import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.food_delivery.auth.dto.SignupRequest;
import com.example.food_delivery.auth.dto.SignupResponse;
import com.example.food_delivery.auth.dto.SuccessResponse;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @PostMapping("/signup")
  public ResponseEntity<SuccessResponse<SignupResponse>> signUp(
      @RequestBody SignupRequest request) {

    UUID uuid = UUID.randomUUID();

    SignupResponse signupResponse = new SignupResponse();
    signupResponse.setId(uuid);
    signupResponse.setFirstName(request.getFirstName());
    signupResponse.setLastName(request.getLastName());
    signupResponse.setEmail(request.getEmail());
    signupResponse.setAge(request.getAge());
    signupResponse.setRole(request.getRole());

    SuccessResponse<SignupResponse> response = new SuccessResponse<SignupResponse>();
    response.setMessage("Customer successfully created!");
    response.setStatus(201);
    response.setData(signupResponse);

    return ResponseEntity.status(response.getStatus()).body(response);

  }

}
