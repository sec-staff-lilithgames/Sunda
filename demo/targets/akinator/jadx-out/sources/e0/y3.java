package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y3 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public z3 f53423i;

    /* renamed from: j, reason: collision with root package name */
    public z3 f53424j;

    /* renamed from: k, reason: collision with root package name */
    public float f53425k;

    /* renamed from: l, reason: collision with root package name */
    public long f53426l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f53427m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z3 f53428n;

    /* renamed from: o, reason: collision with root package name */
    public int f53429o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(z3 z3Var, zu.d dVar) {
        super(dVar);
        this.f53428n = z3Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f53427m = obj;
        this.f53429o |= Integer.MIN_VALUE;
        return this.f53428n.onDragStopped(0.0f, this);
    }
}
