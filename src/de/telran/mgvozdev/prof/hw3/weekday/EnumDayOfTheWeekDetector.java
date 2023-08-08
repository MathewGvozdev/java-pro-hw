package de.telran.mgvozdev.prof.hw3.weekday;

public class EnumDayOfTheWeekDetector implements DayOfTheWeekDetector{

    @Override
    public String detectDayName(int number) {
        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            if (day.ordinal() == number - 1) {
                return day.name();
            }
        }
        return "Please input a valid number between 1 and 7";
    }
}
