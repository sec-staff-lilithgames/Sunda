package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public g0 f72251i;

    /* renamed from: j, reason: collision with root package name */
    public l0 f72252j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f72253k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g0 f72254l;

    /* renamed from: m, reason: collision with root package name */
    public int f72255m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g0 g0Var, zu.d dVar) {
        super(dVar);
        this.f72254l = g0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72253k = obj;
        this.f72255m |= Integer.MIN_VALUE;
        return this.f72254l.preload(null, this);
    }
}
