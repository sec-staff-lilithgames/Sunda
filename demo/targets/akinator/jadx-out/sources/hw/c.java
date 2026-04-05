package hw;

import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c {
    public static final int binarySearch(int i10, int i11, l compare) {
        e0.checkNotNullParameter(compare, "compare");
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) / 2;
            int iIntValue = ((Number) compare.invoke(Integer.valueOf(i13))).intValue();
            if (iIntValue < 0) {
                i12 = i13 - 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i10 = i13 + 1;
            }
        }
        return (-i10) - 1;
    }

    public static final int read14BitInt(String str, int i10) {
        e0.checkNotNullParameter(str, "<this>");
        char cCharAt = str.charAt(i10);
        return (cCharAt << 7) + str.charAt(i10 + 1);
    }
}
