package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au extends jj {
    public au(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        TextView textView = new TextView(context);
        this.prr = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.prr, getWidgetLayoutParams());
    }

    private boolean jpo() {
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.f51if.f18197jd) && this.f51if.f18197jd.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.my.ju.jd();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my
    public void jj() {
        com.bytedance.sdk.component.adexpress.jd.au renderRequest = this.oya.getRenderRequest();
        if (renderRequest == null || !TextUtils.isEmpty(renderRequest.hx())) {
            super.jj();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f18242qk, this.xyk);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean zz() {
        /*
            r4 = this;
            super.zz()
            android.view.View r0 = r4.prr
            com.bytedance.sdk.component.adexpress.dynamic.cm.qk r1 = r4.f51if
            int r1 = r1.xyk()
            r0.setTextAlignment(r1)
            android.view.View r0 = r4.prr
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bytedance.sdk.component.adexpress.dynamic.cm.qk r1 = r4.f51if
            int r1 = r1.qk()
            r0.setTextColor(r1)
            android.view.View r0 = r4.prr
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bytedance.sdk.component.adexpress.dynamic.cm.qk r1 = r4.f51if
            float r1 = r1.my()
            r0.setTextSize(r1)
            boolean r0 = com.bytedance.sdk.component.adexpress.cm.jd()
            if (r0 == 0) goto L8a
            android.view.View r0 = r4.prr
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            r0.setIncludeFontPadding(r1)
            android.view.View r0 = r4.prr
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r2 = com.bytedance.sdk.component.adexpress.cm.jpo()
            int r3 = r4.xyk
            float r3 = (float) r3
            int r2 = com.bytedance.sdk.component.adexpress.cm.qk.jd(r2, r3)
            com.bytedance.sdk.component.adexpress.dynamic.cm.qk r3 = r4.f51if
            int r3 = r3.jd()
            int r2 = r2 - r3
            com.bytedance.sdk.component.adexpress.dynamic.cm.qk r3 = r4.f51if
            int r3 = r3.jpo()
            int r2 = r2 - r3
            float r2 = (float) r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 - r3
            com.bytedance.sdk.component.adexpress.dynamic.cm.qk r3 = r4.f51if
            float r3 = r3.my()
            float r2 = java.lang.Math.min(r2, r3)
            r0.setTextSize(r2)
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView r0 = r4.oya
            if (r0 == 0) goto L80
            com.bytedance.sdk.component.adexpress.jd.au r0 = r0.getRenderRequest()
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.pdm()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L80
            android.view.View r2 = r4.prr
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r0)
            goto L82
        L80:
            r1 = 8
        L82:
            android.view.View r0 = r4.prr
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r1)
            goto Lc3
        L8a:
            boolean r0 = r4.jpo()
            if (r0 == 0) goto Lb2
            boolean r0 = com.bytedance.sdk.component.adexpress.dynamic.my.ju.jd()
            if (r0 == 0) goto La2
            android.view.View r0 = r4.prr
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = com.bytedance.sdk.component.adexpress.dynamic.my.ju.jpo()
            r0.setText(r1)
            goto Lc3
        La2:
            android.view.View r0 = r4.prr
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.bytedance.sdk.component.adexpress.dynamic.cm.qk r1 = r4.f51if
            java.lang.String r1 = r1.f18197jd
            java.lang.String r1 = com.bytedance.sdk.component.adexpress.dynamic.my.ju.jpo(r1)
            r0.setText(r1)
            goto Lc3
        Lb2:
            android.view.View r0 = r4.prr
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "tt_logo_cn"
            int r1 = com.bytedance.sdk.component.utils.dt.jd(r1, r2)
            r0.setText(r1)
        Lc3:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.au.zz():boolean");
    }
}
