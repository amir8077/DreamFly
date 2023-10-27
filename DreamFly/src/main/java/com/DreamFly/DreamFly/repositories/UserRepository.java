package com.DreamFly.DreamFly.repositories;
import com.DreamFly.DreamFly.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods here if needed
}

