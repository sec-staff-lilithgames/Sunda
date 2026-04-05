package com.bytedance.sdk.component.adexpress.dynamic.animation.jpo;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr extends cm {
    public prr(View view, com.bytedance.sdk.component.adexpress.dynamic.cm.jpo jpoVar) {
        super(view, jpoVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.cm
    public List<ObjectAnimator> jpo() {
        float f10;
        float fJpo = com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f18113jd.jj());
        float fJpo2 = com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f18113jd.qk());
        float f11 = 0.0f;
        if ("reverse".equals(this.f18113jd.hna())) {
            f10 = fJpo2;
            fJpo2 = 0.0f;
            f11 = fJpo;
            fJpo = 0.0f;
        } else {
            f10 = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.cm.jd.jpo(this.wqx.getContext())) {
            fJpo = -fJpo;
            f11 = -f11;
        }
        this.wqx.setTranslationX(fJpo);
        this.wqx.setTranslationY(fJpo2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.wqx, "translationX", fJpo, f11).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.wqx, "translationY", fJpo2, f10).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(jpo(duration));
        arrayList.add(jpo(duration2));
        return arrayList;
    }
}
