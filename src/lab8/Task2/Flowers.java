package lab8.Task2;

public class Flowers {
    protected int countFlowers;
    protected double price;
    protected String namel;

    protected Flowers() {}

    protected Flowers(int countFlowers, double price, String namel) {
        this.countFlowers = countFlowers;
        this.price = price;
        this.namel = namel;
    }

    public int getCountFlowers() {
        return countFlowers;
    }

    public void setCountFlowers(int countFlowers) {
        this.countFlowers = countFlowers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNamel() {
        return namel;
    }

    public void setNamel(String namel) {
        this.namel = namel;
    }

    protected double totalPrice() {
        return countFlowers * price;
    }

    protected String countFlowerOut() {
        return namel + " - " + countFlowers + "(" + price + "$ шт)";
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "countFlowers=" + countFlowers +
                ", price=" + price +
                ", namel='" + namel + '\'' +
                '}';
    }
}

