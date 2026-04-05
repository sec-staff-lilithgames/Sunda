package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class se extends qk implements com.bytedance.sdk.component.adexpress.dynamic.wqx {

    /* renamed from: jd, reason: collision with root package name */
    private boolean f18249jd;
    private boolean jpo;
    private boolean nmd;

    public se(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(xykVar.yd().jd())) {
            dynamicRootView.setTimedown(this.xyk);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my
    public void jj() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.f18236au.yd().jd()) && !TextUtils.equals("skip-with-time-countdown", this.f18236au.yd().jd())) {
            super.jj();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f18242qk, this.xyk);
        layoutParams.gravity = 8388627;
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            layoutParams.leftMargin = this.zz;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wqx
    public void jpo(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        if (z11 || this.nmd) {
            ((TextView) this.prr).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (Integer.parseInt((String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (Exception unused) {
        }
        setVisibility(0);
        if (!z10 && this.oya.getRenderRequest().jpo() && com.bytedance.sdk.component.adexpress.cm.jj.jd(this.oya.getRenderRequest().cm())) {
            if (com.bytedance.sdk.component.adexpress.cm.jd()) {
                ((TextView) this.prr).setText(i10 + ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
            } else {
                ((TextView) this.prr).setText(String.format(com.bytedance.sdk.component.utils.dt.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), "tt_reward_full_skip"), Integer.valueOf(i10)));
            }
            this.jpo = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.cm.jd() && !"open_ad".equals(this.oya.getRenderRequest().cm()) && this.oya.getRenderRequest().jpo()) {
            this.nmd = true;
            setVisibility(8);
            return;
        }
        if ("timedown".equals(this.f18236au.yd().jd())) {
            ((TextView) this.prr).setText(charSequence);
            return;
        }
        ((TextView) this.prr).setText(((Object) charSequence) + ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
        this.f18249jd = true;
        if (this.jpo) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f51if.cm() + this.f51if.wqx()) + com.bytedance.sdk.component.adexpress.dynamic.my.ju.jd(((TextView) this.prr).getText() != null ? r5.toString() : "", this.f51if.my(), true)[0]), this.xyk);
            layoutParams.gravity = 8388629;
            this.prr.setLayoutParams(layoutParams);
            this.jpo = false;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.prr).getText())) {
            setMeasuredDimension(0, this.xyk);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qk, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        super.zz();
        if (com.bytedance.sdk.component.adexpress.cm.jj.jd(this.oya.getRenderRequest().cm())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.f18236au.yd().jd())) {
            ((TextView) this.prr).setText(String.valueOf((int) Double.parseDouble(this.f51if.yd())));
            return true;
        }
        ((TextView) this.prr).setText(((int) Double.parseDouble(this.f51if.yd())) + ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
        return true;
    }
}
