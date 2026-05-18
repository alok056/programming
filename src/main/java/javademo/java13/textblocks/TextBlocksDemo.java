package javademo.java13.textblocks;

public class TextBlocksDemo {
    public static void main(String[] args) {
        String json = """
                {
                  "name": "Alok",
                  "role": "developer"
                }
                """;

        String query = """
                SELECT id, name
                FROM users
                WHERE active = true
                """;

        System.out.println("JSON text block:\n" + json);
        System.out.println("SQL text block:\n" + query);
    }
}
