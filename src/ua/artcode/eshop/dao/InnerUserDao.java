package ua.artcode.eshop.dao;

import ua.artcode.eshop.db.AppDb;
import ua.artcode.eshop.model.User;

import java.util.List;

/**
 * Created by serhii on 24.09.15.
 */
public class InnerUserDao implements UserDao {

    private AppDb appDb;

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User find(int id) {
        return null;
    }

    @Override
    public User find(String email) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }
}
