package d0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f51460i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f51461j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51462k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f0.q f51463l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(boolean z10, p0.j2 j2Var, f0.q qVar, zu.d dVar) {
        super(2, dVar);
        this.f51461j = z10;
        this.f51462k = j2Var;
        this.f51463l = qVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new k2(this.f51461j, this.f51462k, this.f51463l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f51460i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            if (!this.f51461j) {
                this.f51460i = 1;
                if (r2.access$invoke$emitExit(this.f51462k, this.f51463l, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
        return ((k2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
