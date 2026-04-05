package io.odeeo.internal.d1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements io.odeeo.internal.x0.b<a> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.j1.k> f63654a;

    public c(io.odeeo.internal.x1.a<io.odeeo.internal.j1.k> aVar) {
        this.f63654a = aVar;
    }

    public static io.odeeo.internal.x0.b<a> create(io.odeeo.internal.x1.a<io.odeeo.internal.j1.k> aVar) {
        return new c(aVar);
    }

    public static void injectRetryManagerProvider(a aVar, io.odeeo.internal.x1.a<io.odeeo.internal.j1.k> aVar2) {
        aVar.f63626m = aVar2;
    }

    @Override // io.odeeo.internal.x0.b
    public void injectMembers(a aVar) {
        injectRetryManagerProvider(aVar, this.f63654a);
    }
}
