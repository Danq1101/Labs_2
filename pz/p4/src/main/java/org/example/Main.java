package org.example;

import org.example.models.Auto;
import org.example.models.User;
import org.example.services.UserService;
import org.example.services.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
        User user = new User("Toleyko Kirill",20);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.saveUser(user);
    }
}