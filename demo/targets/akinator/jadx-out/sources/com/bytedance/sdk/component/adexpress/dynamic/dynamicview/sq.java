package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sq extends jj {

    /* renamed from: dt, reason: collision with root package name */
    private LinearLayout f18250dt;

    /* renamed from: jd, reason: collision with root package name */
    private TextView f18251jd;
    private TextView jpo;
    private TextView nmd;

    /* renamed from: rq, reason: collision with root package name */
    private TextView f18252rq;

    /* renamed from: tu, reason: collision with root package name */
    private TextView f18253tu;

    public sq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        this.jpo = new TextView(this.f18241ju);
        this.f18251jd = new TextView(this.f18241ju);
        this.nmd = new TextView(this.f18241ju);
        this.f18250dt = new LinearLayout(this.f18241ju);
        this.f18252rq = new TextView(this.f18241ju);
        this.f18253tu = new TextView(this.f18241ju);
        this.jpo.setTag(9);
        this.f18251jd.setTag(10);
        this.nmd.setTag(12);
        this.f18250dt.addView(this.nmd);
        this.f18250dt.addView(this.f18253tu);
        this.f18250dt.addView(this.f18251jd);
        this.f18250dt.addView(this.f18252rq);
        this.f18250dt.addView(this.jpo);
        addView(this.f18250dt, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my
    public boolean cm() {
        this.jpo.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.jpo.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.f18251jd.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f18251jd.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.nmd.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.nmd.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f18242qk, this.xyk);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        this.nmd.setText("Function");
        this.f18251jd.setText("Permission list");
        this.f18252rq.setText(" | ");
        this.f18253tu.setText(" | ");
        this.jpo.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar = this.f51if;
        if (qkVar != null) {
            this.nmd.setTextColor(qkVar.qk());
            this.nmd.setTextSize(this.f51if.my());
            this.f18251jd.setTextColor(this.f51if.qk());
            this.f18251jd.setTextSize(this.f51if.my());
            this.f18252rq.setTextColor(this.f51if.qk());
            this.f18253tu.setTextColor(this.f51if.qk());
            this.jpo.setTextColor(this.f51if.qk());
            this.jpo.setTextSize(this.f51if.my());
            return false;
        }
        this.nmd.setTextColor(-1);
        this.nmd.setTextSize(12.0f);
        this.f18251jd.setTextColor(-1);
        this.f18251jd.setTextSize(12.0f);
        this.f18252rq.setTextColor(-1);
        this.f18253tu.setTextColor(-1);
        this.jpo.setTextColor(-1);
        this.jpo.setTextSize(12.0f);
        return false;
    }
}
