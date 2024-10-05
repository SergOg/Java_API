package seminar5;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private HashMap<String, Integer> basket = new HashMap<>();

    public void addProduct(String product, Integer quantity) {
// Введите свое решение ниже
        if (basket.containsKey(product)) {
            int q = basket.get(product) + quantity;
            basket.put(product, q);
        } else basket.put(product, quantity);
    }

    public void removeProduct(String product) {
// Введите свое решение ниже
        if (basket.containsKey(product)) {
            basket.remove(product);
        }
    }

    public void updateQuantity(String product, Integer quantity) {
// Введите свое решение ниже
        if (basket.containsKey(product)) {
            basket.put(product, quantity);
        }
    }

    public int checkProduct(String product) {
// Введите свое решение ниже
        return basket.getOrDefault(product, 0);
    }

    public void showBasket() {
// Введите свое решение ниже
        for (Map.Entry<String, Integer> entry : basket.entrySet()) {
            System.out.println(entry);
        }
    }
}
