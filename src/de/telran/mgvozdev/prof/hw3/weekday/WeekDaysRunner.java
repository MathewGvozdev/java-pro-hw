package de.telran.mgvozdev.prof.hw3.weekday;

public class WeekDaysRunner {

    public static void main(String[] args) {
        DayOfTheWeekDetector ifDetector = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetector switchDetector = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetector arrayDetector = new DayOfTheWeekDetectorArrayVersion();
        System.out.println(ifDetector.detectDayName(1));
        System.out.println(switchDetector.detectDayName(4));
        System.out.println(arrayDetector.detectDayName(7));

        DayOfTheWeekDetector enumDetector = new EnumDayOfTheWeekDetector();
        System.out.println(enumDetector.detectDayName(2));
    }
}
