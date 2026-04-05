package dd;

import com.amazon.device.ads.DtbConstants;
import com.sfbx.appconsent.core.BuildConfig;
import j$.util.DesugarTimeZone;
import j1.o2;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class j0 extends DateFormat {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f52031i = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f52032j;

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f52033k;

    /* renamed from: l, reason: collision with root package name */
    public static final TimeZone f52034l;

    /* renamed from: m, reason: collision with root package name */
    public static final Locale f52035m;

    /* renamed from: n, reason: collision with root package name */
    public static final SimpleDateFormat f52036n;

    /* renamed from: o, reason: collision with root package name */
    public static final j0 f52037o;

    /* renamed from: p, reason: collision with root package name */
    public static final GregorianCalendar f52038p;

    /* renamed from: b, reason: collision with root package name */
    public transient TimeZone f52039b;

    /* renamed from: c, reason: collision with root package name */
    public final Locale f52040c;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f52041e;

    /* renamed from: f, reason: collision with root package name */
    public transient Calendar f52042f;

    /* renamed from: g, reason: collision with root package name */
    public transient DateFormat f52043g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f52044h;

    static {
        try {
            f52032j = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            f52033k = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
            f52034l = timeZone;
            Locale locale = Locale.US;
            f52035m = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            f52036n = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            f52037o = new j0();
            f52038p = new GregorianCalendar(timeZone, locale);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public j0() {
        this.f52044h = true;
        this.f52040c = f52035m;
    }

    public static final DateFormat a(DateFormat dateFormat, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat simpleDateFormat;
        if (locale.equals(f52035m)) {
            simpleDateFormat = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                simpleDateFormat.setTimeZone(timeZone);
            }
        } else {
            simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            if (timeZone == null) {
                timeZone = f52034l;
            }
            simpleDateFormat.setTimeZone(timeZone);
        }
        if (bool != null) {
            simpleDateFormat.setLenient(bool.booleanValue());
        }
        return simpleDateFormat;
    }

    public static int c(int i10, String str) {
        return (str.charAt(i10 + 1) - '0') + ((str.charAt(i10) - '0') * 10);
    }

    public static int d(String str) {
        return (str.charAt(3) - '0') + ((str.charAt(2) - '0') * 10) + ((str.charAt(1) - '0') * 100) + ((str.charAt(0) - '0') * 1000);
    }

    public static void g(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 10;
        if (i11 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i11 + 48));
            i10 -= i11 * 10;
        }
        stringBuffer.append((char) (i10 + 48));
    }

    public static TimeZone getDefaultTimeZone() {
        return f52034l;
    }

    @Deprecated
    public static DateFormat getISO8601Format(TimeZone timeZone, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", locale);
        simpleDateFormat.setTimeZone(f52034l);
        return simpleDateFormat;
    }

    @Deprecated
    public static DateFormat getRFC1123Format(TimeZone timeZone, Locale locale) {
        return a(f52036n, timeZone, locale, null);
    }

    public static void h(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 100;
        if (i11 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i11 > 99) {
                stringBuffer.append(i11);
            } else {
                g(stringBuffer, i11);
            }
            i10 -= i11 * 100;
        }
        g(stringBuffer, i10);
    }

    public final Calendar b(TimeZone timeZone) {
        Calendar calendar = this.f52042f;
        if (calendar == null) {
            calendar = (Calendar) f52038p.clone();
            this.f52042f = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    public final Date e(String str) throws ParseException {
        String str2;
        int i10;
        int iC;
        int length = str.length();
        Calendar calendarB = b((this.f52039b == null || 'Z' == str.charAt(length + (-1))) ? f52034l : this.f52039b);
        calendarB.clear();
        int iCharAt = 0;
        if (length > 10) {
            Matcher matcher = f52032j.matcher(str);
            if (matcher.matches()) {
                int iStart = matcher.start(2);
                int iEnd = matcher.end(2);
                int i11 = iEnd - iStart;
                if (i11 > 1) {
                    int iC2 = c(iStart + 1, str) * BuildConfig.VERSION_CODE;
                    if (i11 >= 5) {
                        iC2 += c(iEnd - 2, str) * 60;
                    }
                    calendarB.set(15, str.charAt(iStart) == '-' ? iC2 * (-1000) : iC2 * 1000);
                    calendarB.set(16, 0);
                }
                int iD = d(str);
                int iC3 = c(5, str) - 1;
                int iC4 = c(8, str);
                int iC5 = c(11, str);
                int iC6 = c(14, str);
                if (length <= 16 || str.charAt(16) != ':') {
                    i10 = iC4;
                    iC = 0;
                } else {
                    i10 = iC4;
                    iC = c(17, str);
                }
                calendarB.set(iD, iC3, i10, iC5, iC6, iC);
                int iStart2 = matcher.start(1);
                int i12 = iStart2 + 1;
                int iEnd2 = matcher.end(1);
                if (i12 >= iEnd2) {
                    calendarB.set(14, 0);
                } else {
                    int i13 = iEnd2 - i12;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3 && i13 > 9) {
                                    throw new ParseException(e3.g.l("Cannot parse date \"", str, "\": invalid fractional seconds '", matcher.group(1).substring(1), "'; can use at most 9 digits"), i12);
                                }
                                iCharAt = str.charAt(iStart2 + 3) - '0';
                            }
                            iCharAt += (str.charAt(iStart2 + 2) - '0') * 10;
                        }
                        iCharAt += (str.charAt(i12) - '0') * 100;
                    }
                    calendarB.set(14, iCharAt);
                }
                return calendarB.getTime();
            }
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        } else {
            if (f52031i.matcher(str).matches()) {
                calendarB.set(d(str), c(5, str) - 1, c(8, str), 0, 0, 0);
                calendarB.set(14, 0);
                return calendarB.getTime();
            }
            str2 = "yyyy-MM-dd";
        }
        Boolean bool = this.f52041e;
        StringBuilder sbB = b3.h.b("Cannot parse date \"", str, "\": while it seems to fit format '", str2, "', parsing fails (leniency? ");
        sbB.append(bool);
        sbB.append(")");
        throw new ParseException(sbB.toString(), 0);
    }

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return obj == this;
    }

    public final Date f(String str, ParsePosition parsePosition) throws ParseException {
        if (str.length() >= 7 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-' && Character.isDigit(str.charAt(5))) {
            try {
                return e(str);
            } catch (IllegalArgumentException e10) {
                throw new ParseException(a.b.m("Cannot parse date \"", str, "\", problem: ", e10.getMessage()), parsePosition.getErrorIndex());
            }
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt < '0' || cCharAt > '9') {
                if (length > 0 || cCharAt != '-') {
                    break;
                }
            }
        }
        if (length < 0 && (str.charAt(0) == '-' || cc.m.inLongRange(str, false))) {
            try {
                return new Date(cc.m.parseLong(str));
            } catch (NumberFormatException unused) {
                throw new ParseException(a.b.l("Timestamp value ", str, " out of 64-bit value range"), parsePosition.getErrorIndex());
            }
        }
        if (this.f52043g == null) {
            this.f52043g = a(f52036n, this.f52039b, this.f52040c, this.f52041e);
        }
        return this.f52043g.parse(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.f52039b;
        if (timeZone == null) {
            timeZone = f52034l;
        }
        Calendar calendarB = b(timeZone);
        calendarB.setTime(date);
        int i10 = calendarB.get(1);
        if (calendarB.get(0) != 0) {
            if (i10 > 9999) {
                stringBuffer.append('+');
            }
            h(stringBuffer, i10);
        } else if (i10 == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            h(stringBuffer, i10 - 1);
        }
        stringBuffer.append('-');
        g(stringBuffer, calendarB.get(2) + 1);
        stringBuffer.append('-');
        g(stringBuffer, calendarB.get(5));
        stringBuffer.append('T');
        g(stringBuffer, calendarB.get(11));
        stringBuffer.append(AbstractJsonLexerKt.COLON);
        g(stringBuffer, calendarB.get(12));
        stringBuffer.append(AbstractJsonLexerKt.COLON);
        g(stringBuffer, calendarB.get(13));
        stringBuffer.append('.');
        int i11 = calendarB.get(14);
        int i12 = i11 / 100;
        if (i12 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i12 + 48));
            i11 -= i12 * 100;
        }
        g(stringBuffer, i11);
        int offset = timeZone.getOffset(calendarB.getTimeInMillis());
        boolean z10 = this.f52044h;
        if (offset == 0) {
            if (z10) {
                stringBuffer.append("+00:00");
                return stringBuffer;
            }
            stringBuffer.append("+0000");
            return stringBuffer;
        }
        int i13 = offset / DtbConstants.NETWORK_READ_TIMEOUT;
        int iAbs = Math.abs(i13 / 60);
        int iAbs2 = Math.abs(i13 % 60);
        stringBuffer.append(offset < 0 ? '-' : '+');
        g(stringBuffer, iAbs);
        if (z10) {
            stringBuffer.append(AbstractJsonLexerKt.COLON);
        }
        g(stringBuffer, iAbs2);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this.f52039b;
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    public boolean isColonIncludedInTimeZone() {
        return this.f52044h;
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this.f52041e;
        return bool == null || bool.booleanValue();
    }

    @Override // java.text.DateFormat
    public Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateF = f(strTrim, parsePosition);
        if (dateF != null) {
            return dateF;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f52033k) {
            if (sb2.length() > 0) {
                sb2.append("\", \"");
            } else {
                sb2.append(AbstractJsonLexerKt.STRING);
            }
            sb2.append(str2);
        }
        sb2.append(AbstractJsonLexerKt.STRING);
        throw new ParseException(e3.g.l("Cannot parse date \"", strTrim, "\": not compatible with any of standard forms (", sb2.toString(), ")"), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Boolean bool = this.f52041e;
        if (boolValueOf == bool || boolValueOf.equals(bool)) {
            return;
        }
        this.f52041e = boolValueOf;
        this.f52043g = null;
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.f52039b)) {
            return;
        }
        this.f52043g = null;
        this.f52039b = timeZone;
    }

    public String toPattern() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSX', 'EEE, dd MMM yyyy HH:mm:ss zzz' (");
        return o2.o(sb2, Boolean.FALSE.equals(this.f52041e) ? "strict" : "lenient", ")]");
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this.f52039b, this.f52040c, this.f52041e);
    }

    public j0 withColonInTimeZone(boolean z10) {
        return this.f52044h == z10 ? this : new j0(this.f52039b, this.f52040c, this.f52041e, z10);
    }

    public j0 withLenient(Boolean bool) {
        Boolean bool2 = this.f52041e;
        return (bool != bool2 && (bool == null || !bool.equals(bool2))) ? new j0(this.f52039b, this.f52040c, bool, this.f52044h) : this;
    }

    public j0 withLocale(Locale locale) {
        return locale.equals(this.f52040c) ? this : new j0(this.f52039b, locale, this.f52041e, this.f52044h);
    }

    public j0 withTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = f52034l;
        }
        TimeZone timeZone2 = this.f52039b;
        if (timeZone == timeZone2 || timeZone.equals(timeZone2)) {
            return this;
        }
        return new j0(timeZone, this.f52040c, this.f52041e, this.f52044h);
    }

    @Override // java.text.DateFormat, java.text.Format
    public j0 clone() {
        return new j0(this.f52039b, this.f52040c, this.f52041e, this.f52044h);
    }

    @Deprecated
    public j0(TimeZone timeZone, Locale locale) {
        this.f52044h = true;
        this.f52039b = timeZone;
        this.f52040c = locale;
    }

    public j0(TimeZone timeZone, Locale locale, Boolean bool, boolean z10) {
        this.f52039b = timeZone;
        this.f52040c = locale;
        this.f52041e = bool;
        this.f52044h = z10;
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return f(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
