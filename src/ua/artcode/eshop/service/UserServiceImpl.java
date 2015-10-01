package ua.artcode.eshop.service;

import ua.artcode.eshop.dao.InnerUserDao;
import ua.artcode.eshop.dao.UserDao;
import ua.artcode.eshop.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class UserServiceImpl implements UserService {

    // SOLID - Dependency Invertion
    public UserDao userDao = new InnerUserDao();

    @Override
    public User register(String email, String fullname, String phone, String pass) {
        // generate id

        new User(0,email,fullname,phone,pass);



        return null;
    }

    @Override
    public String login(String email, String pass) {
        return null;
    }

    @Override
    public User showUserInfo(int id) {
        return null;
    }

    @Override
    public void addUserFriend(String accessKey, int id) {

    }

    @Override
    public List<User> showFollowersByUserId(int id) {
        return null;
    }
}
