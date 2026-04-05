package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new com.google.android.material.datepicker.a();

    /* renamed from: b, reason: collision with root package name */
    public final Month f29130b;

    /* renamed from: c, reason: collision with root package name */
    public final Month f29131c;

    /* renamed from: e, reason: collision with root package name */
    public final DateValidator f29132e;

    /* renamed from: f, reason: collision with root package name */
    public final Month f29133f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29134g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29135h;

    /* renamed from: i, reason: collision with root package name */
    public final int f29136i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DateValidator extends Parcelable {
        boolean isValid(long j10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final long f29137f;

        /* renamed from: g, reason: collision with root package name */
        public static final long f29138g;

        /* renamed from: c, reason: collision with root package name */
        public Long f29141c;

        /* renamed from: d, reason: collision with root package name */
        public int f29142d;

        /* renamed from: a, reason: collision with root package name */
        public long f29139a = f29137f;

        /* renamed from: b, reason: collision with root package name */
        public long f29140b = f29138g;

        /* renamed from: e, reason: collision with root package name */
        public DateValidator f29143e = DateValidatorPointForward.from(Long.MIN_VALUE);

        static {
            long j10 = Month.a(1900, 0).f29151h;
            Calendar calendarC = j0.c(null);
            calendarC.setTimeInMillis(j10);
            f29137f = j0.a(calendarC).getTimeInMillis();
            long j11 = Month.a(2100, 11).f29151h;
            Calendar calendarC2 = j0.c(null);
            calendarC2.setTimeInMillis(j11);
            f29138g = j0.a(calendarC2).getTimeInMillis();
        }

        public CalendarConstraints build() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f29143e);
            Month monthB = Month.b(this.f29139a);
            Month monthB2 = Month.b(this.f29140b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l9 = this.f29141c;
            return new CalendarConstraints(monthB, monthB2, dateValidator, l9 == null ? null : Month.b(l9.longValue()), this.f29142d);
        }

        public a setEnd(long j10) {
            this.f29140b = j10;
            return this;
        }

        public a setFirstDayOfWeek(int i10) {
            this.f29142d = i10;
            return this;
        }

        public a setOpenAt(long j10) {
            this.f29141c = Long.valueOf(j10);
            return this;
        }

        public a setStart(long j10) {
            this.f29139a = j10;
            return this;
        }

        public a setValidator(DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.f29143e = dateValidator;
            return this;
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f29130b = month;
        this.f29131c = month2;
        this.f29133f = month3;
        this.f29134g = i10;
        this.f29132e = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > j0.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f29136i = month.d(month2) + 1;
        this.f29135h = (month2.f29148e - month.f29148e) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f29130b.equals(calendarConstraints.f29130b) && this.f29131c.equals(calendarConstraints.f29131c) && w3.d.equals(this.f29133f, calendarConstraints.f29133f) && this.f29134g == calendarConstraints.f29134g && this.f29132e.equals(calendarConstraints.f29132e);
    }

    public DateValidator getDateValidator() {
        return this.f29132e;
    }

    public long getEndMs() {
        return this.f29131c.f29151h;
    }

    public Long getOpenAtMs() {
        Month month = this.f29133f;
        if (month == null) {
            return null;
        }
        return Long.valueOf(month.f29151h);
    }

    public long getStartMs() {
        return this.f29130b.f29151h;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29130b, this.f29131c, this.f29133f, Integer.valueOf(this.f29134g), this.f29132e});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f29130b, 0);
        parcel.writeParcelable(this.f29131c, 0);
        parcel.writeParcelable(this.f29133f, 0);
        parcel.writeParcelable(this.f29132e, 0);
        parcel.writeInt(this.f29134g);
    }
}
