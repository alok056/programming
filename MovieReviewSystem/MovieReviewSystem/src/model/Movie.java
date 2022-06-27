package model;

import java.util.List;

public class Movie {
    String name;
    int releaseYear;
    MoviewStatus moviewStatus;
    List<Genre> genres;

    public Movie(String name, int releaseYear, List<Genre> genres, MoviewStatus moviewStatus) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genres = genres;
        this.moviewStatus = moviewStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public MoviewStatus getStatus() {
        return moviewStatus;
    }

    public void setStatus(MoviewStatus moviewStatus) {
        this.moviewStatus = moviewStatus;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}
