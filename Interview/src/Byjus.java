import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Byjus {
    class ListNode {
        Date time;
        boolean in;
        ListNode next;

        public ListNode(Date time, boolean in) {
            this.time = time;
            this.in = in;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Map<String, ListNode> map = new HashMap<>();

    }

    public void getOverlappingSessions(Map<String, ListNode> map, String user1, String user2) {
        if (!map.containsKey(user1) || !map.containsKey(user2)) {
            System.out.println("Not a valid input");
            return;
        }

        ListNode ptr1 = map.get(user1);
        ListNode ptr2 = map.get(user2);
        boolean user1LoggedIn = false;
        boolean user2LoggedIn = false;

        boolean bothUsersLoggedIn = false;

        while (ptr1 != null && ptr2 != null) {
            if (ptr1.time.equals(ptr2.time)) {
                user1LoggedIn = ptr1.in;
                ptr1 = ptr1.next;

                user2LoggedIn = ptr2.in;
                ptr2 = ptr2.next;
            } else if (ptr1.time.before(ptr2.time)) {
                user1LoggedIn = ptr1.in;
                ptr1 = ptr1.next;
            } else {
                user2LoggedIn = ptr2.in;
                ptr2 = ptr2.next;
            }

            if (user1LoggedIn && user2LoggedIn) {
                System.out.println("Both the users are logged in: " + ptr1.time);
                bothUsersLoggedIn = true;
            } else if (bothUsersLoggedIn) {
                System.out.println("Both the users are logged out: " + ptr1.time);
                bothUsersLoggedIn = false;
            }
        }
    }
}
