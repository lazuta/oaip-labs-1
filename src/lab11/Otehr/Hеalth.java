package lab11.Otehr;

import lab11.Intterface.iHealth;

public class Hеalth implements iHealth {
    protected String nameOrg;
    protected String adress;
    protected double budget;
    protected int countPeople;

    public Hеalth() {}

    public Hеalth(String nameOrg, String adress, double budget, int countPeople) {
        this.nameOrg = nameOrg;
        this.adress = adress;
        this.budget = budget;
        this.countPeople = countPeople;
    }

    public String getNameOrg() {
        return nameOrg;
    }

    public String setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
        return nameOrg;
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

    public double NDS() {
        return budget - (budget / countPeople) * 0.2;
    }

    protected double NDS(double newNds) {
        return budget - (budget / countPeople) * newNds;
    }

    public String message() {
        return "Адрес: " + adress;
    }

    protected String message(String mess) {
        return mess;
    }

    protected String message(String mess, String mes2) {
        return mess + " " + mes2;
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
