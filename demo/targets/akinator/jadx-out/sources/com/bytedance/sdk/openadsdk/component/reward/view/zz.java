package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends com.bytedance.sdk.openadsdk.core.jj.wqx {
    private final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpo;

    public zz(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        super(jpoVar.f19920pe);
        this.jpo = jpoVar;
        if (jpoVar.ux != null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    public void jpo(com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayoutXyk;
        jdVar.jpo(this);
        if (this.jpo.jpo != 1 && (rFEndCardBackUpLayoutXyk = jdVar.xyk()) != null) {
            addView(rFEndCardBackUpLayoutXyk, new FrameLayout.LayoutParams(-1, -1));
        }
        jpo(jdVar.zz(), this);
        jpo(jdVar.yd(), this);
    }

    private void jpo(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
