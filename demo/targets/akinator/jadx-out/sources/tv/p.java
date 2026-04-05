package tv;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.sfbx.appconsent.core.BuildConfig;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f87454a = {1, 10, 100, 1000, 10000, DefaultOggSeeker.MATCH_BYTE_RANGE, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f87455b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f87456c = {3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f87457d = {1, 2, 4, 5, 7, 8};

    public static final void a(StringBuilder sb2, StringBuilder sb3, int i10) {
        if (i10 < 10) {
            sb2.append('0');
        }
        sb3.append(i10);
    }

    public static final String access$formatIso(n nVar) {
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        c0 c0VarFromInstant = c0.f87425h.fromInstant(nVar);
        int year = c0VarFromInstant.getYear();
        int i10 = 0;
        if (Math.abs(year) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (year >= 0) {
                sb3.append(year + 10000);
                e0.checkNotNullExpressionValue(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(year - 10000);
                e0.checkNotNullExpressionValue(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (year >= 10000) {
                sb2.append('+');
            }
            sb2.append(year);
        }
        sb2.append('-');
        a(sb2, sb2, c0VarFromInstant.getMonth());
        sb2.append('-');
        a(sb2, sb2, c0VarFromInstant.getDay());
        sb2.append('T');
        a(sb2, sb2, c0VarFromInstant.getHour());
        sb2.append(AbstractJsonLexerKt.COLON);
        a(sb2, sb2, c0VarFromInstant.getMinute());
        sb2.append(AbstractJsonLexerKt.COLON);
        a(sb2, sb2, c0VarFromInstant.getSecond());
        if (c0VarFromInstant.getNanosecond() != 0) {
            sb2.append('.');
            while (true) {
                int nanosecond = c0VarFromInstant.getNanosecond();
                int i11 = i10 + 1;
                iArr = f87454a;
                if (nanosecond % iArr[i11] != 0) {
                    break;
                }
                i10 = i11;
            }
            int i12 = i10 - (i10 % 3);
            String strValueOf = String.valueOf((c0VarFromInstant.getNanosecond() / iArr[i12]) + iArr[9 - i12]);
            e0.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
        }
        sb2.append('Z');
        return sb2.toString();
    }

    public static final s access$parseIso(CharSequence charSequence) {
        int i10;
        int i11;
        int iB;
        char cCharAt;
        char cCharAt2;
        if (charSequence.length() == 0) {
            return new q("An empty string is not a valid Instant", charSequence);
        }
        char cCharAt3 = charSequence.charAt(0);
        if (cCharAt3 == '+' || cCharAt3 == '-') {
            i10 = 1;
        } else {
            i10 = 0;
            cCharAt3 = ' ';
        }
        int iCharAt = 0;
        int i12 = i10;
        while (i12 < charSequence.length() && '0' <= (cCharAt2 = charSequence.charAt(i12)) && cCharAt2 < ':') {
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i12) - '0');
            i12++;
        }
        int i13 = i12 - i10;
        if (i13 > 10) {
            return c(charSequence, "Expected at most 10 digits for the year number, got " + i13 + " digits");
        }
        if (i13 == 10 && e0.compare((int) charSequence.charAt(i10), 50) >= 0) {
            return c(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i13 + " digits");
        }
        if (i13 < 4) {
            return c(charSequence, "The year number must be padded to 4 digits, got " + i13 + " digits");
        }
        if (cCharAt3 == '+' && i13 == 4) {
            return c(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (cCharAt3 == ' ' && i13 != 4) {
            return c(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (cCharAt3 == '-') {
            iCharAt = -iCharAt;
        }
        int i14 = iCharAt;
        int i15 = i12 + 16;
        if (charSequence.length() < i15) {
            return c(charSequence, "The input string is too short");
        }
        q qVarB = b(charSequence, "'-'", i12, new t5.s(2));
        if (qVarB != null) {
            return qVarB;
        }
        q qVarB2 = b(charSequence, "'-'", i12 + 3, new t5.s(3));
        if (qVarB2 != null) {
            return qVarB2;
        }
        q qVarB3 = b(charSequence, "'T' or 't'", i12 + 6, new t5.s(4));
        if (qVarB3 != null) {
            return qVarB3;
        }
        q qVarB4 = b(charSequence, "':'", i12 + 9, new t5.s(5));
        if (qVarB4 != null) {
            return qVarB4;
        }
        q qVarB5 = b(charSequence, "':'", i12 + 12, new t5.s(6));
        if (qVarB5 != null) {
            return qVarB5;
        }
        for (int i16 = 0; i16 < 10; i16++) {
            q qVarB6 = b(charSequence, "an ASCII digit", f87455b[i16] + i12, new t5.s(7));
            if (qVarB6 != null) {
                return qVarB6;
            }
        }
        int iD = d(charSequence, i12 + 1);
        int iD2 = d(charSequence, i12 + 4);
        int iD3 = d(charSequence, i12 + 7);
        int iD4 = d(charSequence, i12 + 10);
        int iD5 = d(charSequence, i12 + 13);
        int i17 = i12 + 15;
        if (charSequence.charAt(i17) == '.') {
            i17 = i15;
            int iCharAt2 = 0;
            while (i17 < charSequence.length() && '0' <= (cCharAt = charSequence.charAt(i17)) && cCharAt < ':') {
                iCharAt2 = (iCharAt2 * 10) + (charSequence.charAt(i17) - '0');
                i17++;
            }
            int i18 = i17 - i15;
            if (1 > i18 || i18 >= 10) {
                return c(charSequence, "1..9 digits are supported for the fraction of the second, got " + i18 + " digits");
            }
            i11 = iCharAt2 * f87454a[9 - i18];
        } else {
            i11 = 0;
        }
        if (i17 >= charSequence.length()) {
            return c(charSequence, "The UTC offset at the end of the string is missing");
        }
        char cCharAt4 = charSequence.charAt(i17);
        if (cCharAt4 == '+' || cCharAt4 == '-') {
            int length = charSequence.length() - i17;
            if (length > 9) {
                return c(charSequence, "The UTC offset string \"" + e(charSequence.subSequence(i17, charSequence.length()).toString(), 16) + "\" is too long");
            }
            if (length % 3 != 0) {
                return c(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i17, charSequence.length()).toString() + AbstractJsonLexerKt.STRING);
            }
            int i19 = 0;
            for (int i20 = 2; i19 < i20; i20 = 2) {
                int i21 = i17 + f87456c[i19];
                if (i21 >= charSequence.length()) {
                    break;
                }
                if (charSequence.charAt(i21) != ':') {
                    StringBuilder sbT = o2.t(i21, "Expected ':' at index ", ", got '");
                    sbT.append(charSequence.charAt(i21));
                    sbT.append('\'');
                    return c(charSequence, sbT.toString());
                }
                i19++;
            }
            int i22 = 0;
            for (int i23 = 6; i22 < i23; i23 = 6) {
                int i24 = f87457d[i22] + i17;
                if (i24 >= charSequence.length()) {
                    break;
                }
                char cCharAt5 = charSequence.charAt(i24);
                if ('0' > cCharAt5 || cCharAt5 >= ':') {
                    StringBuilder sbT2 = o2.t(i24, "Expected an ASCII digit at index ", ", got '");
                    sbT2.append(charSequence.charAt(i24));
                    sbT2.append('\'');
                    return c(charSequence, sbT2.toString());
                }
                i22++;
            }
            int iD6 = d(charSequence, i17 + 1);
            int iD7 = length > 3 ? d(charSequence, i17 + 4) : 0;
            int iD8 = length > 6 ? d(charSequence, i17 + 7) : 0;
            if (iD7 > 59) {
                return c(charSequence, "Expected offset-minute-of-hour in 0..59, got " + iD7);
            }
            if (iD8 > 59) {
                return c(charSequence, "Expected offset-second-of-minute in 0..59, got " + iD8);
            }
            if (iD6 > 17 && (iD6 != 18 || iD7 != 0 || iD8 != 0)) {
                return c(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i17, charSequence.length()).toString());
            }
            iB = (cCharAt4 == '-' ? -1 : 1) * j1.o2.B(iD7, 60, iD6 * BuildConfig.VERSION_CODE, iD8);
        } else {
            if (cCharAt4 != 'Z' && cCharAt4 != 'z') {
                return c(charSequence, "Expected the UTC offset at position " + i17 + ", got '" + cCharAt4 + '\'');
            }
            int i25 = i17 + 1;
            if (charSequence.length() != i25) {
                return c(charSequence, "Extra text after the instant at position " + i25);
            }
            iB = 0;
        }
        if (1 > iD || iD >= 13) {
            return c(charSequence, "Expected a month number in 1..12, got " + iD);
        }
        if (1 <= iD2) {
            if (iD2 <= (iD != 2 ? (iD == 4 || iD == 6 || iD == 9 || iD == 11) ? 30 : 31 : isLeapYear(i14) ? 29 : 28)) {
                if (iD3 > 23) {
                    return c(charSequence, "Expected hour in 0..23, got " + iD3);
                }
                if (iD4 > 59) {
                    return c(charSequence, "Expected minute-of-hour in 0..59, got " + iD4);
                }
                if (iD5 > 59) {
                    return c(charSequence, "Expected second-of-minute in 0..59, got " + iD5);
                }
                c0 c0Var = new c0(i14, iD, iD2, iD3, iD4, iD5, i11);
                long year = c0Var.getYear();
                long j10 = 365 * year;
                long month = (year >= 0 ? ((year + 399) / 400) + (((3 + year) / 4) - ((99 + year) / 100)) + j10 : j10 - ((year / AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR) + ((year / (-4)) - (year / (-100))))) + (((c0Var.getMonth() * 367) - 362) / 12) + (c0Var.getDay() - 1);
                if (c0Var.getMonth() > 2) {
                    month = !isLeapYear(c0Var.getYear()) ? month - 2 : (-1) + month;
                }
                return new r((((month - 719528) * 86400) + (c0Var.getSecond() + ((c0Var.getMinute() * 60) + (c0Var.getHour() * BuildConfig.VERSION_CODE)))) - iB, c0Var.getNanosecond());
            }
        }
        StringBuilder sbF = w0.i.f(iD, i14, "Expected a valid day-of-month for month ", " of year ", ", got ");
        sbF.append(iD2);
        return c(charSequence, sbF.toString());
    }

    public static final q b(CharSequence charSequence, String str, int i10, kv.l lVar) {
        char cCharAt = charSequence.charAt(i10);
        if (((Boolean) lVar.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return c(charSequence, "Expected " + str + ", but got '" + cCharAt + "' at position " + i10);
    }

    public static final q c(CharSequence charSequence, String str) {
        StringBuilder sbT = a.b.t(str, " when parsing an Instant from \"");
        sbT.append(e(charSequence, 64));
        sbT.append(AbstractJsonLexerKt.STRING);
        return new q(sbT.toString(), charSequence);
    }

    public static final int d(CharSequence charSequence, int i10) {
        return (charSequence.charAt(i10 + 1) - '0') + ((charSequence.charAt(i10) - '0') * 10);
    }

    public static final String e(CharSequence charSequence, int i10) {
        if (charSequence.length() <= i10) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i10).toString() + APSSharedUtil.TRUNCATE_SEPARATOR;
    }

    public static final boolean isLeapYear(int i10) {
        if ((i10 & 3) == 0) {
            return i10 % 100 != 0 || i10 % 400 == 0;
        }
        return false;
    }

    public static /* synthetic */ void isDistantFuture$annotations(n nVar) {
    }

    public static /* synthetic */ void isDistantPast$annotations(n nVar) {
    }
}
