package de.telran.mgvozdev.prof.hw3.weekday;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    private final String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    // number must be from 1 to 7
    @Override
    public String detectDayName(int number) {
        return weekDays[number - 1];
    }
}
