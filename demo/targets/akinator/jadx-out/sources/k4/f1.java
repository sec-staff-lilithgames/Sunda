package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public g1 f70322i;

    /* renamed from: j, reason: collision with root package name */
    public Object f70323j;

    /* renamed from: k, reason: collision with root package name */
    public Object f70324k;

    /* renamed from: l, reason: collision with root package name */
    public i1 f70325l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f70326m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g1 f70327n;

    /* renamed from: o, reason: collision with root package name */
    public int f70328o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, zu.d dVar) {
        super(dVar);
        this.f70327n = g1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70326m = obj;
        this.f70328o |= Integer.MIN_VALUE;
        return this.f70327n.writeScope(null, this);
    }
}
