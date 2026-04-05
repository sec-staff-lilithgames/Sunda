package jj;

import hj.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public kj.e f69641a;

    /* renamed from: b, reason: collision with root package name */
    public kj.c f69642b;

    /* renamed from: c, reason: collision with root package name */
    public p f69643c;

    public a build() {
        gj.e.checkBuilderRequirement(this.f69641a, kj.e.class);
        if (this.f69642b == null) {
            this.f69642b = new kj.c();
        }
        gj.e.checkBuilderRequirement(this.f69643c, p.class);
        kj.e eVar = this.f69641a;
        kj.c cVar = this.f69642b;
        p pVar = this.f69643c;
        f fVar = new f();
        fVar.f69633a = gj.b.provider(kj.f.create(eVar));
        fVar.f69634b = new d(pVar);
        e eVar2 = new e(pVar);
        fVar.f69635c = eVar2;
        fVar.f69636d = gj.b.provider(hj.k.create(gj.b.provider(kj.d.create(cVar, eVar2))));
        fVar.f69637e = new b(pVar);
        fVar.f69638f = new c(pVar);
        fVar.f69639g = gj.b.provider(hj.i.create());
        fVar.f69640h = gj.b.provider(ej.k.create(fVar.f69633a, fVar.f69634b, fVar.f69636d, y.create(), y.create(), fVar.f69637e, fVar.f69635c, fVar.f69638f, fVar.f69639g));
        return fVar;
    }

    public g glideModule(kj.c cVar) {
        this.f69642b = (kj.c) gj.e.checkNotNull(cVar);
        return this;
    }

    public g headlessInAppMessagingModule(kj.e eVar) {
        this.f69641a = (kj.e) gj.e.checkNotNull(eVar);
        return this;
    }

    public g universalComponent(p pVar) {
        this.f69643c = (p) gj.e.checkNotNull(pVar);
        return this;
    }
}
