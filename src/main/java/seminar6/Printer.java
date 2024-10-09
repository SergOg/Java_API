package seminar6;

public abstract class Printer extends Goods{
    private boolean double_print; // Двухсторонняя печать
    private boolean color_print; // Цветная печать
    private String size_list;    //Формат печати

    public Printer(double price, String vendor, boolean double_print, boolean color_print, String size_list) {
        super(price, vendor);
        this.double_print = double_print;
        this.color_print = color_print;
        this.size_list = size_list;
    }
}
