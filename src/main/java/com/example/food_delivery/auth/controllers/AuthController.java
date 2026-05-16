package com.example.food_delivery.auth.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.food_delivery.auth.dto.SignupRequest;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @PostMapping("/signup")
  public ResponseEntity<String> signUp(@RequestBody SignupRequest request) {
    System.out.println(request);
    return ResponseEntity.ok("User signed up successfully!");

  }

}
