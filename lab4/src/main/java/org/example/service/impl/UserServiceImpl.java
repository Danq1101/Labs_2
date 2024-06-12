package org.example.service.impl;

import org.example.model.User;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public User findUser(String email){
        return userRepository.findUserByEmail(email);
    }

    @Override
    public void updateUser(String email, String phoneNumber, String city){
        User user = userRepository.findUserByEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setCity(city);
    }

    public User findUserById(Integer id){
        return userRepository.findUserById(id);
    }

}
