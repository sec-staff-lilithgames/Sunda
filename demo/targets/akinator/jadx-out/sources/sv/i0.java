package sv;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class i0 extends h0 {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.i0.a(java.lang.String):boolean");
    }

    public static final BigDecimal toBigDecimalOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        try {
            if (a(str)) {
                return new BigDecimal(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static final BigInteger toBigIntegerOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return toBigIntegerOrNull(str, 10);
    }

    public static Double toDoubleOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        try {
            if (a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Float toFloatOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        try {
            if (a(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static final BigInteger toBigIntegerOrNull(String str, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        e.checkRadix(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i11 = str.charAt(0) == '-' ? 1 : 0; i11 < length; i11++) {
                if (e.digitOf(str.charAt(i11), i10) < 0) {
                    return null;
                }
            }
        } else if (e.digitOf(str.charAt(0), i10) < 0) {
            return null;
        }
        return new BigInteger(str, e.checkRadix(i10));
    }

    public static final BigDecimal toBigDecimalOrNull(String str, MathContext mathContext) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(mathContext, "mathContext");
        try {
            if (a(str)) {
                return new BigDecimal(str, mathContext);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
