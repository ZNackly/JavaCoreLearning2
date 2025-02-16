package Enum;

import java.util.Arrays;

public class EnumEx1 {

    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.DaysInfo();
        WeekDays w = WeekDays.SUNDAY;
        WeekDays.myMood(w);
        System.out.println(today.weekDay);
        System.out.println(WeekDays.valueOf("SUNDAY"));
        WeekDays[] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}
