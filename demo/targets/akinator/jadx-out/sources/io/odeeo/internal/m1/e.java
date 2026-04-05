package io.odeeo.internal.m1;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements io.odeeo.internal.y0.b<d> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<Context> f64738a;

    public e(io.odeeo.internal.x1.a<Context> aVar) {
        this.f64738a = aVar;
    }

    public static e create(io.odeeo.internal.x1.a<Context> aVar) {
        return new e(aVar);
    }

    public static d newInstance(Context context) {
        return new d(context);
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public d get() {
        return newInstance(this.f64738a.get());
    }
}
