package com.bytedance.sdk.openadsdk.wqx;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju extends View {
    private final int jpo;

    public ju(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(getMeasuredWidth(), this.jpo);
    }

    public ju(Context context, int i10) {
        super(context);
        setBackgroundColor(i10);
        this.jpo = va.jd(getContext(), 0.66f);
    }
}
