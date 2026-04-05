package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.core.widget.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif extends com.bytedance.sdk.openadsdk.core.jj.wqx {
    public float jpo;

    public Cif(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jj.wqx, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = getLayoutParams().width;
        int i13 = getLayoutParams().height;
        float f10 = this.jpo;
        if (f10 > 0.0f) {
            if (i12 == -2) {
                size = (int) (size2 * f10);
                mode = 1073741824;
            } else if (i13 == -2) {
                size2 = (int) (size / f10);
                mode2 = 1073741824;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f10) {
        this.jpo = f10;
    }

    public Cif(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Cif(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.jpo = 0.0f;
    }
}
