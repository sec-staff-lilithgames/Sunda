package g7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public a f57405i;

    /* renamed from: j, reason: collision with root package name */
    public i f57406j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f57407k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f57408l;

    /* renamed from: m, reason: collision with root package name */
    public int f57409m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, zu.d dVar) {
        super(dVar);
        this.f57408l = aVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f57407k = obj;
        this.f57409m |= Integer.MIN_VALUE;
        return this.f57408l.intercept(null, this);
    }
}
