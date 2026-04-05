package io.odeeo.internal.g1;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements io.odeeo.internal.y0.b<io.odeeo.internal.k1.a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f64245a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<Context> f64246b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<ConnectivityManager> f64247c;

    public i(h hVar, io.odeeo.internal.x1.a<Context> aVar, io.odeeo.internal.x1.a<ConnectivityManager> aVar2) {
        this.f64245a = hVar;
        this.f64246b = aVar;
        this.f64247c = aVar2;
    }

    public static i create(h hVar, io.odeeo.internal.x1.a<Context> aVar, io.odeeo.internal.x1.a<ConnectivityManager> aVar2) {
        return new i(hVar, aVar, aVar2);
    }

    public static io.odeeo.internal.k1.a provideAvailabilityCallback(h hVar, Context context, ConnectivityManager connectivityManager) {
        return (io.odeeo.internal.k1.a) io.odeeo.internal.y0.d.checkNotNullFromProvides(hVar.provideAvailabilityCallback(context, connectivityManager));
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public io.odeeo.internal.k1.a get() {
        return provideAvailabilityCallback(this.f64245a, this.f64246b.get(), this.f64247c.get());
    }
}
