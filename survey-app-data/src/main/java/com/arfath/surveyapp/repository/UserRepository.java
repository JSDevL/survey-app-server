package com.arfath.surveyapp.repository;

import com.arfath.surveyapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
