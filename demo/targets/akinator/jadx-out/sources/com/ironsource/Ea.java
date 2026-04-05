package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
final class Ea implements Ba {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3279j3 f34272a;

    /* renamed from: b, reason: collision with root package name */
    private final Ca f34273b;

    public Ea(AbstractC3279j3 legacyStrategy, Ca listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(legacyStrategy, "legacyStrategy");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f34272a = legacyStrategy;
        this.f34273b = listener;
    }

    @Override // com.ironsource.Ba
    public void a(Ca listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.Ba
    public void b() {
        this.f34272a.b();
    }

    @Override // com.ironsource.Ba
    public void c() {
        this.f34272a.c();
    }

    @Override // com.ironsource.Ba
    public void d() {
        this.f34272a.d();
    }

    @Override // com.ironsource.Ba
    public void e() {
        this.f34272a.e();
    }
}
