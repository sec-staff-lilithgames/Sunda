package com.bytedance.sdk.openadsdk.core.ju.jd.cm;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends com.bytedance.adsdk.ugeno.zz.jd.jpo {

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.adsdk.ugeno.zz.jd.jpo f20480jd;
    private final com.bytedance.adsdk.ugeno.zz.jd.jpo jpo;

    public jpo(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.zz.jd.jpo jpoVar = new com.bytedance.adsdk.ugeno.zz.jd.jpo(context);
        this.jpo = jpoVar;
        addView(jpoVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.zz.jd.jpo jpoVar2 = new com.bytedance.adsdk.ugeno.zz.jd.jpo(context);
        this.f20480jd = jpoVar2;
        jpoVar2.setBackgroundColor(0);
        addView(jpoVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.zz.jd.jpo getVideoView() {
        return this.jpo;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f20480jd.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f20480jd.setOnTouchListener(onTouchListener);
    }
}
