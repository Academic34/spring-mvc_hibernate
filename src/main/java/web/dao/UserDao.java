package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

//    void createUserTable();

//    void dropUserTable();

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void removeUser(int id);

    User getUserById(int id);

}
