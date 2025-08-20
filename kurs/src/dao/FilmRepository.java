package dao;
import model.Film;

import java.util.List;

public interface FilmRepository {
    Film create(Film film);
    Film read(Integer id);
    boolean update(Film film, int id);
    boolean delete(int id);
    List<Film> readAll();
}
