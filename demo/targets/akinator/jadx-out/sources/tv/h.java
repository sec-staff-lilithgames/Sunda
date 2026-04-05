package tv;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.k0;
import sv.n0;
import sv.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h {
    public static final long a(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? f.m7184constructorimpl((qv.v.coerceIn(j10, -4611686018427387903L, 4611686018427387903L) << 1) + 1) : b(j10 * 1000000);
    }

    public static final long access$durationOfNanosNormalized(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? f.m7184constructorimpl(((j10 / 1000000) << 1) + 1) : b(j10);
    }

    public static final long access$millisToNanos(long j10) {
        return j10 * 1000000;
    }

    public static final long access$nanosToMillis(long j10) {
        return j10 / 1000000;
    }

    public static final long access$parseDuration(String str, boolean z10) {
        int i10;
        char cCharAt;
        char cCharAt2;
        int i11;
        boolean z11;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        e eVar = f.f87433c;
        long jM7177getZEROUwyO8pc = eVar.m7177getZEROUwyO8pc();
        char cCharAt3 = str.charAt(0);
        int i12 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z12 = i12 > 0;
        boolean z13 = z12 && n0.startsWith$default((CharSequence) str, '-', false, 2, (Object) null);
        if (length <= i12) {
            throw new IllegalArgumentException("No components");
        }
        char cCharAt4 = str.charAt(i12);
        char c10 = AbstractJsonLexerKt.COLON;
        char c11 = '0';
        if (cCharAt4 == 'P') {
            int i13 = i12 + 1;
            if (i13 == length) {
                throw new IllegalArgumentException();
            }
            boolean z14 = false;
            i iVar = null;
            while (i13 < length) {
                if (str.charAt(i13) != 'T') {
                    int i14 = i13;
                    while (true) {
                        if (i14 >= str.length()) {
                            i11 = length;
                            break;
                        }
                        char cCharAt5 = str.charAt(i14);
                        if (c11 > cCharAt5 || cCharAt5 >= c10) {
                            i11 = length;
                            if (!n0.contains$default((CharSequence) "+-.", cCharAt5, false, 2, (Object) null)) {
                                break;
                            }
                        } else {
                            i11 = length;
                        }
                        i14++;
                        length = i11;
                        c11 = '0';
                        c10 = AbstractJsonLexerKt.COLON;
                    }
                    e0.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i13, i14);
                    e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length2 = strSubstring.length() + i13;
                    if (length2 < 0 || length2 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                    }
                    char cCharAt6 = str.charAt(length2);
                    int i15 = length2 + 1;
                    i iVarDurationUnitByIsoChar = m.durationUnitByIsoChar(cCharAt6, z14);
                    if (iVar != null && iVar.compareTo(iVarDurationUnitByIsoChar) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default = n0.indexOf$default((CharSequence) strSubstring, '.', 0, false, 6, (Object) null);
                    if (iVarDurationUnitByIsoChar != i.f87442g || iIndexOf$default <= 0) {
                        z11 = z14;
                        jM7177getZEROUwyO8pc = f.m7208plusLRDsOJo(jM7177getZEROUwyO8pc, toDuration(c(strSubstring), iVarDurationUnitByIsoChar));
                    } else {
                        e0.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iIndexOf$default);
                        e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        z11 = z14;
                        long jM7208plusLRDsOJo = f.m7208plusLRDsOJo(jM7177getZEROUwyO8pc, toDuration(c(strSubstring2), iVarDurationUnitByIsoChar));
                        e0.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iIndexOf$default);
                        e0.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jM7177getZEROUwyO8pc = f.m7208plusLRDsOJo(jM7208plusLRDsOJo, toDuration(Double.parseDouble(strSubstring3), iVarDurationUnitByIsoChar));
                    }
                    z14 = z11;
                    iVar = iVarDurationUnitByIsoChar;
                    i13 = i15;
                    length = i11;
                    c11 = '0';
                    c10 = AbstractJsonLexerKt.COLON;
                } else {
                    if (z14 || (i13 = i13 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z14 = true;
                }
            }
        } else {
            if (z10) {
                throw new IllegalArgumentException();
            }
            char c12 = '0';
            if (k0.regionMatches(str, i12, "Infinity", 0, Math.max(length - i12, 8), true)) {
                jM7177getZEROUwyO8pc = eVar.m7175getINFINITEUwyO8pc();
            } else {
                boolean z15 = !z12;
                if (z12 && str.charAt(i12) == '(' && p0.last(str) == ')') {
                    i12++;
                    int i16 = length - 1;
                    if (i12 == i16) {
                        throw new IllegalArgumentException("No components");
                    }
                    i10 = i16;
                    z15 = true;
                } else {
                    i10 = length;
                }
                boolean z16 = false;
                i iVar2 = null;
                while (i12 < i10) {
                    if (z16 && z15) {
                        while (i12 < str.length() && str.charAt(i12) == ' ') {
                            i12++;
                        }
                    }
                    int i17 = i12;
                    while (i17 < str.length() && ((c12 <= (cCharAt2 = str.charAt(i17)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i17++;
                    }
                    e0.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(i12, i17);
                    e0.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = strSubstring4.length() + i12;
                    int i18 = length3;
                    while (i18 < str.length() && 'a' <= (cCharAt = str.charAt(i18)) && cCharAt < '{') {
                        i18++;
                    }
                    e0.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length3, i18);
                    e0.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    int length4 = length3 + strSubstring5.length();
                    i iVarDurationUnitByShortName = m.durationUnitByShortName(strSubstring5);
                    if (iVar2 != null && iVar2.compareTo(iVarDurationUnitByShortName) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iIndexOf$default2 = n0.indexOf$default((CharSequence) strSubstring4, '.', 0, false, 6, (Object) null);
                    if (iIndexOf$default2 > 0) {
                        e0.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iIndexOf$default2);
                        e0.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        long jM7208plusLRDsOJo2 = f.m7208plusLRDsOJo(jM7177getZEROUwyO8pc, toDuration(Long.parseLong(strSubstring6), iVarDurationUnitByShortName));
                        e0.checkNotNull(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iIndexOf$default2);
                        e0.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        jM7177getZEROUwyO8pc = f.m7208plusLRDsOJo(jM7208plusLRDsOJo2, toDuration(Double.parseDouble(strSubstring7), iVarDurationUnitByShortName));
                        if (length4 < i10) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jM7177getZEROUwyO8pc = f.m7208plusLRDsOJo(jM7177getZEROUwyO8pc, toDuration(Long.parseLong(strSubstring4), iVarDurationUnitByShortName));
                    }
                    iVar2 = iVarDurationUnitByShortName;
                    i12 = length4;
                    z16 = true;
                    c12 = '0';
                }
            }
        }
        return z13 ? f.m7223unaryMinusUwyO8pc(jM7177getZEROUwyO8pc) : jM7177getZEROUwyO8pc;
    }

    public static final long b(long j10) {
        return f.m7184constructorimpl(j10 << 1);
    }

    public static final long c(String str) {
        char cCharAt;
        int length = str.length();
        int i10 = (length <= 0 || !n0.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i10 > 16) {
            int i11 = i10;
            while (true) {
                if (i10 < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == '0') {
                        if (i11 == i10) {
                            i11++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i10++;
                } else if (length - i11 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!k0.startsWith$default(str, "+", false, 2, null) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(p0.drop(str, 1));
    }

    public static final long toDuration(int i10, i unit) {
        e0.checkNotNullParameter(unit, "unit");
        return unit.compareTo(i.f87442g) <= 0 ? b(k.convertDurationUnitOverflow(i10, unit, i.f87439c)) : toDuration(i10, unit);
    }

    public static final long toDuration(long j10, i unit) {
        e0.checkNotNullParameter(unit, "unit");
        i iVar = i.f87439c;
        long jConvertDurationUnitOverflow = k.convertDurationUnitOverflow(4611686018426999999L, iVar, unit);
        if ((-jConvertDurationUnitOverflow) <= j10 && j10 <= jConvertDurationUnitOverflow) {
            return b(k.convertDurationUnitOverflow(j10, unit, iVar));
        }
        return f.m7184constructorimpl((qv.v.coerceIn(k.convertDurationUnit(j10, unit, i.f87441f), -4611686018427387903L, 4611686018427387903L) << 1) + 1);
    }

    public static final long toDuration(double d10, i unit) {
        e0.checkNotNullParameter(unit, "unit");
        double dConvertDurationUnit = k.convertDurationUnit(d10, unit, i.f87439c);
        if (!Double.isNaN(dConvertDurationUnit)) {
            long jRoundToLong = mv.d.roundToLong(dConvertDurationUnit);
            if (-4611686018426999999L <= jRoundToLong && jRoundToLong < 4611686018427000000L) {
                return b(jRoundToLong);
            }
            return a(mv.d.roundToLong(k.convertDurationUnit(d10, unit, i.f87441f)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }
}
