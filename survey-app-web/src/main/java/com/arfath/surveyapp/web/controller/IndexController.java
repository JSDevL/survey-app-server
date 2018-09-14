package com.arfath.surveyapp.web.controller;

import com.arfath.surveyapp.data.domain.User;
import com.arfath.surveyapp.data.repository.UserRepository;
import com.arfath.surveyapp.web.security.UserDetailsImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class IndexController {

    private UserRepository userRepository;

    public IndexController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/api/")
    public List<User> getAppUsers() {
        return this.userRepository.findAll();
    }

    @GetMapping(path = "/api/user")
    public Object getAppUser(@AuthenticationPrincipal UserDetails userDetails) {
        return userDetails;
    }

}
