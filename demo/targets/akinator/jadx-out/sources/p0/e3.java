package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e3 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public kv.a f80196i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f80197j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f3 f80198k;

    /* renamed from: l, reason: collision with root package name */
    public int f80199l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(f3 f3Var, zu.d dVar) {
        super(dVar);
        this.f80198k = f3Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f80197j = obj;
        this.f80199l |= Integer.MIN_VALUE;
        return this.f80198k.awaitDispose(null, this);
    }
}
