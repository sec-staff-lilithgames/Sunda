package io.odeeo.internal.f1;

import android.content.Context;
import io.odeeo.internal.j1.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements io.odeeo.internal.y0.b<a> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<Context> f64041a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.s1.a> f64042b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.s1.c> f64043c;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<k> f64044d;

    public b(io.odeeo.internal.x1.a<Context> aVar, io.odeeo.internal.x1.a<io.odeeo.internal.s1.a> aVar2, io.odeeo.internal.x1.a<io.odeeo.internal.s1.c> aVar3, io.odeeo.internal.x1.a<k> aVar4) {
        this.f64041a = aVar;
        this.f64042b = aVar2;
        this.f64043c = aVar3;
        this.f64044d = aVar4;
    }

    public static b create(io.odeeo.internal.x1.a<Context> aVar, io.odeeo.internal.x1.a<io.odeeo.internal.s1.a> aVar2, io.odeeo.internal.x1.a<io.odeeo.internal.s1.c> aVar3, io.odeeo.internal.x1.a<k> aVar4) {
        return new b(aVar, aVar2, aVar3, aVar4);
    }

    public static a newInstance(Context context, io.odeeo.internal.s1.a aVar, io.odeeo.internal.s1.c cVar, io.odeeo.internal.x1.a<k> aVar2) {
        return new a(context, aVar, cVar, aVar2);
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public a get() {
        return newInstance(this.f64041a.get(), this.f64042b.get(), this.f64043c.get(), this.f64044d);
    }
}
