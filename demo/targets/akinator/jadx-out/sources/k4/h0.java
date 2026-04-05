package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public p f70349i;

    /* renamed from: j, reason: collision with root package name */
    public q2 f70350j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f70351k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f70352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f70353m;

    /* renamed from: n, reason: collision with root package name */
    public int f70354n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p pVar, zu.d dVar) {
        super(dVar);
        this.f70353m = pVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70352l = obj;
        this.f70354n |= Integer.MIN_VALUE;
        return p.access$readDataAndUpdateCache(this.f70353m, false, this);
    }
}
