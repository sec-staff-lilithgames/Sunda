package com.bytedance.sdk.component.adexpress.jj;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends tu {
    private nmd jpo;

    public jj(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        jpo(context, i10, i11, i12, jSONObject);
    }

    private void jpo(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        nmd nmdVar = new nmd(context, com.bytedance.sdk.component.adexpress.wqx.jpo.wqx(context), i10, i11, i12, jSONObject);
        this.jpo = nmdVar;
        addView(nmdVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.jpo.setLayoutParams(layoutParams);
    }

    public nmd getShakeView() {
        return this.jpo;
    }

    public void setShakeText(String str) {
        if (this.jpo == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.jpo.setShakeText("");
        } else {
            this.jpo.setShakeText(str);
        }
    }
}
