package com.bytedance.sdk.component.adexpress.dynamic.animation.jpo;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif extends cm {
    public Cif(View view, com.bytedance.sdk.component.adexpress.dynamic.cm.jpo jpoVar) {
        super(view, jpoVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.cm
    public List<ObjectAnimator> jpo() {
        int i10;
        int i11;
        this.wqx.setTag(2097610711, Integer.valueOf(this.f18113jd.cm()));
        View view = this.wqx;
        if (view == null || !com.bytedance.sdk.component.adexpress.cm.jd.jpo(view.getContext())) {
            i10 = 0;
            i11 = 1;
        } else {
            i11 = 0;
            i10 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.wqx, "shineValue", i10, i11).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(jpo(duration));
        return arrayList;
    }
}
