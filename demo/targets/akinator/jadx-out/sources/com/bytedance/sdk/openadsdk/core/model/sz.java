package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.dm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sz {

    /* renamed from: au, reason: collision with root package name */
    private int f20789au;

    /* renamed from: if, reason: not valid java name */
    private long f137if;

    /* renamed from: jd, reason: collision with root package name */
    public long f20791jd;

    /* renamed from: jj, reason: collision with root package name */
    private long f20792jj;
    public boolean jpo;

    /* renamed from: ju, reason: collision with root package name */
    private int f20793ju;
    private long my;

    /* renamed from: qk, reason: collision with root package name */
    private long f20794qk;
    private long xyk;

    /* renamed from: yd, reason: collision with root package name */
    private long f20795yd;
    private long zz;
    private dm wqx = dm.wqx();

    /* renamed from: cm, reason: collision with root package name */
    private dm f20790cm = dm.wqx();

    public long cm() {
        return this.f20794qk;
    }

    public void jd(dm dmVar) {
        this.f20790cm = dmVar;
        this.zz = dmVar.jpo(this.wqx);
    }

    public long jj() {
        return this.zz;
    }

    public void jpo(dm dmVar, dm dmVar2, int i10, dm dmVar3) {
        this.my = dmVar.jpo(this.wqx);
        this.f20792jj = dmVar2.jpo(dmVar);
        this.f20794qk = i10;
        this.xyk = dmVar3.jpo(dmVar2);
    }

    public long my() {
        return this.xyk;
    }

    public long qk() {
        return this.f20795yd;
    }

    public long wqx() {
        return this.f20792jj;
    }

    public int xyk() {
        return this.f20793ju;
    }

    public synchronized long yd() {
        return this.f20789au;
    }

    public long zz() {
        return this.f137if;
    }

    public long jd() {
        return this.my;
    }

    public void jd(long j10) {
        this.f137if = j10;
    }

    public synchronized void jd(int i10) {
        this.f20789au = i10;
    }

    public void jpo(dm dmVar) {
        this.wqx = dmVar;
    }

    public dm jpo() {
        return this.wqx;
    }

    public void jpo(long j10) {
        this.f20795yd = j10;
    }

    public void jpo(int i10) {
        this.f20793ju = i10;
    }
}
