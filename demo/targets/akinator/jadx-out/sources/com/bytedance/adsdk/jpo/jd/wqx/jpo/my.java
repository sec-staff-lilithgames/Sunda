package com.bytedance.adsdk.jpo.jd.wqx.jpo;

import java.util.Deque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends jj {
    @Override // com.bytedance.adsdk.jpo.jd.wqx.jpo.jj
    public int jpo(String str, int i10, Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque, com.bytedance.adsdk.jpo.jd.wqx.jpo jpoVar) {
        char cJpo;
        int i11 = i10;
        while (true) {
            cJpo = jpo(i11, str);
            if (!com.bytedance.adsdk.jpo.jd.my.jpo.jd(cJpo) && !com.bytedance.adsdk.jpo.jd.my.jpo.wqx(cJpo)) {
                break;
            }
            i11++;
        }
        if (cJpo != '(') {
            return jpoVar.jpo(str, i10, deque);
        }
        deque.push(new com.bytedance.adsdk.jpo.jd.jd.jpo.yd(str.substring(i10, i11)));
        return i11 + 1;
    }
}
