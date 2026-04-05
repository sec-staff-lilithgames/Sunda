package com.bytedance.adsdk.jpo.jd.wqx.jpo;

import com.bytedance.adsdk.jpo.jd.jd.jpo.tu;
import java.util.Deque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends jj {
    @Override // com.bytedance.adsdk.jpo.jd.wqx.jpo.jj
    public int jpo(String str, int i10, Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque, com.bytedance.adsdk.jpo.jd.wqx.jpo jpoVar) {
        char cJpo = jpo(i10, str);
        return (com.bytedance.adsdk.jpo.jd.my.jpo.jd(cJpo) || cJpo == '$') ? jpo(str, i10, deque) : jpoVar.jpo(str, i10, deque);
    }

    private int jpo(String str, int i10, Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i12 + i10;
            char cJpo = jpo(i11, str);
            if (!com.bytedance.adsdk.jpo.jd.my.jpo.jd(cJpo) && !com.bytedance.adsdk.jpo.jd.my.jpo.wqx(cJpo) && '.' != cJpo && '[' != cJpo && ']' != cJpo && '_' != cJpo && '-' != cJpo && '$' != cJpo) {
                break;
            }
            i12++;
        }
        String strSubstring = str.substring(i10, i11);
        if (com.bytedance.adsdk.jpo.jd.cm.jpo.jpo(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.jpo.jd.jd.jpo.qk(strSubstring));
            return i11;
        }
        deque.push(new tu(strSubstring));
        return i11;
    }
}
