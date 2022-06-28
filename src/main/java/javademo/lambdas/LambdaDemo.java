package javademo.lambdas;

public class LambdaDemo {
    public static void wish(Greeting greeting) {
        greeting.greet();
    }

    public static void main(String args[]) {
        Greeting hindiGreeting = new HindiGreeting();
        wish(hindiGreeting);  // Passing an object of HindiGreeting.

        Greeting englishGreeting = new EnglishGreeting();
        wish(englishGreeting);  // Passing an object of EnglishGreeting.

        // We are passing an anonymous class object to the wish method.
        wish(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Ram Ram !");
            }
        });

        // Lambda expression
        wish(() -> System.out.println("Ram Ram !"));
    }
}
