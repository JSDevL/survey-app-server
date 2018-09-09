package com.arfath.surveyapp.boot.bootstrap;

import com.arfath.surveyapp.domain.AppUser;
import com.arfath.surveyapp.repository.AppUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private AppUserRepository appUserRepository;

    public DataLoader(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.appUserRepository.save(new AppUser("Arfath", "Ahmed", "arfath.7920@gmail.com"));
    }
}
