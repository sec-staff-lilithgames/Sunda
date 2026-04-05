package cc;

import java.math.BigDecimal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {
    public static NumberFormatException a(RuntimeException runtimeException, String str) {
        String message = runtimeException.getMessage();
        if (message == null) {
            message = "Not a valid number representation";
        }
        int length = str.length();
        return new NumberFormatException(a.b.m("Value ", length <= 1000 ? a.b.l("\"", str, "\"") : String.format("\"%s\" (truncated to %d chars (from %d))", str.substring(0, 1000), 1000, Integer.valueOf(length)), " can not be deserialized as `java.math.BigDecimal`, reason:  ", message));
    }

    public static NumberFormatException b(RuntimeException runtimeException, char[] cArr, int i10, int i11) {
        String message = runtimeException.getMessage();
        if (message == null) {
            message = "Not a valid number representation";
        }
        return new NumberFormatException(a.b.m("Value ", i11 <= 1000 ? a.b.l("\"", new String(cArr, i10, i11), "\"") : String.format("\"%s\" (truncated to %d chars (from %d))", new String(cArr, i10, 1000), 1000, Integer.valueOf(i11)), " can not be deserialized as `java.math.BigDecimal`, reason:  ", message));
    }

    public static BigDecimal parse(String str) {
        try {
            return str.length() < 500 ? new BigDecimal(str) : bc.n.parseBigDecimal(str);
        } catch (ArithmeticException e10) {
            e = e10;
            throw a(e, str);
        } catch (NumberFormatException e11) {
            e = e11;
            throw a(e, str);
        }
    }

    public static BigDecimal parseWithFastParser(String str) {
        try {
            return bc.n.parseBigDecimal(str);
        } catch (ArithmeticException | NumberFormatException e10) {
            throw a(e10, str);
        }
    }

    public static BigDecimal parseWithFastParser(char[] cArr, int i10, int i11) {
        try {
            return bc.n.parseBigDecimal(cArr, i10, i11);
        } catch (ArithmeticException | NumberFormatException e10) {
            throw b(e10, cArr, i10, i11);
        }
    }

    public static BigDecimal parse(char[] cArr, int i10, int i11) {
        try {
            if (i11 < 500) {
                return new BigDecimal(cArr, i10, i11);
            }
            return bc.n.parseBigDecimal(cArr, i10, i11);
        } catch (ArithmeticException e10) {
            e = e10;
            throw b(e, cArr, i10, i11);
        } catch (NumberFormatException e11) {
            e = e11;
            throw b(e, cArr, i10, i11);
        }
    }

    public static BigDecimal parse(char[] cArr) {
        return parse(cArr, 0, cArr.length);
    }
}
