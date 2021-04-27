package com.ua.IBank.service;

import com.ua.IBank.model.Role;
import com.ua.IBank.model.User;
import com.ua.IBank.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setPassword(passwordEncoder.encode(user.getConfirmPassword()));
        user.setRole(Role.ROLE_USER);
        userRepo.save(user);
    }

}
