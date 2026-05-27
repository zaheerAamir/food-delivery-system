package com.example.food_delivery.auth.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.food_delivery.auth.models.Users;

@Repository
public interface AuthRepository extends JpaRepository<Users, UUID> {

}
