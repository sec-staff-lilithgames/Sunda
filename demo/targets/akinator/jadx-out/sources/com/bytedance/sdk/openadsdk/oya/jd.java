package com.bytedance.sdk.openadsdk.oya;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends yd {
    public jd(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.oya.yd
    public com.bytedance.sdk.openadsdk.core.jj.xyk jd(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarJd = super.jd(context);
        xykVarJd.setTextColor(-1);
        xykVarJd.setTextSize(2, 13.0f);
        xykVarJd.setText("Pangle");
        return xykVarJd;
    }

    @Override // com.bytedance.sdk.openadsdk.oya.yd
    public void jpo(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        myVar.setOrientation(1);
        addView(myVar);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 2.0f;
        wqxVar.setLayoutParams(layoutParams);
        myVar.addView(wqxVar);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVarMy = my(context);
        this.jpo = wqxVarMy;
        wqxVarMy.setId(hna.kgu);
        this.jpo.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        wqxVar.addView(this.jpo);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVarJj = jj(context);
        this.f21422jd = cmVarJj;
        cmVarJj.setId(hna.ez);
        this.f21422jd.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        wqxVar.addView(this.f21422jd);
        PAGLogoView pAGLogoViewXyk = xyk(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        int iJd = va.jd(context, 10.0f);
        layoutParams2.leftMargin = iJd;
        layoutParams2.topMargin = iJd;
        layoutParams2.bottomMargin = iJd;
        pAGLogoViewXyk.setLayoutParams(layoutParams2);
        wqxVar.addView(pAGLogoViewXyk);
        com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        myVar2.setLayoutParams(layoutParams3);
        myVar2.setOrientation(1);
        myVar2.setGravity(81);
        int iJd2 = va.jd(context, 16.0f);
        myVar2.setPadding(iJd2, iJd2, iJd2, iJd2);
        myVar.addView(myVar2);
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(context);
        qkVar.setId(hna.f21520eq);
        qkVar.setLayoutParams(new LinearLayout.LayoutParams(-2, va.jd(context, 40.0f)));
        qkVar.setGravity(17);
        myVar2.addView(qkVar);
        sq sqVarQk = qk(context);
        this.wqx = sqVarQk;
        sqVarQk.setId(hna.ykp);
        int iJd3 = va.jd(context, 35.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iJd3, iJd3);
        layoutParams4.addRule(20);
        layoutParams4.addRule(9);
        layoutParams4.addRule(15);
        this.wqx.setLayoutParams(layoutParams4);
        qkVar.addView(this.wqx);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarJd = jd(context);
        this.f21421cm = xykVarJd;
        xykVarJd.setId(hna.vzb);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, iJd * 2);
        int iJd4 = va.jd(context, 6.0f);
        layoutParams5.leftMargin = iJd4;
        layoutParams5.setMarginStart(iJd4);
        layoutParams5.addRule(1, this.wqx.getId());
        layoutParams5.addRule(17, this.wqx.getId());
        this.f21421cm.setLayoutParams(layoutParams5);
        qkVar.addView(this.f21421cm);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarWqx = wqx(context);
        this.my = xykVarWqx;
        xykVarWqx.setId(hna.f21524gf);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, va.jd(context, 20.0f));
        layoutParams6.addRule(3, this.f21421cm.getId());
        layoutParams6.addRule(8, this.wqx.getId());
        layoutParams6.addRule(17, this.wqx.getId());
        layoutParams6.addRule(1, this.wqx.getId());
        layoutParams6.leftMargin = iJd4;
        layoutParams6.setMarginStart(iJd4);
        this.my.setLayoutParams(layoutParams6);
        qkVar.addView(this.my);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarCm = cm(context);
        this.f21423jj = xykVarCm;
        xykVarCm.setId(hna.rzi);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, va.jd(context, 22.0f));
        layoutParams7.topMargin = iJd2;
        this.f21423jj.setLayoutParams(layoutParams7);
        myVar2.addView(this.f21423jj);
    }

    @Override // com.bytedance.sdk.openadsdk.oya.yd
    public com.bytedance.sdk.openadsdk.core.jj.xyk wqx(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarWqx = super.wqx(context);
        xykVarWqx.setTextColor(-1);
        return xykVarWqx;
    }

    public jd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jd(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
