package io.ktor.util.date;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GMTDateParser {
    public static final char ANY = '*';
    public static final Companion Companion = new Companion(null);
    public static final char DAY_OF_MONTH = 'd';
    public static final char HOURS = 'h';
    public static final char MINUTES = 'm';
    public static final char MONTH = 'M';
    public static final char SECONDS = 's';
    public static final char YEAR = 'Y';
    public static final char ZONE = 'z';
    private final String pattern;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public GMTDateParser(String pattern) {
        e0.checkNotNullParameter(pattern, "pattern");
        this.pattern = pattern;
        if (pattern.length() <= 0) {
            throw new IllegalStateException("Date parser pattern shouldn't be empty.");
        }
    }

    private final void handleToken(GMTDateBuilder gMTDateBuilder, char c10, String str) {
        if (c10 == 's') {
            gMTDateBuilder.setSeconds(Integer.valueOf(Integer.parseInt(str)));
            return;
        }
        if (c10 == 'm') {
            gMTDateBuilder.setMinutes(Integer.valueOf(Integer.parseInt(str)));
            return;
        }
        if (c10 == 'h') {
            gMTDateBuilder.setHours(Integer.valueOf(Integer.parseInt(str)));
            return;
        }
        if (c10 == 'd') {
            gMTDateBuilder.setDayOfMonth(Integer.valueOf(Integer.parseInt(str)));
            return;
        }
        if (c10 == 'M') {
            gMTDateBuilder.setMonth(Month.Companion.from(str));
            return;
        }
        if (c10 == 'Y') {
            gMTDateBuilder.setYear(Integer.valueOf(Integer.parseInt(str)));
            return;
        }
        if (c10 == 'z') {
            if (!e0.areEqual(str, "GMT")) {
                throw new IllegalStateException("Check failed.");
            }
        } else if (c10 != '*') {
            for (int i10 = 0; i10 < str.length(); i10++) {
                if (str.charAt(i10) != c10) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
    }

    public final GMTDate parse(String dateString) {
        e0.checkNotNullParameter(dateString, "dateString");
        GMTDateBuilder gMTDateBuilder = new GMTDateBuilder();
        char cCharAt = this.pattern.charAt(0);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i11 < this.pattern.length()) {
            try {
                if (this.pattern.charAt(i11) == cCharAt) {
                    i11++;
                } else {
                    int i13 = (i12 + i11) - i10;
                    String strSubstring = dateString.substring(i12, i13);
                    e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    handleToken(gMTDateBuilder, cCharAt, strSubstring);
                    try {
                        cCharAt = this.pattern.charAt(i11);
                        i10 = i11;
                        i11++;
                        i12 = i13;
                    } catch (Throwable unused) {
                        i12 = i13;
                        throw new InvalidDateStringException(dateString, i12, this.pattern);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (i12 < dateString.length()) {
            String strSubstring2 = dateString.substring(i12);
            e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            handleToken(gMTDateBuilder, cCharAt, strSubstring2);
        }
        return gMTDateBuilder.build();
    }
}
