import service.Discounter;
import service.ipml.ChristmasDiscounter;
import service.ipml.EasterDiscounter;

import java.math.BigDecimal;

public class Application_First {
    public static void main(String[] args) {
        Discounter easterDiscounter = new EasterDiscounter();
        Discounter christmasDiscounter = new ChristmasDiscounter();

        BigDecimal discountedValueEaster = easterDiscounter
                .applyDiscount(BigDecimal.valueOf(100));
        BigDecimal discountedValueChristmas = christmasDiscounter
                .applyDiscount(BigDecimal.valueOf(100));

        System.out.println("Discounted Value in Easter " + discountedValueEaster);
        System.out.println("Discounted Value in Christmas " + discountedValueChristmas);
    }
}
