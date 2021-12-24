package com.laundry.service;

import com.laundry.domain.User;
import com.laundry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User getUsuarios(){
        return (User) repository.findAll();
    }

}
