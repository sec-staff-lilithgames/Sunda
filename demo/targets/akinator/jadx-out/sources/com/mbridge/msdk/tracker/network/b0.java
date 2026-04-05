package com.mbridge.msdk.tracker.network;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final q f43946a;

    /* renamed from: b, reason: collision with root package name */
    private long f43947b;

    /* renamed from: c, reason: collision with root package name */
    private int f43948c;

    /* renamed from: d, reason: collision with root package name */
    private String f43949d;

    public b0() {
        this.f43948c = 0;
        this.f43949d = "";
        this.f43946a = null;
    }

    public abstract int a();

    public void a(long j10) {
        this.f43947b = j10;
    }

    public int b() {
        return this.f43948c;
    }

    public void a(int i10) {
        this.f43948c = i10;
    }

    public b0(q qVar) {
        this.f43948c = 0;
        this.f43949d = "";
        this.f43946a = qVar;
    }

    public b0(String str) {
        super(str);
        this.f43948c = 0;
        this.f43949d = "";
        this.f43946a = null;
    }

    public b0(Throwable th2) {
        super(th2);
        this.f43948c = 0;
        this.f43949d = "";
        this.f43946a = null;
    }
}
