package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final lu.b f51094c;

    /* renamed from: e, reason: collision with root package name */
    public final int f51095e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f51096f;

    public x(lu.b bVar, int i10, boolean z10) {
        this.f51094c = bVar;
        this.f51095e = i10;
        this.f51096f = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        boolean z10 = this.f51096f;
        int i10 = this.f51095e;
        lu.b bVar = this.f51094c;
        v wVar = z10 ? new w(cVar, bVar.parallelism(), i10) : new u(cVar, bVar.parallelism(), i10);
        cVar.onSubscribe(wVar);
        bVar.subscribe(wVar.f51089c);
    }
}
