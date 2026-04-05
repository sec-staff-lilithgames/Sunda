package com.bytedance.adsdk.jpo.jd.wqx.jpo;

import com.bytedance.adsdk.jpo.jd.jd.jpo.nmd;
import java.util.Deque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends jj {
    @Override // com.bytedance.adsdk.jpo.jd.wqx.jpo.jj
    public int jpo(String str, int i10, Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque, com.bytedance.adsdk.jpo.jd.wqx.jpo jpoVar) {
        if ('\'' != jpo(i10, str)) {
            return jpoVar.jpo(str, i10, deque);
        }
        int i11 = i10 + 1;
        int length = str.length();
        int i12 = i11;
        while (i12 < length && jpo(i12, str) != '\'') {
            i12++;
        }
        if (jpo(i12, str) != '\'') {
            throw new com.bytedance.adsdk.jpo.jpo.jpo("String expression not surrounded by '", str.substring(i10));
        }
        deque.push(new nmd(str.substring(i11, i12)));
        return i12 + 1;
    }
}
