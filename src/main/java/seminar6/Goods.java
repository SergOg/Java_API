package seminar6;

public abstract class Goods {
    protected double price; //Цена
    protected String vendor;    //Производитель

    public Goods(double price, String vendor) {
        this.price = price;
        this.vendor = vendor;
    }

    public String getGoodType() {
        return getClass().getSimpleName();
    }

    public abstract int getRam();

    public abstract int getHdd();

    public abstract String getOs();

    public abstract String getColor();
}
