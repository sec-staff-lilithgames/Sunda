package com.bytedance.sdk.component.jj.jpo.my;

import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class my implements Comparable<my>, Runnable {
    private String wqx;
    private int jpo = 5;

    /* renamed from: jd, reason: collision with root package name */
    private String f18733jd = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public my(String str) {
        this.wqx = str;
    }

    public void jpo(int i10) {
        this.jpo = i10;
    }

    public int jpo() {
        return this.jpo;
    }

    @Override // java.lang.Comparable
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public int compareTo(my myVar) {
        if (jpo() < myVar.jpo()) {
            return 1;
        }
        return jpo() >= myVar.jpo() ? -1 : 0;
    }
}
