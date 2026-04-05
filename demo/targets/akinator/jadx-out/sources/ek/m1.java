package ek;

import android.util.Log;
import java.util.Map;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class m1 extends bv.n implements kv.q {

    /* renamed from: i, reason: collision with root package name */
    public int f54587i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ FlowCollector f54588j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Throwable f54589k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v1 f54590l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(v1 v1Var, zu.d dVar) {
        super(3, dVar);
        this.f54590l = v1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f54587i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            FlowCollector flowCollector = this.f54588j;
            Throwable th2 = this.f54589k;
            t0 t0Var = new t0(this.f54590l.f54651b.generateNewSession(null), (y1) null, (Map) null, 4, (kotlin.jvm.internal.u) null);
            Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th2.getMessage() + ". Emit fallback session " + t0Var.getSessionDetails().getSessionId());
            this.f54588j = null;
            this.f54587i = 1;
            if (flowCollector.emit(t0Var, this) == coroutine_suspended) {
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

    @Override // kv.q
    public final Object invoke(FlowCollector<? super t0> flowCollector, Throwable th2, zu.d<? super tu.x0> dVar) {
        m1 m1Var = new m1(this.f54590l, dVar);
        m1Var.f54588j = flowCollector;
        m1Var.f54589k = th2;
        return m1Var.invokeSuspend(tu.x0.f87415a);
    }
}
