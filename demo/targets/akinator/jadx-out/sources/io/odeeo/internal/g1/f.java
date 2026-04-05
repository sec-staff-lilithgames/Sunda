package io.odeeo.internal.g1;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f implements io.odeeo.internal.y0.b<SharedPreferences> {

    /* renamed from: a, reason: collision with root package name */
    public final b f64213a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<Context> f64214b;

    public f(b bVar, io.odeeo.internal.x1.a<Context> aVar) {
        this.f64213a = bVar;
        this.f64214b = aVar;
    }

    public static f create(b bVar, io.odeeo.internal.x1.a<Context> aVar) {
        return new f(bVar, aVar);
    }

    public static SharedPreferences providePopUpImageControllerSharedPreferences(b bVar, Context context) {
        return (SharedPreferences) io.odeeo.internal.y0.d.checkNotNullFromProvides(bVar.providePopUpImageControllerSharedPreferences(context));
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public SharedPreferences get() {
        return providePopUpImageControllerSharedPreferences(this.f64213a, this.f64214b.get());
    }
}
