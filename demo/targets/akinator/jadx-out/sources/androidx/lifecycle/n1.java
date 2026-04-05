package androidx.lifecycle;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f6678i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1 f6679j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6680k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p1 p1Var, Object obj, zu.d dVar) {
        super(2, dVar);
        this.f6679j = p1Var;
        this.f6680k = obj;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new n1(this.f6679j, this.f6680k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f6678i;
        p1 p1Var = this.f6679j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            m target$lifecycle_livedata_release = p1Var.getTarget$lifecycle_livedata_release();
            this.f6678i = 1;
            if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        p1Var.getTarget$lifecycle_livedata_release().setValue(this.f6680k);
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((n1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
