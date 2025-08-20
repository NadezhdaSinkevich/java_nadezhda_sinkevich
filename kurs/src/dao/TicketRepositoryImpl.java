package dao;

import exeption.MyException;
import model.Ticket;
import connector.BdConnection;
import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TicketRepositoryImpl {



    public Ticket create(Ticket ticket) {

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();

            PreparedStatement stmn = conn.prepareStatement("INSERT INTO tickets (film,place,price,buy) VALUES(?,?,?,?)");

            stmn.setInt(1,ticket.getFilm());
            stmn.setInt(2,ticket.getPlace());
            stmn.setInt(3,ticket.getPrice());
            stmn.setString(4,ticket.getBuy());
            stmn.execute();


        } catch (ClassNotFoundException e) {
            throw new MyException("error create ticket");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return ticket;
    }


    public Ticket read(int id) {

        Ticket ticket = new Ticket();

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();

            PreparedStatement stmn = conn.prepareStatement("SELECT * FROM tickets WHERE id = ?");
            stmn.setInt(1,id);

            ResultSet resultSet = stmn.executeQuery();

            if (resultSet.next()) {

                Integer idBd=resultSet.getInt(1);
                Integer idUserBd=resultSet.getInt(2);
                Integer filmBd=resultSet.getInt(3);
                Integer placeBd=resultSet.getInt(4);
                Integer priceBd=resultSet.getInt(5);
                String buyBd=resultSet.getString(6);

                ticket.setId(idBd);
                ticket.setUser(idUserBd);
                ticket.setFilm(filmBd);
                ticket.setPlace(placeBd);
                ticket.setPrice(priceBd);
                ticket.setBuy(buyBd);

            }else {
                ticket = null;
            }

        }
        catch (ClassNotFoundException e) {
            throw new MyException("error read ticket");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return ticket;
    }

    public Ticket readTicketPlaceFilm(int film, int place) {

        Ticket ticket = new Ticket();

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();

            PreparedStatement stmn = conn.prepareStatement("SELECT * FROM tickets WHERE film = ? AND place = ?");
            stmn.setInt(1,film);
            stmn.setInt(2,place);

            ResultSet resultSet = stmn.executeQuery();

            if (resultSet.next()) {

                Integer idBd=resultSet.getInt(1);
                Integer idUserBd=resultSet.getInt(2);
                Integer filmBd=resultSet.getInt(3);
                Integer placeBd=resultSet.getInt(4);
                Integer priceBd=resultSet.getInt(5);
                String buyBd=resultSet.getString(6);

                ticket.setId(idBd);
                ticket.setUser(idUserBd);
                ticket.setFilm(filmBd);
                ticket.setPlace(placeBd);
                ticket.setPrice(priceBd);
                ticket.setBuy(buyBd);

            }else {
                ticket = null;
            }

        }
        catch (ClassNotFoundException e) {
            throw new MyException("error read ticket");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return ticket;
    }


    public boolean update(int idTicket, int idUser, String flag) {

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();
            PreparedStatement stmn;

            if (idUser == 0){
                // return ticket
                stmn = conn.prepareStatement("UPDATE tickets SET user=DEFAULT, buy=? WHERE id=?");
                stmn.setString(1,flag);
                stmn.setInt(2,idTicket);
            }
            else {
                //buy ticket
                stmn = conn.prepareStatement("UPDATE tickets SET user=?, buy=? WHERE id=?");
                stmn.setInt(1,idUser);
                stmn.setString(2,flag);
                stmn.setInt(3,idTicket);
            }

            stmn.execute();


        } catch (ClassNotFoundException e) {
            throw new MyException("error update ticket");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


        return true;
    }



    public boolean delete(int id) {
        return false;
    }


    public List<Ticket> readAll() {
        List<Ticket> ticketsList = new ArrayList<>();
        int i=0;

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tickets");

            while(resultSet.next()){

                Integer idTicketBd = resultSet.getInt(1);;
                Integer id_userBd = resultSet.getInt(2); ;
                Integer filmBd = resultSet.getInt(3);;
                Integer placeBd = resultSet.getInt(4);;
                Integer priceBd = resultSet.getInt(5);;
                String buyBd = resultSet.getString(6);;



                Ticket ticket = new Ticket(idTicketBd,id_userBd,filmBd,placeBd,priceBd,buyBd);
                ticketsList.add(ticket);
            }

        } catch (ClassNotFoundException e) {
            throw new MyException("error read ticket");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return ticketsList;
    }

    public List<Ticket> readTicketInUser(int idUser) {
        List<Ticket> ticketsList = new ArrayList<>();
        int i=0;

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();


            PreparedStatement stmn = conn.prepareStatement("SELECT * FROM tickets WHERE user = ?");
            stmn.setInt(1,idUser);
            ResultSet resultSet = stmn.executeQuery();



            while(resultSet.next()){

                Integer idTicketBd = resultSet.getInt(1);
                Integer id_userBd = resultSet.getInt(2);
                Integer filmBd = resultSet.getInt(3);
                Integer placeBd = resultSet.getInt(4);
                Integer priceBd = resultSet.getInt(5);
                String buyBd = resultSet.getString(6);



                Ticket ticket = new Ticket(idTicketBd,id_userBd,filmBd,placeBd,priceBd,buyBd);
                ticketsList.add(ticket);
            }

        } catch (ClassNotFoundException e) {
            throw new MyException("error read ticket");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return ticketsList;
    }

    public List<Ticket> readTicketInFilm(int idFilm){
        List<Ticket> ticketsList = new ArrayList<>();
        int i=0;

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();


            PreparedStatement stmn = conn.prepareStatement("SELECT * FROM tickets WHERE film = ?");
            stmn.setInt(1,idFilm);
            ResultSet resultSet = stmn.executeQuery();



            while(resultSet.next()){

                Integer idTicketBd = resultSet.getInt(1);;
                Integer id_userBd = resultSet.getInt(2); ;
                Integer filmBd = resultSet.getInt(3);;
                Integer placeBd = resultSet.getInt(4);;
                Integer priceBd = resultSet.getInt(5);;
                String buyBd = resultSet.getString(6);;



                Ticket ticket = new Ticket(idTicketBd,id_userBd,filmBd,placeBd,priceBd,buyBd);
                ticketsList.add(ticket);
            }

        } catch (ClassNotFoundException e) {
            throw new MyException("error read ticket");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return ticketsList;
    }

    public List<Ticket> readTicketToBuy(int idFilm){
        List<Ticket> ticketsList = new ArrayList<>();
        int i=0;

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();


            PreparedStatement stmn = conn.prepareStatement("SELECT * FROM tickets WHERE film = ? AND buy = ?");
            stmn.setInt(1,idFilm);
            stmn.setString(2,"false");
            ResultSet resultSet = stmn.executeQuery();



            while(resultSet.next()){

                Integer idTicketBd = resultSet.getInt(1);;
                Integer id_userBd = resultSet.getInt(2); ;
                Integer filmBd = resultSet.getInt(3);;
                Integer placeBd = resultSet.getInt(4);;
                Integer priceBd = resultSet.getInt(5);;
                String buyBd = resultSet.getString(6);;



                Ticket ticket = new Ticket(idTicketBd,id_userBd,filmBd,placeBd,priceBd,buyBd);
                ticketsList.add(ticket);
            }

        } catch (ClassNotFoundException e) {
            throw new MyException("error read ticket");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return ticketsList;
    }
}
