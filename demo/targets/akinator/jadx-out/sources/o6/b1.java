package o6;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77868i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f77869j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(y0 y0Var, zu.d dVar) {
        super(2, dVar);
        this.f77869j = y0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new b1(this.f77869j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77868i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            zu.k kVar = this.f77869j.f77997l.getCoroutineContext().get(Job.Key);
            kotlin.jvm.internal.e0.checkNotNull(kVar);
            this.f77868i = 1;
            if (JobKt.cancelAndJoin((Job) kVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((b1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
