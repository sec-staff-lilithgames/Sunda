package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b0.e2;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.hna;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.utils.ju;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends wqx {

    /* renamed from: au, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.jj.my f20113au;
    private final hna oya;

    public jj(Context context, dt dtVar) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        this.f20113au = myVar;
        myVar.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = va.jd(context, 24.0f);
        layoutParams.topMargin = va.jd(context, 56.0f);
        myVar.setLayoutParams(layoutParams);
        myVar.setClickable(false);
        myVar.setGravity(16);
        myVar.setOrientation(0);
        sq sqVar = new sq(context);
        this.f20118jj = sqVar;
        sqVar.setId(520093759);
        this.f20118jj.setLayoutParams(new LinearLayout.LayoutParams(va.jd(context, 24.0f), va.jd(context, 24.0f)));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.f20120qk = xykVar;
        xykVar.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = va.jd(context, 8.0f);
        this.f20120qk.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = this.f20120qk;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xykVar2.setEllipsize(truncateAt);
        this.f20120qk.setMaxLines(2);
        this.f20120qk.setTextColor(Color.parseColor("#161823"));
        this.f20120qk.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(va.jd(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = va.jd(context, 24.0f);
        layoutParams3.rightMargin = va.jd(context, 24.0f);
        qkVar.setLayoutParams(layoutParams3);
        sq sqVar2 = new sq(context);
        this.zz = sqVar2;
        int i10 = com.bytedance.sdk.openadsdk.utils.hna.xfa;
        sqVar2.setId(i10);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(va.jd(context, 80.0f), va.jd(context, 80.0f));
        layoutParams4.addRule(14);
        this.zz.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar3 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.f20121yd = xykVar3;
        int i11 = com.bytedance.sdk.openadsdk.utils.hna.yxp;
        xykVar3.setId(i11);
        this.f20121yd.setTextSize(24.0f);
        this.f20121yd.setTextColor(Color.parseColor("#161823"));
        this.f20121yd.setGravity(17);
        this.f20121yd.setMaxLines(1);
        this.f20121yd.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i10);
        layoutParams5.topMargin = va.jd(context, 12.0f);
        layoutParams5.addRule(14);
        this.f20121yd.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar4 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.f20119ju = xykVar4;
        int i12 = com.bytedance.sdk.openadsdk.utils.hna.gox;
        xykVar4.setId(i12);
        this.f20119ju.setTextSize(16.0f);
        this.f20119ju.setTextColor(Color.parseColor("#80161823"));
        this.f20119ju.setGravity(17);
        this.f20119ju.setMaxLines(2);
        this.f20119ju.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i11);
        layoutParams6.topMargin = va.jd(context, 4.0f);
        layoutParams6.addRule(14);
        this.f20119ju.setLayoutParams(layoutParams6);
        hna hnaVar = new hna(context);
        this.oya = hnaVar;
        RelativeLayout.LayoutParams layoutParamsE = e2.e(-2, -2, 14);
        layoutParamsE.topMargin = va.jd(context, 12.0f);
        hnaVar.setLayoutParams(layoutParamsE);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar5 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.my = xykVar5;
        xykVar5.setId(520093717);
        this.my.setBackground(ju.jpo(context, "tt_reward_full_video_backup_btn_bg"));
        this.my.setEllipsize(truncateAt);
        this.my.setLines(1);
        this.my.setGravity(17);
        this.my.setTextColor(-1);
        this.my.setTextSize(16.0f);
        this.my.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, va.jd(context, 44.0f));
        layoutParams7.addRule(3, i12);
        layoutParams7.topMargin = va.jd(context, 54.0f);
        layoutParams7.addRule(14);
        this.my.setLayoutParams(layoutParams7);
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, dtVar);
        this.f20116cm = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, va.jd(context, 14.0f));
        layoutParams8.leftMargin = va.jd(context, 16.0f);
        layoutParams8.bottomMargin = va.jd(context, 24.0f);
        layoutParams8.addRule(12);
        this.f20116cm.setLayoutParams(layoutParams8);
        addView(this.xyk);
        myVar.addView(this.f20118jj);
        myVar.addView(this.f20120qk);
        addView(myVar);
        qkVar.addView(this.zz);
        qkVar.addView(this.f20121yd);
        qkVar.addView(this.f20119ju);
        qkVar.addView(hnaVar);
        qkVar.addView(this.my);
        addView(qkVar);
        addView(this.f20116cm);
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public com.bytedance.sdk.openadsdk.core.jj.cm getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public com.bytedance.sdk.openadsdk.core.jj.xyk getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public hna getScoreBar() {
        return this.oya;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public View getUserInfo() {
        return this.f20113au;
    }
}
