package io.ktor.util.date;

import androidx.core.app.NotificationCompat;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GMTDate implements Comparable<GMTDate> {
    public static final Companion Companion = new Companion(null);
    private static final GMTDate START = DateJvmKt.GMTDate(0L);
    private final int dayOfMonth;
    private final WeekDay dayOfWeek;
    private final int dayOfYear;
    private final int hours;
    private final int minutes;
    private final Month month;
    private final int seconds;
    private final long timestamp;
    private final int year;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final GMTDate getSTART() {
            return GMTDate.START;
        }

        private Companion() {
        }
    }

    public GMTDate(int i10, int i11, int i12, WeekDay dayOfWeek, int i13, int i14, Month month, int i15, long j10) {
        e0.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        e0.checkNotNullParameter(month, "month");
        this.seconds = i10;
        this.minutes = i11;
        this.hours = i12;
        this.dayOfWeek = dayOfWeek;
        this.dayOfMonth = i13;
        this.dayOfYear = i14;
        this.month = month;
        this.year = i15;
        this.timestamp = j10;
    }

    public static /* synthetic */ GMTDate copy$default(GMTDate gMTDate, int i10, int i11, int i12, WeekDay weekDay, int i13, int i14, Month month, int i15, long j10, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i10 = gMTDate.seconds;
        }
        if ((i16 & 2) != 0) {
            i11 = gMTDate.minutes;
        }
        if ((i16 & 4) != 0) {
            i12 = gMTDate.hours;
        }
        if ((i16 & 8) != 0) {
            weekDay = gMTDate.dayOfWeek;
        }
        if ((i16 & 16) != 0) {
            i13 = gMTDate.dayOfMonth;
        }
        if ((i16 & 32) != 0) {
            i14 = gMTDate.dayOfYear;
        }
        if ((i16 & 64) != 0) {
            month = gMTDate.month;
        }
        if ((i16 & 128) != 0) {
            i15 = gMTDate.year;
        }
        if ((i16 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            j10 = gMTDate.timestamp;
        }
        long j11 = j10;
        Month month2 = month;
        int i17 = i15;
        int i18 = i13;
        int i19 = i14;
        return gMTDate.copy(i10, i11, i12, weekDay, i18, i19, month2, i17, j11);
    }

    public final int component1() {
        return this.seconds;
    }

    public final int component2() {
        return this.minutes;
    }

    public final int component3() {
        return this.hours;
    }

    public final WeekDay component4() {
        return this.dayOfWeek;
    }

    public final int component5() {
        return this.dayOfMonth;
    }

    public final int component6() {
        return this.dayOfYear;
    }

    public final Month component7() {
        return this.month;
    }

    public final int component8() {
        return this.year;
    }

    public final long component9() {
        return this.timestamp;
    }

    public final GMTDate copy(int i10, int i11, int i12, WeekDay dayOfWeek, int i13, int i14, Month month, int i15, long j10) {
        e0.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        e0.checkNotNullParameter(month, "month");
        return new GMTDate(i10, i11, i12, dayOfWeek, i13, i14, month, i15, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GMTDate)) {
            return false;
        }
        GMTDate gMTDate = (GMTDate) obj;
        return this.seconds == gMTDate.seconds && this.minutes == gMTDate.minutes && this.hours == gMTDate.hours && this.dayOfWeek == gMTDate.dayOfWeek && this.dayOfMonth == gMTDate.dayOfMonth && this.dayOfYear == gMTDate.dayOfYear && this.month == gMTDate.month && this.year == gMTDate.year && this.timestamp == gMTDate.timestamp;
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final WeekDay getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final int getDayOfYear() {
        return this.dayOfYear;
    }

    public final int getHours() {
        return this.hours;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final Month getMonth() {
        return this.month;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp) + g.d(this.year, (this.month.hashCode() + g.d(this.dayOfYear, g.d(this.dayOfMonth, (this.dayOfWeek.hashCode() + g.d(this.hours, g.d(this.minutes, Integer.hashCode(this.seconds) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GMTDate(seconds=");
        sb2.append(this.seconds);
        sb2.append(", minutes=");
        sb2.append(this.minutes);
        sb2.append(", hours=");
        sb2.append(this.hours);
        sb2.append(", dayOfWeek=");
        sb2.append(this.dayOfWeek);
        sb2.append(", dayOfMonth=");
        sb2.append(this.dayOfMonth);
        sb2.append(", dayOfYear=");
        sb2.append(this.dayOfYear);
        sb2.append(", month=");
        sb2.append(this.month);
        sb2.append(", year=");
        sb2.append(this.year);
        sb2.append(", timestamp=");
        return g.n(sb2, this.timestamp, ')');
    }

    @Override // java.lang.Comparable
    public int compareTo(GMTDate other) {
        e0.checkNotNullParameter(other, "other");
        return e0.compare(this.timestamp, other.timestamp);
    }
}
