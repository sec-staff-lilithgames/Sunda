package com.bytedance.sdk.component.xyk.wqx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jd implements Comparable<jd>, Runnable {

    /* renamed from: cm, reason: collision with root package name */
    private long f19044cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f19045jd;

    /* renamed from: jj, reason: collision with root package name */
    private long f19046jj;
    private int jpo;
    private long my;
    private Runnable wqx;

    public jd(String str) {
        this.jpo = 5;
        this.f19045jd = str;
    }

    public long cm() {
        return this.my;
    }

    public String jd() {
        return this.f19045jd;
    }

    public Runnable jj() {
        return this.wqx;
    }

    public void jpo(int i10) {
        this.jpo = i10;
    }

    public long my() {
        return this.f19046jj;
    }

    public long wqx() {
        return this.f19044cm;
    }

    public void jd(long j10) {
        this.my = j10;
    }

    public int jpo() {
        return this.jpo;
    }

    public void wqx(long j10) {
        this.f19046jj = j10;
    }

    @Override // java.lang.Comparable
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public int compareTo(jd jdVar) {
        if (jpo() < jdVar.jpo()) {
            return 1;
        }
        return jpo() >= jdVar.jpo() ? -1 : 0;
    }

    public jd(int i10, String str) {
        this.jpo = i10;
        this.f19045jd = str;
    }

    public void jpo(long j10) {
        this.f19044cm = j10;
    }

    public jd(String str, Runnable runnable) {
        this.jpo = 5;
        this.f19045jd = str;
        this.wqx = runnable;
    }
}
