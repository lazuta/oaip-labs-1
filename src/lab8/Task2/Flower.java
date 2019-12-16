package lab8.Task2;

public class Flower extends Flowers{
    protected int countFlowers;
    protected double price;
    protected String namel;

    public Flower() {}

    public Flower(int countFlowers, double price, String namel) {
        super(countFlowers, price, namel);
        this.countFlowers = countFlowers;
        this.price = price;
        this.namel = namel;
    }

    @Override
    public int getCountFlowers() {
        return countFlowers;
    }

    @Override
    public void setCountFlowers(int countFlowers) {
        this.countFlowers = countFlowers;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getNamel() {
        return namel;
    }

    @Override
    public void setNamel(String namel) {
        this.namel = namel;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "countFlowers=" + countFlowers +
                ", price=" + price +
                ", namel='" + namel + '\'' +
                '}';
    }
}
