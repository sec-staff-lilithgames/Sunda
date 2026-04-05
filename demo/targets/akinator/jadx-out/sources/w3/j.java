package w3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f90373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f90374c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f90375e;

    public /* synthetic */ j(k kVar, k kVar2, int i10) {
        this.f90373b = i10;
        this.f90374c = kVar;
        this.f90375e = kVar2;
    }

    @Override // w3.k
    public final boolean test(Object obj) {
        switch (this.f90373b) {
            case 0:
                return this.f90374c.test(obj) || this.f90375e.test(obj);
            default:
                return this.f90374c.test(obj) && this.f90375e.test(obj);
        }
    }
}
