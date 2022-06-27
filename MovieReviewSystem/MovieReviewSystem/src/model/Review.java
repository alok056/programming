package model;

import java.util.List;

public class Review {
    String userName;
    int reviewScore;
    List<String> comments;

    public Review(String userName, int reviewScore, List<String> comments) {
        this.reviewScore = reviewScore;
        this.comments = comments;
        this.userName = userName;
    }

    public Review(int reviewScore, List<String> comments) {
        this.reviewScore = reviewScore;
        this.comments = comments;
        this.userName = userName;
    }

    public int getReview() {
        return reviewScore;
    }

    public void setReview(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }
}
