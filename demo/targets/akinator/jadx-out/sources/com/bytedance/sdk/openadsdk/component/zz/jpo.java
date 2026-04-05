package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.hna;
import com.bytedance.sdk.openadsdk.core.zz.nmd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends com.bytedance.sdk.openadsdk.core.zz.jpo {
    private nmd jpo;

    public jpo(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.jpo
    public void jpo(View view, int i10, hna hnaVar) {
        nmd nmdVar = this.jpo;
        if (nmdVar != null) {
            nmdVar.jpo(view, i10, hnaVar);
        }
    }

    public void jpo(nmd nmdVar) {
        this.jpo = nmdVar;
        nmdVar.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
