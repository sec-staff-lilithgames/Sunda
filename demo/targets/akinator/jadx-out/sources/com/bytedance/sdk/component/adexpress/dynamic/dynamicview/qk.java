package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends jj {
    public qk(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.jpo jpoVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.jpo(context);
        this.prr = jpoVar;
        jpoVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.prr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (!com.bytedance.sdk.component.adexpress.cm.jd() || !"fillButton".equals(this.f18236au.yd().jd())) {
            return super.getWidgetLayoutParams();
        }
        ((TextView) this.prr).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView) this.prr).setMaxLines(1);
        FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
        widgetLayoutParams.width -= this.f51if.opi() * 2;
        widgetLayoutParams.height -= this.f51if.opi() * 2;
        widgetLayoutParams.topMargin = this.f51if.opi() + widgetLayoutParams.topMargin;
        int iOpi = this.f51if.opi() + widgetLayoutParams.leftMargin;
        widgetLayoutParams.leftMargin = iOpi;
        widgetLayoutParams.setMarginStart(iOpi);
        widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
        return widgetLayoutParams;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        super.zz();
        if (TextUtils.equals("download-progress-button", this.f18236au.yd().jd()) && TextUtils.isEmpty(this.f51if.yd())) {
            this.prr.setVisibility(4);
            return true;
        }
        this.prr.setTextAlignment(this.f51if.xyk());
        ((TextView) this.prr).setText(this.f51if.yd());
        ((TextView) this.prr).setTextColor(this.f51if.qk());
        ((TextView) this.prr).setTextSize(this.f51if.my());
        ((TextView) this.prr).setGravity(17);
        ((TextView) this.prr).setIncludeFontPadding(false);
        if ("fillButton".equals(this.f18236au.yd().jd())) {
            this.prr.setPadding(0, 0, 0, 0);
        } else {
            this.prr.setPadding(this.f51if.wqx(), this.f51if.jd(), this.f51if.cm(), this.f51if.jpo());
        }
        return true;
    }
}
