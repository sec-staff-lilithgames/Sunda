package ek;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a0 implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f54453a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f54454b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f54455c;

    public a0(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        this.f54453a = aVar;
        this.f54454b = aVar2;
        this.f54455c = aVar3;
    }

    public static a0 create(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        return new a0(aVar, aVar2, aVar3);
    }

    public static k4.n sessionDataStore(Context context, zu.m mVar, u0 u0Var) {
        return (k4.n) hk.d.checkNotNullFromProvides(w.f54661a.sessionDataStore(context, mVar, u0Var));
    }

    @Override // hk.b, hk.e, ru.a
    public k4.n get() {
        return sessionDataStore((Context) this.f54453a.get(), (zu.m) this.f54454b.get(), (u0) this.f54455c.get());
    }
}
