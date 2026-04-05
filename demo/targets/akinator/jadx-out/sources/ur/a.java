package ur;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f88658a = TimeUnit.DAYS.toMillis(1);

    public static Calendar beginOfDay(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public static Calendar calendarFromDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static int daysBetween(Date date, Date date2) {
        return (int) (Math.abs(beginOfDay(calendarFromDate(date2)).getTimeInMillis() - beginOfDay(calendarFromDate(date)).getTimeInMillis()) / f88658a);
    }
}
