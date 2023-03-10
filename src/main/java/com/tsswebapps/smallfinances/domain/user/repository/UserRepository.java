package com.tsswebapps.smallfinances.domain.user.repository;

import com.tsswebapps.smallfinances.domain.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
