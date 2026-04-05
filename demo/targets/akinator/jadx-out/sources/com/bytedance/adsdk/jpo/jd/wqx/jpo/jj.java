package com.bytedance.adsdk.jpo.jd.wqx.jpo;

import java.util.Deque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jj {
    public int jd(int i10, String str) {
        while (com.bytedance.adsdk.jpo.jd.my.jpo.jpo(jpo(i10, str))) {
            i10++;
        }
        return i10;
    }

    public char jpo(int i10, String str) {
        if (i10 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i10);
    }

    public abstract int jpo(String str, int i10, Deque<com.bytedance.adsdk.jpo.jd.jd.jpo> deque, com.bytedance.adsdk.jpo.jd.wqx.jpo jpoVar);
}
