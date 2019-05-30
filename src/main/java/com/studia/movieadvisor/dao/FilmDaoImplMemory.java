package com.studia.movieadvisor.dao;

import com.studia.movieadvisor.model.Film;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class FilmDaoImplMemory implements  FilmDao {

    public List<Film> peliculas = new ArrayList<>();


    public void init(){
        //crear peliculas de memoria
        //peliculas = UtilFilmReader.readFile(path,separator, listseparator);
    }

    @Override
    public Film findById(long id) {
        return null;
    }

    @Override
    public Collection<Film> findall() {
        return null;
    }
}
