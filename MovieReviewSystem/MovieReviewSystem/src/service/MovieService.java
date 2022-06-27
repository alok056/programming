package service;

import database.MovieRespository;
import exceptions.MovieNotFoundException;
import exceptions.UserNotFoundException;
import model.Genre;
import model.Movie;
import model.MoviewStatus;
import model.User;

import java.util.List;

public class MovieService {
    MovieRespository movieRespository;

    public MovieService(MovieRespository movieRespository) {
        this.movieRespository = movieRespository;
    }

    public Movie addMovie(String movieName, int releaseYear, List<Genre> genres) {
        return this.movieRespository.addMovie(movieName, releaseYear, genres);
    }

    public Movie getMovie(String name) throws MovieNotFoundException {
        Movie movie = this.movieRespository.getMovie(name);
        if (movie == null) {
            throw new MovieNotFoundException();
        }

        return movie;
    }

    public Movie releaseMovie(String movieName) throws MovieNotFoundException {
        Movie movie = this.movieRespository.getMovie(movieName);

        if (movie == null) {
            throw new MovieNotFoundException();
        }

        return this.movieRespository.releaseMovie(movie);
    }
}
