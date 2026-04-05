package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.mS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2468mS implements CL {
    public static String[] A07 = {"KBisateWM8YQ4arKDgRYpdTDxezzMkCv", "VJ2uSooodcJBZOLyoDYKaqw5tYDrMz4W", "bemaZsDF2tY6J54Bg3tOUH55klLpC", "LnVxhCvG0lD6F7ZPu", "7ofy39p1yDzqV7NnIWFVVnn8VzEJdml2", "3pklWVRHTZe0TjeZrFE3TnxhkITdP", "TfKHOeXRiNIOMg3PDS", "WMeybOD3P6lu5fyh7Idh"};
    public Looper A00;
    public Timeline A01;
    public C10167m A02;
    public final ArrayList<CK> A05 = new ArrayList<>(1);
    public final HashSet<CK> A06 = new HashSet<>(1);
    public final CW A04 = new CW();
    public final C9P A03 = new C9P();

    public abstract void A09();

    public abstract void A0A(C5H c5h);

    public final C10167m A00() {
        return (C10167m) C3M.A02(this.A02);
    }

    public final C9P A01(C2461mL c2461mL) {
        return this.A03.A00(0, c2461mL);
    }

    public final CW A02(C2461mL c2461mL) {
        return this.A04.A02(0, c2461mL, 0L);
    }

    public void A03() {
    }

    public void A04() {
    }

    public final void A05(Timeline timeline) {
        this.A01 = timeline;
        Iterator<CK> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().AFI(this, timeline);
        }
    }

    public final void A06(CK ck2) {
        boolean z10 = !this.A06.isEmpty();
        this.A06.remove(ck2);
        if (z10) {
            boolean wasEnabled = this.A06.isEmpty();
            if (wasEnabled) {
                A03();
            }
        }
    }

    public final void A07(CK ck2) {
        C3M.A01(this.A00);
        boolean zIsEmpty = this.A06.isEmpty();
        this.A06.add(ck2);
        if (zIsEmpty) {
            A04();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(com.facebook.ads.redexgen.core.CK r4, com.facebook.ads.redexgen.core.C5H r5, com.facebook.ads.redexgen.core.C10167m r6) {
        /*
            r3 = this;
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r0 = r3.A00
            if (r0 == 0) goto Lc
            android.os.Looper r0 = r3.A00
            if (r0 != r2) goto L31
        Lc:
            r0 = 1
        Ld:
            com.facebook.ads.redexgen.core.C3M.A07(r0)
            r3.A02 = r6
            com.facebook.ads.androidx.media3.common.Timeline r1 = r3.A01
            java.util.ArrayList<com.facebook.ads.redexgen.X.CK> r0 = r3.A05
            r0.add(r4)
            android.os.Looper r0 = r3.A00
            if (r0 != 0) goto L28
            r3.A00 = r2
            java.util.HashSet<com.facebook.ads.redexgen.X.CK> r0 = r3.A06
            r0.add(r4)
            r3.A0A(r5)
        L27:
            return
        L28:
            if (r1 == 0) goto L27
            r3.A07(r4)
            r4.AFI(r3, r1)
            goto L27
        L31:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2468mS.A08(com.facebook.ads.redexgen.X.CK, com.facebook.ads.redexgen.X.5H, com.facebook.ads.redexgen.X.7m):void");
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void A3r(Handler handler, CX cx2) {
        C3M.A01(handler);
        C3M.A01(cx2);
        this.A04.A04(handler, cx2);
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void AGN(CK ck2, C5H c5h) {
        A08(ck2, c5h, C10167m.A03);
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void AH1(CK ck2) {
        this.A05.remove(ck2);
        if (this.A05.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.clear();
            String[] strArr = A07;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "pnZ7WVnnf2PAl7J7h";
            strArr2[6] = "ddcJoNElLz9Uvwup8w";
            A09();
            return;
        }
        A06(ck2);
    }

    @Override // com.facebook.ads.redexgen.core.CL
    public final void AHi(CX cx2) {
        this.A04.A0D(cx2);
    }
}
