package javademo.java8.datetime;

import java.time.*;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 5, 17);
        LocalTime time = LocalTime.of(10, 30);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        ZonedDateTime zoned = dateTime.atZone(ZoneId.of("Asia/Kolkata"));
        Duration duration = Duration.between(time, time.plusHours(2));

        System.out.println("LocalDate: " + date);
        System.out.println("ZonedDateTime: " + zoned);
        System.out.println("Duration hours: " + duration.toHours());
        System.out.println("Instant now: " + Instant.now());
    }
}
