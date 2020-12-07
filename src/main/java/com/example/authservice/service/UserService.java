package com.example.authservice.service;



import com.example.authservice.model.User;
import com.example.authservice.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
