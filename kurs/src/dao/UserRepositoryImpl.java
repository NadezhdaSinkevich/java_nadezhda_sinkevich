package dao;

import exeption.MyException;
import model.User;
import connector.BdConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{



    @Override
    public User create(User user) {

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();

            PreparedStatement stmn = conn.prepareStatement("INSERT INTO users (login,password,level) VALUES(?,?,?)");

            stmn.setString(1,user.getLogin());
            stmn.setString(2,user.getPassword());
            stmn.setString(3,user.getLevel());
            stmn.execute();


        } catch (ClassNotFoundException e) {
            throw new MyException("error create user");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public User read(String login, String password) {

        User user = new User();

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();

            PreparedStatement stmn = conn.prepareStatement("SELECT * FROM Users WHERE login = ? AND password = ?");
            stmn.setString(1,login);
            stmn.setString(2,password);

            ResultSet resultSet = stmn.executeQuery();

            if (resultSet.next()) {

                Integer idUserBd = resultSet.getInt(1);
                String loginUserBd = resultSet.getString(2);
                String passwordUserBd = resultSet.getString(3);
                String levelUserBd = resultSet.getString(4);

                user.setId(idUserBd);
                user.setLogin(loginUserBd);
                user.setPassword(passwordUserBd);
                user.setLevel(levelUserBd);

            }else {
                user = null;
            }

        }
        catch (ClassNotFoundException e) {
            throw new MyException("error read user");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public User readId (int id){
        User user = new User();

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();

            PreparedStatement stmn = conn.prepareStatement("SELECT * FROM Users WHERE id=?");
            stmn.setInt(1,id);

            ResultSet resultSet = stmn.executeQuery();

            if (resultSet.next()) {

                Integer idUserBd = resultSet.getInt(1);
                String loginUserBd = resultSet.getString(2);
                String passwordUserBd = resultSet.getString(3);
                String levelUserBd = resultSet.getString(4);

                user.setId(idUserBd);
                user.setLogin(loginUserBd);
                user.setPassword(passwordUserBd);
                user.setLevel(levelUserBd);

            }else {
                user = null;
            }

        }
        catch (ClassNotFoundException e) {
            throw new MyException("error read user");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public User readLogin(String login) {

        User user = new User();

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();

            PreparedStatement stmn = conn.prepareStatement("SELECT * FROM Users WHERE login = ? ");
            stmn.setString(1,login);

            ResultSet resultSet = stmn.executeQuery();

            if (resultSet.next()) {

                Integer idUserBd = resultSet.getInt(1);
                String loginUserBd = resultSet.getString(2);
                String passwordUserBd = resultSet.getString(3);
                String levelUserBd = resultSet.getString(4);

                user.setId(idUserBd);
                user.setLogin(loginUserBd);
                user.setPassword(passwordUserBd);
                user.setLevel(levelUserBd);

            }else {
                user = null;
            }

        }
        catch (ClassNotFoundException e) {
            throw new MyException("error read user");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }


    @Override
    public boolean update(User user, int id) {
        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();
            PreparedStatement stmn;

            stmn = conn.prepareStatement("UPDATE users SET login=?, password=?, level=? WHERE id=?");
            stmn.setString(1,user.getLogin());
            stmn.setString(2,user.getPassword());
            stmn.setString(3,user.getLevel());
            stmn.setInt(4,id);

            stmn.execute();


        } catch (ClassNotFoundException e) {
            throw new MyException("error update user");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public boolean delete(int id) {

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();

            PreparedStatement stmn = conn.prepareStatement("DELETE FROM users WHERE id=?");
            stmn.setInt(1,id);

            stmn.execute();


        } catch (ClassNotFoundException e) {
            throw new MyException("error delete user");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


        return true;
    }

    @Override
    public List<User> readAll() {

        List<User> usersList = new ArrayList<>();
        int i=0;

        try {

            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Users");

            while(resultSet.next()){

                Integer idUserBd = resultSet.getInt(1);
                String loginUserBd = resultSet.getString(2);
                String passwordUserBd = resultSet.getString(3);
                String levelUserBd = resultSet.getString(4);

                User userBd = new User(idUserBd,loginUserBd,passwordUserBd,levelUserBd);

                usersList.add(userBd);
            }

        } catch (ClassNotFoundException e) {
            throw new MyException("error read user");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return usersList;
    }
}
