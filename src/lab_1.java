import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class lab_1 {
    public static void main(String[] args) {
        String nameTheme = "Star Wars";
        byte numOfFilms = 9;
        short numOfBooks = 1300;
        int firstCashFees = 775498007;
        float lenghtOfBlade = 10.6299F;
        boolean truthFact = true;
        char [] namesOfPerson = {'j','e','d','i'};
        double numsPersonOfKotusant = 1250 * Math.pow(10,9) ;

       /* System.out.println("My theme is " + nameTheme + " universe. A total of " + numOfFilms + " films were made. " +
                "Was also written " + numOfBooks + " books. The first film on franchise to ern " + firstCashFees + " dollars. " +
                "In this world the most strong people is " + namesOfPerson[0] +namesOfPerson[1] + namesOfPerson[2] +
                namesOfPerson[3] + ". They are use light blade, it`s lenght is "+ lenghtOfBlade + " inch" +
                ". The main planet in Respublic is Korusant " + "and there are " + numsPersonOfKotusant + " people lives on it." +
                " All facts in this text is " + truthFact + ".");*/

        List<BigDecimal> bigDecimals = new ArrayList<>(Arrays.asList(
                new BigDecimal(12),
                new BigDecimal(12)
        ));

        bigDecimals.stream().map(Objects::requireNonNull)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
    sdfsdf
}
