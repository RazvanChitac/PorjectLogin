package db;
import db.Dbinitializer;
import sda.java.loginproject.entity.Users;

public class UsersDao extends Dbinitializer {

    public void insertUser (Users user) {
        openSessionAndTransaction();
        session.persist(user);
        user.setUsername("razvanchitac");
        closeSessionAndTransaction();
    }

    public Users findUser(String username) {
        openSessionAndTransaction();
        Users user = session.find(Users.class, username);
        System.out.println(user);
        closeSessionAndTransaction();
        return user;
    }

    public void updateUser (Users user) {
        openSessionAndTransaction();
        session.update(user);
        closeSessionAndTransaction();
    }

}
