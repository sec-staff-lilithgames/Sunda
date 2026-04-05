package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.component.utils.pdm;
import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju implements qk<ViewGroup> {

    /* renamed from: jd, reason: collision with root package name */
    private final FrameLayout f18341jd;
    private final com.bytedance.sdk.component.adexpress.jj.yd jpo;

    public ju(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar, String str, String str2) {
        com.bytedance.sdk.component.adexpress.jj.yd ydVar = new com.bytedance.sdk.component.adexpress.jj.yd(context);
        this.jpo = ydVar;
        ydVar.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18341jd = frameLayout;
        frameLayout.addView(ydVar, new FrameLayout.LayoutParams(-2, -2));
        double dCql = qkVar.cql();
        dCql = dCql == 0.0d ? 1.0d : dCql;
        double dOta = qkVar.ota();
        double d10 = dOta != 0.0d ? dOta : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if (!"20".equals(str2)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (myVar.getDynamicWidth() * 0.32d * dCql), (int) (myVar.getDynamicWidth() * 0.32d * d10));
            layoutParams2.gravity = 17;
            frameLayout.setLayoutParams(layoutParams2);
        } else {
            jpo(context, frameLayout, qkVar);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 81;
            layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, qkVar.fy() > 0 ? qkVar.fy() : com.bytedance.sdk.component.adexpress.cm.jd() ? 0 : AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
            frameLayout.setLayoutParams(layoutParams3);
            frameLayout.setClipChildren(false);
        }
    }

    private void jpo(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -pdm.jpo(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(dt.jd(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, pdm.jpo(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(dt.jd(context, "tt_splash_brush_mask_hint")));
        if (qkVar != null && !TextUtils.isEmpty(qkVar.dn())) {
            textView2.setText(qkVar.dn());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jd() {
        this.jpo.jj();
        ViewParent parent = this.f18341jd.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f18341jd);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public ViewGroup wqx() {
        return this.f18341jd;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx.qk
    public void jpo() {
        this.jpo.xyk();
    }
}
