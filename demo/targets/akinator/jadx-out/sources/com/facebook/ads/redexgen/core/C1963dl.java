package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1963dl implements LA {
    public static byte[] A01;
    public static String[] A02 = {"DkadTd3hzRbbbOHMxE7l2HcIgF77c2Wg", "0ZuZJmAU8cZIcQf3szyGmXM5AilOTJtQ", "s7OtZpyonCiYFMYFU1WCjmQvHXym6FPj", "3vySfQzjuhiXchKud6RTPthf0ulaYdWV", "CDvhYqwZm7dYJUP65EPDHmFcAmisUun7", "F", "FueLju8lXT0mR7zmJE5", "4fFvsSsvSh6WJapTHyxRGbQ9SIVR6447"};
    public final /* synthetic */ C1911cu A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-89, -85, -97, -91, -93};
        String[] strArr = A02;
        if (strArr[4].charAt(11) == strArr[0].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "8YVOAkqjlCZIfPO923uAjm7vB9HJVDjx";
        strArr2[0] = "zjuPMStvlm1D7VGZIKzQB2odE0473uv0";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C1963dl(C1911cu c1911cu) {
        this.A00 = c1911cu;
    }

    @Override // com.facebook.ads.redexgen.core.LA
    public final void AAq(Throwable th2) {
        this.A00.A08().AAy(A00(0, 5, 39), AbstractC1550Sv.A1e, new C1551Sw(th2));
    }

    @Override // com.facebook.ads.redexgen.core.LA
    public final void AB4(Throwable th2) {
        this.A00.A08().AAy(A00(0, 5, 39), AbstractC1550Sv.A1g, new C1551Sw(th2));
    }

    @Override // com.facebook.ads.redexgen.core.LA
    public final void AGk(String str, int i10, String str2, Long l9, Long l10, C1346Kv c1346Kv) {
        SI.A05(this.A00, c1346Kv.A06, c1346Kv.A08, c1346Kv.A09, c1346Kv.A07, c1346Kv.A03, i10, str2, l9, l10, null);
    }

    @Override // com.facebook.ads.redexgen.core.LA
    public final void AGl(String str, boolean z10, C1346Kv c1346Kv) {
        SI.A04(this.A00, new SH(c1346Kv.A06, c1346Kv.A08, c1346Kv.A07, c1346Kv.A03, str), z10);
    }
}
