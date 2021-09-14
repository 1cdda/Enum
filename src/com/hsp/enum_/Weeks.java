package com.hsp.enum_;

/**
 * @version 1.0
 * @Author Cxc
 */
public class Weeks {
    public static void main(String[] args) {
        WeekDays[] weeks = WeekDays.values();
        System.out.println("=====星期=====");
        for (WeekDays week : weeks) {
            System.out.println(week);

        }
    }
}
enum WeekDays{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期七");
    private String name;

    private WeekDays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;

    }
}
