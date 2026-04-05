package lb;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b1 f72792i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f72793j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(b1 b1Var, String str, zu.d dVar) {
        super(2, dVar);
        this.f72792i = b1Var;
        this.f72793j = str;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new c1(this.f72792i, this.f72793j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return this.f72792i.getTraductionFromToken(this.f72793j);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super String> dVar) {
        return ((c1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
