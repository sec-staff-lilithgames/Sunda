package io.odeeo.internal.g1;

import io.odeeo.internal.y1.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l implements io.odeeo.internal.y0.b<io.odeeo.internal.j1.h> {

    /* renamed from: a, reason: collision with root package name */
    public final h f64253a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<s> f64254b;

    public l(h hVar, io.odeeo.internal.x1.a<s> aVar) {
        this.f64253a = hVar;
        this.f64254b = aVar;
    }

    public static l create(h hVar, io.odeeo.internal.x1.a<s> aVar) {
        return new l(hVar, aVar);
    }

    public static io.odeeo.internal.j1.h provideOdeeoSDKApi(h hVar, s sVar) {
        return (io.odeeo.internal.j1.h) io.odeeo.internal.y0.d.checkNotNullFromProvides(hVar.provideOdeeoSDKApi(sVar));
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public io.odeeo.internal.j1.h get() {
        return provideOdeeoSDKApi(this.f64253a, this.f64254b.get());
    }
}
