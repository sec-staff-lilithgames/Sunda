package jj;

import kj.r;
import kj.s;
import kj.t;
import kj.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public r f69644a;

    public o build() {
        gj.e.checkBuilderRequirement(this.f69644a, r.class);
        r rVar = this.f69644a;
        j jVar = new j();
        jVar.f69645a = gj.b.provider(s.create(rVar));
        jVar.f69646b = gj.b.provider(u.create(rVar));
        t tVarCreate = t.create(rVar);
        jVar.f69647c = tVarCreate;
        jVar.f69648d = gj.b.provider(ij.g.create(jVar.f69645a, jVar.f69646b, tVarCreate));
        jVar.f69649e = gj.b.provider(ij.i.create(jVar.f69645a, jVar.f69646b, jVar.f69647c));
        jVar.f69650f = gj.b.provider(ij.b.create(jVar.f69645a, jVar.f69646b, jVar.f69647c));
        jVar.f69651g = gj.b.provider(ij.e.create(jVar.f69645a, jVar.f69646b, jVar.f69647c));
        return jVar;
    }

    public i inflaterModule(r rVar) {
        this.f69644a = (r) gj.e.checkNotNull(rVar);
        return this;
    }
}
