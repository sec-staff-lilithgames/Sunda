package md;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public Context f74325a;

    @Override // md.i0
    public j0 build() {
        pd.d.checkBuilderRequirement(this.f74325a, Context.class);
        Context context = this.f74325a;
        p pVar = new p();
        pVar.f74326b = pd.a.provider(w.create());
        pd.b bVarCreate = pd.c.create(context);
        pVar.f74327c = bVarCreate;
        pVar.f74328e = pd.a.provider(nd.n.create(pVar.f74327c, nd.l.create(bVarCreate, xd.c.create(), xd.e.create())));
        pVar.f74329f = vd.u.create(pVar.f74327c, vd.g.create(), vd.j.create());
        pVar.f74330g = pd.a.provider(vd.h.create(pVar.f74327c));
        pVar.f74331h = pd.a.provider(vd.q.create(xd.c.create(), xd.e.create(), vd.l.create(), pVar.f74329f, pVar.f74330g));
        td.e eVarCreate = td.e.create(pVar.f74327c, pVar.f74331h, td.d.create(xd.c.create()), xd.e.create());
        pVar.f74332i = eVarCreate;
        ru.a aVar = pVar.f74326b;
        ru.a aVar2 = pVar.f74328e;
        ru.a aVar3 = pVar.f74331h;
        pVar.f74333j = td.b.create(aVar, aVar2, eVarCreate, aVar3, aVar3);
        pd.b bVar = pVar.f74327c;
        ru.a aVar4 = pVar.f74328e;
        ru.a aVar5 = pVar.f74331h;
        pVar.f74334k = ud.i.create(bVar, aVar4, aVar5, pVar.f74332i, pVar.f74326b, aVar5, xd.c.create(), xd.e.create(), pVar.f74331h);
        ru.a aVar6 = pVar.f74326b;
        ru.a aVar7 = pVar.f74331h;
        pVar.f74335l = ud.k.create(aVar6, aVar7, pVar.f74332i, aVar7);
        pVar.f74336m = pd.a.provider(k0.create(xd.c.create(), xd.e.create(), pVar.f74333j, pVar.f74334k, pVar.f74335l));
        return pVar;
    }

    @Override // md.i0
    public o setApplicationContext(Context context) {
        this.f74325a = (Context) pd.d.checkNotNull(context);
        return this;
    }
}
