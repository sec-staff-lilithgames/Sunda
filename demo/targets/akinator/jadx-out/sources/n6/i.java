package n6;

import androidx.work.CoroutineWorker;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f75745i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f75746j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CoroutineWorker coroutineWorker, zu.d dVar) {
        super(2, dVar);
        this.f75746j = coroutineWorker;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new i(this.f75746j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f75745i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f75745i = 1;
        Object objDoWork = this.f75746j.doWork(this);
        return objDoWork == coroutine_suspended ? coroutine_suspended : objDoWork;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super a0> dVar) {
        return ((i) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
