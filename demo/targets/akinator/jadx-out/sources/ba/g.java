package ba;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f8994c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f8995e;

    public /* synthetic */ g(k kVar, a aVar, int i10) {
        this.f8993b = i10;
        this.f8994c = kVar;
        this.f8995e = aVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) throws Exception {
        x5.b bVar = (x5.b) obj;
        switch (this.f8993b) {
            case 0:
                this.f8994c.f9002b.insert(bVar, this.f8995e);
                break;
            default:
                this.f8994c.f9006f.handle(bVar, this.f8995e);
                break;
        }
        return null;
    }
}
