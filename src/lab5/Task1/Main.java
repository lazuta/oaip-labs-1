package lab5.Task1;

public class Main {
    public static void main(String[] args) {
        Hospital h = new Hospital("Больница #3", "Семенова 17", 450340, 12300);
        Sanitary S = new Sanitary("Санитарная 43", "Авроровская 137", 50840, 1300);
        Hеalth he = new Hеalth("Органищаиця здравохранения", "Пушкина 7", 1450340, 1720);
        System.out.println(h.message());
        System.out.println(S.SawingBudget());
        System.out.println(he.NDS());
    }
}
