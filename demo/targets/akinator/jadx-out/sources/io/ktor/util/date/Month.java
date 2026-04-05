package io.ktor.util.date;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum Month {
    JANUARY("Jan"),
    FEBRUARY("Feb"),
    MARCH("Mar"),
    APRIL("Apr"),
    MAY("May"),
    JUNE("Jun"),
    JULY("Jul"),
    AUGUST("Aug"),
    SEPTEMBER("Sep"),
    OCTOBER("Oct"),
    NOVEMBER("Nov"),
    DECEMBER("Dec");

    public static final Companion Companion = new Companion(null);
    private final String value;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Month from(int i10) {
            return Month.values()[i10];
        }

        private Companion() {
        }

        public final Month from(String value) {
            Month month;
            e0.checkNotNullParameter(value, "value");
            Month[] monthArrValues = Month.values();
            int length = monthArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    month = null;
                    break;
                }
                month = monthArrValues[i10];
                if (e0.areEqual(month.getValue(), value)) {
                    break;
                }
                i10++;
            }
            if (month != null) {
                return month;
            }
            throw new IllegalStateException(("Invalid month: " + value).toString());
        }
    }

    Month(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
