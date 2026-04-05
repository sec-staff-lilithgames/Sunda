package androidx.lifecycle;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r1 f6682i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l1 f6683j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r1 r1Var, l1 l1Var, zu.d dVar) {
        super(2, dVar);
        this.f6682i = r1Var;
        this.f6683j = l1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new o(this.f6682i, this.f6683j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        r1 r1Var = this.f6682i;
        p pVar = new p(new n(r1Var, 0));
        l1 l1Var = this.f6683j;
        r1Var.addSource(l1Var, pVar);
        return new x(l1Var, r1Var);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
