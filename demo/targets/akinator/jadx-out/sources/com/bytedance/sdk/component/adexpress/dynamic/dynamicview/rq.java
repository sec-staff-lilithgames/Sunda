package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class rq extends qk implements com.bytedance.sdk.component.adexpress.dynamic.wqx {

    /* renamed from: jd, reason: collision with root package name */
    private int f18248jd;
    private int[] jpo;
    private int nmd;

    public rq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my
    public void jj() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f18242qk, this.xyk);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx
    public void jpo(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        String strJpo = com.bytedance.sdk.component.utils.dt.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), "tt_reward_screen_skip_tx");
        if (i10 == 0) {
            this.prr.setVisibility(0);
            ((TextView) this.prr).setText("| ".concat(String.valueOf(strJpo)));
            this.prr.measure(-2, -2);
            this.jpo = new int[]{this.prr.getMeasuredWidth() + 1, this.prr.getMeasuredHeight()};
            View view = this.prr;
            int[] iArr = this.jpo;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.prr).setGravity(17);
            ((TextView) this.prr).setIncludeFontPadding(false);
            jpo();
            this.prr.setPadding(this.f51if.wqx(), this.f18248jd, this.f51if.cm(), this.nmd);
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.prr).getText())) {
            setMeasuredDimension(0, this.xyk);
        } else {
            setMeasuredDimension(this.f18242qk, this.xyk);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qk, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        super.zz();
        ((TextView) this.prr).setText("");
        return true;
    }

    private void jpo() {
        int iJpo = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.my());
        this.f18248jd = ((this.xyk - iJpo) / 2) - this.f51if.jpo();
        this.nmd = 0;
    }
}
