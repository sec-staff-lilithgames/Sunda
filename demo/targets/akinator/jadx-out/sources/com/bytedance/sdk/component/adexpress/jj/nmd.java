package com.bytedance.sdk.component.adexpress.jj;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nmd extends jr {
    private TextView jpo;

    public nmd(Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, view, i10, i11, i12, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.jj.jr
    public void jpo(Context context, View view) {
        addView(view);
        this.jpo = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.jj.jr
    public void setShakeText(String str) {
        if (this.jpo == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.jpo.setText(str);
            return;
        }
        try {
            this.jpo.setText(com.bytedance.sdk.component.utils.dt.jd(this.jpo.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e10) {
            e10.getMessage();
        }
    }
}
