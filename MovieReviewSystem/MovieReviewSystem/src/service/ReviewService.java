package service;

import database.ReviewRepository;
import exceptions.DuplicateReviewException;
import exceptions.MovieNotFoundException;
import exceptions.MovieNotReleasedException;
import exceptions.UserNotFoundException;
import model.*;

import java.util.*;

public class ReviewService {
    ReviewRepository reviewRepository;
    UserService userService;
    MovieService movieService;

    public ReviewService(ReviewRepository reviewRepository, UserService userService, MovieService movieService) {
        this.reviewRepository = reviewRepository;
        this.userService = userService;
        this.movieService = movieService;
    }

    public Review addReview(String userName, String movieName, int rating) throws UserNotFoundException, MovieNotReleasedException, MovieNotFoundException, DuplicateReviewException {
        User user = userService.getUser(userName);
        Movie movie = movieService.getMovie(movieName);

        if (MoviewStatus.UNRELEASED.equals(movie.getStatus())) {
            throw new MovieNotReleasedException();
        }

        if (user.getReviews() >= 3) {
            user = userService.upgradeUserToCritics(user.getName());
        }

        if (UserType.CRITICS.equals(user.getUserType())) {
            rating = rating * 2;
        }

        return reviewRepository.addReview(movieName, userName, rating, null);
    }

    public Map<String, Integer> getTopMovieByReviews(int n) {
        Map<String, Integer> answer = new HashMap<>();

        Map<String, Integer> map = reviewRepository.getTopMovieByReviews();

        // Creating priority queue with limit size n
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(n, Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(entry);
            if (pq.size() > n) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            answer.put(entry.getKey(), entry.getValue());
        }

        return answer;
    }

    public Map<String, Double> getTopMovieByAvgReviews(int n) {
        Map<String, Double> answer = new HashMap<>();

        Map<String, Double> map = reviewRepository.getTopMovieByAvgReviews();

        // Creating priority queue with limit size n
        PriorityQueue<Map.Entry<String, Double>> pq = new PriorityQueue<>(n, Map.Entry.comparingByValue());
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            pq.add(entry);
            if (pq.size() > n) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            Map.Entry<String, Double> entry = pq.poll();
            answer.put(entry.getKey(), entry.getValue());
        }

        return answer;
    }

    public Map<String, Integer> getTopMovieByReviewsAndGenre(Genre genre, int n) throws MovieNotFoundException {
        Map<String, Integer> answer = new HashMap<>();

        Map<String, Integer> map = reviewRepository.getTopMovieByReviews();

        // Creating priority queue with limit size n
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(n, Map.Entry.comparingByValue());
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();

            Movie movie = movieService.getMovie(entry.getKey());
            if (movie.getGenres().contains(genre)) {
                pq.add(entry);
                if (pq.size() > n) {
                    pq.poll();
                }
            }
        }

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            answer.put(entry.getKey(), entry.getValue());
        }

        return answer;
    }

    public Map<String, Double> getTopMovieByAvgReviewsAndGenre(Genre genre, int n) throws MovieNotFoundException {
        Map<String, Double> answer = new HashMap<>();

        Map<String, Double> map = reviewRepository.getTopMovieByAvgReviews();

        // Creating priority queue with limit size n
        PriorityQueue<Map.Entry<String, Double>> pq = new PriorityQueue<>(n, Map.Entry.comparingByValue());
        Iterator<Map.Entry<String, Double>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Double> entry = itr.next();

            Movie movie = movieService.getMovie(entry.getKey());
            if (movie.getGenres().contains(genre)) {
                pq.add(entry);
                if (pq.size() > n) {
                    pq.poll();
                }
            }
        }

        while (!pq.isEmpty()) {
            Map.Entry<String, Double> entry = pq.poll();
            answer.put(entry.getKey(), entry.getValue());
        }

        return answer;
    }
}
