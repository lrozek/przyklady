package pl.lrozek.szkolenia.enumeration;

public enum DayOfTheWeek {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public String display() {
        return ordinal() + " " + name().toLowerCase();
    }

}
