package sda.java.loginproject.db;

import sda.java.loginproject.entity.Users;

public class Main {

    public static void main(String[] args) {
        Users user = new Users();
        user.setUsername("razvanch");
        user.setPassword("salut123");
        user.setRole("Admin");

        UsersDao usersDao = new UsersDao();
        usersDao.insertUser(user);

    }
}
