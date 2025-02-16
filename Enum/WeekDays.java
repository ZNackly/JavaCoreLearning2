package Enum;

public enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("bad"),
    THURSDAY("normal"),
    FRIDAY("good"),
    SATURDAY("excelent"),
    SUNDAY("good");

    private String mood;

    private WeekDays(String mood) {
        this.mood = mood;
    }

    public static void myMood(WeekDays w) {
        System.out.println(w.mood);
    }

}

enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}