package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class UserDaoImp implements UserDao {


    List<User> listUsers = Arrays.asList(
            new User(1, "name1", "lastName1", 1980),
            new User(2, "name2", "lastName2", 1990),
            new User(3, "name3", "lastName3", 2000));


    @Override
    public List<User> getAllUsers() {
        return listUsers;
    }

    @Override
    public void addUser(User user) {
        listUsers.add(user);
    }

    @Override
    public void changeUser(User user) {

    }

    @Override
    public void removeUser(int id) {
        listUsers.remove(listUsers.stream().filter(user -> user.getId() == id).findFirst().get());
    }
}
