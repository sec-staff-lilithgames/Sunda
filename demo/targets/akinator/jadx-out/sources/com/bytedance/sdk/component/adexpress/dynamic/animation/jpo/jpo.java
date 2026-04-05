package com.bytedance.sdk.component.adexpress.dynamic.animation.jpo;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends cm {
    public jpo(View view, com.bytedance.sdk.component.adexpress.dynamic.cm.jpo jpoVar) {
        super(view, jpoVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.cm
    public List<ObjectAnimator> jpo() {
        float fOpi = this.f18113jd.opi() / 100.0f;
        float fJr = this.f18113jd.jr() / 100.0f;
        if ("reverse".equals(this.f18113jd.hna()) && this.f18113jd.oya() <= 0.0d) {
            fJr = fOpi;
            fOpi = fJr;
        }
        this.wqx.setAlpha(fOpi);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.wqx, "alpha", fOpi, fJr).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(jpo(duration));
        return arrayList;
    }
}
