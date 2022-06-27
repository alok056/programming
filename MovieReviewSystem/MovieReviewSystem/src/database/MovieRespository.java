package database;

import model.Genre;
import model.Movie;
import model.MoviewStatus;
import model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieRespository {
    Map<String, Movie> movieMap;

    public MovieRespository() {
        movieMap = new HashMap<>();
    }

    public Movie addMovie(String movieName, int releaseYear, List<Genre> genreList) {
        Movie movie = new Movie(movieName, releaseYear, genreList, MoviewStatus.UNRELEASED);
        this.movieMap.put(movieName, movie);

        return movie;
    }

    public Movie getMovie(String movieName) {
        Movie movie = null;
        if (this.movieMap.containsKey(movieName)) {
            movie = this.movieMap.get(movieName);
        }

        return movie;
    }

    public Movie releaseMovie(Movie movie) {
        movie.setStatus(MoviewStatus.RELEASED);

        this.movieMap.put(movie.getName(), movie);

        return movie;
    }
}
