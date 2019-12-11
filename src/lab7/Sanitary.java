package lab7;

public class Sanitary extends Hеalth{
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

    public Sanitary(String nameOrg, String adress, double budget, int countPeople, String nameOrg1, String adress1, double budget1, int countPeople1) {
        super(nameOrg, adress, budget, countPeople);
        this.nameOrg = nameOrg1;
        this.adress = adress1;
        this.budget = budget1;
        this.countPeople = countPeople1;
    }

    @Override
    public String getNameOrg() {
        return nameOrg;
    }

    @Override
    public void setNameOrg(String nameOrg) {
        this.nameOrg = nameOrg;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public double getBudget() {
        return budget;
    }

    @Override
    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public int getCountPeople() {
        return countPeople;
    }

    @Override
    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    @Override
    protected double SawingBudget() {
        return super.SawingBudget();
    }

    @Override
    double NDS() {
        return super.NDS();
    }

    @Override
    protected double NDS(double newNds) {
        return super.NDS(newNds);
    }

    @Override
    protected String message() {
        return super.message();
    }

    @Override
    protected String message(String mess) {
        return super.message(mess);
    }

    @Override
    protected String message(String mess, String mes2) {
        return super.message(mess, mes2);
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
