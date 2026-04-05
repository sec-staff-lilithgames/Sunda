package io.odeeo.internal.d1;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements io.odeeo.internal.y0.b<a> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.j1.f> f63648a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.u1.a> f63649b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<CoroutineScope> f63650c;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.q1.a> f63651d;

    /* renamed from: e, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.t1.a> f63652e;

    /* renamed from: f, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.j1.k> f63653f;

    public b(io.odeeo.internal.x1.a<io.odeeo.internal.j1.f> aVar, io.odeeo.internal.x1.a<io.odeeo.internal.u1.a> aVar2, io.odeeo.internal.x1.a<CoroutineScope> aVar3, io.odeeo.internal.x1.a<io.odeeo.internal.q1.a> aVar4, io.odeeo.internal.x1.a<io.odeeo.internal.t1.a> aVar5, io.odeeo.internal.x1.a<io.odeeo.internal.j1.k> aVar6) {
        this.f63648a = aVar;
        this.f63649b = aVar2;
        this.f63650c = aVar3;
        this.f63651d = aVar4;
        this.f63652e = aVar5;
        this.f63653f = aVar6;
    }

    public static b create(io.odeeo.internal.x1.a<io.odeeo.internal.j1.f> aVar, io.odeeo.internal.x1.a<io.odeeo.internal.u1.a> aVar2, io.odeeo.internal.x1.a<CoroutineScope> aVar3, io.odeeo.internal.x1.a<io.odeeo.internal.q1.a> aVar4, io.odeeo.internal.x1.a<io.odeeo.internal.t1.a> aVar5, io.odeeo.internal.x1.a<io.odeeo.internal.j1.k> aVar6) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static a newInstance(io.odeeo.internal.j1.f fVar, io.odeeo.internal.u1.a aVar, CoroutineScope coroutineScope, io.odeeo.internal.q1.a aVar2, io.odeeo.internal.t1.a aVar3) {
        return new a(fVar, aVar, coroutineScope, aVar2, aVar3);
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public a get() {
        a aVarNewInstance = newInstance(this.f63648a.get(), this.f63649b.get(), this.f63650c.get(), this.f63651d.get(), this.f63652e.get());
        c.injectRetryManagerProvider(aVarNewInstance, this.f63653f);
        return aVarNewInstance;
    }
}
