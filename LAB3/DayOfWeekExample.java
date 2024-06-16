import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DayOfWeekExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        Date date = calendar.getTime();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                System.out.println("Sunday");
                break;
            case Calendar.MONDAY:
                System.out.println("Monday");
                break;
            case Calendar.TUESDAY:
                System.out.println("Tuesday");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case Calendar.THURSDAY:
                System.out.println("Thursday");
                break;
            case Calendar.FRIDAY:
                System.out.println("Friday");
                break;
            case Calendar.SATURDAY:
                System.out.println("Saturday");
                break;
        }
    }
}