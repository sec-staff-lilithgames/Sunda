package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class O0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f35076e = -1;

    /* renamed from: a, reason: collision with root package name */
    private final a f35077a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35078b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35079c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35080d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public O0(a aVar, long j10, long j11, long j12) {
        this.f35077a = aVar;
        this.f35078b = j10;
        this.f35079c = j11;
        this.f35080d = j12;
    }

    public a a() {
        return this.f35077a;
    }

    public long b() {
        return this.f35080d;
    }

    public long c() {
        return this.f35079c;
    }

    public long d() {
        return this.f35078b;
    }

    public boolean e() {
        a aVar = this.f35077a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f35077a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
