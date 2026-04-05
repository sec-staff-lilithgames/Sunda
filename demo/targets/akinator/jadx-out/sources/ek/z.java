package ek;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class z implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f54682a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f54683b;

    public z(ru.a aVar, ru.a aVar2) {
        this.f54682a = aVar;
        this.f54683b = aVar2;
    }

    public static z create(ru.a aVar, ru.a aVar2) {
        return new z(aVar, aVar2);
    }

    public static k4.n sessionConfigsDataStore(Context context, zu.m mVar) {
        return (k4.n) hk.d.checkNotNullFromProvides(w.f54661a.sessionConfigsDataStore(context, mVar));
    }

    @Override // hk.b, hk.e, ru.a
    public k4.n get() {
        return sessionConfigsDataStore((Context) this.f54682a.get(), (zu.m) this.f54683b.get());
    }
}
