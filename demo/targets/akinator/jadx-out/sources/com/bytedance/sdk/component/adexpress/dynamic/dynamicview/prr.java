package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr extends jj {

    /* renamed from: jd, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.cm.xyk f18247jd;
    String jpo;

    public prr(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar, String str) {
        super(context, dynamicRootView, xykVar);
        this.jpo = str;
        this.f18247jd = xykVar;
        com.bytedance.sdk.component.adexpress.jj.yd lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.jj.yd getLottieView() {
        com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar = this.f18236au;
        if (xykVar == null || xykVar.yd() == null || this.f18241ju == null || TextUtils.isEmpty(this.jpo)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVarMy = this.f18236au.yd().my();
        String strWad = jjVarMy != null ? jjVarMy.wad() : "";
        if (TextUtils.isEmpty(strWad)) {
            return null;
        }
        String strR = o2.r(new StringBuilder(), this.jpo, "static/lotties/", strWad, ".json");
        com.bytedance.sdk.component.adexpress.jj.yd ydVar = new com.bytedance.sdk.component.adexpress.jj.yd(this.f18241ju);
        ydVar.setImageLottieTosPath(strR);
        ydVar.xyk();
        return ydVar;
    }
}
