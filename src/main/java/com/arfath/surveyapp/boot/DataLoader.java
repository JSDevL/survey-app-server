package com.arfath.surveyapp.boot;

import com.arfath.surveyapp.data.domain.Role;
import com.arfath.surveyapp.data.domain.User;
import com.arfath.surveyapp.data.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
@Profile("dev")
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
                new User(null,
                        null,
                        null,
                        "JSDevL",
                        "Arfath",
                        "",
                        "arfath.7920@gmail.com",
                        passwordEncoder.encode("root"),
                        new ArrayList<>(Arrays.asList(Role.ADMIN)))
        );
    }
}
