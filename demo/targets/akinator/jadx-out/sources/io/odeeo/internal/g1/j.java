package io.odeeo.internal.g1;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements io.odeeo.internal.y0.b<ConnectivityManager> {

    /* renamed from: a, reason: collision with root package name */
    public final h f64248a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<Context> f64249b;

    public j(h hVar, io.odeeo.internal.x1.a<Context> aVar) {
        this.f64248a = hVar;
        this.f64249b = aVar;
    }

    public static j create(h hVar, io.odeeo.internal.x1.a<Context> aVar) {
        return new j(hVar, aVar);
    }

    public static ConnectivityManager provideConnectivityManager(h hVar, Context context) {
        return (ConnectivityManager) io.odeeo.internal.y0.d.checkNotNullFromProvides(hVar.provideConnectivityManager(context));
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public ConnectivityManager get() {
        return provideConnectivityManager(this.f64248a, this.f64249b.get());
    }
}
