package io.odeeo.internal.z0;

import io.odeeo.internal.j1.k;
import io.odeeo.sdk.advertisement.AdLoader;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements io.odeeo.internal.y0.b<AdLoader> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.j1.f> f67792a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.r1.b> f67793b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<CoroutineScope> f67794c;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<k> f67795d;

    public d(io.odeeo.internal.x1.a<io.odeeo.internal.j1.f> aVar, io.odeeo.internal.x1.a<io.odeeo.internal.r1.b> aVar2, io.odeeo.internal.x1.a<CoroutineScope> aVar3, io.odeeo.internal.x1.a<k> aVar4) {
        this.f67792a = aVar;
        this.f67793b = aVar2;
        this.f67794c = aVar3;
        this.f67795d = aVar4;
    }

    public static d create(io.odeeo.internal.x1.a<io.odeeo.internal.j1.f> aVar, io.odeeo.internal.x1.a<io.odeeo.internal.r1.b> aVar2, io.odeeo.internal.x1.a<CoroutineScope> aVar3, io.odeeo.internal.x1.a<k> aVar4) {
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    public static AdLoader newInstance(io.odeeo.internal.j1.f fVar, io.odeeo.internal.r1.b bVar, CoroutineScope coroutineScope) {
        return new AdLoader(fVar, bVar, coroutineScope);
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public AdLoader get() {
        AdLoader adLoaderNewInstance = newInstance(this.f67792a.get(), this.f67793b.get(), this.f67794c.get());
        e.injectRetryManagerProvider(adLoaderNewInstance, this.f67795d);
        return adLoaderNewInstance;
    }
}
