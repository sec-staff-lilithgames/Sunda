package com.bytedance.adsdk.jpo.jd.wqx.jpo;

import com.bytedance.adsdk.jpo.jd.jd.jpo.rq;
import java.util.Deque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends jj {
    @Override // com.bytedance.adsdk.jpo.jd.wqx.jpo.jj
    public int jpo(String str, int i10, Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque, com.bytedance.adsdk.jpo.jd.wqx.jpo jpoVar) {
        if ('(' != jpo(i10, str)) {
            return jpoVar.jpo(str, i10, deque);
        }
        deque.push(new rq(com.bytedance.adsdk.jpo.jd.cm.cm.LEFT_PAREN));
        return i10 + 1;
    }
}
