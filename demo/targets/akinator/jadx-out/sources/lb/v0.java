package lb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class v0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public qb.n f73010i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f73011j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s0 f73012k;

    /* renamed from: l, reason: collision with root package name */
    public int f73013l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(s0 s0Var, zu.d dVar) {
        super(dVar);
        this.f73012k = s0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f73011j = obj;
        this.f73013l |= Integer.MIN_VALUE;
        return this.f73012k.callCMDBAsync(null, this);
    }
}
