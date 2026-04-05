package com.bytedance.sdk.openadsdk.oya;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b0.e2;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends yd {
    public cm(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.oya.yd
    public void jpo(Context context) {
        int iJd = va.jd(context, 10.0f);
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        myVar.setLayoutParams(layoutParams);
        layoutParams.gravity = 17;
        myVar.setOrientation(1);
        myVar.setPadding(iJd, iJd, iJd, iJd);
        addView(myVar);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 3.0f;
        wqxVar.setLayoutParams(layoutParams2);
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
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        layoutParams3.leftMargin = iJd;
        layoutParams3.topMargin = iJd;
        layoutParams3.bottomMargin = iJd;
        pAGLogoViewXyk.setLayoutParams(layoutParams3);
        wqxVar.addView(pAGLogoViewXyk);
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        qkVar.setLayoutParams(layoutParams4);
        myVar.addView(qkVar);
        sq sqVarQk = qk(context);
        this.wqx = sqVarQk;
        int i10 = hna.ykp;
        sqVarQk.setId(i10);
        int iJd2 = va.jd(context, 40.0f);
        this.wqx.setLayoutParams(e2.e(iJd2, iJd2, 15));
        qkVar.addView(this.wqx);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarJd = jd(context);
        this.f21421cm = xykVarJd;
        xykVarJd.setId(hna.vzb);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(15);
        layoutParams5.leftMargin = iJd;
        layoutParams5.setMarginStart(iJd);
        layoutParams5.addRule(1, i10);
        layoutParams5.addRule(17, i10);
        this.f21421cm.setLayoutParams(layoutParams5);
        qkVar.addView(this.f21421cm);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVarCm = cm(context);
        this.f21423jj = xykVarCm;
        xykVarCm.setId(hna.rzi);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(va.jd(context, 100.0f), va.jd(context, 32.0f));
        layoutParams6.addRule(11);
        layoutParams6.addRule(21);
        layoutParams6.addRule(15);
        this.f21423jj.setLayoutParams(layoutParams6);
        qkVar.addView(this.f21423jj);
    }

    public cm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cm(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
