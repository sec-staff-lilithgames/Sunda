package io.odeeo.internal.j1;

import android.content.SharedPreferences;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j implements io.odeeo.internal.y0.b<i> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<h> f64396a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<CoroutineScope> f64397b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<SharedPreferences> f64398c;

    public j(io.odeeo.internal.x1.a<h> aVar, io.odeeo.internal.x1.a<CoroutineScope> aVar2, io.odeeo.internal.x1.a<SharedPreferences> aVar3) {
        this.f64396a = aVar;
        this.f64397b = aVar2;
        this.f64398c = aVar3;
    }

    public static j create(io.odeeo.internal.x1.a<h> aVar, io.odeeo.internal.x1.a<CoroutineScope> aVar2, io.odeeo.internal.x1.a<SharedPreferences> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i newInstance(h hVar, CoroutineScope coroutineScope, SharedPreferences sharedPreferences) {
        return new i(hVar, coroutineScope, sharedPreferences);
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public i get() {
        return newInstance(this.f64396a.get(), this.f64397b.get(), this.f64398c.get());
    }
}
