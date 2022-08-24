package ebayj;

public class DayCalculator {

    public static String calculateDate(int num, String day, int targetNum) {
        int source = num %= 7;
        int target = targetNum %= 7;

        String[] days = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
        int index = 0;
        for (int i = 0; i < 7; i++) {
            if (days[i].equals(day)) {
                break;
            } else {
                index++;
            }
        }

        int targetIndex = 0;

        if (source <= target) {
            targetIndex = target - source;
            return days[(index + targetIndex) % 7];
        } else {
            targetIndex = source - target;
            return days[(7 + index - targetIndex) % 7];
        }
    }
}
