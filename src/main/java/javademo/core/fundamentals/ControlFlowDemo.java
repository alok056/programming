package javademo.core.fundamentals;

public class ControlFlowDemo {
    public static void main(String[] args) {
        int score = 85;

        /************************************
         *  if-else                         *
         ************************************/

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C or below");
        }

        /************************************
         *  switch                          *
         ************************************/

        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Other day");
        }

        /************************************
         *  for loop                        *
         ************************************/

        System.out.print("for loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        /************************************
         *  while loop                      *
         ************************************/

        int n = 3;
        System.out.print("while loop: ");
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();

        /************************************
         *  do-while loop                   *
         ************************************/

        int x = 1;
        System.out.print("do-while: ");
        do {
            System.out.print(x + " ");
            x++;
        } while (x <= 3);
        System.out.println();

        /************************************
         *  enhanced for-each               *
         ************************************/

        int[] nums = {10, 20, 30};
        System.out.print("for-each: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
