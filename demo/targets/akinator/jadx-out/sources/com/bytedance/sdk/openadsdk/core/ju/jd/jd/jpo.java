package com.bytedance.sdk.openadsdk.core.ju.jd.jd;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends com.bytedance.adsdk.ugeno.zz.jd.jpo {
    private final com.bytedance.adsdk.ugeno.zz.jd.jpo jpo;

    public jpo(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.zz.jd.jpo jpoVar = new com.bytedance.adsdk.ugeno.zz.jd.jpo(context);
        this.jpo = jpoVar;
        addView(jpoVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.zz.jd.jpo getPlayableView() {
        return this.jpo;
    }
}
