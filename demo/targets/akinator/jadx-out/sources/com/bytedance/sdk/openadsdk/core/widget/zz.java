package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private hna f20976cm;

    /* renamed from: jd, reason: collision with root package name */
    private sq f20977jd;

    /* renamed from: jj, reason: collision with root package name */
    private PAGLogoView f20978jj;
    private boolean jpo;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.wqx.jpo f20979ju;
    private TextView my;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.xyk f20980qk;
    private TextView wqx;
    private dt xyk;

    /* renamed from: yd, reason: collision with root package name */
    private boolean f20981yd;
    private String zz;

    public zz(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.hna.gmx);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar) {
        this.f20979ju = jpoVar;
        TextView textView = this.my;
        if (textView != null) {
            textView.setOnClickListener(jpoVar);
            this.my.setOnTouchListener(this.f20979ju);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            jpo();
        }
    }

    private void jd() {
        Context context = getContext();
        boolean z10 = this.xyk.ll() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setGravity(1);
        myVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z10 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(va.jd(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iJd = va.jd(context, 24.0f);
        layoutParams.rightMargin = iJd;
        layoutParams.leftMargin = iJd;
        addView(myVar, layoutParams);
        sq sqVar = new sq(context);
        this.f20977jd = sqVar;
        sqVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(va.jd(context, 80.0f), va.jd(context, 80.0f));
        layoutParams2.bottomMargin = va.jd(context, 12.0f);
        myVar.addView(this.f20977jd, layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.wqx = xykVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xykVar.setEllipsize(truncateAt);
        this.wqx.setGravity(17);
        this.wqx.setMaxLines(2);
        this.wqx.setMaxWidth(va.jd(context, 180.0f));
        this.wqx.setTextColor(-1);
        this.wqx.setTextSize(2, 24.0f);
        myVar.addView(this.wqx, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.f20980qk = xykVar2;
        xykVar2.setEllipsize(truncateAt);
        this.f20980qk.setGravity(17);
        this.f20980qk.setMaxLines(2);
        this.f20980qk.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.f20980qk.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = va.jd(context, 8.0f);
        myVar.addView(this.f20980qk, layoutParams3);
        this.f20976cm = new hna(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, va.jd(context, 16.0f));
        layoutParams4.topMargin = va.jd(context, 12.0f);
        this.f20976cm.setVisibility(8);
        myVar.addView(this.f20976cm, layoutParams4);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar3 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.my = xykVar3;
        xykVar3.setId(520093707);
        this.my.setGravity(17);
        this.my.setText(com.bytedance.sdk.component.utils.dt.jpo(context, "tt_video_download_apk"));
        this.my.setTextColor(-1);
        this.my.setTextSize(2, 16.0f);
        this.my.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, va.jd(context, 44.0f));
        layoutParams5.topMargin = va.jd(context, 54.0f);
        myVar.addView(this.my, layoutParams5);
        if (!this.f20981yd && this.xyk.ci() && rv.wqx(this.xyk)) {
            this.my.setVisibility(8);
        }
        this.f20978jj = PAGLogoView.createPAGLogoViewByMaterial(context, this.xyk);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, va.jd(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = va.jd(context, 18.0f);
        if (z10) {
            layoutParams6.bottomMargin = va.jd(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = va.jd(context, 24.0f);
        }
        addView(this.f20978jj, layoutParams6);
    }

    public void jpo(dt dtVar, String str, com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar, boolean z10) {
        this.xyk = dtVar;
        this.zz = str;
        this.f20981yd = z10;
        this.f20979ju = jpoVar;
    }

    private void jpo() {
        if (this.jpo) {
            return;
        }
        this.jpo = true;
        jd();
        this.my.setOnClickListener(this.f20979ju);
        this.my.setOnTouchListener(this.f20979ju);
        String strClt = this.xyk.clt();
        if (!TextUtils.isEmpty(strClt)) {
            this.my.setText(strClt);
        }
        if (this.f20977jd != null && this.xyk.ou() != null && !TextUtils.isEmpty(this.xyk.ou().jpo())) {
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.xyk.ou(), this.f20977jd, this.xyk);
        }
        hna hnaVar = this.f20976cm;
        if (hnaVar != null) {
            va.jpo((TextView) null, hnaVar, this.xyk);
            if (this.xyk.xur() != null) {
                this.f20976cm.setVisibility(0);
            }
        }
        if (this.wqx != null) {
            if (this.xyk.xur() != null && !TextUtils.isEmpty(this.xyk.xur().jd())) {
                this.wqx.setText(this.xyk.xur().jd());
            } else if (!TextUtils.isEmpty(this.xyk.as())) {
                this.wqx.setText(this.xyk.as());
            } else {
                this.wqx.setVisibility(8);
            }
        }
        if (this.f20980qk != null) {
            String strOzw = this.xyk.ozw();
            if (!TextUtils.isEmpty(strOzw)) {
                this.f20980qk.setText(strOzw);
            } else {
                this.f20980qk.setVisibility(8);
            }
        }
        this.f20978jj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.zz.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.jpo(zz.this.getContext(), zz.this.xyk, zz.this.zz);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
