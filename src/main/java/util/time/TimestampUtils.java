package util.time;

import java.util.Calendar;

/**
 * chengliang的时间戳工具
 *
 * @author chengliang
 * @date 2022/6/8 16:18
 */
public class TimestampUtils {

    /**
     * 获取当前时间戳
     *
     * @return {@code Long}
     */
    public static Long getCurrentTimestamp() {
        return System.currentTimeMillis();
    }

    /**
     * 获取今天起始时间戳
     *
     * @return {@code Long}
     */
    public static Long getTodayTimestamp() {
        return interceptTimestamp(getCalendarInstance()).getTimeInMillis();
    }

    /**
     * 获取明天起始时间戳
     *
     * @return {@code Long}
     */
    public static Long getTomorrowTimestamp() {
        Calendar calendar = getCalendarInstance();
        calendar.add(Calendar.DATE, 1);
        return interceptTimestamp(calendar).getTimeInMillis();
    }

    private static Calendar getCalendarInstance() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(getCurrentTimestamp());
        return calendar;
    }

    private static Calendar interceptTimestamp(Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar;
    }

}
