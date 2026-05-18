package javademo.java18.charset;

import java.nio.charset.Charset;

public class Utf8DefaultDemo {
    public static void main(String[] args) {
        Charset defaultCharset = Charset.defaultCharset();
        System.out.println("Default charset (UTF-8 since Java 18): " + defaultCharset);
        System.out.println("file.encoding: " + System.getProperty("file.encoding"));
    }
}
