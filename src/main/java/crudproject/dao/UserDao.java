package crudproject.dao;

import crudproject.model.User;
import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void add(User user);

    void delete(User user);

    void edit(User user, int id);

    User getById(int id);
}
