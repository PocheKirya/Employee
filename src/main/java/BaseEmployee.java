public abstract class BaseEmployee implements IEmployee {

    private String name;
    private int baseSalary;

    public BaseEmployee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract int getSalary();

    @Override
    public int getBaseSalary() {
        return baseSalary;
    }
    @Override
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public static int getSalary(Month[] monthArray, int baseSalary) {
        int days = 0;
        for (Month month : monthArray) {
            days += month.getDaysWork();
        }
        return baseSalary * days;
    }
}
