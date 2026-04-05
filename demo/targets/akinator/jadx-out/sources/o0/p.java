package o0;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f77355i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f77356j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, zu.d dVar) {
        super(2, dVar);
        this.f77356j = qVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        p pVar = new p(this.f77356j, dVar);
        pVar.f77355i = obj;
        return pVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f77355i, null, null, new o(this.f77356j, null), 3, null);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Job> dVar) {
        return ((p) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
