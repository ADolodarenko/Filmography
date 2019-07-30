package org.dav.learn.enterprise.filmography.service;

import org.dav.learn.enterprise.filmography.model.Film;

import java.util.List;

public interface FilmService {
    List<Film> allFilms();
    void add(Film film);
    void delete(Film film);
    void edit(Film film);
    Film getById(int id);
}
