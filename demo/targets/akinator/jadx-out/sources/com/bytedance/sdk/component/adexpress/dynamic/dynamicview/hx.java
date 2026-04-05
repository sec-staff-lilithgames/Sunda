package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hx extends jj implements com.bytedance.sdk.component.adexpress.dynamic.wqx {

    /* renamed from: jd, reason: collision with root package name */
    boolean f18216jd;
    int jpo;
    private int nmd;

    /* renamed from: rq, reason: collision with root package name */
    private int f18217rq;

    /* renamed from: tu, reason: collision with root package name */
    private boolean f18218tu;

    public hx(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        this.f18217rq = 0;
        setTag(Integer.valueOf(getClickArea()));
        jpo();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().se()) {
            return;
        }
        View view = this.prr;
        if (view != null) {
            view.setVisibility(8);
        }
        setVisibility(8);
    }

    private void jpo() {
        List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> listJu = this.f18236au.ju();
        if (listJu == null || listJu.size() <= 0) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> it = listJu.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.cm.xyk next = it.next();
            if (TextUtils.equals("skip-with-time-skip-btn", next.yd().jd())) {
                int iJpo = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, next.xyk() + (com.bytedance.sdk.component.adexpress.cm.jd() ? next.au() : 0));
                this.nmd = iJpo;
                this.jpo = this.f18242qk - iJpo;
            }
        }
        this.f18217rq = this.f18242qk - this.jpo;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my
    public void jj() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.f18216jd) {
            layoutParams.leftMargin = this.zz;
        } else {
            layoutParams.leftMargin = this.zz + this.f18217rq;
        }
        if (this.f18218tu && this.f51if != null) {
            layoutParams.leftMargin = ((this.zz + this.f18217rq) - ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.wqx()))) - ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.cm()));
        }
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            layoutParams.topMargin = this.f18245yd - ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.jd()));
        } else {
            layoutParams.topMargin = this.f18245yd;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f18218tu && this.f51if != null) {
            setMeasuredDimension(this.nmd + ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.wqx())) + ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.cm())), this.xyk);
        } else if (this.f18216jd) {
            setMeasuredDimension(this.f18242qk, this.xyk);
        } else {
            setMeasuredDimension(this.jpo, this.xyk);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        if (com.bytedance.sdk.component.adexpress.cm.jj.jd(this.oya.getRenderRequest().cm())) {
            return true;
        }
        super.zz();
        setPadding((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.wqx()), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.jd()), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.cm()), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.jpo()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx
    public void jpo(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        if (z11 && this.f18218tu != z11) {
            this.f18218tu = z11;
            jj();
            return;
        }
        if (z10 && this.f18216jd != z10) {
            this.f18216jd = z10;
            jj();
        }
        this.f18216jd = z10;
    }
}
