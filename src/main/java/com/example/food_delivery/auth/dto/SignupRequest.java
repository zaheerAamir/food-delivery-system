package com.example.food_delivery.auth.dto;

import com.example.food_delivery.auth.models.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class SignupRequest {

  @NotBlank(message = "Invalid First Name!")
  @Pattern(regexp = "^[a-zA-Z]+$", message = "First Name must be of type String")
  private String firstName;

  @NotBlank(message = "Invalid Last Name!")
  @Pattern(regexp = "^[a-zA-Z]+$", message = "Last Name must be of type String")
  private String lastName;

  @NotNull(message = "Invalid age!")
  @Min(18)
  private Integer age;

  @NotBlank(message = "Invalid Email!")
  @Email(message = "Property email must be of type Email!")
  private String email;

  @NotBlank(message = "Invalid Password")
  @Size(min = 8, max = 20)
  @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).+$",
      message = "Password must contain uppercase, lowercase, number and special character")
  private String password;

  @NotNull(message = "Invalid role!")
  private Role role;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }


}
