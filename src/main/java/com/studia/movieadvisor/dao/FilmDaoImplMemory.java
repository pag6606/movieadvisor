package com.studia.movieadvisor.dao;

import com.studia.movieadvisor.config.AppConfig;
import com.studia.movieadvisor.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public class FilmDaoImplMemory implements  FilmDao {

    public List<Film> peliculas = new ArrayList<>();

    @Autowired
    private AppConfig config;

    public void init(){
        //crear peliculas de memoria
        peliculas = UtilFilmReader.readFile(config.getFile(),config.getSeparator(), config.getListSeparator());
    }

    @Override
    public Film findById(long id) {
        // @formater:off
        Optional<Film> result =
                peliculas.stream().filter(f-> f.getId()==id).findFirst();
        // @formater:on
        return result.orElse(null);
    }

    @Override
    public Collection<Film> findall() {
        return peliculas;
    }
}
