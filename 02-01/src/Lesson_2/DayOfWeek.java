package Lesson_2;


/*Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
        С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.

        Возвращает кол-во оставшихся рабочих часов до конца
        недели по заданному текущему дню. Считается, что
        текущий день ещё не начался, и рабочие часы за него
        должны учитываться.*/

public class DayOfWeek {

    private static int WORKINGWEEK = 40;
    private static int WORKINGDAY = 8;

    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOfWeekList.MONDAY));
        System.out.println(getWorkingHours(DayOfWeekList.TUESDAY));
        System.out.println(getWorkingHours(DayOfWeekList.WEDNESDAY));
        System.out.println(getWorkingHours(DayOfWeekList.THURSDAY));
        System.out.println(getWorkingHours(DayOfWeekList.FRIDAY));
        System.out.println(getWorkingHours(DayOfWeekList.SATURDAY));
        System.out.println(getWorkingHours(DayOfWeekList.SUNDAY));
    }

    private static String getWorkingHours(DayOfWeekList dayOfWeek) {
        if (dayOfWeek != DayOfWeekList.SATURDAY && dayOfWeek != DayOfWeekList.SUNDAY) {
            return String.valueOf(WORKINGWEEK - WORKINGDAY * dayOfWeek.ordinal());
        } else {
            return "Выхи";
        }
    }


}

enum DayOfWeekList {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}