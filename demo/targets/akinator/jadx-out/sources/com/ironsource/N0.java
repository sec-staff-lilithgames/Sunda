package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class N0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f35017e = -1;

    /* renamed from: a, reason: collision with root package name */
    private final a f35018a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35019b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35020c;

    /* renamed from: d, reason: collision with root package name */
    private final long f35021d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        MANUAL_WITH_LOAD_ON_SHOW,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public N0(a aVar, long j10, long j11, long j12) {
        this.f35018a = aVar;
        this.f35019b = j10;
        this.f35020c = j11;
        this.f35021d = j12;
    }

    public a a() {
        return this.f35018a;
    }

    public long b() {
        return this.f35021d;
    }

    public long c() {
        return this.f35020c;
    }

    public long d() {
        return this.f35019b;
    }

    public boolean e() {
        a aVar = this.f35018a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f35018a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD || aVar == a.MANUAL_WITH_LOAD_ON_SHOW;
    }
}
