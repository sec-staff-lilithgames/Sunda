package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k2 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Object f77617i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77618j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j2 f77619k;

    /* renamed from: l, reason: collision with root package name */
    public int f77620l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(j2 j2Var, zu.d dVar) {
        super(dVar);
        this.f77619k = j2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f77618j = obj;
        this.f77620l |= Integer.MIN_VALUE;
        return j2.access$checkInvalidatedTables(this.f77619k, null, this);
    }
}
