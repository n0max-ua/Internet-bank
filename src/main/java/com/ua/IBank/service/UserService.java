package com.ua.IBank.service;

import com.ua.IBank.model.Role;
import com.ua.IBank.model.User;
import com.ua.IBank.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setPassword(bCryptPasswordEncoder.encode(user.getConfirmPassword()));
        user.setRole(Role.ROLE_USER);
        userRepo.save(user);
    }

}
