package pj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final d f81430a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81431b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f81432c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f81433d;

    public e(d dVar, ru.a aVar, ru.a aVar2, ru.a aVar3) {
        this.f81430a = dVar;
        this.f81431b = aVar;
        this.f81432c = aVar2;
        this.f81433d = aVar3;
    }

    public static e create(d dVar, ru.a aVar, ru.a aVar2, ru.a aVar3) {
        return new e(dVar, aVar, aVar2, aVar3);
    }

    public static nj.d providesApiClient(d dVar, ru.a aVar, Application application, nj.r0 r0Var) {
        return (nj.d) dj.d.checkNotNullFromProvides(new nj.d(aVar, dVar.f81426a, application, dVar.f81428c, r0Var));
    }

    @Override // dj.b, dj.e, ru.a
    public nj.d get() {
        return providesApiClient(this.f81430a, this.f81431b, (Application) this.f81432c.get(), (nj.r0) this.f81433d.get());
    }
}
