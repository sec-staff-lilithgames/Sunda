package com.bytedance.sdk.component.adexpress.dynamic.animation.jpo;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends cm {
    public qk(View view, com.bytedance.sdk.component.adexpress.dynamic.cm.jpo jpoVar) {
        super(view, jpoVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.cm
    public List<ObjectAnimator> jpo() {
        this.wqx.setTag(2097610709, Integer.valueOf(this.f18113jd.wqx()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.wqx, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(jpo(duration));
        return arrayList;
    }
}
