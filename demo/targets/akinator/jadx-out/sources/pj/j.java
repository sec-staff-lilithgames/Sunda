package pj;

import nj.i1;
import nj.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class j implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final d f81447a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81448b;

    public j(d dVar, ru.a aVar) {
        this.f81447a = dVar;
        this.f81448b = aVar;
    }

    public static j create(d dVar, ru.a aVar) {
        return new j(dVar, aVar);
    }

    public static j1 providesTestDeviceHelper(d dVar, i1 i1Var) {
        dVar.getClass();
        return (j1) dj.d.checkNotNullFromProvides(new j1(i1Var));
    }

    @Override // dj.b, dj.e, ru.a
    public j1 get() {
        return providesTestDeviceHelper(this.f81447a, (i1) this.f81448b.get());
    }
}
