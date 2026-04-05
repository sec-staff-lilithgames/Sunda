package com.bytedance.sdk.component.adexpress.dynamic.animation.jpo;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends cm {
    public jj(View view, com.bytedance.sdk.component.adexpress.dynamic.cm.jpo jpoVar) {
        super(view, jpoVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.cm
    public List<ObjectAnimator> jpo() {
        float f10 = this.wqx.getLayoutParams().width;
        this.wqx.setTranslationX(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.wqx, "translationX", f10, 0.0f).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.wqx, "alpha", 0.0f, 1.0f).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(jpo(duration));
        arrayList.add(jpo(duration2));
        return arrayList;
    }
}
