package com.bytedance.adsdk.ugeno.yoga.jd;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.jd.wqx;
import com.bytedance.adsdk.ugeno.yoga.ju;
import com.bytedance.adsdk.ugeno.yoga.qk;
import com.bytedance.adsdk.ugeno.yoga.yd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends ViewGroup {
    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof jd) {
            throw null;
        }
        yd ydVarJpo = ju.jpo();
        wqx.jpo(new wqx.jpo(layoutParams), ydVarJpo, view);
        ydVarJpo.jpo(view);
        ydVarJpo.jpo((qk) new wqx.jd());
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof wqx.jpo;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new wqx.jpo(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new wqx.jpo(layoutParams);
    }

    public yd getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
