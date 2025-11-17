package com.vaibhavi.secureapi.controller;

import org.springframework.web.bind.annotation.*;
import com.vaibhavi.secureapi.model.AppUser;           
import com.vaibhavi.secureapi.repository.AppUserRepository;

@RestController
@RequestMapping("/api/users")
public class AppUserController {
    private final AppUserRepository repository;

    public AppUserController(AppUserRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public AppUser create(@RequestBody AppUser user) {
        return repository.save(user);
    }
}