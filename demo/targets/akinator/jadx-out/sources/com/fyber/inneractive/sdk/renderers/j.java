package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final float f26574a;

    public j(Context context, float f10) {
        super(context);
        this.f26574a = f10;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        View.MeasureSpec.getMode(i10);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == 0 || (mode == Integer.MIN_VALUE && View.MeasureSpec.getSize(i11) > 0)) {
            int size = View.MeasureSpec.getSize(i10);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            float f10 = this.f26574a;
            if (f10 != 0.0f) {
                i11 = View.MeasureSpec.makeMeasureSpec((int) (size * f10), 1073741824);
            }
            iMakeMeasureSpec = iMakeMeasureSpec2;
        } else {
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        }
        super.onMeasure(iMakeMeasureSpec, i11);
    }
}
