package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6702i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f6703j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, zu.d dVar) {
        super(2, dVar);
        this.f6703j = s0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        r0 r0Var = new r0(this.f6703j, dVar);
        r0Var.f6702i = obj;
        return r0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f6702i;
        s0 s0Var = this.f6703j;
        if (s0Var.getLifecycle$lifecycle_common().getCurrentState().compareTo(j0.f6615c) >= 0) {
            s0Var.getLifecycle$lifecycle_common().addObserver(s0Var);
        } else {
            JobKt__JobKt.cancel$default(coroutineScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((r0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
