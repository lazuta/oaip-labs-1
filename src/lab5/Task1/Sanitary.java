package lab5.Task1;

public class Sanitary {
    protected String nameOrg;
    protected String adress;
    protected double budget;
    protected int countPeople;

    public Sanitary() {}

    public Sanitary(String nameOrg, String adress, double budget, int countPeople) {
        this.nameOrg = nameOrg;
        this.adress = adress;
        this.budget = budget;
        this.countPeople = countPeople;
    }

    public String getNameOrg() {
        return nameOrg;
    }

    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    protected double SawingBudget() {
        return budget / countPeople;
    }

    protected double NDS() {
        return budget - (budget / countPeople) * 0.2;
    }

    protected String message() {
        return "Адрес: " + adress;
    }

    @Override
    public String toString() {
        return "Hеalth{" +
                "nameOrg='" + nameOrg + '\'' +
                ", adress='" + adress + '\'' +
                ", budget=" + budget +
                ", countPeople=" + countPeople +
                '}';
    }
}
