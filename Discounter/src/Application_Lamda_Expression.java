import service.Discounter;

import java.math.BigDecimal;

public class Application_Lamda_Expression {
    public static void main(String[] args) {

        Discounter easterDiscounter = amount -> amount.multiply(BigDecimal.valueOf(0.5));
        Discounter chirsmasDiscounter = amount -> amount.multiply(BigDecimal.valueOf(0.9));

        System.out.println("Discounted Value in Easter " + easterDiscounter.applyDiscount(BigDecimal.valueOf(100)));
        System.out.println("Discounted Value in Chismas " + chirsmasDiscounter.applyDiscount(BigDecimal.valueOf(100)));

    }
}
