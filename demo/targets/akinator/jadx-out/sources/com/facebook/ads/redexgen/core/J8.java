package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class J8 implements ZY {
    public static byte[] A01;
    public static String[] A02 = {"Lf", "nmAxyBcQYqE4UmHMsUF1rAa8zTrMAPgx", "yXHjwHYuNIdrzaXYLvaZZ8rDuk", "9P19JGz6dEYaA5InwGx6w36V1Sjc1fgT", "Uaeemoya7byMjdbMYqkdDOMCW0kva5u1", "a9sExJmhm07IJOfFlJQHVREgKDfvTtqT", "zS9IM7X0AIqJ7SZD2m", "JScTq5ptQGF6W5ukeGazDvn9iL3"};
    public final /* synthetic */ C1291Is A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -31, -45, -32, -51, -36, -49, -28, -41, -43, -49, -30, -41, -35, -36, -51, -41, -49, -48};
    }

    static {
        A01();
    }

    public J8(C1291Is c1291Is) {
        this.A00 = c1291Is;
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AES(String str) {
        this.A00.A0K = false;
        this.A00.A07.setProgress(100);
        XP.A0L(this.A00.A07, 8);
        if (this.A00.A0Y.A1d() && this.A00.A08 != null) {
            String strA0y = this.A00.A0Y.A0y();
            if (!TextUtils.isEmpty(strA0y)) {
                this.A00.A08.loadUrl(strA0y);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEU(String str) throws SecurityException {
        this.A00.A0K = true;
        XP.A0L(this.A00.A07, 0);
        this.A00.A06.setUrl(str);
        if (!this.A00.A0I && this.A00.A00 > 1) {
            this.A00.A0I = true;
            C1291Is c1291Is = this.A00;
            String[] strArr = A02;
            if (strArr[4].charAt(17) == strArr[5].charAt(17)) {
                throw new RuntimeException();
            }
            A02[2] = "wX256yuF2";
            c1291Is.A0l(A00(0, 19, 95));
        }
        C1291Is.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEq(int i10) {
        if (this.A00.A0K) {
            this.A00.A07.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEt(String str) {
        this.A00.A06.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEw() {
        this.A00.A0c.A0D().ACf(14);
    }
}
