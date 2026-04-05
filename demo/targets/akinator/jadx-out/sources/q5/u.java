package q5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public r f82496i;

    /* renamed from: j, reason: collision with root package name */
    public n f82497j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f82498k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f82499l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f82500m;

    /* renamed from: n, reason: collision with root package name */
    public int f82501n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r rVar, zu.d dVar) {
        super(dVar);
        this.f82500m = rVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f82499l = obj;
        this.f82501n |= Integer.MIN_VALUE;
        return this.f82500m.b(false, this);
    }
}
