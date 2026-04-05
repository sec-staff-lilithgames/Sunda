package o9;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o4 extends bv.n implements kv.p {
    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new o4(2, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        lb.s0 s0VarSharedInstance = lb.s0.f72971j.sharedInstance();
        String currentLanguage = ca.m.sharedInstance().getCurrentLanguage();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(currentLanguage, "getCurrentLanguage(...)");
        return s0VarSharedInstance.startSession(currentLanguage, ca.m.sharedInstance().getCurrentSubject(), ca.o.sharedInstance().isPrio(), ca.m.sharedInstance().isChildProtectEnabled());
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super lb.y0> dVar) {
        return ((o4) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
