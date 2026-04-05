package o0;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f77351i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f77352j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, zu.d dVar) {
        super(2, dVar);
        this.f77352j = qVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        n nVar = new n(this.f77352j, dVar);
        nVar.f77351i = obj;
        return nVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f77351i;
        q qVar = this.f77352j;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new k(qVar, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new l(qVar, null), 3, null);
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new m(qVar, null), 3, null);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Job> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
