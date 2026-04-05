package lb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public e f72994i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f72995j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f72996k;

    /* renamed from: l, reason: collision with root package name */
    public int f72997l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(e eVar, zu.d dVar) {
        super(dVar);
        this.f72996k = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72995j = obj;
        this.f72997l |= Integer.MIN_VALUE;
        return this.f72996k.excludePropositionAsync(null, this);
    }
}
