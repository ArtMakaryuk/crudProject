package crudproject.service;

import crudproject.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void add(User user);

    void delete(int id);

    void edit(User user);

    User getById(int id);
}
