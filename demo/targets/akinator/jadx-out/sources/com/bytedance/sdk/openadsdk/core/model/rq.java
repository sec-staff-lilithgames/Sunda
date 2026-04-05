package com.bytedance.sdk.openadsdk.core.model;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class rq {
    private long jpo = 10000;

    /* renamed from: jd, reason: collision with root package name */
    private long f20776jd = 10000;
    private long wqx = 10;

    /* renamed from: cm, reason: collision with root package name */
    private long f20775cm = 20;
    private String my = "";

    public long cm() {
        return this.f20775cm;
    }

    public long jd() {
        return this.f20776jd;
    }

    public long jpo() {
        return this.jpo;
    }

    public String my() {
        return this.my;
    }

    public long wqx() {
        return this.wqx;
    }

    public void cm(long j10) {
        if (j10 < 0) {
            this.f20775cm = 20L;
        } else {
            this.f20775cm = j10;
        }
    }

    public void jd(long j10) {
        if (j10 < 0) {
            this.f20776jd = 20L;
        } else {
            this.f20776jd = j10;
        }
    }

    public void jpo(long j10) {
        if (j10 <= 0) {
            this.jpo = 10L;
        } else {
            this.jpo = j10;
        }
    }

    public void wqx(long j10) {
        if (j10 <= 0) {
            this.wqx = 10L;
        } else {
            this.wqx = j10;
        }
    }

    public void jpo(String str) {
        this.my = str;
    }
}
