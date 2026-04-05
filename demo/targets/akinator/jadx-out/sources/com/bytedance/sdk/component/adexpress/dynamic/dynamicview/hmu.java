package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hmu extends jj {
    private int jpo;

    public hmu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        this.jpo = 0;
        com.bytedance.sdk.component.adexpress.jj.hmu hmuVar = new com.bytedance.sdk.component.adexpress.jj.hmu(context, null);
        this.prr = hmuVar;
        hmuVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.prr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iJpo = (int) (com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.cm()) + this.f51if.wqx()) + (com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.my()) * 5.0f));
        if (this.f18242qk > iJpo && 4 == this.f51if.xyk()) {
            this.jpo = (this.f18242qk - iJpo) / 2;
        }
        this.f18242qk = iJpo;
        return new FrameLayout.LayoutParams(this.f18242qk, this.xyk);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my
    public void jj() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f18242qk, this.xyk);
        layoutParams.topMargin = this.f18245yd;
        int i10 = this.zz + this.jpo;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() throws NumberFormatException {
        DynamicRootView dynamicRootView;
        super.zz();
        double dAu = this.f51if.au();
        if (com.bytedance.sdk.component.adexpress.cm.jd() && (dAu < 0.0d || dAu > 5.0d || ((dynamicRootView = this.oya) != null && dynamicRootView.getRenderRequest() != null && this.oya.getRenderRequest().yd() != 4))) {
            this.prr.setVisibility(8);
            return true;
        }
        double d10 = (dAu < 0.0d || dAu > 5.0d) ? 5.0d : dAu;
        this.prr.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.jj.hmu) this.prr).jpo(d10, this.f51if.qk(), (int) this.f51if.my(), ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.jd())) + ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.jpo())) + ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.my())));
        return true;
    }
}
