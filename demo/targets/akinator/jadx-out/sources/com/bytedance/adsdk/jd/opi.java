package com.bytedance.adsdk.jd;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi {
    private boolean jpo = false;

    /* renamed from: jd, reason: collision with root package name */
    private final Set<Object> f17409jd = new jpo();
    private final Map<String, com.bytedance.adsdk.jd.jj.cm> wqx = new HashMap();

    /* renamed from: cm, reason: collision with root package name */
    private final Comparator<Pair<String, Float>> f17408cm = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.jd.opi.1
        @Override // java.util.Comparator
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public void jpo(boolean z10) {
        this.jpo = z10;
    }

    public void jpo(String str, float f10) {
        if (this.jpo) {
            com.bytedance.adsdk.jd.jj.cm cmVar = this.wqx.get(str);
            if (cmVar == null) {
                cmVar = new com.bytedance.adsdk.jd.jj.cm();
                this.wqx.put(str, cmVar);
            }
            cmVar.jpo(f10);
            if (str.equals("__container")) {
                Iterator<Object> it = this.f17409jd.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
