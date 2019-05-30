package com.studia.movieadvisor.dao;

import com.studia.movieadvisor.model.Film;

import java.util.Collection;

public interface FilmDao {

    public Film  findById(long id);
    public Collection<Film> findall();

}
