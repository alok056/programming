package model;

public class User extends Account {
    private UserType userType;
    private int reviews;

    public User(String name, String email) {
        super(name, email);
        this.reviews = 0;
        this.userType = UserType.VIEWER;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
}
