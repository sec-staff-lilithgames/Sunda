package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends bv.n implements kv.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f11420i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f11421j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Object obj, zu.d dVar) {
        super(1, dVar);
        this.f11420i = eVar;
        this.f11421j = obj;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(zu.d<?> dVar) {
        return new c(this.f11420i, this.f11421j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        e eVar = this.f11420i;
        e.access$endAnimation(eVar);
        Object objA = eVar.a(this.f11421j);
        eVar.getInternalState$animation_core_release().setValue$animation_core_release(objA);
        eVar.f11444e.setValue(objA);
        return tu.x0.f87415a;
    }

    @Override // kv.l
    public final Object invoke(zu.d<? super tu.x0> dVar) {
        return ((c) create(dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
