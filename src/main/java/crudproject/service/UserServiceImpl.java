package crudproject.service;

import crudproject.dao.UserDao;
import crudproject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers()  {
        return userDao.getAllUsers();
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(userDao.getById(id));
    }

    @Transactional
    @Override
    public void edit(User user, int id) {
        userDao.edit(user, id);
    }

    @Transactional
    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }
}
