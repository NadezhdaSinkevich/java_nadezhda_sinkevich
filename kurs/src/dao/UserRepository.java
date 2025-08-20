package dao;
import model.User;
import java.util.List;

public interface UserRepository {
    User create (User user);
    User read(String login, String password);
    boolean update(User user, int id);
    boolean delete(int id);
    List<User> readAll();
}
