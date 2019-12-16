package lab8.Task2;

public class Main {
    static Flower f[] = new Flower[2];
    public static void main(String[] args) {
        f[0] =  new Flower(10, 2.5, "Роза");
        f[1] =  new Flower(16, 2.9, "Ромашка");



        double sum = 0;
        for(int i = 0; i <= f.length - 1; i++) {
            System.out.println(f[i].countFlowerOut());
            sum += f[i].totalPrice();
        }
        System.out.println("Общая сумма: " + sum);
    }
}
