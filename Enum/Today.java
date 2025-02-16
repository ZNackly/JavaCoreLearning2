package Enum;

public class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void DaysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to your work!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("You can sleep today!");
                break;

        }
    }
}
