package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new z();

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f29146b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29147c;

    /* renamed from: e, reason: collision with root package name */
    public final int f29148e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29149f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29150g;

    /* renamed from: h, reason: collision with root package name */
    public final long f29151h;

    /* renamed from: i, reason: collision with root package name */
    public String f29152i;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = j0.a(calendar);
        this.f29146b = calendarA;
        this.f29147c = calendarA.get(2);
        this.f29148e = calendarA.get(1);
        this.f29149f = calendarA.getMaximum(7);
        this.f29150g = calendarA.getActualMaximum(5);
        this.f29151h = calendarA.getTimeInMillis();
    }

    public static Month a(int i10, int i11) {
        Calendar calendarC = j0.c(null);
        calendarC.set(1, i10);
        calendarC.set(2, i11);
        return new Month(calendarC);
    }

    public static Month b(long j10) {
        Calendar calendarC = j0.c(null);
        calendarC.setTimeInMillis(j10);
        return new Month(calendarC);
    }

    public final String c() {
        if (this.f29152i == null) {
            long timeInMillis = this.f29146b.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = j0.f29181a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f29152i = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f29152i;
    }

    public final int d(Month month) {
        if (!(this.f29146b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f29147c - this.f29147c) + ((month.f29148e - this.f29148e) * 12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f29147c == month.f29147c && this.f29148e == month.f29148e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f29147c), Integer.valueOf(this.f29148e)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f29148e);
        parcel.writeInt(this.f29147c);
    }

    @Override // java.lang.Comparable
    public int compareTo(Month month) {
        return this.f29146b.compareTo(month.f29146b);
    }
}
