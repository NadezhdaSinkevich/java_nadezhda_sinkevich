package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BdConnection {
    public Connection conn;

    public BdConnection() throws ClassNotFoundException {
        String url = "jdbc:mysql://127.127.126.30:3306/cinema";
        String username = "root";
        String password = "";
        Class.forName("com.mysql.jdbc.Driver");
        try {
            //System.out.println("connecction sucsess");
            conn = DriverManager.getConnection(url, username, password);

        } catch (
                SQLException e) {
            e.printStackTrace();
        }

    }
    public BdConnection(Connection conn) {
        this.conn = conn;
    }

    public Connection getConn() {
        return conn;
    }




}
