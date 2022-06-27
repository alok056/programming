package database;

import exceptions.DuplicateReviewException;
import model.Genre;
import model.Movie;
import model.Review;
import model.User;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ReviewRepository {
    Map<String, Map<String, Review>> moviewReviewMap;

    public ReviewRepository() {
        moviewReviewMap = new HashMap<>();
    }

    public Review addReview(String movieName, String userName, int reviewScore, List<String> comments) throws DuplicateReviewException {
        Review review = getReviewByUserAndMovie(userName, movieName);

        if (review != null) {
            throw new DuplicateReviewException();
        }

        Map<String, Review> reviewMap = null;

        if (moviewReviewMap.containsKey(movieName)) {
            reviewMap = this.moviewReviewMap.get(movieName);
        } else {
            reviewMap = new HashMap<>();
        }

        reviewMap.put(userName, new Review(reviewScore, comments));

        this.moviewReviewMap.put(movieName, reviewMap);

        return review;
    }

    public Review getReviewByUserAndMovie(String userName, String movieName) {
        Map<String, Review> reviewMap;
        if (moviewReviewMap.containsKey(movieName)) {
            reviewMap = this.moviewReviewMap.get(movieName);
        } else {
            return null;
        }

        Review review = null;

        if (reviewMap.containsKey(userName)) {
            review = reviewMap.get(userName);
        }

        return review;
    }

    public Map<String, Double> getAllMovieByAvgReviews() {
        Map<String, Double> reviewMap = new HashMap<>();

        Iterator<Map.Entry<String, Map<String, Review>>> it = moviewReviewMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Map<String, Review>> map = it.next();
            int reviewCount = 0;
            int reviewScore = 0;
            Iterator<Map.Entry<String, Review>> itr = map.getValue().entrySet().iterator();
            while (itr.hasNext()) {
                Map.Entry<String, Review> reviewEntry = itr.next();
                reviewCount++;
                reviewScore += reviewEntry.getValue().getReviewScore();
            }

            reviewMap.put(map.getKey(), (double) reviewScore/reviewCount);
        }

        return reviewMap;
    }

    public Map<String, Double> getTopMovieByAvgReviews() {
        Map<String, Double> reviewMap = getAllMovieByAvgReviews();

        return reviewMap;
    }

    public Map<String, Integer> getAllMovieByReviews() {
        Map<String, Integer> reviewMap = new HashMap<>();

        Iterator<Map.Entry<String, Map<String, Review>>> it = moviewReviewMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Map<String, Review>> map = it.next();
            int reviewScore = 0;
            Iterator<Map.Entry<String, Review>> itr = map.getValue().entrySet().iterator();
            while (itr.hasNext()) {
                Map.Entry<String, Review> reviewEntry = itr.next();
                reviewScore += reviewEntry.getValue().getReviewScore();
            }

            reviewMap.put(map.getKey(), reviewScore);
        }

        return reviewMap;
    }

    public Map<String, Integer> getTopMovieByReviews() {
        Map<String, Integer> reviewMap = getAllMovieByReviews();

        return reviewMap;
    }

    public Map<String, Review> getAllMovieReviews2(String movieName) {
        Map<String, Review> reviewMap = null;
        if (moviewReviewMap.containsKey(movieName)) {
            reviewMap = this.moviewReviewMap.get(movieName);
        }

        return reviewMap;
    }
}
