package com.arfath.surveyapp.boot;

import com.arfath.surveyapp.data.domain.Role;
import com.arfath.surveyapp.data.domain.User;
import com.arfath.surveyapp.data.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public DataLoader(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(
                User.builder()
                        .userName("JSDevL")
                        .firstName("Arfath")
                        .lastName("")
                        .password(passwordEncoder.encode("root"))
                        .email("arfath.7920@gmail.com")
                        .roles(new ArrayList<>(Arrays.asList(Role.ADMIN)))
                        .build()
        );
    }
}
