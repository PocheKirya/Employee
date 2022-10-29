public class Manager extends BaseEmployee implements IEmployee {

    private static final int BONUS_COEFFICIENT = 1;

    private int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    private double getBonusMultiplier() {
        return 1.0 + getBonusCoefficient() * numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        return (int)(getBaseSalary() * getBonusMultiplier());
    }

    public int getSalary(Month[] monthArray) {
        return (int) (getSalary(monthArray, this.getBaseSalary()) * getBonusMultiplier());
    }


    public int getBonusCoefficient() {
        return Manager.BONUS_COEFFICIENT;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
}
