package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1815bM implements View.OnTouchListener {
    public static byte[] A01;
    public static String[] A02 = {"0HVxtLG0sPkx2", "hiZzr77KokQTc", "mNnSSdkwXzrOg41hebGrtMF8fEOYdjGE", "NiiVAR3ay3HziijWMkU57MyJi0qOk8bf", "5RCf0Yx637qOFKYGhhAOV12LnRlJgv3P", "3PZq2jvav8U89", "SINF4Npt4bG7GbW3rji", "p0cbgO4lXEkOYy0C0Gpe"};
    public final /* synthetic */ C1291Is A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] - i12) - 39;
            String[] strArr = A02;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "15sr1U6GzUIP4MnHZRSc";
            strArr2[5] = "N9mozJJ8LQfhA";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-83, -85, -99, -86, -105, -101, -92, -95, -101, -93, -105, -95, -103, -102, -67, -69, -83, -70, -89, -77, -83, -63, -72, -87, -84, -89, -85, -76, -79, -85, -77, -89, -79, -87, -86};
    }

    static {
        A01();
    }

    public ViewOnTouchListenerC1815bM(C1291Is c1291Is) {
        this.A00 = c1291Is;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getActionMasked()
            r3 = 1
            switch(r0) {
                case 0: goto L78;
                case 1: goto L1d;
                default: goto L8;
            }
        L8:
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.ViewOnTouchListenerC1815bM.A02
            r0 = 4
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 54
            if (r1 == r0) goto Laa
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1d:
            com.facebook.ads.redexgen.X.Is r4 = r5.A00
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.ViewOnTouchListenerC1815bM.A02
            r0 = 1
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L60
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.ViewOnTouchListenerC1815bM.A02
            java.lang.String r1 = "OcZWYNEqCaLP"
            r0 = 6
            r2[r0] = r1
            com.facebook.ads.redexgen.core.C1291Is.A04(r4)
            com.facebook.ads.redexgen.X.Is r0 = r5.A00
            boolean r0 = com.facebook.ads.redexgen.core.C1291Is.A12(r0)
            if (r0 != 0) goto L8
        L43:
            com.facebook.ads.redexgen.X.Is r0 = r5.A00
            int r1 = com.facebook.ads.redexgen.core.C1291Is.A03(r0)
            r0 = 5
            if (r1 < r0) goto L8
            com.facebook.ads.redexgen.X.Is r0 = r5.A00
            com.facebook.ads.redexgen.core.C1291Is.A16(r0, r3)
            com.facebook.ads.redexgen.X.Is r3 = r5.A00
            r2 = 0
            r1 = 14
            r0 = 17
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.core.C1291Is.A0f(r3, r0)
            goto L8
        L60:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.ViewOnTouchListenerC1815bM.A02
            java.lang.String r1 = "icFIHzt0T1qa8"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "30YVfIVk012ko"
            r0 = 0
            r2[r0] = r1
            com.facebook.ads.redexgen.core.C1291Is.A04(r4)
            com.facebook.ads.redexgen.X.Is r0 = r5.A00
            boolean r0 = com.facebook.ads.redexgen.core.C1291Is.A12(r0)
            if (r0 != 0) goto L8
            goto L43
        L78:
            com.facebook.ads.redexgen.X.Is r0 = r5.A00
            boolean r0 = com.facebook.ads.redexgen.core.C1291Is.A11(r0)
            if (r0 != 0) goto L8
            com.facebook.ads.redexgen.X.Is r0 = r5.A00
            android.view.inputmethod.InputMethodManager r0 = com.facebook.ads.redexgen.core.C1291Is.A07(r0)
            if (r0 == 0) goto L8
            com.facebook.ads.redexgen.X.Is r0 = r5.A00
            android.view.inputmethod.InputMethodManager r0 = com.facebook.ads.redexgen.core.C1291Is.A07(r0)
            boolean r0 = r0.isAcceptingText()
            if (r0 == 0) goto L8
            com.facebook.ads.redexgen.X.Is r0 = r5.A00
            com.facebook.ads.redexgen.core.C1291Is.A15(r0, r3)
            com.facebook.ads.redexgen.X.Is r3 = r5.A00
            r2 = 14
            r1 = 21
            r0 = 33
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.core.C1291Is.A0f(r3, r0)
            goto L8
        Laa:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.ViewOnTouchListenerC1815bM.A02
            java.lang.String r1 = "w8TKL5U61DrXWGWK9GXi8K1kZSuhi8qi"
            r0 = 4
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.ViewOnTouchListenerC1815bM.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
