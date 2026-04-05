package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public g1 f70314i;

    /* renamed from: j, reason: collision with root package name */
    public a1 f70315j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f70316k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f70317l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g1 f70318m;

    /* renamed from: n, reason: collision with root package name */
    public int f70319n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(g1 g1Var, zu.d dVar) {
        super(dVar);
        this.f70318m = g1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70317l = obj;
        this.f70319n |= Integer.MIN_VALUE;
        return this.f70318m.readScope(null, this);
    }
}
