import service.Discounter;
import service.ipml.ChristmasDiscounter;
import service.ipml.EasterDiscounter;

import java.math.BigDecimal;

public class Application_Second {
    public static void main(String[] args) {
        Discounter easterDiscounter = new EasterDiscounter();
        Discounter chrismasDiscounter = new ChristmasDiscounter();

        BigDecimal easter = easterDiscounter
                .applyDiscount(BigDecimal.valueOf(100));
        BigDecimal chrismas = chrismasDiscounter
                .applyDiscount(BigDecimal.valueOf(100));

        System.out.println("Discounted Value in Easter " + easter);

        System.out.println("Discounted Value in Christmas " + chrismas);

    }
}
