package com.vaibhavi.secureapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vaibhavi.secureapi.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}