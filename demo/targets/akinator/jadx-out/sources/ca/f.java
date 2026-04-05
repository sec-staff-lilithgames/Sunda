package ca;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import lb.s0;
import timber.log.Timber;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f11943i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f11944j;

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        f fVar = new f(2, dVar);
        fVar.f11944j = obj;
        return fVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f11943i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.f11944j;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.f11944j;
            a0.throwOnFailure(obj);
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            try {
                s0.f72971j.sharedInstance().updateInstancesListFromWSC();
            } catch (Exception e10) {
                Timber.Forest.e(e10, "Erreur update WS centraux", new Object[0]);
            }
            this.f11944j = coroutineScope;
            this.f11943i = 1;
            if (DelayKt.delay(300000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
