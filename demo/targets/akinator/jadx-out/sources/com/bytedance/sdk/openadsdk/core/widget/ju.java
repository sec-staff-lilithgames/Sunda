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
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private hna f20945cm;

    /* renamed from: jd, reason: collision with root package name */
    private sq f20946jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.xyk f20947jj;
    private boolean jpo;
    private PAGLogoView my;

    /* renamed from: qk, reason: collision with root package name */
    private dt f20948qk;
    private TextView wqx;
    private String xyk;
    private com.bytedance.sdk.openadsdk.core.wqx.jpo zz;

    public ju(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.hna.cz);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar) {
        this.zz = jpoVar;
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
        boolean z10 = this.f20948qk.ll() == 1;
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
        this.f20946jd = sqVar;
        sqVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(va.jd(context, 80.0f), va.jd(context, 80.0f));
        layoutParams2.bottomMargin = va.jd(context, 12.0f);
        myVar.addView(this.f20946jd, layoutParams2);
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
        this.f20947jj = xykVar2;
        xykVar2.setEllipsize(truncateAt);
        this.f20947jj.setGravity(17);
        this.f20947jj.setMaxLines(2);
        this.f20947jj.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.f20947jj.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = va.jd(context, 8.0f);
        myVar.addView(this.f20947jj, layoutParams3);
        this.f20945cm = new hna(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, va.jd(context, 16.0f));
        layoutParams4.topMargin = va.jd(context, 12.0f);
        this.f20945cm.setVisibility(8);
        myVar.addView(this.f20945cm, layoutParams4);
        this.my = PAGLogoView.createPAGLogoViewByMaterial(context, this.f20948qk);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, va.jd(context, 14.0f));
        layoutParams5.gravity = 8388691;
        layoutParams5.leftMargin = va.jd(context, 18.0f);
        if (z10) {
            layoutParams5.bottomMargin = va.jd(context, 61.0f);
        } else {
            layoutParams5.bottomMargin = va.jd(context, 24.0f);
        }
        addView(this.my, layoutParams5);
    }

    public void jpo(dt dtVar, String str, com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar) {
        this.f20948qk = dtVar;
        this.xyk = str;
        this.zz = jpoVar;
    }

    private void jpo() {
        if (this.jpo) {
            return;
        }
        this.jpo = true;
        jd();
        if (this.f20946jd != null && this.f20948qk.ou() != null && !TextUtils.isEmpty(this.f20948qk.ou().jpo())) {
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.f20948qk.ou(), this.f20946jd, this.f20948qk);
        }
        hna hnaVar = this.f20945cm;
        if (hnaVar != null) {
            va.jpo((TextView) null, hnaVar, this.f20948qk);
            if (this.f20948qk.xur() != null) {
                this.f20945cm.setVisibility(0);
            }
        }
        if (this.wqx != null) {
            if (this.f20948qk.xur() != null && !TextUtils.isEmpty(this.f20948qk.xur().jd())) {
                this.wqx.setText(this.f20948qk.xur().jd());
            } else if (!TextUtils.isEmpty(this.f20948qk.as())) {
                this.wqx.setText(this.f20948qk.as());
            } else {
                this.wqx.setVisibility(8);
            }
        }
        if (this.f20947jj != null) {
            String strOzw = this.f20948qk.ozw();
            if (!TextUtils.isEmpty(strOzw)) {
                this.f20947jj.setText(strOzw);
            } else {
                this.f20947jj.setVisibility(8);
            }
        }
        this.my.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.ju.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.jpo(ju.this.getContext(), ju.this.f20948qk, ju.this.xyk);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
