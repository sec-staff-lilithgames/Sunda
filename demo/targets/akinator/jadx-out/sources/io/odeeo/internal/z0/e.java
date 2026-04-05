package io.odeeo.internal.z0;

import io.odeeo.internal.j1.k;
import io.odeeo.sdk.advertisement.AdLoader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements io.odeeo.internal.x0.b<AdLoader> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<k> f67796a;

    public e(io.odeeo.internal.x1.a<k> aVar) {
        this.f67796a = aVar;
    }

    public static io.odeeo.internal.x0.b<AdLoader> create(io.odeeo.internal.x1.a<k> aVar) {
        return new e(aVar);
    }

    public static void injectRetryManagerProvider(AdLoader adLoader, io.odeeo.internal.x1.a<k> aVar) {
        adLoader.retryManagerProvider = aVar;
    }

    @Override // io.odeeo.internal.x0.b
    public void injectMembers(AdLoader adLoader) {
        injectRetryManagerProvider(adLoader, this.f67796a);
    }
}
