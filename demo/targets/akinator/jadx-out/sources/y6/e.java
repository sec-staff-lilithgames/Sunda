package y6;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import n6.b0;
import r6.l;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f94100i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f94101j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b0 f94102k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f94103l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v6.b0 f94104m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ConstraintTrackingWorker constraintTrackingWorker, b0 b0Var, l lVar, v6.b0 b0Var2, zu.d dVar) {
        super(2, dVar);
        this.f94101j = constraintTrackingWorker;
        this.f94102k = b0Var;
        this.f94103l = lVar;
        this.f94104m = b0Var2;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new e(this.f94101j, this.f94102k, this.f94103l, this.f94104m, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f94100i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        this.f94100i = 1;
        Object objAccess$runWorker = ConstraintTrackingWorker.access$runWorker(this.f94101j, this.f94102k, this.f94103l, this.f94104m, this);
        return objAccess$runWorker == coroutine_suspended ? coroutine_suspended : objAccess$runWorker;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super n6.a0> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
