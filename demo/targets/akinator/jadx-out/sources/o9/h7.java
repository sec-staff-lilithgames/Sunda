package o9;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h7 extends bv.n implements kv.p {
    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new h7(2, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        ca.o oVarSharedInstance = ca.o.sharedInstance();
        String uidUser = ca.m.sharedInstance().getUidUser();
        lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
        kotlin.jvm.internal.e0.checkNotNull(currentInstance);
        return bv.b.boxInt(oVarSharedInstance.getUserInfos(uidUser, String.valueOf(currentInstance.getBaseLogiqueId()), ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getCurrentSubject()));
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((h7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
