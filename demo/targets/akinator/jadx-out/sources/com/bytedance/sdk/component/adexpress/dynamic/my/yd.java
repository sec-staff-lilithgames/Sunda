package com.bytedance.sdk.component.adexpress.dynamic.my;

import com.bytedance.sdk.component.adexpress.dynamic.my.jd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd {
    public static float jpo(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<jd.jpo> jpo(float f10, List<jd.jpo> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<jd.jpo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((jd.jpo) it.next().clone());
        }
        Iterator it2 = arrayList.iterator();
        boolean z10 = true;
        int i10 = 0;
        int i11 = 0;
        while (it2.hasNext()) {
            jd.jpo jpoVar = (jd.jpo) it2.next();
            if (jpoVar.f18289jd) {
                i10 = (int) (i10 + jpoVar.jpo);
            } else {
                i11 = (int) (i11 + jpoVar.jpo);
                z10 = false;
            }
        }
        if (!z10 || f10 <= i10) {
            float f11 = i10;
            float f12 = f10 < f11 ? f10 / f11 : 1.0f;
            float f13 = f10 > f11 ? (f10 - f11) / i11 : 0.0f;
            if (f13 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                boolean z11 = false;
                while (it3.hasNext()) {
                    jd.jpo jpoVar2 = (jd.jpo) it3.next();
                    if (!jpoVar2.f18289jd) {
                        float f14 = jpoVar2.wqx;
                        if (f14 != 0.0f && jpoVar2.jpo * f13 > f14) {
                            jpoVar2.jpo = f14;
                            jpoVar2.f18289jd = true;
                            z11 = true;
                        }
                    }
                    arrayList2.add(jpoVar2);
                }
                if (z11) {
                    return jpo(f10, arrayList2);
                }
            }
            Iterator it4 = arrayList.iterator();
            int i12 = 0;
            while (it4.hasNext()) {
                jd.jpo jpoVar3 = (jd.jpo) it4.next();
                if (jpoVar3.f18289jd) {
                    jpoVar3.jpo = jpo(jpoVar3.jpo * f12);
                } else {
                    jpoVar3.jpo = jpo(jpoVar3.jpo * f13);
                }
                i12 = (int) (i12 + jpoVar3.jpo);
            }
            float f15 = i12;
            if (f15 < f10) {
                float f16 = f10 - f15;
                for (int size = 0; size < arrayList.size() && f16 > 0.0f; size = (size + 1) % arrayList.size()) {
                    jd.jpo jpoVar4 = (jd.jpo) arrayList.get(size);
                    if ((f10 < f11 && jpoVar4.f18289jd) || (f10 > f11 && !jpoVar4.f18289jd)) {
                        jpoVar4.jpo += 0.0625f;
                        f16 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}
