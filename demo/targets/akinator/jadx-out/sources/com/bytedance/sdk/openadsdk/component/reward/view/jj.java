package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.common.Cif;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {
    public static void jpo(FrameLayout frameLayout, dt dtVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(context);
        qkVar.setId(hna.f21518dt);
        qkVar.setBackgroundColor(Color.parseColor("#F8F8F8"));
        frameLayout.addView(qkVar, new FrameLayout.LayoutParams(-1, -1));
        View cif = new Cif(context);
        cif.setId(hna.hmu);
        qkVar.addView(cif, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setId(hna.f21539nq);
        myVar.setOrientation(1);
        myVar.setVisibility(8);
        myVar.setGravity(1);
        myVar.setId(hna.nzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        qkVar.addView(myVar, layoutParams);
        sq sqVar = new sq(context);
        sqVar.setId(hna.f21526hx);
        myVar.addView(sqVar, new LinearLayout.LayoutParams(va.jd(context, 80.0f), va.jd(context, 80.0f)));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar.setId(hna.pdm);
        xykVar.setTextColor(Color.parseColor("#161823"));
        xykVar.setTextSize(2, 24.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = va.jd(context, 12.0f);
        myVar.addView(xykVar, layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar2.setId(hna.f21547rv);
        xykVar2.setGravity(17);
        xykVar2.setTextColor(Color.parseColor("#80161823"));
        xykVar2.setTextSize(2, 16.0f);
        xykVar2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        int iJd = va.jd(context, 60.0f);
        layoutParams3.leftMargin = iJd;
        layoutParams3.rightMargin = iJd;
        layoutParams3.setMarginStart(iJd);
        layoutParams3.setMarginEnd(layoutParams3.rightMargin);
        layoutParams3.topMargin = va.jd(context, 8.0f);
        myVar.addView(xykVar2, layoutParams3);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar3 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar3.setId(hna.f21554uu);
        xykVar3.setGravity(17);
        xykVar3.setTextColor(-1);
        xykVar3.setText(com.bytedance.sdk.component.utils.dt.jpo(context, "tt_video_mobile_go_detail"));
        xykVar3.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(va.jd(context, 255.0f), va.jd(context, 44.0f));
        layoutParams4.topMargin = va.jd(context, 32.0f);
        myVar.addView(xykVar3, layoutParams4);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar4 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar4.setId(hna.f21548se);
        xykVar4.setGravity(17);
        xykVar4.setTextColor(-16777216);
        xykVar4.setText("Sorry,this AD fails to load...");
        xykVar4.setVisibility(8);
        xykVar4.setGravity(1);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(13);
        qkVar.addView(xykVar4, layoutParams5);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, dtVar);
        viewCreatePAGLogoViewByMaterial.setId(hna.sz);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, va.jd(context, 14.0f));
        layoutParams6.addRule(12);
        int iJd2 = va.jd(context, 16.0f);
        layoutParams6.leftMargin = iJd2;
        layoutParams6.setMarginStart(iJd2);
        layoutParams6.bottomMargin = va.jd(context, 20.0f);
        qkVar.addView(viewCreatePAGLogoViewByMaterial, layoutParams6);
    }

    public static void jpo(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        View myVar = new my(context);
        myVar.setId(hna.f164if);
        myVar.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.addView(myVar, layoutParams);
        View myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar2.setId(hna.f21514au);
        myVar2.setVisibility(8);
        frameLayout.addView(myVar2, new FrameLayout.LayoutParams(-1, -1));
        View jjVar = new com.bytedance.sdk.component.zz.jj(context, true);
        jjVar.setLayerType(2, null);
        jjVar.setVisibility(4);
        jjVar.setId(hna.oya);
        frameLayout.addView(jjVar, new FrameLayout.LayoutParams(-1, -1));
        View frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(hna.prr);
        frameLayout2.setVisibility(4);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(new RFEndCardBackUpLayout(context), new FrameLayout.LayoutParams(-1, -1));
    }
}
