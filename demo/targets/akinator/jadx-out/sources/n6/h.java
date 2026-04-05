package n6;

import androidx.work.CoroutineWorker;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f75743i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f75744j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CoroutineWorker coroutineWorker, zu.d dVar) {
        super(2, dVar);
        this.f75744j = coroutineWorker;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new h(this.f75744j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f75743i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f75743i = 1;
        Object foregroundInfo = this.f75744j.getForegroundInfo(this);
        return foregroundInfo == coroutine_suspended ? coroutine_suspended : foregroundInfo;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super o> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
