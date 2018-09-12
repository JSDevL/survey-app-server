package com.arfath.surveyapp.controller;

import com.arfath.surveyapp.domain.User;
import com.arfath.surveyapp.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    private UserRepository userRepository;

    public IndexController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/")
    public List<User> getAppUsers() {
        return this.userRepository.findAll();
    }

}
