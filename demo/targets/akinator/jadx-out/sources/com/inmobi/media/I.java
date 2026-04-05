package com.inmobi.media;

import android.graphics.Point;
import android.graphics.RectF;
import android.view.RoundedCorner;
import android.view.WindowInsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class I extends Zf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f31860a;

    public I(J j10) {
        this.f31860a = j10;
    }

    @Override // com.inmobi.media.Zf
    public final void a(WindowInsets insets) {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        if (R3.f32183a.K()) {
            RoundedCorner roundedCorner = insets.getRoundedCorner(0);
            int radius = roundedCorner != null ? roundedCorner.getRadius() : 0;
            RoundedCorner roundedCorner2 = insets.getRoundedCorner(1);
            int radius2 = roundedCorner2 != null ? roundedCorner2.getRadius() : 0;
            RoundedCorner roundedCorner3 = insets.getRoundedCorner(2);
            int radius3 = roundedCorner3 != null ? roundedCorner3.getRadius() : 0;
            RoundedCorner roundedCorner4 = insets.getRoundedCorner(3);
            int radius4 = roundedCorner4 != null ? roundedCorner4.getRadius() : 0;
            RoundedCorner roundedCorner5 = insets.getRoundedCorner(0);
            RectF rectF4 = null;
            Point center = roundedCorner5 != null ? roundedCorner5.getCenter() : null;
            RoundedCorner roundedCorner6 = insets.getRoundedCorner(1);
            Point center2 = roundedCorner6 != null ? roundedCorner6.getCenter() : null;
            RoundedCorner roundedCorner7 = insets.getRoundedCorner(2);
            Point center3 = roundedCorner7 != null ? roundedCorner7.getCenter() : null;
            RoundedCorner roundedCorner8 = insets.getRoundedCorner(3);
            Point center4 = roundedCorner8 != null ? roundedCorner8.getCenter() : null;
            if (radius <= 0 || center == null) {
                rectF = null;
            } else {
                rectF = new RectF(r9 - radius, r0 - radius, center.x, center.y);
            }
            if (radius2 <= 0 || center2 == null) {
                rectF2 = null;
            } else {
                rectF2 = new RectF(center2.x, r2 - radius, r9 + radius2, center2.y);
            }
            if (radius4 <= 0 || center4 == null) {
                rectF3 = null;
            } else {
                int i10 = center4.x;
                rectF3 = new RectF(i10 - radius4, center4.y, i10, r13 + radius4);
            }
            if (radius3 > 0 && center3 != null) {
                rectF4 = new RectF(center3.x, center3.y, r13 + radius3, r3 + radius3);
            }
            this.f31860a.f31889g = new B(rectF, rectF2, rectF3, rectF4);
        }
    }
}
