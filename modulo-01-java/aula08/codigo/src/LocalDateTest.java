import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateTest {
  public static void main(String[] args) {
    Locale localeBrasil = new Locale("pt", "BR");

    LocalDate localDate = LocalDate.of(2023, Month.DECEMBER, 6);
    System.out.println(localDate.getDayOfYear());
    DayOfWeek dia = localDate.getDayOfWeek();
    System.out.println(dia);
    System.out.println(dia.getDisplayName(TextStyle.FULL, localeBrasil));

    String data = "2023-11-10";

    LocalDate localDateDois = LocalDate.parse(data);

    System.out.println(localDateDois);

    System.out.println(localDateDois.minusDays(10));
    System.out.println(localDateDois.minusMonths(1));
    System.out.println(localDateDois.minusYears(3));

    System.out.println(localDate.isAfter(localDateDois));
    System.out.println(localDate.isBefore(localDateDois));
    System.out.println(localDate.isLeapYear());
    System.out.println(LocalDate.now().isLeapYear()); // retorna se é ano bissexto

    System.out.println(localDateDois.compareTo(localDate));
  }
}
