package com.bytedance.adsdk.jpo.jd.wqx.jpo;

import com.bytedance.adsdk.jpo.jd.jd.jpo.hna;
import e3.g;
import java.util.Deque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends jj {
    @Override // com.bytedance.adsdk.jpo.jd.wqx.jpo.jj
    public int jpo(String str, int i10, Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque, com.bytedance.adsdk.jpo.jd.wqx.jpo jpoVar) {
        if (!com.bytedance.adsdk.jpo.jd.my.jpo.cm(jpo(i10, str))) {
            return jpoVar.jpo(str, i10, deque);
        }
        int i11 = i10 + 1;
        String str2 = new String(new char[]{jpo(i10, str), jpo(i11, str)});
        if (com.bytedance.adsdk.jpo.jd.cm.wqx.jpo(str2) != null) {
            deque.push(new hna(com.bytedance.adsdk.jpo.jd.cm.wqx.jpo(str2)));
            return i10 + 2;
        }
        String strValueOf = String.valueOf(jpo(i10, str));
        if (com.bytedance.adsdk.jpo.jd.cm.wqx.jpo(strValueOf) != null) {
            deque.push(new hna(com.bytedance.adsdk.jpo.jd.cm.wqx.jpo(strValueOf)));
            return i11;
        }
        StringBuilder sbO = g.o("Unrecognized:", strValueOf, "examine:");
        sbO.append(str.substring(0, i10));
        throw new IllegalArgumentException(sbO.toString());
    }
}
