package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi extends jj {
    public jd jpo;

    public opi(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my
    public GradientDrawable getDrawable() {
        jd jdVar = new jd();
        this.jpo = jdVar;
        return jdVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my
    public jd jpo(Bitmap bitmap) {
        jpo jpoVar = new jpo(bitmap, this.jpo);
        this.jpo = jpoVar;
        return jpoVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        return super.zz();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my
    public GradientDrawable jpo(GradientDrawable.Orientation orientation, int[] iArr) {
        jd jdVar = new jd(orientation, iArr);
        this.jpo = jdVar;
        return jdVar;
    }
}
