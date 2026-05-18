package javademo.java18.server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class SimpleWebServerDemo {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(0), 0);
        int port = server.getAddress().getPort();

        server.createContext("/", exchange -> {
            byte[] body = "Hello from Java HttpServer".getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, body.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(body);
            }
        });

        server.start();
        System.out.println("Simple web server on http://localhost:" + port + "/");
        System.out.println("Press Ctrl+C to stop.");
    }
}
