package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.sq f19736cm;

    /* renamed from: jd, reason: collision with root package name */
    protected Context f19737jd;
    protected View jpo = my();
    private com.bytedance.sdk.openadsdk.core.jj.xyk my;
    private com.bytedance.sdk.openadsdk.core.widget.xyk wqx;

    public ju(Context context) {
        this.f19737jd = context;
    }

    private View my() {
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(this.f19737jd);
        myVar.setGravity(1);
        myVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.sq sqVar = new com.bytedance.sdk.openadsdk.core.widget.sq(this.f19737jd);
        this.f19736cm = sqVar;
        sqVar.setId(520093745);
        int iJd = va.jd(this.f19737jd, 64.0f);
        myVar.addView(this.f19736cm, new LinearLayout.LayoutParams(iJd, iJd));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(this.f19737jd);
        this.my = xykVar;
        xykVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(va.jd(this.f19737jd, 219.0f), -2);
        layoutParams.topMargin = va.jd(this.f19737jd, 16.0f);
        this.my.setLayoutParams(layoutParams);
        this.my.setEllipsize(TextUtils.TruncateAt.END);
        this.my.setGravity(17);
        this.my.setMaxWidth(va.jd(this.f19737jd, 150.0f));
        this.my.setMaxLines(2);
        this.my.setTextColor(-1);
        this.my.setTextSize(1, 16.0f);
        myVar.addView(this.my);
        this.wqx = new com.bytedance.sdk.openadsdk.core.widget.xyk(this.f19737jd);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(va.jd(this.f19737jd, 219.0f), va.jd(this.f19737jd, 6.0f));
        layoutParams2.topMargin = va.jd(this.f19737jd, 32.0f);
        myVar.addView(this.wqx, layoutParams2);
        return myVar;
    }

    public void cm() {
        this.jpo = null;
        this.f19737jd = null;
    }

    public com.bytedance.sdk.openadsdk.core.widget.sq jd() {
        return this.f19736cm;
    }

    public View jpo() {
        return this.jpo;
    }

    public com.bytedance.sdk.openadsdk.core.jj.xyk wqx() {
        return this.my;
    }

    public void jpo(int i10) {
        this.wqx.setProgress(i10);
    }
}
