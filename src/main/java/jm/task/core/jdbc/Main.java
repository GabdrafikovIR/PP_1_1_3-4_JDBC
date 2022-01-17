package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService us = new UserServiceImpl();
        us.createUsersTable();
        us.saveUser("Iosif", "Stalin", (byte) 74);
        us.saveUser("Georgij", "Zhukov", (byte) 77);
        us.saveUser("Konstantin", "Rokosovskij", (byte) 71);
        us.saveUser("Ivan", "Konev", (byte) 75);
        List<User> users;
        users = us.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        us.cleanUsersTable();
        us.dropUsersTable();
    }
}
