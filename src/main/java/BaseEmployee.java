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
    public int getBaseSalary() {
        return baseSalary;
    }
    @Override
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
}
