package org.dav.learn.enterprise.filmography.service;

import org.dav.learn.enterprise.filmography.dao.FilmDAO;
import org.dav.learn.enterprise.filmography.dao.FilmDAOImpl;
import org.dav.learn.enterprise.filmography.model.Film;

import java.util.List;

public class FilmServiceImpl implements FilmService {
    private FilmDAO filmDAO = new FilmDAOImpl();

    @Override
    public List<Film> allFilms() {
        return filmDAO.allFilms();
    }

    @Override
    public void add(Film film) {
        filmDAO.add(film);
    }

    @Override
    public void delete(Film film) {
        filmDAO.delete(film);
    }

    @Override
    public void edit(Film film) {
        filmDAO.edit(film);
    }

    @Override
    public Film getById(int id) {
        return filmDAO.getById(id);
    }
}
