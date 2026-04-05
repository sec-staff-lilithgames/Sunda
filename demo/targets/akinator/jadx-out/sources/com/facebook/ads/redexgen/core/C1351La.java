package com.facebook.ads.redexgen.core;

import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.La, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1351La extends C1751aK {
    public static String[] A01 = {"Er9uQMazYAvywc84qssi8CcPD5K", "bpAOsy1ZAool4ZO", "456cLSbicHverE2", "OQn0GSeoKkB55mmrW6XfcsGu8yTW4vwY", "5C5KK7QE3ZVmFSCl85soxjy8aya", "FZZqXqYfqR5sLOGe", "aaYiwVUQ6XuTYr3PnCNNWh", "fICxnQOCOsz8JBbFc5EZnQUEppLIkjem"};
    public ImageView.ScaleType A00;

    public C1351La(C1937dL c1937dL) {
        super(c1937dL);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r3 = android.view.View.MeasureSpec.getSize(r6)
            int r2 = android.view.View.MeasureSpec.getSize(r5)
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L36
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            if (r0 != r1) goto L36
            int r0 = java.lang.Math.min(r2, r3)
            r4.setMeasuredDimension(r0, r0)
        L1d:
            android.widget.ImageView$ScaleType r0 = r4.A00
            if (r0 == 0) goto L64
            android.widget.ImageView$ScaleType r3 = r4.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1351La.A01
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 15
            if (r1 == r0) goto L5a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L36:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L46
            if (r3 <= 0) goto L42
            int r2 = java.lang.Math.min(r2, r3)
        L42:
            r4.setMeasuredDimension(r2, r2)
            goto L1d
        L46:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            if (r0 != r1) goto L56
            if (r2 <= 0) goto L52
            int r3 = java.lang.Math.min(r2, r3)
        L52:
            r4.setMeasuredDimension(r3, r3)
            goto L1d
        L56:
            super.onMeasure(r5, r6)
            goto L1d
        L5a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1351La.A01
            java.lang.String r1 = "1TQeY3NJoCywMKTf"
            r0 = 0
            r2[r0] = r1
            super.setScaleType(r3)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1351La.onMeasure(int, int):void");
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
