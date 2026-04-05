package q5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public r f82508i;

    /* renamed from: j, reason: collision with root package name */
    public String f82509j;

    /* renamed from: k, reason: collision with root package name */
    public kv.l f82510k;

    /* renamed from: l, reason: collision with root package name */
    public n f82511l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f82512m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f82513n;

    /* renamed from: o, reason: collision with root package name */
    public int f82514o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r rVar, zu.d dVar) {
        super(dVar);
        this.f82513n = rVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f82512m = obj;
        this.f82514o |= Integer.MIN_VALUE;
        return this.f82513n.usePrepared(null, null, this);
    }
}
