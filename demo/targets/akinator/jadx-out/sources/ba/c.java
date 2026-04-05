package ba;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f8982c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f8983e;

    public /* synthetic */ c(k kVar, n nVar, int i10) {
        this.f8981b = i10;
        this.f8982c = kVar;
        this.f8983e = nVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) throws Exception {
        x5.b bVar = (x5.b) obj;
        switch (this.f8981b) {
            case 0:
                this.f8982c.f9007g.handle(bVar, this.f8983e);
                break;
            default:
                this.f8982c.f9003c.insert(bVar, this.f8983e);
                break;
        }
        return null;
    }
}
