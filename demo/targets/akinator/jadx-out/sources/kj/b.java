package kj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final a f71546a;

    public b(a aVar) {
        this.f71546a = aVar;
    }

    public static b create(a aVar) {
        return new b(aVar);
    }

    public static Application providesApplication(a aVar) {
        return (Application) gj.e.checkNotNullFromProvides(aVar.providesApplication());
    }

    @Override // gj.c, gj.f, ru.a
    public Application get() {
        return providesApplication(this.f71546a);
    }
}
