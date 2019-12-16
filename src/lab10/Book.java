package lab10;

public abstract class Book implements IEditionsInterface {
    private int count;
    private double price;
    private String Name;

    public Book(int count, double price, String string) {
        this.count = count;
        this.price = price;
        this.Name = string;
    }

    public Book() {}

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public int totalPrice() {
        return (int) (this.count * this.price);
    }

    @Override
    public String bookInformation() {
        return this.Name + " - " + this.price + " - " + this.count + ".";
    }

    abstract public int countBooks();

    @Override
    public String toString() {
        return "Book{" +
                "count=" + count +
                ", price=" + price +
                ", Name='" + Name + '\'' +
                '}';
    }
}
