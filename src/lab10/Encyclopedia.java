package lab10;

public class Encyclopedia extends Book{
    public int count;

    public Encyclopedia() {
        super();
    }

    public Encyclopedia(int count, double price, String string) {
        super(count, price, string);
        this.count = count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int countBooks() {
        return this.count;
    }

    @Override
    public String toString() {
        return "Encyclopedia{" +
                "count=" + count +
                '}';
    }
}
