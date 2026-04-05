package io.ktor.util.date;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GMTDateBuilder {
    private Integer dayOfMonth;
    private Integer hours;
    private Integer minutes;
    public Month month;
    private Integer seconds;
    private Integer year;

    public final GMTDate build() {
        Integer num = this.seconds;
        e0.checkNotNull(num);
        int iIntValue = num.intValue();
        Integer num2 = this.minutes;
        e0.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        Integer num3 = this.hours;
        e0.checkNotNull(num3);
        int iIntValue3 = num3.intValue();
        Integer num4 = this.dayOfMonth;
        e0.checkNotNull(num4);
        int iIntValue4 = num4.intValue();
        Month month = getMonth();
        Integer num5 = this.year;
        e0.checkNotNull(num5);
        return DateJvmKt.GMTDate(iIntValue, iIntValue2, iIntValue3, iIntValue4, month, num5.intValue());
    }

    public final Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final Integer getHours() {
        return this.hours;
    }

    public final Integer getMinutes() {
        return this.minutes;
    }

    public final Month getMonth() {
        Month month = this.month;
        if (month != null) {
            return month;
        }
        e0.throwUninitializedPropertyAccessException("month");
        return null;
    }

    public final Integer getSeconds() {
        return this.seconds;
    }

    public final Integer getYear() {
        return this.year;
    }

    public final void setDayOfMonth(Integer num) {
        this.dayOfMonth = num;
    }

    public final void setHours(Integer num) {
        this.hours = num;
    }

    public final void setMinutes(Integer num) {
        this.minutes = num;
    }

    public final void setMonth(Month month) {
        e0.checkNotNullParameter(month, "<set-?>");
        this.month = month;
    }

    public final void setSeconds(Integer num) {
        this.seconds = num;
    }

    public final void setYear(Integer num) {
        this.year = num;
    }
}
