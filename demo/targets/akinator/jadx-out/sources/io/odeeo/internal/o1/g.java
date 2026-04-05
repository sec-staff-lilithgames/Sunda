package io.odeeo.internal.o1;

import io.odeeo.internal.j1.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements io.odeeo.internal.x0.b<e> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<k> f65218a;

    public g(io.odeeo.internal.x1.a<k> aVar) {
        this.f65218a = aVar;
    }

    public static io.odeeo.internal.x0.b<e> create(io.odeeo.internal.x1.a<k> aVar) {
        return new g(aVar);
    }

    public static void injectRetryManagerProvider(e eVar, io.odeeo.internal.x1.a<k> aVar) {
        eVar.f65179c = aVar;
    }

    @Override // io.odeeo.internal.x0.b
    public void injectMembers(e eVar) {
        injectRetryManagerProvider(eVar, this.f65218a);
    }
}
