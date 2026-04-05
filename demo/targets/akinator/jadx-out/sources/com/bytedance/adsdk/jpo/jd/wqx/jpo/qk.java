package com.bytedance.adsdk.jpo.jd.wqx.jpo;

import com.bytedance.adsdk.jpo.jd.jd.jpo.prr;
import java.util.Deque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends jj {
    private boolean jpo(String str, int i10, Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque) {
        if ('-' != jpo(i10, str)) {
            return com.bytedance.adsdk.jpo.jd.my.jpo.wqx(jpo(i10, str));
        }
        if (deque.peek() != null && !com.bytedance.adsdk.jpo.jd.cm.wqx.jpo(deque.peek().jpo())) {
            return false;
        }
        if (com.bytedance.adsdk.jpo.jd.my.jpo.wqx(jpo(i10 + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i10));
    }

    @Override // com.bytedance.adsdk.jpo.jd.wqx.jpo.jj
    public int jpo(String str, int i10, Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque, com.bytedance.adsdk.jpo.jd.wqx.jpo jpoVar) {
        char cJpo;
        if (!jpo(str, i10, deque)) {
            return jpoVar.jpo(str, i10, deque);
        }
        int i11 = jpo(i10, str) == '-' ? i10 + 1 : i10;
        boolean z10 = false;
        while (true) {
            cJpo = jpo(i11, str);
            if (!com.bytedance.adsdk.jpo.jd.my.jpo.wqx(cJpo) && (z10 || cJpo != '.')) {
                break;
            }
            i11++;
            if (cJpo == '.') {
                z10 = true;
            }
        }
        if (cJpo != '.') {
            deque.push(new prr(str.substring(i10, i11)));
            return i11;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i10, i11));
    }
}
