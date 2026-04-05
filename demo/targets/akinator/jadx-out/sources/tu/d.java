package tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements zu.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zu.m f87367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f87368c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.q f87369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zu.d f87370f;

    public d(zu.m mVar, e eVar, kv.q qVar, zu.d dVar) {
        this.f87367b = mVar;
        this.f87368c = eVar;
        this.f87369e = qVar;
        this.f87370f = dVar;
    }

    @Override // zu.d
    public zu.m getContext() {
        return this.f87367b;
    }

    @Override // zu.d
    public void resumeWith(Object obj) {
        kv.q qVar = this.f87369e;
        e eVar = this.f87368c;
        eVar.f87374b = qVar;
        eVar.f87376e = this.f87370f;
        eVar.f87377f = obj;
    }
}
