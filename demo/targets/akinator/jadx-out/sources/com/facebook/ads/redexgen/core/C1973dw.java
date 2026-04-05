package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.dw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1973dw implements S1 {
    public static byte[] A01;
    public static String[] A02 = {"XX81oR58WpEsQKvqY2LExbYJLqP9XswE", "az8CKzVkexBjitPsCylcg2AVWlGeK3EI", "bGZ3", "xIFKC7mmnDHSKxOkrjRNDYdlMsmKF1A7", "XScWVG1X4Mc8JZxVJlT03KGo8WKkDIiE", "ymPwCIBu7cN5wKkxYqt2Z3a", "4biB1nxlWznGwE3vHvSlKad", "lswyJVFYW7lcf"};
    public final Map<String, AbstractC1528Rz> A00 = new HashMap();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "T1kvqoJ1cX6i4DSx7n80qqGN8Qg91HVj";
            strArr2[3] = "zM5VtNN21yuLINvrTPslJyIzIvAVUrXA";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 74);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{49, 42, 22, 49, 55, 44, 43, 34};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.S1
    public final synchronized String AHr() {
        StringBuilder sb2;
        sb2 = new StringBuilder();
        Iterator<AbstractC1528Rz> it = this.A00.values().iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A00(0, 8, 15));
        }
        return sb2.toString();
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.core.S1
    public final synchronized void reset() {
        this.A00.clear();
    }
}
