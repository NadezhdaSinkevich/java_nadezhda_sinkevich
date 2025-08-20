package dao;

import exeption.MyException;
import model.Film;
import model.Ticket;
import connector.BdConnection;
import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmRepositoryImpl implements FilmRepository{

    @Override
    public Film create(Film film) {

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();

            PreparedStatement stmn = conn.prepareStatement("INSERT INTO films (name,date) VALUES(?,?)");

            stmn.setString(1,film.getName());
            stmn.setString(2,film.getDate_time());
            stmn.execute();


        } catch (ClassNotFoundException e) {
            throw new MyException("error create film");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return film;

    }

    @Override
    public Film read(Integer id) {
        Film film = new Film();

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();

            PreparedStatement stmn = conn.prepareStatement("SELECT * FROM films WHERE id = ?");
            stmn.setInt(1,id);

            ResultSet resultSet = stmn.executeQuery();

            if (resultSet.next()) {

                Integer idBd = resultSet.getInt(1);
                String nameBd = resultSet.getString(2);
                String date_timeBd = resultSet.getString(3);

                film.setId(idBd);
                film.setName(nameBd);
                film.setDate_time(date_timeBd);

            }else {
                film = null;
            }

        }
        catch (ClassNotFoundException e) {
            throw new MyException("error read film");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return film;
    }

    public Film readNameDate(String nameFilm, String dateFilm ) {
        Film film = new Film();

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();

            PreparedStatement stmn = conn.prepareStatement("SELECT * FROM films WHERE name = ? AND date = ?");
            stmn.setString(1, nameFilm);
            stmn.setString(2,dateFilm);

            ResultSet resultSet = stmn.executeQuery();

            if (resultSet.next()) {

                Integer idBd = resultSet.getInt(1);
                String nameBd = resultSet.getString(2);
                String date_timeBd = resultSet.getString(3);

                film.setId(idBd);
                film.setName(nameBd);
                film.setDate_time(date_timeBd);

            } else {
                film = null;
            }

        } catch (ClassNotFoundException e) {
            throw new MyException("error read film");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return film;
    }

    @Override
    public boolean update(Film film, int id) {
        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();
            PreparedStatement stmn;

            stmn = conn.prepareStatement("UPDATE films SET name=?, date=? WHERE id=?");
            stmn.setString(1,film.getName());
            stmn.setString(2,film.getDate_time());
            stmn.setInt(3,id);

            stmn.execute();


        } catch (ClassNotFoundException e) {
            throw new MyException("error update film");
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

            PreparedStatement stmn = conn.prepareStatement("DELETE FROM films WHERE id=?");
            stmn.setInt(1,id);

            stmn.execute();


        } catch (ClassNotFoundException e) {
            throw new MyException("error delete film");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public List<Film> readAll() {
        List<Film> filmsList = new ArrayList<>();
        int i=0;

        try {

            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();


            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Films");

            while(resultSet.next()){

                Integer idFilmBd = resultSet.getInt(1);
                String nameFilmBd = resultSet.getString(2);
                String dateFilmBd = resultSet.getString(3);

                Film filmBd = new Film(idFilmBd,nameFilmBd,dateFilmBd,putTicket(nameFilmBd));

                filmsList.add(filmBd);
            }

        } catch (ClassNotFoundException e) {
            throw new MyException("error read film");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return filmsList;
    }

    public List<Ticket> putTicket(String nameFilm){

        List<Ticket> ticketFilm= new ArrayList<>();

        try {
            BdConnection bdConnection = new BdConnection();
            Connection conn = bdConnection.getConn();

            Statement statement = conn.createStatement();

            PreparedStatement stmn = conn.prepareStatement("SELECT * FROM tickets WHERE film = ?");
            stmn.setString(1,nameFilm);

            ResultSet resultSet = stmn.executeQuery();



            while (resultSet.next()) {
                Ticket ticket = new Ticket();

                Integer id=resultSet.getInt(1);
                Integer id_user=resultSet.getInt(2);
                Integer film=resultSet.getInt(3);
                Integer place=resultSet.getInt(4);
                Integer price=resultSet.getInt(5);
                String buy=resultSet.getString(6);

                ticket.setId(id);
                ticket.setUser(id_user);
                ticket.setFilm(film);
                ticket.setPlace(place);
                ticket.setPrice(price);
                ticket.setBuy(buy);

                ticketFilm.add(ticket);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return ticketFilm;
    }
}
