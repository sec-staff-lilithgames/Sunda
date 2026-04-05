package com.facebook.ads.redexgen.core;

import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public final class YM extends ImageView {
    public static String[] A01 = {"zJ2", "QjUwZCbDUlfOcmdTeXyvd13", "pmgXUgQY3G9embGve5GBnFw0VEVT9oeH", "awdDomzwyqRyeOiEyYHeXSv00pR55TnX", "BJj1MoNnpM6JKdO5Mh8uM61yAFI5TCy", "1E", "dRD1sNctYpeCeu2V1pPS6WM", "8C9irfg3VZNd6lZFm"};
    public ImageView.ScaleType A00;

    public YM(C1937dL c1937dL) {
        super(c1937dL);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r6 = android.view.View.MeasureSpec.getSize(r9)
            int r5 = android.view.View.MeasureSpec.getSize(r8)
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r4) goto L27
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != r4) goto L27
            int r0 = java.lang.Math.min(r5, r6)
            r7.setMeasuredDimension(r0, r0)
        L1d:
            android.widget.ImageView$ScaleType r0 = r7.A00
            if (r0 == 0) goto L26
            android.widget.ImageView$ScaleType r0 = r7.A00
            super.setScaleType(r0)
        L26:
            return
        L27:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r4) goto L37
            if (r6 <= 0) goto L33
            int r5 = java.lang.Math.min(r5, r6)
        L33:
            r7.setMeasuredDimension(r5, r5)
            goto L1d
        L37:
            int r3 = android.view.View.MeasureSpec.getMode(r9)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.YM.A01
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto L5f
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.YM.A01
            java.lang.String r1 = "z6sTWRHNr9jgarJvj"
            r0 = 7
            r2[r0] = r1
            if (r3 != r4) goto L5b
            if (r5 <= 0) goto L57
            int r6 = java.lang.Math.min(r5, r6)
        L57:
            r7.setMeasuredDimension(r6, r6)
            goto L1d
        L5b:
            super.onMeasure(r8, r9)
            goto L1d
        L5f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.YM.onMeasure(int, int):void");
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
