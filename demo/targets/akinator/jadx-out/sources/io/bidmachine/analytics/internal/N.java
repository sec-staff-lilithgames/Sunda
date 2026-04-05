package io.bidmachine.analytics.internal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f59918a = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.SSS", Locale.getDefault());

    public final Long a(String str) throws ParseException {
        int i10 = Calendar.getInstance().get(1);
        Date date = this.f59918a.parse(i10 + '-' + str);
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }
}
