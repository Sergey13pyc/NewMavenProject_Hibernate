package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();


        userService.saveUser("Сергей", "Артемов", (byte) 29);
        userService.saveUser("Анастасия", "Щучкина", (byte) 26);
        userService.saveUser("Максим", "Лапшин", (byte) 26);
        userService.saveUser("Азат", "Байгельдин", (byte) 28);

        userService.getAllUsers();

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
    }

