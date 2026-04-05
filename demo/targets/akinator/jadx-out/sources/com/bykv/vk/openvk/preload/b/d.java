package com.bykv.vk.openvk.preload.b;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class d<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private static AtomicLong f17000d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    d f17001a;

    /* renamed from: b, reason: collision with root package name */
    IN f17002b;

    /* renamed from: c, reason: collision with root package name */
    OUT f17003c;

    /* renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.b.b.a f17004e;

    /* renamed from: f, reason: collision with root package name */
    private b f17005f;

    /* renamed from: g, reason: collision with root package name */
    private long f17006g;

    public abstract Object a(b<OUT> bVar, IN in2) throws Throwable;

    public void a(Object... objArr) {
    }

    public final long b() {
        return this.f17006g;
    }

    public final void c() {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f17004e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f17005f, this);
    }

    public final void d() {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f17004e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f17005f, this);
    }

    public final void e() {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f17004e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f17005f, this);
    }

    public final OUT f() {
        return this.f17003c;
    }

    public final void a(b bVar, d dVar, IN in2, com.bykv.vk.openvk.preload.b.b.a aVar, Object[] objArr) {
        this.f17005f = new m(bVar);
        this.f17001a = dVar;
        this.f17002b = in2;
        this.f17004e = aVar;
        if (dVar != null) {
            this.f17006g = dVar.f17006g;
        } else {
            long andIncrement = f17000d.getAndIncrement();
            this.f17006g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    public final void b(Throwable th2) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f17004e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f17005f, this, th2);
    }

    public final void c(Throwable th2) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f17004e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f17005f, this, th2);
    }

    public final void d(Throwable th2) {
        com.bykv.vk.openvk.preload.b.b.a aVar = this.f17004e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f17005f, this, th2);
    }
}
