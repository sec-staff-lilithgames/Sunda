package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class kln extends jj implements com.bytedance.sdk.component.adexpress.dynamic.my {

    /* renamed from: jd, reason: collision with root package name */
    FrameLayout f18233jd;
    TextView jpo;
    boolean nmd;

    public kln(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        this.nmd = false;
        View view = new View(context);
        this.prr = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.jpo = new TextView(context);
        this.f18233jd = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.jpo.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.jpo.setBackground(gradientDrawable);
        this.jpo.setTextSize(10.0f);
        this.jpo.setGravity(17);
        this.jpo.setTextColor(-1);
        this.jpo.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            addView(this.f18233jd, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.jpo);
        addView(this.prr, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.cm.jd()) {
            addView(this.f18233jd, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.f18233jd;
        dynamicRootView.setVideoListener(this);
    }

    private void wqx(View view) {
        if (view == this.jpo || view == ((jj) this).f18221jr) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.jpo.f18269jj)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i10 = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                return;
            }
            wqx(viewGroup.getChildAt(i10));
            i10++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.my
    public void jpo() {
        this.jpo.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my
    public boolean my() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.my
    public void setTimeUpdate(int i10) {
        if (!this.f18236au.yd().my().sn() || i10 <= 0 || this.nmd) {
            this.nmd = true;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                wqx(getChildAt(i11));
            }
            this.jpo.setVisibility(8);
            return;
        }
        String strL = o2.l(i10 >= 60 ? "0" + (i10 / 60) : "00", ":");
        int i12 = i10 % 60;
        this.jpo.setText(i12 > 9 ? strL + i12 : o2.g(i12, strL, "0"));
        this.jpo.setVisibility(0);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        super.zz();
        double dQk = 0.0d;
        double dJj = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVarM406if = this.f18236au; xykVarM406if != null; xykVarM406if = xykVarM406if.m406if()) {
            dJj = (dJj + xykVarM406if.jj()) - xykVarM406if.cm();
            dQk = (dQk + xykVarM406if.qk()) - xykVarM406if.my();
        }
        try {
            float f10 = (float) dJj;
            int iJpo = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), f10);
            int iJpo2 = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), f10 + this.my);
            if (com.bytedance.sdk.component.adexpress.cm.jd.jpo(getContext())) {
                int dynamicWidth = ((opi) this.oya.getChildAt(0)).getDynamicWidth();
                int i10 = dynamicWidth - iJpo2;
                iJpo2 = dynamicWidth - iJpo;
                iJpo = i10;
            }
            if ("open_ad".equals(this.oya.getRenderRequest().cm())) {
                this.oya.videoView = this.f18233jd;
            } else {
                float f11 = (float) dQk;
                ((opi) this.oya.getChildAt(0)).jpo.jpo(iJpo, (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), f11), iJpo2, (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), f11 + this.f18239jj));
            }
        } catch (Exception unused) {
        }
        this.oya.updateRenderInfoForVideo(dJj, dQk, this.my, this.f18239jj, this.f51if.prr());
        return true;
    }
}
