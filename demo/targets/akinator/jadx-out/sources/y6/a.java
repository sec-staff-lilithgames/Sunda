package y6;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f94086i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f94087j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ConstraintTrackingWorker constraintTrackingWorker, zu.d dVar) {
        super(2, dVar);
        this.f94087j = constraintTrackingWorker;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new a(this.f94087j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f94086i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        this.f94086i = 1;
        Object objAccess$setupAndRunConstraintTrackingWork = ConstraintTrackingWorker.access$setupAndRunConstraintTrackingWork(this.f94087j, this);
        return objAccess$setupAndRunConstraintTrackingWork == coroutine_suspended ? coroutine_suspended : objAccess$setupAndRunConstraintTrackingWork;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super n6.a0> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
