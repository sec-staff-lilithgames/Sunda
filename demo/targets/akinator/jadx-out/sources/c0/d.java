package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends bv.n implements kv.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f11429i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, zu.d dVar) {
        super(1, dVar);
        this.f11429i = eVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(zu.d<?> dVar) {
        return new d(this.f11429i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        e.access$endAnimation(this.f11429i);
        return tu.x0.f87415a;
    }

    @Override // kv.l
    public final Object invoke(zu.d<? super tu.x0> dVar) {
        return ((d) create(dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
