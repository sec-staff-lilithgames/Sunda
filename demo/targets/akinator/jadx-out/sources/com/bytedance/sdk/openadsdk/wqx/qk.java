package com.bytedance.sdk.openadsdk.wqx;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends LinearLayout {

    /* renamed from: jd, reason: collision with root package name */
    private xyk f21642jd;
    private final FilterWord jpo;
    private final yd wqx;

    public qk(Context context, FilterWord filterWord, yd ydVar) {
        super(context);
        setOrientation(1);
        this.jpo = filterWord;
        this.wqx = ydVar;
        jpo();
    }

    private void jd() {
        this.f21642jd = new xyk(getContext(), this.wqx);
        new LinearLayout.LayoutParams(-1, -2);
        this.f21642jd.jpo(this.jpo.getOptions());
        addView(this.f21642jd);
    }

    private void jpo() {
        wqx();
        jd();
    }

    private void wqx() {
        String name = this.jpo.getName();
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = va.jd(getContext(), 12.0f);
        layoutParams.gravity = 17;
        xykVar.setGravity(17);
        xykVar.setText(name);
        xykVar.setTextColor(Color.argb(85, 22, 24, 35));
        xykVar.setTextSize(this.wqx.zz() ? 14 : 10);
        addView(xykVar, layoutParams);
    }
}
