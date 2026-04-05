package o6;

import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends bv.n implements kv.r {

    /* renamed from: i, reason: collision with root package name */
    public int f77862i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Throwable f77863j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ long f77864k;

    @Override // kv.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((FlowCollector<? super Boolean>) obj, (Throwable) obj2, ((Number) obj3).longValue(), (zu.d<? super Boolean>) obj4);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77862i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            Throwable th2 = this.f77863j;
            long j10 = this.f77864k;
            n6.c0.get().error(c0.f77871a, "Cannot check for unfinished work", th2);
            long jMin = Math.min(j10 * 30000, c0.f77872b);
            this.f77862i = 1;
            if (DelayKt.delay(jMin, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return bv.b.boxBoolean(true);
    }

    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, long j10, zu.d<? super Boolean> dVar) {
        a0 a0Var = new a0(4, dVar);
        a0Var.f77863j = th2;
        a0Var.f77864k = j10;
        return a0Var.invokeSuspend(tu.x0.f87415a);
    }
}
