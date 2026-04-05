package io.ktor.http;

import io.ktor.util.date.GMTDate;
import io.ktor.util.date.GMTDateParser;
import io.ktor.util.date.InvalidDateStringException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.n0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DateUtilsKt {
    private static final List<String> HTTP_DATE_FORMATS = p0.listOf((Object[]) new String[]{"***, dd MMM YYYY hh:mm:ss zzz", "****, dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d hh:mm:ss YYYY", "***, dd-MMM-YYYY hh:mm:ss zzz", "***, dd-MMM-YYYY hh-mm-ss zzz", "***, dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh:mm:ss zzz", "*** dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh-mm-ss zzz", "***,dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d YYYY hh:mm:ss zzz"});

    public static final GMTDate fromCookieToGmtDate(String str) {
        e0.checkNotNullParameter(str, "<this>");
        String string = n0.trim(str).toString();
        try {
            return new CookieDateParser().parse(string);
        } catch (InvalidCookieDateException unused) {
            return fromHttpToGmtDate(string);
        }
    }

    public static final GMTDate fromHttpToGmtDate(String str) {
        e0.checkNotNullParameter(str, "<this>");
        String string = n0.trim(str).toString();
        Iterator<String> it = HTTP_DATE_FORMATS.iterator();
        while (it.hasNext()) {
            try {
                return new GMTDateParser(it.next()).parse(str);
            } catch (InvalidDateStringException unused) {
            }
        }
        throw new IllegalStateException(("Failed to parse date: " + string).toString());
    }

    private static final String padZero(int i10, int i11) {
        return n0.padStart(String.valueOf(i10), i11, '0');
    }

    public static final String toHttpDate(GMTDate gMTDate) {
        e0.checkNotNullParameter(gMTDate, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(gMTDate.getDayOfWeek().getValue() + ", ");
        sb2.append(padZero(gMTDate.getDayOfMonth(), 2) + ' ');
        sb2.append(gMTDate.getMonth().getValue() + ' ');
        sb2.append(padZero(gMTDate.getYear(), 4));
        sb2.append(" " + padZero(gMTDate.getHours(), 2) + AbstractJsonLexerKt.COLON + padZero(gMTDate.getMinutes(), 2) + AbstractJsonLexerKt.COLON + padZero(gMTDate.getSeconds(), 2) + ' ');
        sb2.append("GMT");
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
