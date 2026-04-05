package io.odeeo.internal.s1;

import io.odeeo.internal.j1.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements io.odeeo.internal.y0.b<c> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<f> f66355a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<String> f66356b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<String> f66357c;

    public d(io.odeeo.internal.x1.a<f> aVar, io.odeeo.internal.x1.a<String> aVar2, io.odeeo.internal.x1.a<String> aVar3) {
        this.f66355a = aVar;
        this.f66356b = aVar2;
        this.f66357c = aVar3;
    }

    public static d create(io.odeeo.internal.x1.a<f> aVar, io.odeeo.internal.x1.a<String> aVar2, io.odeeo.internal.x1.a<String> aVar3) {
        return new d(aVar, aVar2, aVar3);
    }

    public static c newInstance(f fVar, String str, String str2) {
        return new c(fVar, str, str2);
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public c get() {
        return newInstance(this.f66355a.get(), this.f66356b.get(), this.f66357c.get());
    }
}
