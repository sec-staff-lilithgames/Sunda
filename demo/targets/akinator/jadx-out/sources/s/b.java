package s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f85132e;

    public b(c cVar, c cVar2, int i10) {
        this.f85132e = i10;
        this.f85140b = cVar2;
        this.f85141c = cVar;
    }

    @Override // s.e
    public final c a(c cVar) {
        switch (this.f85132e) {
            case 0:
                return cVar.f85136f;
            default:
                return cVar.f85135e;
        }
    }

    @Override // s.e
    public final c b(c cVar) {
        switch (this.f85132e) {
            case 0:
                return cVar.f85135e;
            default:
                return cVar.f85136f;
        }
    }
}
