package lab5.Task2;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {}

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    protected void sizeOn(int x) {
        this.a = this.a * x;
        this.b = this.b * x;
        this.c = this.c * x;
    }

    protected void sizeOut(int x) {
        this.a = this.a / x;
        this.b = this.b / x;
        this.c = this.c / x;
    }

    protected double perimetr() {
        return a + b + c;
    }

    protected double area() {
        return 0.5 * a * c;
    }

    protected String ygol() {
        return "А: 90, B: 60, C:30";
    }
}
