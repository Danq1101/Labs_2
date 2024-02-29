package org.example.services;

import org.example.dao.UserDAO;
import org.example.dao.UserDaoImpl;
import org.example.models.Auto;
import org.example.models.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserDAO usersDao = new UserDaoImpl();

    public User findUser(int id) {
        return usersDao.findById(id);
    }
    public void saveUser(User user) {
        usersDao.save(user);
    }
    public void deleteUser(User user) {
        usersDao.delete(user);
    }
    public void updateUser(User user) {
        usersDao.update(user);
    }
    public List<User> findAllUsers() {
        return usersDao.findAll();
    }
    public Auto findAutoById(int id) {
        return usersDao.findAutoById(id);
    }

}
