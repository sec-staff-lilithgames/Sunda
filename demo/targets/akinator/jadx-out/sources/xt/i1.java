package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i1 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93433b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f93434c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f93435e;

    /* renamed from: f, reason: collision with root package name */
    public final st.a f93436f;

    /* renamed from: g, reason: collision with root package name */
    public final st.a f93437g;

    /* renamed from: h, reason: collision with root package name */
    public final st.a f93438h;

    /* renamed from: i, reason: collision with root package name */
    public final st.a f93439i;

    public i1(mt.i iVar, st.g gVar, st.g gVar2, st.a aVar, st.a aVar2, st.a aVar3, st.a aVar4) {
        this.f93433b = iVar;
        this.f93434c = gVar;
        this.f93435e = gVar2;
        this.f93436f = aVar;
        this.f93437g = aVar2;
        this.f93438h = aVar3;
        this.f93439i = aVar4;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f93433b.subscribe(new h1(this, fVar));
    }
}
