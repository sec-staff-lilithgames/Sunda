package io.odeeo.internal.j1;

import io.odeeo.internal.y1.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements io.odeeo.internal.y0.b<f> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<h> f64384a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<s> f64385b;

    public g(io.odeeo.internal.x1.a<h> aVar, io.odeeo.internal.x1.a<s> aVar2) {
        this.f64384a = aVar;
        this.f64385b = aVar2;
    }

    public static g create(io.odeeo.internal.x1.a<h> aVar, io.odeeo.internal.x1.a<s> aVar2) {
        return new g(aVar, aVar2);
    }

    public static f newInstance(h hVar, s sVar) {
        return new f(hVar, sVar);
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public f get() {
        return newInstance(this.f64384a.get(), this.f64385b.get());
    }
}
