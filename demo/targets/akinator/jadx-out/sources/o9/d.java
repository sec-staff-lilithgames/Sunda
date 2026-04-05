package o9;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z0 f78083i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.jvm.internal.z0 z0Var, zu.d dVar) {
        super(2, dVar);
        this.f78083i = z0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new d(this.f78083i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        this.f78083i.f71866b = ca.o.sharedInstance().checkLogin(ca.m.sharedInstance().getKeyUser());
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
