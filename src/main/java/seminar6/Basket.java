package seminar6;

import java.util.HashSet;
import java.util.Set;

public class Basket {
    static Set<Goods> basket = new HashSet<>();

    public static void addProduct(Goods product) {
        basket.add(product);
    }

    public void showBasket() {
        for (Goods e : basket) {
            System.out.println(e);
        }
    }
}
