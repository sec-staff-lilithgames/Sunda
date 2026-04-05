package o5;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77727i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j2 f77728j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.a f77729k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(j2 j2Var, kv.a aVar, zu.d dVar) {
        super(2, dVar);
        this.f77728j = j2Var;
        this.f77729k = aVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new t2(this.f77728j, this.f77729k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77727i;
        kv.a aVar = this.f77729k;
        try {
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                j2 j2Var = this.f77728j;
                this.f77727i = 1;
                obj = j2Var.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            aVar.invoke();
            return tu.x0.f87415a;
        } catch (Throwable th2) {
            aVar.invoke();
            throw th2;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((t2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
