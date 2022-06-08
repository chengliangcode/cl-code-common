package util.time;

import java.util.Calendar;

/**
 * cl的时间工具
 *
 * @author chengliang
 * @date 2022/6/8 16:18
 */
public class TimeUtils {

    public static Long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public static Long getTodayTime() {
        return System.currentTimeMillis();
    }

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        long l = currentTimeMillis >> 5;
        System.out.println(l);
//        Calendar instance = Calendar.getInstance();
//        instance.setTimeInMillis(currentTimeMillis);
//        instance.set(Calendar.HOUR_OF_DAY, 0);
//        instance.set(Calendar.MINUTE, 0);
//        instance.set(Calendar.SECOND, 0);
//        instance.set(Calendar.MILLISECOND, 0);
//        System.out.println(instance.getTime().getTime());
    }


}
