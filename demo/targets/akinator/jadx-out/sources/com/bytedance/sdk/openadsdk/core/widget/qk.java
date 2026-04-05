package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.pdm;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends com.bytedance.sdk.openadsdk.core.jj.qk {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.xyk f20963cm;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.xyk f20964jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f20965jj;
    private sq jpo;
    private boolean my;
    private xyk wqx;

    public qk(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (jpo()) {
            jd();
        }
    }

    public com.bytedance.sdk.openadsdk.core.jj.xyk getDownloadButton() {
        return this.f20963cm;
    }

    public xyk getLoadingProgressBar() {
        return this.wqx;
    }

    public void jd() {
        if (this.my) {
            return;
        }
        this.my = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        sq sqVar = new sq(context);
        this.jpo = sqVar;
        sqVar.setId(520093745);
        int iJd = va.jd(context, 64.0f);
        this.jpo.setLayoutParams(new RelativeLayout.LayoutParams(iJd, iJd));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.f20964jd = xykVar;
        xykVar.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(va.jd(context, 219.0f), -2);
        layoutParams2.topMargin = va.jd(context, 16.0f);
        this.f20964jd.setLayoutParams(layoutParams2);
        this.f20964jd.setEllipsize(TextUtils.TruncateAt.END);
        this.f20964jd.setGravity(17);
        this.f20964jd.setMaxWidth(va.jd(context, 150.0f));
        this.f20964jd.setMaxLines(2);
        this.f20964jd.setTextColor(-1);
        this.f20964jd.setTextSize(1, 16.0f);
        xyk xykVar2 = new xyk(context);
        this.wqx = xykVar2;
        xykVar2.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(va.jd(context, 219.0f), va.jd(context, 6.0f));
        layoutParams3.topMargin = va.jd(context, 24.0f);
        this.wqx.setLayoutParams(layoutParams3);
        this.f20963cm = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(va.jd(context, 138.0f), va.jd(context, 42.0f));
        layoutParams4.topMargin = va.jd(context, 48.0f);
        this.f20963cm.setLayoutParams(layoutParams4);
        this.f20963cm.setTextColor(-1);
        this.f20963cm.setTextSize(16.0f);
        this.f20963cm.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.f20963cm.setBackground(gradientDrawable);
        linearLayout.addView(this.jpo);
        linearLayout.addView(this.f20964jd);
        linearLayout.addView(this.wqx);
        linearLayout.addView(this.f20963cm);
        addView(linearLayout);
    }

    public boolean jpo() {
        return true;
    }

    public void setProgress(int i10) {
        xyk xykVar = this.wqx;
        if (xykVar != null) {
            xykVar.setProgress(i10);
        }
    }

    public void jpo(dt dtVar, int i10) {
        if (!this.my || dtVar == null || this.f20965jj) {
            return;
        }
        this.f20965jj = true;
        boolean zZrw = dtVar.zrw();
        if (zZrw || dtVar.ou() == null || TextUtils.isEmpty(dtVar.ou().jpo())) {
            this.jpo.setVisibility(8);
        } else {
            try {
                com.bytedance.sdk.openadsdk.zz.cm.jpo(dtVar.ou()).wqx(1).jpo(new com.bytedance.sdk.openadsdk.zz.jd(dtVar, dtVar.ou().jpo(), new pdm(this.jpo)));
            } catch (Throwable unused) {
            }
        }
        if (zZrw) {
            this.f20964jd.setText("Loading");
        } else if (TextUtils.isEmpty(dtVar.ozw())) {
            this.f20964jd.setVisibility(8);
        } else {
            this.f20964jd.setText(dtVar.ozw());
        }
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = this.f20963cm;
        if (xykVar != null) {
            xykVar.setText(dtVar.clt());
        }
    }
}
