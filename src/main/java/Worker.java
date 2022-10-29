public final class Worker extends BaseEmployee implements IEmployee {

    public Worker(String name, int baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public final int getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public int getSalary() {
        return getBaseSalary();
    }
}
