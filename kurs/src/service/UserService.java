package service;

import dao.UserRepository;
import dao.UserRepositoryImpl;
import model.User;

import java.util.List;

public class UserService  {
private UserRepositoryImpl userRepository;

    public UserService(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user) {

        User userExtra = userRepository.readLogin(user.getLogin());

        if(userExtra == null){
            return userRepository.create(user);
        }
        else {
            return null;
        }

    }

    public User read(String login, String password) {
        return userRepository.read(login,password);
    }

    public User readId(int id){
        return userRepository.readId(id);
    }

    public String roleUser(String login, String password){

        User user = read(login,password);
        String role = null;

        if (user != null)
        {
            role = user.getLevel();
        }
        return role;
    }

    public boolean update(User user, int id) {

        if (userRepository.readLogin(user.getLogin()) != null && !userRepository.readLogin(user.getLogin()).getLevel().equals("admin")){

            userRepository.update(user,id);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean delete(int id) {

        if (readId(id) != null) {

            if (readId(id).getLevel().equals("user") || readId(id).getLevel().equals("manager")){

                userRepository.delete(id);
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public List<User> readAll() {
        return userRepository.readAll();
    }
}
