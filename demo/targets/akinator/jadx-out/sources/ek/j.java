package ek;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class j implements v {

    /* renamed from: a, reason: collision with root package name */
    public Context f54554a;

    /* renamed from: b, reason: collision with root package name */
    public zu.m f54555b;

    /* renamed from: c, reason: collision with root package name */
    public zu.m f54556c;

    /* renamed from: d, reason: collision with root package name */
    public com.google.firebase.g f54557d;

    /* renamed from: e, reason: collision with root package name */
    public tj.f f54558e;

    /* renamed from: f, reason: collision with root package name */
    public sj.c f54559f;

    @Override // ek.v
    public x build() {
        hk.d.checkBuilderRequirement(this.f54554a, Context.class);
        hk.d.checkBuilderRequirement(this.f54555b, zu.m.class);
        hk.d.checkBuilderRequirement(this.f54556c, zu.m.class);
        hk.d.checkBuilderRequirement(this.f54557d, com.google.firebase.g.class);
        hk.d.checkBuilderRequirement(this.f54558e, tj.f.class);
        hk.d.checkBuilderRequirement(this.f54559f, sj.c.class);
        Context context = this.f54554a;
        zu.m mVar = this.f54555b;
        zu.m mVar2 = this.f54556c;
        com.google.firebase.g gVar = this.f54557d;
        tj.f fVar = this.f54558e;
        sj.c cVar = this.f54559f;
        k kVar = new k();
        kVar.f54562a = hk.c.create(gVar);
        hk.b bVarCreate = hk.c.create(context);
        kVar.f54563b = bVarCreate;
        kVar.f54564c = hk.a.provider(ik.c.create(bVarCreate));
        kVar.f54565d = hk.a.provider(c0.create());
        kVar.f54566e = hk.c.create(fVar);
        kVar.f54567f = hk.a.provider(y.create(kVar.f54562a));
        hk.b bVarCreate2 = hk.c.create(mVar2);
        kVar.f54568g = bVarCreate2;
        kVar.f54569h = hk.a.provider(ik.j.create(kVar.f54567f, bVarCreate2));
        kVar.f54570i = hk.c.create(mVar);
        kVar.f54571j = hk.a.provider(ik.q.create(kVar.f54564c, hk.a.provider(ik.k.create(kVar.f54565d, kVar.f54566e, kVar.f54567f, kVar.f54569h, hk.a.provider(ik.a0.create(kVar.f54570i, kVar.f54565d, hk.a.provider(z.create(kVar.f54563b, kVar.f54568g))))))));
        hk.e eVarProvider = hk.a.provider(e0.create());
        kVar.f54572k = eVarProvider;
        kVar.f54573l = hk.a.provider(g1.create(kVar.f54565d, eVarProvider));
        kVar.f54574m = hk.a.provider(e1.create(kVar.f54562a, kVar.f54566e, kVar.f54571j, hk.a.provider(q.create(hk.c.create(cVar))), kVar.f54570i));
        kVar.f54575n = hk.a.provider(a0.create(kVar.f54563b, kVar.f54568g, hk.a.provider(v0.create(kVar.f54573l))));
        hk.e eVarProvider2 = hk.a.provider(w1.create(kVar.f54571j, kVar.f54573l, kVar.f54574m, kVar.f54565d, kVar.f54575n, hk.a.provider(p0.create(kVar.f54563b, kVar.f54572k)), kVar.f54570i));
        kVar.f54576o = eVarProvider2;
        kVar.f54577p = hk.a.provider(f0.create(kVar.f54562a, kVar.f54571j, kVar.f54570i, hk.a.provider(j1.create(eVarProvider2))));
        return kVar;
    }

    @Override // ek.v
    public j appContext(Context context) {
        this.f54554a = (Context) hk.d.checkNotNull(context);
        return this;
    }

    @Override // ek.v
    public j backgroundDispatcher(zu.m mVar) {
        this.f54555b = (zu.m) hk.d.checkNotNull(mVar);
        return this;
    }

    @Override // ek.v
    public j blockingDispatcher(zu.m mVar) {
        this.f54556c = (zu.m) hk.d.checkNotNull(mVar);
        return this;
    }

    @Override // ek.v
    public j firebaseApp(com.google.firebase.g gVar) {
        this.f54557d = (com.google.firebase.g) hk.d.checkNotNull(gVar);
        return this;
    }

    @Override // ek.v
    public j firebaseInstallationsApi(tj.f fVar) {
        this.f54558e = (tj.f) hk.d.checkNotNull(fVar);
        return this;
    }

    @Override // ek.v
    public j transportFactoryProvider(sj.c cVar) {
        this.f54559f = (sj.c) hk.d.checkNotNull(cVar);
        return this;
    }
}
