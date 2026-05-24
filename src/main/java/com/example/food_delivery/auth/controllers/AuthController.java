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
import com.example.food_delivery.auth.services.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

  private final AuthService authService;

  public AuthController(AuthService authService) {
    this.authService = authService;
  }

  @PostMapping("/signup")
  public ResponseEntity<SuccessResponse<SignupResponse>> signUpController(
      @RequestBody SignupRequest request) {

    SignupResponse signupResponse = authService.signUpService(request);

    SuccessResponse<SignupResponse> response = new SuccessResponse<SignupResponse>();
    response.setMessage("Customer successfully created!");
    response.setStatus(201);
    response.setData(signupResponse);

    return ResponseEntity.status(response.getStatus()).body(response);

  }

}
