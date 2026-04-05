package io.odeeo.internal.g1;

import io.odeeo.internal.y1.s;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements io.odeeo.internal.y0.b<s> {

    /* renamed from: a, reason: collision with root package name */
    public final h f64255a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<l0> f64256b;

    public m(h hVar, io.odeeo.internal.x1.a<l0> aVar) {
        this.f64255a = hVar;
        this.f64256b = aVar;
    }

    public static m create(h hVar, io.odeeo.internal.x1.a<l0> aVar) {
        return new m(hVar, aVar);
    }

    public static s provideRetrofit(h hVar, l0 l0Var) {
        return (s) io.odeeo.internal.y0.d.checkNotNullFromProvides(hVar.provideRetrofit(l0Var));
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public s get() {
        return provideRetrofit(this.f64255a, this.f64256b.get());
    }
}
