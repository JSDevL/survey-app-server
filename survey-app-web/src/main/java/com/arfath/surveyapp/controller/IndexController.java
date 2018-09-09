package com.arfath.surveyapp.controller;

import com.arfath.surveyapp.domain.AppUser;
import com.arfath.surveyapp.repository.AppUserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {

    private AppUserRepository appUserRepository;

    public IndexController(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @GetMapping(path = "/")
    public List<AppUser> getAppUsers() {
        return this.appUserRepository.findAll();
    }

}
