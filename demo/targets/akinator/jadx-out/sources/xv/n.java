package xv;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements Comparator {
    @Override // java.util.Comparator
    public int compare(String a10, String b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(a10, "a");
        kotlin.jvm.internal.e0.checkNotNullParameter(b10, "b");
        int iMin = Math.min(a10.length(), b10.length());
        for (int i10 = 4; i10 < iMin; i10++) {
            char cCharAt = a10.charAt(i10);
            char cCharAt2 = b10.charAt(i10);
            if (cCharAt != cCharAt2) {
                return kotlin.jvm.internal.e0.compare((int) cCharAt, (int) cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a10.length();
        int length2 = b10.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
