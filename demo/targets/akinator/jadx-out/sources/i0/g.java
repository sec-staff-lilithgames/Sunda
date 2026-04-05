package i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public i1.j f59302i;

    /* renamed from: j, reason: collision with root package name */
    public Object[] f59303j;

    /* renamed from: k, reason: collision with root package name */
    public int f59304k;

    /* renamed from: l, reason: collision with root package name */
    public int f59305l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f59306m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f59307n;

    /* renamed from: o, reason: collision with root package name */
    public int f59308o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, zu.d dVar) {
        super(dVar);
        this.f59307n = hVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f59306m = obj;
        this.f59308o |= Integer.MIN_VALUE;
        return this.f59307n.bringIntoView(null, this);
    }
}
