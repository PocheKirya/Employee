public final class Director extends Manager implements IManager, IEmployee {

    public static final  int BONUS_COEFFICIENT = 8;

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    protected double getBonusMultiplier() {
        return 1.0 + getBonusCoefficient() * getNumberOfSubordinates() / 100.0;
    }
    @Override
    public int getBonusCoefficient() {
        return Director.BONUS_COEFFICIENT;
    }

    @Override
    public int setNumberOfSubordinates(int numberOfSubordinates) {
        return numberOfSubordinates;

    }


}
