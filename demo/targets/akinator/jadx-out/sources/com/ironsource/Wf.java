package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Wf {

    /* renamed from: a, reason: collision with root package name */
    protected long f35694a;

    /* renamed from: b, reason: collision with root package name */
    protected long f35695b;

    /* renamed from: c, reason: collision with root package name */
    protected long f35696c;

    public long a() {
        return Math.max(0L, this.f35694a - System.currentTimeMillis());
    }

    public void b(long j10) {
        this.f35696c = j10;
        this.f35694a = (j10 - this.f35695b) + this.f35694a;
    }

    public void c(long j10) {
        this.f35695b = j10;
        this.f35696c = 0L;
    }

    public void a(long j10) {
        this.f35694a = System.currentTimeMillis() + j10;
    }

    public void b() {
        this.f35694a = 0L;
        this.f35695b = 0L;
        this.f35696c = 0L;
    }
}
