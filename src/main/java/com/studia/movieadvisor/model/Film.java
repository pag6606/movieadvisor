package com.studia.movieadvisor.model;

import java.util.List;

public class Film {

    private  long id;
    private String title;
    private String year;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    private List<String> genres;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", generes=" + genres +
                '}';
    }

    public Film() {
    }

    public Film(long id, String title, String year, List<String> generes) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genres = generes;
    }

}
