package com.google.android.material.datepicker;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f29181a = new AtomicReference();

    public static Calendar a(Calendar calendar) {
        Calendar calendarC = c(calendar);
        Calendar calendarC2 = c(null);
        calendarC2.set(calendarC.get(1), calendarC.get(2), calendarC.get(5));
        return calendarC2;
    }

    public static Calendar b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
