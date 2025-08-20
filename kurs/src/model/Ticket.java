package model;

public class Ticket {
    Integer id;
    Integer id_user;
    Integer film;
    Integer place;
    Integer price;
    String buy;

    public Ticket( Integer id_user, Integer film, Integer place, Integer price, String buy) {
        this.id_user = id_user;
        this.film = film;
        this.place = place;
        this.price = price;
        this.buy = buy;
    }

    public Ticket( Integer film, Integer place, Integer price, String buy) {
        this.film = film;
        this.place = place;
        this.price = price;
        this.buy = buy;
    }
    public Ticket(Integer id, Integer id_user, Integer film, Integer place, Integer price, String buy) {
        this.id = id;
        this.id_user = id_user;
        this.film = film;
        this.place = place;
        this.price = price;
        this.buy = buy;
    }
    public Ticket(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser() {
        return id_user;
    }

    public void setUser(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getFilm() {
        return film;
    }

    public void setFilm(Integer film) {
        this.film = film;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", id_user=" + id_user +
                ", film=" + film +
                ", place=" + place +
                ", price=" + price +
                ", buy=" + buy +
                '}';
    }
}
