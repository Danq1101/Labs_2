package org.example.dao;

import org.example.models.Auto;
import org.example.models.User;

import java.util.List;

public interface UserDAO {

    User findById(int id);

    void save (User user);

    void update(User user);

    void delete(User user);

    Auto findAutoById(int id);

    List<User> findAll();


}
