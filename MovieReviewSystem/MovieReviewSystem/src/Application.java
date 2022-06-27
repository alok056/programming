import database.MovieRespository;
import database.ReviewRepository;
import database.UserRepository;
import exceptions.DuplicateReviewException;
import exceptions.MovieNotFoundException;
import exceptions.MovieNotReleasedException;
import exceptions.UserNotFoundException;
import model.Genre;
import service.MovieService;
import service.ReviewService;
import service.UserService;

import java.util.List;

import static model.Genre.ACTION;
import static model.Genre.DRAMA;

public class Application {
    public static void main(String[] args) throws MovieNotFoundException, UserNotFoundException, DuplicateReviewException, MovieNotReleasedException {
        MovieService movieService = new MovieService(new MovieRespository());

        UserService userService = new UserService(new UserRepository());

        ReviewService reviewService = new ReviewService(new ReviewRepository(), userService, movieService);

        userService.addUser("Alok", "alok@gmail.com");
        userService.addUser("Abhi", "abhi@gmail.com");

        movieService.addMovie("Batman", 2022, List.of(ACTION));
        movieService.addMovie("Batman 2", 2022, List.of(ACTION));
        movieService.addMovie("OMG", 2022, List.of(Genre.COMEDY, Genre.DRAMA));
        movieService.addMovie("OMG 2", 2022, List.of(Genre.COMEDY, Genre.DRAMA));
        movieService.addMovie("Thor", 2022, List.of(Genre.COMEDY, ACTION));
        movieService.addMovie("Thor 2", 2022, List.of(Genre.COMEDY, ACTION));
        movieService.addMovie("Thor 3", 2022, List.of(Genre.COMEDY, ACTION));
        movieService.addMovie("Thor 4", 2022, List.of(Genre.COMEDY, ACTION));

        movieService.releaseMovie("Batman");
        movieService.releaseMovie("Batman 2");
        movieService.releaseMovie("OMG");
        movieService.releaseMovie("Thor");
        movieService.releaseMovie("Thor 2");
        movieService.releaseMovie("Thor 3");
        movieService.releaseMovie("Thor 4");

        reviewService.addReview("Alok", "Batman", 9);
        reviewService.addReview("Alok", "Batman 2", 8);
        reviewService.addReview("Alok", "OMG", 7);
        reviewService.addReview("Alok", "Thor", 5);
        reviewService.addReview("Alok", "Thor 2", 7);
        reviewService.addReview("Alok", "Thor 3", 8);
        reviewService.addReview("Alok", "Thor 4", 9);
//        reviewService.addReview("Alok", "OMG 2", 6);



        reviewService.addReview("Abhi", "OMG", 6);
//        reviewService.addReview("Abhi", "OMG", 9);
        reviewService.addReview("Abhi", "Batman", 6);
        reviewService.addReview("Abhi", "Thor", 2);
        reviewService.addReview("Abhi", "Thor 2", 5);
        reviewService.addReview("Abhi", "Thor 3", 6);
        reviewService.addReview("Abhi", "Thor 4", 8);


//        reviewService.addReview("Abhi", "Batman 3", 6);

//        reviewService.addReview("Abhay", "Batman 3", 6);


        System.out.println("getTopMovieByAvgReviews(5): " + reviewService.getTopMovieByAvgReviews(5));
        System.out.println("getTopMovieByAvgReviews(1): " + reviewService.getTopMovieByAvgReviews(1));
        System.out.println("getTopMovieByAvgReviews(2): " + reviewService.getTopMovieByAvgReviews(2));

        System.out.println("getTopMovieByAvgReviewsAndGenre(ACTION, 2): " + reviewService.getTopMovieByAvgReviewsAndGenre(ACTION, 2));
        System.out.println("getTopMovieByAvgReviewsAndGenre(DRAMA, 2): " + reviewService.getTopMovieByAvgReviewsAndGenre(DRAMA, 2));


        System.out.println("getTopMovieByReviews(5): " + reviewService.getTopMovieByReviews(5));
        System.out.println("getTopMovieByReviews(1): " + reviewService.getTopMovieByReviews(1));
        System.out.println("reviewService.getTopMovieByReviews(2): " + reviewService.getTopMovieByReviews(2));

        System.out.println("getTopMovieByReviewsAndGenre(ACTION, 2): " + reviewService.getTopMovieByReviewsAndGenre(ACTION, 2));
        System.out.println("getTopMovieByReviewsAndGenre(DRAMA, 2): " + reviewService.getTopMovieByReviewsAndGenre(DRAMA, 2));
    }
}
