package lb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public e f72924i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f72925j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f72926k;

    /* renamed from: l, reason: collision with root package name */
    public int f72927l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e eVar, zu.d dVar) {
        super(dVar);
        this.f72926k = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72925j = obj;
        this.f72927l |= Integer.MIN_VALUE;
        return this.f72926k.cancelSessionAsync(this);
    }
}
