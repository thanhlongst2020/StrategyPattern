import service.Discounter;
import service.Discounter_All_In_One;
import service.ipml.ChristmasDiscounter;
import service.ipml.EasterDiscounter;

import java.math.BigDecimal;

public class Application_All_In_One {
    public static void main(String[] args) {

        Discounter discounter = Discounter_All_In_One.newYearDiscounter();

        System.out.println(discounter.applyDiscount(BigDecimal.valueOf(100)));

    }
}
