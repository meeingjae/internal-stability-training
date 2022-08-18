package ebayj;

public class DayCalculator {

    public static String calculateDate(int num, String day, int targetNum) {
        num %= 7;
        targetNum %= 7;

        String[] days = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
        int index = 0;
        for (int i = 0; i < 7; i++) {
            if (days[i].equals(day)) {
                break;
            } else {
                index++;
            }
        }
        int resultNum;
        if (num > targetNum) {
            resultNum = (num - targetNum) % 7;
        } else {
            resultNum = (targetNum - num) % 7;
        }

        return days[(index + resultNum) % 7];
    }
}
