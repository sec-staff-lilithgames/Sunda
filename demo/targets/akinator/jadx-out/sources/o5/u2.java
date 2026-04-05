package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u2 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public j2 f77739i;

    /* renamed from: j, reason: collision with root package name */
    public r0 f77740j;

    /* renamed from: k, reason: collision with root package name */
    public String f77741k;

    /* renamed from: l, reason: collision with root package name */
    public String[] f77742l;

    /* renamed from: m, reason: collision with root package name */
    public int f77743m;

    /* renamed from: n, reason: collision with root package name */
    public int f77744n;

    /* renamed from: o, reason: collision with root package name */
    public int f77745o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f77746p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j2 f77747q;

    /* renamed from: r, reason: collision with root package name */
    public int f77748r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(j2 j2Var, zu.d dVar) {
        super(dVar);
        this.f77747q = j2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f77746p = obj;
        this.f77748r |= Integer.MIN_VALUE;
        return j2.access$startTrackingTable(this.f77747q, null, 0, this);
    }
}
