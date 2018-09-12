package com.arfath.surveyapp.boot.bootstrap;

import com.arfath.surveyapp.domain.User;
import com.arfath.surveyapp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Arfath", "Ahmed", "arfath.7920@gmail.com"));
    }
}
