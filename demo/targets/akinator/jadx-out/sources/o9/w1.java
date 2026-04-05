package o9;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w1 extends bv.n implements kv.p {
    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new w1(2, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        try {
            ca.o oVarSharedInstance = ca.o.sharedInstance();
            lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
            kotlin.jvm.internal.e0.checkNotNull(currentInstance);
            oVarSharedInstance.callCMDB(currentInstance.getServiceIdAlias());
        } catch (Exception unused) {
            ca.o.sharedInstance().callCMDB("1");
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((w1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
