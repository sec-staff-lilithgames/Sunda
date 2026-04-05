package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v2 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public r0 f77751i;

    /* renamed from: j, reason: collision with root package name */
    public String f77752j;

    /* renamed from: k, reason: collision with root package name */
    public String[] f77753k;

    /* renamed from: l, reason: collision with root package name */
    public int f77754l;

    /* renamed from: m, reason: collision with root package name */
    public int f77755m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f77756n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j2 f77757o;

    /* renamed from: p, reason: collision with root package name */
    public int f77758p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(j2 j2Var, zu.d dVar) {
        super(dVar);
        this.f77757o = j2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f77756n = obj;
        this.f77758p |= Integer.MIN_VALUE;
        return j2.access$stopTrackingTable(this.f77757o, null, 0, this);
    }
}
