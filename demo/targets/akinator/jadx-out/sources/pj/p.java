package pj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class p implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final n f81460a;

    public p(n nVar) {
        this.f81460a = nVar;
    }

    public static p create(n nVar) {
        return new p(nVar);
    }

    public static Application providesApplication(n nVar) {
        return (Application) dj.d.checkNotNullFromProvides(nVar.providesApplication());
    }

    @Override // dj.b, dj.e, ru.a
    public Application get() {
        return providesApplication(this.f81460a);
    }
}
