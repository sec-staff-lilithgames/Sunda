package p0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f80214i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f80215j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.p f80216k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j2 f80217l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(kv.p pVar, j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f80216k = pVar;
        this.f80217l = j2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        f5 f5Var = new f5(this.f80216k, this.f80217l, dVar);
        f5Var.f80215j = obj;
        return f5Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f80214i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            f3 f3Var = new f3(this.f80217l, ((CoroutineScope) this.f80215j).getCoroutineContext());
            this.f80214i = 1;
            if (this.f80216k.invoke(f3Var, this) == coroutine_suspended) {
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

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((f5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
