package com.bytedance.adsdk.jpo.jd.wqx.jpo;

import java.util.Deque;
import java.util.LinkedList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends jj {
    @Override // com.bytedance.adsdk.jpo.jd.wqx.jpo.jj
    public int jpo(String str, int i10, Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque, com.bytedance.adsdk.jpo.jd.wqx.jpo jpoVar) {
        com.bytedance.adsdk.jpo.jd.jd.jpo jpoVarPollFirst;
        if (')' != jpo(i10, str)) {
            return jpoVar.jpo(str, i10, deque);
        }
        LinkedList<com.bytedance.adsdk.jpo.jd.jd.jpo> linkedList = new LinkedList();
        while (true) {
            jpoVarPollFirst = deque.pollFirst();
            if (jpoVarPollFirst == null || jpoVarPollFirst.jpo() == com.bytedance.adsdk.jpo.jd.cm.jd.METHOD || jpoVarPollFirst.jpo() == com.bytedance.adsdk.jpo.jd.cm.cm.LEFT_PAREN) {
                break;
            }
            linkedList.addFirst(jpoVarPollFirst);
        }
        if (jpoVarPollFirst == null) {
            throw new IllegalArgumentException(str.substring(0, i10));
        }
        if (jpoVarPollFirst.jpo() != com.bytedance.adsdk.jpo.jd.cm.jd.METHOD) {
            deque.push(com.bytedance.adsdk.jpo.jd.my.jd.jpo(linkedList, str, i10));
            return i10 + 1;
        }
        com.bytedance.adsdk.jpo.jd.jd.jpo.yd ydVar = (com.bytedance.adsdk.jpo.jd.jd.jpo.yd) jpoVarPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (com.bytedance.adsdk.jpo.jd.jd.jpo jpoVar2 : linkedList) {
            if (jpoVar2.jpo() == com.bytedance.adsdk.jpo.jd.cm.cm.COMMA) {
                linkedList2.add(com.bytedance.adsdk.jpo.jd.my.jd.jpo(linkedList3, str, i10));
                linkedList3.clear();
            } else {
                linkedList3.addLast(jpoVar2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.jpo.jd.my.jd.jpo(linkedList3, str, i10));
        }
        ydVar.jpo((com.bytedance.adsdk.jpo.jd.jd.jpo[]) linkedList2.toArray(new com.bytedance.adsdk.jpo.jd.jd.jpo[linkedList2.size()]));
        int i11 = i10 + 1;
        deque.push(ydVar);
        return i11;
    }
}
