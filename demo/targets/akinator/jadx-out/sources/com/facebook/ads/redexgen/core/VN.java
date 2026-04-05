package com.facebook.ads.redexgen.core;

import android.graphics.Rect;

/* loaded from: assets/audience_network.dex */
public final class VN {
    public static String[] A02 = {"P6MYZTOvDAaFen8GvswQ7TN6uAA4LWVv", "hYZBnkN7eg3Goj1fCi2fLRcc1xaBLP0T", "hgTfm2gsKyXruwHhjUk", "Xl5p6SNgJSz0NngEgDitAc249tQNQ8ta", "gXDmJbn0MXLGD1TV1woO3x4WUye", "irvXIfdrm7YhWQVUx8qen3XIyPBMomv3", "r42H5ZZ7hG", "IBnhtff"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C2661pu<UE, UJ> c2661pu) {
        if (c2661pu.A06.A05()) {
            return c2661pu.A07.A07();
        }
        if (!c2661pu.A06.A06()) {
            return true;
        }
        return c2661pu.A07.A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A01(com.facebook.ads.redexgen.core.C2661pu<com.facebook.ads.redexgen.core.UE, com.facebook.ads.redexgen.core.UJ> r7, com.facebook.ads.redexgen.core.InterfaceC2652pk r8) {
        /*
            r6 = this;
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r8.A9P(r7)     // Catch: java.lang.IllegalStateException -> L6
        L6:
            r0 = 0
            r5 = 1
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.VN.A02
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto Lb3
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.VN.A02
            java.lang.String r1 = "l0GJDJ6h98NWCV6pJLy8cxtVoo076bMe"
            r0 = 5
            r2[r0] = r1
            if (r3 <= 0) goto L26
            boolean r0 = A00(r7)
            if (r0 == 0) goto L26
            return r5
        L26:
            ModelType r0 = r7.A06
            com.facebook.ads.redexgen.X.UE r0 = (com.facebook.ads.redexgen.core.UE) r0
            android.view.View r1 = r0.A00()
            android.graphics.Rect r0 = r6.A01
            boolean r0 = r1.getGlobalVisibleRect(r0)
            if (r0 == 0) goto L48
            android.graphics.Rect r0 = r6.A01
            int r1 = r0.bottom
            android.graphics.Rect r0 = r6.A01
            int r0 = r0.top
            int r1 = r1 - r0
            if (r1 <= 0) goto L48
            boolean r0 = A00(r7)
            if (r0 == 0) goto L48
            return r5
        L48:
            android.graphics.Rect r0 = r6.A00
            r8.A9O(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.VN.A02
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L8a
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.VN.A02
            java.lang.String r1 = "WH3ZGQ"
            r0 = 2
            r2[r0] = r1
            android.graphics.Rect r0 = r6.A01
            r8.A85(r7, r0)
            android.graphics.Rect r0 = r6.A00
            int r1 = r0.bottom
            android.graphics.Rect r0 = r6.A00
            int r0 = r0.top
            int r1 = r1 - r0
            if (r1 <= 0) goto L9b
        L70:
            android.graphics.Rect r0 = r6.A01
            int r4 = r0.bottom
            android.graphics.Rect r0 = r6.A00
            int r3 = r0.top
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.VN.A02
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto L9d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L8a:
            android.graphics.Rect r0 = r6.A01
            r8.A85(r7, r0)
            android.graphics.Rect r0 = r6.A00
            int r1 = r0.bottom
            android.graphics.Rect r0 = r6.A00
            int r0 = r0.top
            int r1 = r1 - r0
            if (r1 <= 0) goto L9b
            goto L70
        L9b:
            r0 = 0
            goto La8
        L9d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.VN.A02
            java.lang.String r1 = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F"
            r0 = 1
            r2[r0] = r1
            int r4 = r4 - r3
            if (r4 <= 0) goto L9b
            r0 = 1
        La8:
            if (r0 == 0) goto Lb1
            boolean r0 = A00(r7)
            if (r0 == 0) goto Lb1
        Lb0:
            return r5
        Lb1:
            r5 = 0
            goto Lb0
        Lb3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.VN.A01(com.facebook.ads.redexgen.X.pu, com.facebook.ads.redexgen.X.pk):boolean");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C2661pu<UE, UJ> c2661pu, InterfaceC2652pk interfaceC2652pk) {
        if (c2661pu.A07.A04() && A01(c2661pu, interfaceC2652pk)) {
            c2661pu.A07.A01();
            c2661pu.A06.A02().ABP(c2661pu.A06.A03(), c2661pu.A06.A04());
        }
        if (c2661pu.A07.A05() && U7.A1g(c2661pu.A06.A01())) {
            c2661pu.A07.A02();
            c2661pu.A06.A02().AB7(c2661pu.A06.A03(), c2661pu.A06.A04());
        }
    }
}
