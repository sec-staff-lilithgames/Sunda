package io.ktor.util.date;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum WeekDay {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat"),
    SUNDAY("Sun");

    public static final Companion Companion = new Companion(null);
    private final String value;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final WeekDay from(int i10) {
            return WeekDay.values()[i10];
        }

        private Companion() {
        }

        public final WeekDay from(String value) {
            WeekDay weekDay;
            e0.checkNotNullParameter(value, "value");
            WeekDay[] weekDayArrValues = WeekDay.values();
            int length = weekDayArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    weekDay = null;
                    break;
                }
                weekDay = weekDayArrValues[i10];
                if (e0.areEqual(weekDay.getValue(), value)) {
                    break;
                }
                i10++;
            }
            if (weekDay != null) {
                return weekDay;
            }
            throw new IllegalStateException(("Invalid day of week: " + value).toString());
        }
    }

    WeekDay(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
