package com.bytedance.sdk.openadsdk.core.ju.jd.jpo;

import android.content.Context;
import com.bytedance.adsdk.jd.jj;
import com.bytedance.adsdk.ugeno.cm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends jj {
    private cm jpo;

    public jd(Context context) {
        super(context);
    }

    public void jpo(cm cmVar) {
        this.jpo = cmVar;
    }

    @Override // com.bytedance.adsdk.jd.jj, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.qk();
        }
    }

    @Override // com.bytedance.adsdk.jd.jj, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.xyk();
        }
    }
}
