package kj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final c f71547a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f71548b;

    public d(c cVar, ru.a aVar) {
        this.f71547a = cVar;
        this.f71548b = aVar;
    }

    public static d create(c cVar, ru.a aVar) {
        return new d(cVar, aVar);
    }

    public static com.bumptech.glide.u providesGlideRequestManager(c cVar, Application application) {
        cVar.getClass();
        return (com.bumptech.glide.u) gj.e.checkNotNullFromProvides(com.bumptech.glide.c.with(application));
    }

    @Override // gj.c, gj.f, ru.a
    public com.bumptech.glide.u get() {
        return providesGlideRequestManager(this.f71547a, (Application) this.f71548b.get());
    }
}
