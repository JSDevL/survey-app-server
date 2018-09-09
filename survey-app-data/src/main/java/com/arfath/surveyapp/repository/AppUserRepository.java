package com.arfath.surveyapp.repository;

import com.arfath.surveyapp.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {}
