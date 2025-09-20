package com.example.userapi.service;

import com.example.userapi.entity.User;
import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> listUsers();
}
