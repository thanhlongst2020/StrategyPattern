import service.Discounter;

import java.math.BigDecimal;

public class Application_Anonymous_Inner_Type {
    public static void main(String[] args) {
        Discounter easterDiscounter = new Discounter() {
            @Override
            public BigDecimal applyDiscount(BigDecimal amount) {
                return amount.multiply(BigDecimal.valueOf(0.5));
            }
        };

        BigDecimal easter = easterDiscounter
                .applyDiscount(BigDecimal.valueOf(100));

        System.out.println("Discounted Value in Easter " + easter);
    }
}
