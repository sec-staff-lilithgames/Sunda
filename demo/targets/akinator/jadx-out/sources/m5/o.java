package m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public p f74044i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f74045j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f74046k;

    /* renamed from: l, reason: collision with root package name */
    public int f74047l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, zu.d dVar) {
        super(dVar);
        this.f74046k = pVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f74045j = obj;
        this.f74047l |= Integer.MIN_VALUE;
        return p.a(this.f74046k, null, this);
    }
}
