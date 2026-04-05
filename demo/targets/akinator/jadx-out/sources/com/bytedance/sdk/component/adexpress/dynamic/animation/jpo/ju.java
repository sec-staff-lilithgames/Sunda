package com.bytedance.sdk.component.adexpress.dynamic.animation.jpo;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju extends cm {
    public ju(View view, com.bytedance.sdk.component.adexpress.dynamic.cm.jpo jpoVar) {
        super(view, jpoVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.cm
    public List<ObjectAnimator> jpo() {
        float f10;
        float fJu = (float) this.f18113jd.ju();
        float fM404if = (float) this.f18113jd.m404if();
        String strHna = this.f18113jd.hna();
        float f11 = 1.0f;
        if ("reverse".equals(strHna) || "alternate-reverse".equals(strHna)) {
            f10 = 1.0f;
        } else {
            f10 = fM404if;
            fM404if = 1.0f;
            f11 = fJu;
            fJu = 1.0f;
        }
        this.wqx.setTag(2097610710, this.f18113jd.jd());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.wqx, "scaleX", fJu, f11).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.wqx, "scaleY", fM404if, f10).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(jpo(duration));
        arrayList.add(jpo(duration2));
        return arrayList;
    }
}
