package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class tu extends jj implements com.bytedance.sdk.component.adexpress.dynamic.wqx {

    /* renamed from: jd, reason: collision with root package name */
    private int f18259jd;
    private int jpo;
    private int nmd;

    public tu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        jpo();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my
    public void jj() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i10 = this.zz;
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = this.f18245yd;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx
    public void jpo(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        this.nmd = i10;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.nmd == 0) {
            setMeasuredDimension(this.f18259jd, this.xyk);
        } else {
            setMeasuredDimension(this.jpo, this.xyk);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        setBackground(getBackgroundDrawable());
        setPadding((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.wqx()), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.jd()), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.cm()), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.jpo()));
        return true;
    }

    private void jpo() {
        List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> listJu = this.f18236au.ju();
        if (listJu == null || listJu.size() <= 0) {
            return;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar : listJu) {
            if (xykVar.yd().jpo() == 21) {
                this.jpo = (int) (this.f18242qk - com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, xykVar.xyk()));
            }
            if (xykVar.yd().jpo() == 20) {
                this.f18259jd = (int) (this.f18242qk - com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, xykVar.xyk()));
            }
        }
    }
}
