package model;

public class User {
    private static Integer idNext=0;
    private Integer id;
    private String login;
    private String password;
    private String level;

    public User(String login, String password, String level) {
        this.id = idNext++;
        this.login = login;
        this.password = password;
        this.level = level;
    }

    public User() {

    }

    public User(Integer id, String login, String password, String level) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.level = level;
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}
    public String getLogin() {return login;}
    public void setLogin(String login) {this.login = login;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getLevel() {return level;}
    public void setLevel(String level) {this.level = level;}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
