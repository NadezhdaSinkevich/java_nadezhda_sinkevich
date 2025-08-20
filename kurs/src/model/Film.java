package model;
import java.util.ArrayList;
import java.util.List;

public class Film {

    private Integer id;
    private String name;
    private String date_time;
    private List<Ticket> ticketsFilm;


    public Film(String name, String date_time) {

        this.name = name;
        this.date_time = date_time;

    }
    public Film(){

    }

    public Film(Integer id, String name, String date_time,List<Ticket> ticketsFilm) {
        this.id = id;
        this.name = name;
        this.date_time = date_time;
        this.ticketsFilm = ticketsFilm;
    }


    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getDate_time() {return date_time;}
    public void setDate_time(String date_time) {this.date_time = date_time;}

    public List<Ticket> getTicketsFilm() {
        return ticketsFilm;
    }

    public void setTicketsFilm(List<Ticket> ticketsFilm) {
        this.ticketsFilm = ticketsFilm;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date_time='" + date_time + '\'' +
                ", ticketsFilm=" + ticketsFilm +
                '}';
    }
}
