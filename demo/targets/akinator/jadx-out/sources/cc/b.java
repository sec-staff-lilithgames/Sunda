package cc;

import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b {
    public static BigInteger parseWithFastParser(String str) {
        try {
            return bc.r.parseBigInteger(str);
        } catch (NumberFormatException e10) {
            if (str.length() > 1000) {
                str = str.substring(0, 1000) + " [truncated]";
            }
            StringBuilder sbO = e3.g.o("Value \"", str, "\" can not be represented as `java.math.BigInteger`, reason: ");
            sbO.append(e10.getMessage());
            throw new NumberFormatException(sbO.toString());
        }
    }

    public static BigInteger parseWithFastParser(String str, int i10) {
        try {
            return bc.r.parseBigInteger(str, i10);
        } catch (NumberFormatException e10) {
            if (str.length() > 1000) {
                str = str.substring(0, 1000) + " [truncated]";
            }
            StringBuilder sbR = a.b.r(i10, "Value \"", str, "\" can not be represented as `java.math.BigInteger` with radix ", ", reason: ");
            sbR.append(e10.getMessage());
            throw new NumberFormatException(sbR.toString());
        }
    }
}
