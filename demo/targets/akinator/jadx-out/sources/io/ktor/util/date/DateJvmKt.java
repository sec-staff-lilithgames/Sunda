package io.ktor.util.date;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DateJvmKt {
    private static final TimeZone GMT_TIMEZONE = DesugarTimeZone.getTimeZone("GMT");

    public static final GMTDate GMTDate(Long l9) {
        Calendar calendar = Calendar.getInstance(GMT_TIMEZONE, Locale.ROOT);
        e0.checkNotNull(calendar);
        return toDate(calendar, l9);
    }

    public static /* synthetic */ GMTDate GMTDate$default(Long l9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l9 = null;
        }
        return GMTDate(l9);
    }

    public static final long getTimeMillis() {
        return System.currentTimeMillis();
    }

    public static final GMTDate toDate(Calendar calendar, Long l9) {
        e0.checkNotNullParameter(calendar, "<this>");
        if (l9 != null) {
            calendar.setTimeInMillis(l9.longValue());
        }
        return new GMTDate(calendar.get(13), calendar.get(12), calendar.get(11), WeekDay.Companion.from((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), Month.Companion.from(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + calendar.get(16) + calendar.get(15));
    }

    public static final Date toJvmDate(GMTDate gMTDate) {
        e0.checkNotNullParameter(gMTDate, "<this>");
        return new Date(gMTDate.getTimestamp());
    }

    public static final GMTDate GMTDate(int i10, int i11, int i12, int i13, Month month, int i14) {
        e0.checkNotNullParameter(month, "month");
        Calendar calendar = Calendar.getInstance(GMT_TIMEZONE, Locale.ROOT);
        e0.checkNotNull(calendar);
        calendar.set(1, i14);
        calendar.set(2, month.ordinal());
        calendar.set(5, i13);
        calendar.set(11, i12);
        calendar.set(12, i11);
        calendar.set(13, i10);
        calendar.set(14, 0);
        return toDate(calendar, null);
    }
}
