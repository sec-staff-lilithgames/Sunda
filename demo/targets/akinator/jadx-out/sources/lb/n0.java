package lb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public e f72928i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f72929j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f72930k;

    /* renamed from: l, reason: collision with root package name */
    public int f72931l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(e eVar, zu.d dVar) {
        super(dVar);
        this.f72930k = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72929j = obj;
        this.f72931l |= Integer.MIN_VALUE;
        return this.f72930k.soundlikeAcceptanceObjectAtIndexAsync(0, this);
    }
}
