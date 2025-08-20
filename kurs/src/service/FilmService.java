package service;

import dao.FilmRepository;
import dao.FilmRepositoryImpl;
import model.Film;

import java.util.List;

public class FilmService {
    private FilmRepositoryImpl filmRepository;

    public FilmService(FilmRepositoryImpl filmRepository) {
        this.filmRepository = filmRepository;
    }


    public Film create(Film film) {

        if (readNameDate(film.getName(),film.getDate_time()) == null){
            return filmRepository.create(film);
        }
        else {
            return null;
        }
    }


    public Film read(Integer id) {
        return filmRepository.read(id);
    }

    public Film readNameDate(String nameFilm, String dateFilm){
        return filmRepository.readNameDate(nameFilm, dateFilm);
    }

    public boolean update(Film film, int id) {

        if (filmRepository.read(id) != null ){

            if (readNameDate(film.getName(),film.getDate_time()) == null){
                filmRepository.update(film,id);
                return true;
            }
            else {
                System.out.println("such film exist");
                return false;
            }
        }
        else {
            System.out.println("film not exist");
            return false;
        }
    }


    public boolean delete(int id) {

        if(read(id) != null){

            filmRepository.delete(id);
            return true;
        }
        else {
            return false;
        }
    }

    public List<Film> readAll() {
        return filmRepository.readAll();
    }
}
