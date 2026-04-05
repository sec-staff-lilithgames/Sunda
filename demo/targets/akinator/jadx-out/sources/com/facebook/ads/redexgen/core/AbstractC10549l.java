package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC10549l implements InterfaceC2549nl {
    public static String[] A04 = {"fHQEiP1zlTMmcDhuRJvCUYhlqM3A1WdS", "0xjR5o24wRXCnK6P48nvJnLVp1A7yIdC", "SqWyKblZmsOi3mnFjBlOyIvINI4fuoz1", "GUT90kd8g0iIA", "yfLAFjbfQv", "f1jCtkpjn8LmH02gI7EE0X95Og8KENXi", "pIy67q2NMZ", "VUF0F4IbO37j7MJUWX75PYUeN7L9nYYd"};
    public int A00;
    public AnonymousClass56 A01;
    public final ArrayList<C5H> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    public /* synthetic */ Map A8l() {
        return AbstractC09474v.A00(this);
    }

    public AbstractC10549l(boolean z10) {
        this.A03 = z10;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0D(com.facebook.ads.redexgen.core.AnonymousClass56 r4, boolean r5) {
        /*
            r3 = this;
            r3.A01 = r4
            r2 = 0
        L3:
            int r0 = r3.A00
            if (r2 >= r0) goto L17
            java.util.ArrayList<com.facebook.ads.redexgen.X.5H> r0 = r3.A02
            java.lang.Object r1 = r0.get(r2)
            com.facebook.ads.redexgen.X.5H r1 = (com.facebook.ads.redexgen.core.C5H) r1
            boolean r0 = r3.A03
            r1.AFX(r3, r4, r0, r5)
            int r2 = r2 + 1
            goto L3
        L17:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC10549l.A0D(com.facebook.ads.redexgen.X.56, boolean):void");
    }

    public final void A0E() {
        AnonymousClass56 anonymousClass56 = (AnonymousClass56) AbstractC09264a.A0f(this.A01);
        for (int i10 = 0; i10 < this.A00; i10++) {
            this.A02.get(i10).AFW(this, anonymousClass56, this.A03);
        }
        this.A01 = null;
    }

    public final void A0F(int i10) {
        AnonymousClass56 anonymousClass56 = (AnonymousClass56) AbstractC09264a.A0f(this.A01);
        for (int i11 = 0; i11 < this.A00; i11++) {
            this.A02.get(i11).ACg(this, anonymousClass56, this.A03, i10);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(com.facebook.ads.redexgen.core.AnonymousClass56 r5) {
        /*
            r4 = this;
            r3 = 0
        L1:
            int r0 = r4.A00
            if (r3 >= r0) goto L29
            java.util.ArrayList<com.facebook.ads.redexgen.X.5H> r0 = r4.A02
            r0.get(r3)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.AbstractC10549l.A04
            r0 = 7
            r1 = r1[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            r0 = 80
            if (r1 == r0) goto L23
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC10549l.A04
            java.lang.String r1 = "KcnUkvSyZAFqCmq9nk7LLPyjKQRUe1pa"
            r0 = 2
            r2[r0] = r1
            int r3 = r3 + 1
            goto L1
        L23:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC10549l.A0G(com.facebook.ads.redexgen.X.56):void");
    }

    public final void A0H(AnonymousClass56 anonymousClass56) {
        A0D(anonymousClass56, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2549nl
    public final void A3v(C5H c5h) {
        C3M.A01(c5h);
        if (!this.A02.contains(c5h)) {
            this.A02.add(c5h);
            this.A00++;
        }
    }
}
