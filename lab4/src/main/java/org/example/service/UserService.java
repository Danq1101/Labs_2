package org.example.service;

import org.example.model.User;

public interface UserService {

    void createUser(User user);

    User findUser(String email);

    void updateUser(String email, String phoneNumber, String city);

    User findUserById(Integer id);

}
