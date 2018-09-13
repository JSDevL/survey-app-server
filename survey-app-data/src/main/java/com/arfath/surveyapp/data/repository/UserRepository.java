package com.arfath.surveyapp.data.repository;

import com.arfath.surveyapp.data.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
