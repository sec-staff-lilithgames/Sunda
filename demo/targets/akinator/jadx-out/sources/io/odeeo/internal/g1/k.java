package io.odeeo.internal.g1;

import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k implements io.odeeo.internal.y0.b<l0> {

    /* renamed from: a, reason: collision with root package name */
    public final h f64250a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.j1.d> f64251b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.j1.a> f64252c;

    public k(h hVar, io.odeeo.internal.x1.a<io.odeeo.internal.j1.d> aVar, io.odeeo.internal.x1.a<io.odeeo.internal.j1.a> aVar2) {
        this.f64250a = hVar;
        this.f64251b = aVar;
        this.f64252c = aVar2;
    }

    public static k create(h hVar, io.odeeo.internal.x1.a<io.odeeo.internal.j1.d> aVar, io.odeeo.internal.x1.a<io.odeeo.internal.j1.a> aVar2) {
        return new k(hVar, aVar, aVar2);
    }

    public static l0 provideHttpClient(h hVar, io.odeeo.internal.j1.d dVar, io.odeeo.internal.j1.a aVar) {
        return (l0) io.odeeo.internal.y0.d.checkNotNullFromProvides(hVar.provideHttpClient(dVar, aVar));
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public l0 get() {
        return provideHttpClient(this.f64250a, this.f64251b.get(), this.f64252c.get());
    }
}
