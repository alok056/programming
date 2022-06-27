/*
 * You have a browser with one tab where you start on the homepage and you can visit another URL,
 * get back in the history number of steps or move forward in the history number of steps.
 */

import java.util.ArrayList;
import java.util.List;

class BrowserHistory {
    private List<String> history;
    private int current;
    private int last;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
    }

    // Visits URL from the current page. It clears up all the forward history.
    public void visit(String url) {
        current++;
        if (current == history.size()) {
            history.add(url);
        } else {
            history.set(current, url);
        }

        last = current;
    }

    // Move steps back in history. If you can only return x steps in the history and steps > x, you
    // will return only x steps. Return the current URL after moving back in history at most steps.
    public String back(int steps) {
        current -= steps;
        if (current < 0) {
            current = 0;
        }

        return history.get(current);
    }

    // Move steps forward in history. If you can only forward x steps in the history and steps > x,
    // you will forward only x steps. Return the current URL after forwarding in history at most
    // steps.
    public String forward(int steps) {
        current += steps;

        if (current > last) {
            current = last;
        }



        return history.get(current);
    }

    public static void main(String[] args) {
        // Test case
        BrowserHistory browserHistory = new BrowserHistory("cashfree.com");
        browserHistory.visit("google.com"); // You are in "cashfree.com". Visit "google.com"
        browserHistory.visit("facebook.com"); // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com"); // You are in "facebook.com". Visit "youtube.com"
        System.out.println(browserHistory.back(1)); // "facebook.com"
        System.out.println(browserHistory.back(1)); // "google.com"
        System.out.println(browserHistory.forward(1)); // "facebook.com"
        browserHistory.visit("linkedin.com"); // You are in "facebook.com". Visit "linkedin.com"
        System.out.println(browserHistory.forward(2)); // "linkedin.com", cannot move forward.
        System.out.println(browserHistory.back(2)); // "google.com"
        System.out.println(browserHistory.back(7)); // "cashfree.com".
    }
}