package com.bytedance.sdk.openadsdk.oya;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends yd {

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.cm f21420qk;
    private com.bytedance.sdk.openadsdk.core.jj.xyk xyk;

    public my(Context context) {
        this(context, null);
    }

    public com.bytedance.sdk.openadsdk.core.jj.xyk getTtBuDescTV() {
        return this.xyk;
    }

    public com.bytedance.sdk.openadsdk.core.jj.cm getTtBuImg() {
        return this.f21420qk;
    }

    @Override // com.bytedance.sdk.openadsdk.oya.yd
    public void jpo(Context context) {
        int iJd = va.jd(context, 6.0f);
        setPadding(iJd, iJd, iJd, iJd);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVarMy = my(context);
        this.jpo = wqxVarMy;
        wqxVarMy.setId(hna.kgu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int iJd2 = va.jd(context, 26.0f);
        layoutParams.topMargin = iJd2;
        this.jpo.setLayoutParams(layoutParams);
        addView(this.jpo);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        this.f21420qk = cmVar;
        cmVar.setId(hna.jrx);
        this.f21420qk.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = iJd2;
        this.f21420qk.setLayoutParams(layoutParams2);
        addView(this.f21420qk);
        PAGLogoView pAGLogoViewXyk = xyk(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int iJd3 = va.jd(context, 10.0f);
        layoutParams3.leftMargin = iJd3;
        layoutParams3.topMargin = iJd3;
        layoutParams3.bottomMargin = iJd3;
        pAGLogoViewXyk.setLayoutParams(layoutParams3);
        addView(pAGLogoViewXyk);
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        myVar.setOrientation(0);
        myVar.setGravity(17);
        addView(myVar);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.xyk = xykVar;
        xykVar.setId(hna.f21536lq);
        this.xyk.setEllipsize(TextUtils.TruncateAt.END);
        this.xyk.setMaxLines(1);
        this.xyk.setTextColor(-1);
        this.xyk.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.xyk.setLayoutParams(layoutParams4);
        myVar.addView(this.xyk);
    }

    public my(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public my(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
