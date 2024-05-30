package Ninetin_march;

public class Enum {
    public static void main(String[] args) {
        Holiday h1 = new Holiday("uttrayan",14,MonthEnum.January);
        Holiday h2 = new Holiday("Rpublic",26,MonthEnum.January);
        Holiday h3 = new Holiday("holi",24,MonthEnum.March);

        System.out.println(h1.isSameMonth(h3));
    }

}

class Holiday{
    String name;
    int date;
    MonthEnum month;

    public Holiday(String name, int date, MonthEnum month) {
        this.name = name;
        this.date = date;
        this.month = month;
    }

    public boolean isSameMonth(Holiday h) {
        if (this.month.equals(h.month)){
            return true;
        }

        return false;
    }
}
