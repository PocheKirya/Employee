public final class Month {

    private String nameMonth; //имя месяца
    private int amountOfDays;//количеством дней
    private int daysWork;//количеством рабочих дней

    public Month(String nameMonth, int amountOfDays, int numberOfWorkingDays) {
        this.nameMonth = nameMonth;
        this.amountOfDays = amountOfDays;
        this.daysWork = numberOfWorkingDays;
    }

    public static Month[][] quarterYearMonth(Month[] months) {
        Month[] a = new Month[3];
        Month[] b = new Month[3];
        Month[] c = new Month[3];
        Month[] d = new Month[3];

        for (int i = 0; i < months.length; i++) {
            if (i < 3) {
                a[i] = months[i];
            } else if (i >= 3 && i < 6) {
                b[i - 3] = months[i];
            } else if (i >= 6 && i < 9) {
                c[i - 6] = months[i];
            } else {
                d[i - 9] = months[i];
            }
        }

        Month[][] quarterYearMonth = {a, b, c, d};
        return quarterYearMonth;
    }

    public static Month[][] halfYearMonth(Month[] months) {
        Month[] a = new Month[6];
        Month[] b = new Month[6];

        for (int i = 0; i < months.length; i++) {
            if (i < 6) {
                a[i] = months[i];
            } else {
                b[i - 6] = months[i];
            }
        }
        Month[][] halfYearMonth = {a, b};
        return halfYearMonth;
    }

    public static Month[] yearMonth(Month january, Month february, Month march,
                                     Month april, Month may, Month june,
                                     Month july, Month august, Month september,
                                     Month october, Month november, Month december) {
        Month[] yearMonth = {january, february, march,
                april, may, june,
                july, august, september,
                october, november, december};
        return yearMonth;
    }

    public int getDaysWork() {
        return daysWork;
    }



}
