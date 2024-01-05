import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    LocalDateTime localDateTimeDois = LocalDateTime.of(2024, 01, 05, 14, 46, 10);

    System.out.println(localDateTime.isAfter(localDateTimeDois));

    System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE));
  }
}
