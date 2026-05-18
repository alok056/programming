package javademo.java15.textblocks;

public class TextBlocksFinalDemo {
    public static void main(String[] args) {
        String html = """
                <html>
                  <body><p>Hello</p></body>
                </html>
                """;
        System.out.println("Text blocks (final in Java 15):\n" + html);
    }
}
