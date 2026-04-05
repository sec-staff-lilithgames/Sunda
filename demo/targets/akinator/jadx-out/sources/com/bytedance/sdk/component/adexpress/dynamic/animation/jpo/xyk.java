package com.bytedance.sdk.component.adexpress.dynamic.animation.jpo;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends cm {
    public xyk(View view, com.bytedance.sdk.component.adexpress.dynamic.cm.jpo jpoVar) {
        super(view, jpoVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.cm
    public List<ObjectAnimator> jpo() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.wqx, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        ((ViewGroup) this.wqx.getParent()).setClipChildren(false);
        ((ViewGroup) this.wqx.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.wqx.getParent().getParent().getParent()).setClipChildren(false);
        this.wqx.setTag(2097610712, this.f18113jd.xyk());
        ArrayList arrayList = new ArrayList();
        arrayList.add(jpo(duration));
        return arrayList;
    }
}
