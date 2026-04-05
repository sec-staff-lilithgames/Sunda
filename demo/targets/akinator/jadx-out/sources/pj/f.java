package pj;

import nj.i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final d f81435a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81436b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f81437c;

    public f(d dVar, ru.a aVar, ru.a aVar2) {
        this.f81435a = dVar;
        this.f81436b = aVar;
        this.f81437c = aVar2;
    }

    public static f create(d dVar, ru.a aVar, ru.a aVar2) {
        return new f(dVar, aVar, aVar2);
    }

    public static nj.j providesDataCollectionHelper(d dVar, i1 i1Var, yi.d dVar2) {
        return (nj.j) dj.d.checkNotNullFromProvides(new nj.j(dVar.f81426a, i1Var, dVar2));
    }

    @Override // dj.b, dj.e, ru.a
    public nj.j get() {
        return providesDataCollectionHelper(this.f81435a, (i1) this.f81436b.get(), (yi.d) this.f81437c.get());
    }
}
