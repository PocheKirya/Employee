public class EmployeeUtils {

    private static int getDelta(IEmployee employee) {
        return employee.getSalary() - employee.getBaseSalary();
    }
    /**
     * поиск наименьшего количества подчиненных в массиве менеджеров
     */
    public static int getLeastSubordinatesNumber(IManager[] managers) {
        if (managers == null || managers.length == 0) {
            return -1;
        }
        int result = managers[0].getNumberOfSubordinates();
        for (int i = 1; i < managers.length; i++) {
            if (result > managers[i].getNumberOfSubordinates()) {
                result = managers[i].getNumberOfSubordinates();
            }
        }
        return result;
    }
    /**
     * поиск наибольшего количества подчиненных в массиве менеджеров
     */
    public static int getMostSubordinatesNumber(IManager[] managers) {
        if (managers == null || managers.length == 0) {
            return -1;
        }
        int result = managers[0].getNumberOfSubordinates();
        for (int i = 1; i < managers.length; i++) {
            if (result < managers[i].getNumberOfSubordinates()) {
                result = managers[i].getNumberOfSubordinates();
            }
        }
        return result;
    }
    /**
     * поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
     */




}
