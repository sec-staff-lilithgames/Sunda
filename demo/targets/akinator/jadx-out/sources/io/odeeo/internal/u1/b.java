package io.odeeo.internal.u1;

import android.content.Context;
import io.odeeo.internal.m1.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements io.odeeo.internal.y0.b<a> {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<Context> f67238a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<io.odeeo.internal.f1.a> f67239b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<d> f67240c;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.x1.a<String> f67241d;

    public b(io.odeeo.internal.x1.a<Context> aVar, io.odeeo.internal.x1.a<io.odeeo.internal.f1.a> aVar2, io.odeeo.internal.x1.a<d> aVar3, io.odeeo.internal.x1.a<String> aVar4) {
        this.f67238a = aVar;
        this.f67239b = aVar2;
        this.f67240c = aVar3;
        this.f67241d = aVar4;
    }

    public static b create(io.odeeo.internal.x1.a<Context> aVar, io.odeeo.internal.x1.a<io.odeeo.internal.f1.a> aVar2, io.odeeo.internal.x1.a<d> aVar3, io.odeeo.internal.x1.a<String> aVar4) {
        return new b(aVar, aVar2, aVar3, aVar4);
    }

    public static a newInstance(Context context, io.odeeo.internal.f1.a aVar, d dVar, String str) {
        return new a(context, aVar, dVar, str);
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public a get() {
        return newInstance(this.f67238a.get(), this.f67239b.get(), this.f67240c.get(), this.f67241d.get());
    }
}
