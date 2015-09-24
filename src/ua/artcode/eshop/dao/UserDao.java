package ua.artcode.eshop.dao;

import ua.artcode.eshop.model.User;

import java.util.List;

/**
 * CRUD - Create, REad, Update, Delete
 */
public interface UserDao {

    // return user with id
    User create(User user);

    User find(int id);
    User find(String email);

    List<User> findAll();

    User update(User user);

    boolean delete(User user);


}
