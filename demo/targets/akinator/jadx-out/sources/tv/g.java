package tv;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal[] f87438a;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal();
        }
        f87438a = threadLocalArr;
    }

    public static final String formatToExactDecimals(double d10, int i10) {
        DecimalFormat decimalFormat;
        ThreadLocal[] threadLocalArr = f87438a;
        if (i10 < threadLocalArr.length) {
            ThreadLocal threadLocal = threadLocalArr[i10];
            Object obj = threadLocal.get();
            Object obj2 = obj;
            if (obj == null) {
                DecimalFormat decimalFormat2 = new DecimalFormat("0");
                if (i10 > 0) {
                    decimalFormat2.setMinimumFractionDigits(i10);
                }
                decimalFormat2.setRoundingMode(RoundingMode.HALF_UP);
                threadLocal.set(decimalFormat2);
                obj2 = decimalFormat2;
            }
            decimalFormat = (DecimalFormat) obj2;
        } else {
            decimalFormat = new DecimalFormat("0");
            if (i10 > 0) {
                decimalFormat.setMinimumFractionDigits(i10);
            }
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        }
        String str = decimalFormat.format(d10);
        e0.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final boolean getDurationAssertionsEnabled() {
        return false;
    }
}
