package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends com.bytedance.sdk.openadsdk.core.jj.cm {
    public wqx(Context context) {
        super(context);
        jpo();
    }

    private void jpo() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.hna.afh);
    }

    public void jpo(int i10, dt dtVar) {
        if (dtVar.ig() || (dtVar.jfy() && dtVar.jr())) {
            va.jpo((View) this, 0);
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo((int) va.jpo(getContext(), i10, true), this, dtVar);
        }
    }
}
