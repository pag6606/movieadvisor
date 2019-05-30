package com.studia.movieadvisor.service;

import com.studia.movieadvisor.dao.FilmDao;
import com.studia.movieadvisor.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmService {
    @Autowired
    FilmDao filmDao;

    @Autowired
    FilmQueryService filmQueryService;


    public Collection<String> findAllGenres() {
        List<String> result = null;

        // @formatter: off
        result = filmDao.findall()
                .stream()
                .map(film -> film.getGenres())
                .flatMap(lista -> lista.stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        // @formatter: on
        return result;
    }

    public Collection<Film> findAll() {
        return filmDao.findall();
    }

    public Collection<Film> findAnyGenre(String... genres){
        return filmQueryService.anyGenre(genres).exec();
    }

    public Collection<Film> findByAllGenres(String... genres){
        return filmQueryService.allGenres(genres).exec();
    }

    public Collection<Film> findByYear(String year){
        return filmQueryService.year(year).exec();
    }

    public Collection<Film> findBetweenYears(String from, String to){
        return filmQueryService.betweenYears(from,to).exec();
    }

    public Collection<Film> findByTitleContains(String title){
        return filmQueryService.titleContains(title).exec();
    }

}
