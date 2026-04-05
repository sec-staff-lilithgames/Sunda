package c0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f11425i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f11426j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z1 f11427k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(z1 z1Var, zu.d dVar) {
        super(2, dVar);
        this.f11427k = z1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        c2 c2Var = new c2(this.f11427k, dVar);
        c2Var.f11426j = obj;
        return c2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        b2 b2Var;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f11425i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.f11426j;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.f11426j;
            tu.a0.throwOnFailure(obj);
        }
        do {
            b2Var = new b2(this.f11427k, x1.getDurationScale(coroutineScope.getCoroutineContext()));
            this.f11426j = coroutineScope;
            this.f11425i = 1;
        } while (p0.e2.withFrameNanos(b2Var, this) != coroutine_suspended);
        return coroutine_suspended;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((c2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
