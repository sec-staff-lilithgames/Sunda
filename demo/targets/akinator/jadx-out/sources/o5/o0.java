package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f77677i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f77678j;

    /* renamed from: k, reason: collision with root package name */
    public int f77679k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, zu.d dVar) {
        super(dVar);
        this.f77678j = p0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f77677i = obj;
        this.f77679k |= Integer.MIN_VALUE;
        return this.f77678j.collect(null, this);
    }
}
