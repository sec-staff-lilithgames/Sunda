package androidx.lifecycle;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DisposableHandle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f6687i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1 f6688j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l1 f6689k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(p1 p1Var, l1 l1Var, zu.d dVar) {
        super(2, dVar);
        this.f6688j = p1Var;
        this.f6689k = l1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new o1(this.f6688j, this.f6689k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f6687i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        m target$lifecycle_livedata_release = this.f6688j.getTarget$lifecycle_livedata_release();
        this.f6687i = 1;
        Object objEmitSource$lifecycle_livedata_release = target$lifecycle_livedata_release.emitSource$lifecycle_livedata_release(this.f6689k, this);
        return objEmitSource$lifecycle_livedata_release == coroutine_suspended ? coroutine_suspended : objEmitSource$lifecycle_livedata_release;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super DisposableHandle> dVar) {
        return ((o1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
