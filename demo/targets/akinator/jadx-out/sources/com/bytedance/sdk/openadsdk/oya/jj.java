package com.bytedance.sdk.openadsdk.oya;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends yd {
    public jj(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.oya.yd
    public com.bytedance.sdk.openadsdk.core.jj.xyk cm(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarCm = super.cm(context);
        xykVarCm.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_download_corner_bg"));
        xykVarCm.setTextSize(2, 8.0f);
        return xykVarCm;
    }

    @Override // com.bytedance.sdk.openadsdk.oya.yd
    public com.bytedance.sdk.openadsdk.core.jj.xyk jd(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarJd = super.jd(context);
        xykVarJd.setGravity(16);
        xykVarJd.setMaxWidth(va.jd(context, 53.0f));
        xykVarJd.setTextColor(-1);
        xykVarJd.setTextSize(2, 10.0f);
        return xykVarJd;
    }

    @Override // com.bytedance.sdk.openadsdk.oya.yd
    public void jpo(Context context) {
        int iJd = va.jd(context, 10.0f);
        int iJd2 = va.jd(context, 5.0f);
        int iJd3 = va.jd(context, 6.0f);
        int iJd4 = va.jd(context, 16.0f);
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        qkVar.setLayoutParams(layoutParams);
        addView(qkVar);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVarMy = my(context);
        this.jpo = wqxVarMy;
        wqxVarMy.setId(hna.kgu);
        this.jpo.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        qkVar.addView(this.jpo);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVarJj = jj(context);
        this.f21422jd = cmVarJj;
        cmVarJj.setId(hna.ez);
        this.f21422jd.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        qkVar.addView(this.f21422jd);
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar2 = new com.bytedance.sdk.openadsdk.core.jj.qk(context);
        int i10 = hna.f21564yq;
        qkVar2.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, va.jd(context, 48.0f));
        layoutParams2.setMargins(iJd2, iJd2, iJd2, iJd2);
        layoutParams2.addRule(12);
        qkVar2.setBackgroundColor(Color.parseColor("#26000000"));
        qkVar2.setGravity(16);
        qkVar2.setLayoutParams(layoutParams2);
        qkVar.addView(qkVar2);
        sq sqVarQk = qk(context);
        this.wqx = sqVarQk;
        int i11 = hna.ykp;
        sqVarQk.setId(i11);
        int iJd5 = va.jd(context, 25.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iJd5, iJd5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.wqx.setLayoutParams(layoutParams3);
        qkVar2.addView(this.wqx);
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(17, i11);
        layoutParams4.addRule(1, i11);
        myVar.setLayoutParams(layoutParams4);
        myVar.setGravity(16);
        myVar.setOrientation(1);
        qkVar2.addView(myVar);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarJd = jd(context);
        this.f21421cm = xykVarJd;
        xykVarJd.setId(hna.vzb);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = iJd3;
        layoutParams5.setMarginStart(iJd3);
        this.f21421cm.setLayoutParams(layoutParams5);
        myVar.addView(this.f21421cm);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarWqx = wqx(context);
        this.my = xykVarWqx;
        xykVarWqx.setId(hna.f21524gf);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = iJd3;
        layoutParams6.setMarginStart(iJd3);
        this.my.setLayoutParams(layoutParams6);
        myVar.addView(this.my);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarCm = cm(context);
        this.f21423jj = xykVarCm;
        xykVarCm.setId(hna.rzi);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(21);
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        this.f21423jj.setLayoutParams(layoutParams7);
        int iJd6 = va.jd(context, 4.0f);
        this.f21423jj.setPadding(iJd6, iJd6, iJd6, iJd6);
        qkVar2.addView(this.f21423jj);
        View viewXyk = xyk(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, i10);
        layoutParams8.leftMargin = iJd4;
        layoutParams8.bottomMargin = iJd;
        viewXyk.setLayoutParams(layoutParams8);
        qkVar.addView(viewXyk);
    }

    @Override // com.bytedance.sdk.openadsdk.oya.yd
    public com.bytedance.sdk.openadsdk.core.jj.xyk wqx(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarWqx = super.wqx(context);
        xykVarWqx.setGravity(16);
        xykVarWqx.setMaxWidth(va.jd(context, 53.0f));
        xykVarWqx.setTextColor(-1);
        xykVarWqx.setTextSize(2, 8.0f);
        return xykVarWqx;
    }

    public jj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jj(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
