package pj;

import nj.i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final d f81444a;

    public i(d dVar) {
        this.f81444a = dVar;
    }

    public static i create(d dVar) {
        return new i(dVar);
    }

    public static i1 providesSharedPreferencesUtils(d dVar) {
        return (i1) dj.d.checkNotNullFromProvides(new i1(dVar.f81426a));
    }

    @Override // dj.b, dj.e, ru.a
    public i1 get() {
        return providesSharedPreferencesUtils(this.f81444a);
    }
}
