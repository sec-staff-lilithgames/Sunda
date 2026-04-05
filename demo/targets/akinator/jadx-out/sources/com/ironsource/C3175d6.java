package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.d6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3175d6 implements InterfaceC3304ka {

    /* renamed from: a, reason: collision with root package name */
    private final Pe f36256a;

    /* renamed from: b, reason: collision with root package name */
    private long f36257b;

    public C3175d6(InterfaceC3357n7 applicationLifecycleService, Pe task) {
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        kotlin.jvm.internal.e0.checkNotNullParameter(task, "task");
        this.f36256a = task;
        applicationLifecycleService.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.f36257b;
    }

    private final void f() {
        this.f36257b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC3304ka
    public void a() {
        this.f36256a.a(Long.valueOf(e()));
        this.f36256a.run();
    }

    @Override // com.ironsource.InterfaceC3304ka
    public void b() {
        f();
    }

    @Override // com.ironsource.InterfaceC3304ka
    public void c() {
    }

    @Override // com.ironsource.InterfaceC3304ka
    public void d() {
    }
}
