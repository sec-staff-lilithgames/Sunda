package com.bytedance.sdk.component.xyk;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk<V> extends FutureTask<V> implements Comparable<qk<V>> {

    /* renamed from: jd, reason: collision with root package name */
    private int f19041jd;
    private int jpo;

    public qk(Callable<V> callable, int i10, int i11) {
        super(callable);
        this.jpo = i10 == -1 ? 5 : i10;
        this.f19041jd = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public int compareTo(qk qkVar) {
        if (jpo() < qkVar.jpo()) {
            return 1;
        }
        return jpo() > qkVar.jpo() ? -1 : 0;
    }

    public int jpo() {
        return this.jpo;
    }
}
