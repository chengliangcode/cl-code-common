package util.time;

import java.util.Calendar;

/**
 * cl的时间戳工具
 *
 * @author chengliang
 * @date 2022/6/8 16:18
 */
public class TimeUtils {

    public static Long getCurrentTimestamp() {
        return System.currentTimeMillis();
    }

    public static Long getTodayTimestamp() {
        return InterceptTimestamp(getCalendarInstance()).getTimeInMillis();
    }

    public static Long getTomorrowTimestamp() {

        Calendar calendar = getCalendarInstance();
        calendar.add(Calendar.DATE, 1);
        return InterceptTimestamp(calendar).getTimeInMillis();
    }

    private static Calendar getCalendarInstance() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(getCurrentTimestamp());
        return calendar;
    }

    private static Calendar InterceptTimestamp(Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }

}
