package com.bytedance.sdk.openadsdk.oya;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends yd {
    public xyk(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.oya.yd
    public com.bytedance.sdk.openadsdk.core.jj.xyk cm(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarCm = super.cm(context);
        xykVarCm.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_download_corner_bg"));
        xykVarCm.setTextSize(2, 15.0f);
        return xykVarCm;
    }

    @Override // com.bytedance.sdk.openadsdk.oya.yd
    public com.bytedance.sdk.openadsdk.core.jj.xyk jd(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarJd = super.jd(context);
        xykVarJd.setGravity(16);
        xykVarJd.setMaxWidth(va.jd(context, 250.0f));
        xykVarJd.setTextColor(-1);
        xykVarJd.setTextSize(2, 17.0f);
        xykVarJd.setText("APP NAME");
        return xykVarJd;
    }

    @Override // com.bytedance.sdk.openadsdk.oya.yd
    public void jpo(Context context) {
        int iJd = va.jd(context, 10.0f);
        int iJd2 = va.jd(context, 16.0f);
        int iJd3 = va.jd(context, 15.0f);
        int iJd4 = va.jd(context, 20.0f);
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
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, va.jd(context, 60.0f));
        layoutParams2.addRule(12);
        layoutParams2.rightMargin = iJd3;
        layoutParams2.leftMargin = iJd3;
        layoutParams2.bottomMargin = iJd3;
        layoutParams2.setMarginEnd(iJd3);
        layoutParams2.setMarginStart(iJd3);
        qkVar2.setBackgroundColor(Color.parseColor("#26000000"));
        qkVar2.setLayoutParams(layoutParams2);
        qkVar.addView(qkVar2);
        sq sqVarQk = qk(context);
        this.wqx = sqVarQk;
        int i11 = hna.ykp;
        sqVarQk.setId(i11);
        int iJd5 = va.jd(context, 50.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iJd5, iJd5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.wqx.setLayoutParams(layoutParams3);
        qkVar2.addView(this.wqx);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarJd = jd(context);
        this.f21421cm = xykVarJd;
        xykVarJd.setId(hna.vzb);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15);
        layoutParams4.leftMargin = iJd4;
        layoutParams4.setMarginStart(iJd4);
        layoutParams4.addRule(1, i11);
        layoutParams4.addRule(17, i11);
        this.f21421cm.setLayoutParams(layoutParams4);
        qkVar2.addView(this.f21421cm);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarCm = cm(context);
        this.f21423jj = xykVarCm;
        xykVarCm.setId(hna.rzi);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(va.jd(context, 100.0f), va.jd(context, 30.0f));
        layoutParams5.addRule(21);
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        layoutParams5.rightMargin = iJd;
        layoutParams5.setMarginEnd(iJd);
        this.f21423jj.setLayoutParams(layoutParams5);
        qkVar2.addView(this.f21423jj);
        View viewXyk = xyk(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(2, i10);
        layoutParams6.leftMargin = iJd2;
        layoutParams6.bottomMargin = iJd;
        viewXyk.setLayoutParams(layoutParams6);
        qkVar.addView(viewXyk);
    }

    public xyk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public xyk(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
