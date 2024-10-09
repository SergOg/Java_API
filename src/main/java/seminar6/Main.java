package seminar6;

import java.util.*;

//Задание 1. Поиск ноутбуков
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1. Поиск ноутбуков");
        Set<Laptop> goods = new HashSet<>();
        Laptop hp = new Laptop(50000, "HP", 8, 500, "Windows11", "Black");
        Laptop lv = new Laptop(40000, "Lenovo", 16, 512, "Windows11", "Black");
        Laptop mac = new Laptop(150000, "Apple", 32, 1024, "Sonoma", "Silver");
        Laptop ac = new Laptop(30000, "Acer", 8, 500, "Windows10", "Black");
        Laptop mci = new Laptop(50000, "MCI", 16, 1024, "Linux", "Black");
        goods.add(hp);
        goods.add(lv);
        goods.add(mac);
        goods.add(ac);
        goods.add(mci);
        Basket basket = new Basket();
        filterLaptops(goods, Menu.menu());
        basket.showBasket();
    }

    public static void filterLaptops(Set<Laptop> laptops, Map<String, Object> filters) {
        for (Goods laptop : laptops) {
            boolean matches = true;
            if (filters.containsKey("ram") && laptop.getRam() < (int) filters.get("ram")) {
                matches = false;
            }
            if (filters.containsKey("hdd") && laptop.getHdd() < (int) filters.get("hdd")) {
                matches = false;
            }
            if (filters.containsKey("os") && !laptop.getOs().equalsIgnoreCase((String) filters.get("os"))) {
                matches = false;
            }
            if (filters.containsKey("color") && !laptop.getColor().equalsIgnoreCase((String) filters.get("color"))) {
                matches = false;
            }
            if (matches) Basket.addProduct(laptop);
        }
    }
}
