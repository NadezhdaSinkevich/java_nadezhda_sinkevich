package by.academy.java.lesson16BD;

import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException{

        String url ="jdbc:mysql://127.127.126.30:3306/cinema";
        String username = "root";
        String password = "";
        Class.forName("com.mysql.jdbc.Driver");
        try {
            System.out.println("connecction sucsess");
            Connection conn = DriverManager.getConnection(url,username,password);
            //PreparedStatement stmn = conn.prepareStatement("UPDATE users SET login=?, password=? WHERE id=?");
            //PreparedStatement stmn = conn.prepareStatement("SELECT * FROM users");
           PreparedStatement stmn = conn.prepareStatement("INSERT INTO tickets (film,place,price,buy) VALUES(?,?,?,?)");
            //PreparedStatement stmn = conn.prepareStatement("DELETE FROM users WHERE login=? AND password=?");

            stmn.setString(1,"film_2");
            stmn.setString(2,"3");
            stmn.setString(3,"123");
            stmn.setString(4,"false");
            stmn.execute();
//stmn.ge
/*
            String name;
            while (rs.next()){
                name = rs.getString("password");
                System.out.println(name+"\n");
            }
*/


        }catch (SQLException e){
            e.printStackTrace();


        }

    }

}
