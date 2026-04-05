package em;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f54695c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f54696e;

    public /* synthetic */ c(d dVar, u uVar, int i10) {
        this.f54694b = i10;
        this.f54695c = dVar;
        this.f54696e = uVar;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f54694b) {
            case 0:
                d dVar = this.f54695c;
                dVar.getClass();
                u uVar = this.f54696e;
                return String.format("Remove ad from caches (%s, size - %s)", uVar, Integer.valueOf(dVar.b(uVar.getAdsFormat())));
            default:
                d dVar2 = this.f54695c;
                dVar2.getClass();
                u uVar2 = this.f54696e;
                return String.format("Store ad (%s, size - %s)", uVar2, Integer.valueOf(dVar2.b(uVar2.getAdsFormat())));
        }
    }
}
