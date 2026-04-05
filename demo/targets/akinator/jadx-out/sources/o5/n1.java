package o5;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77669i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77670j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f77671k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f77671k = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        n1 n1Var = new n1(this.f77671k, dVar);
        n1Var.f77670j = obj;
        return n1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        d2 d2Var;
        Throwable th2;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77669i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d2Var = (d2) this.f77670j;
            try {
                tu.a0.throwOnFailure(obj);
                d2Var.release();
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                d2Var.release();
                throw th2;
            }
        }
        tu.a0.throwOnFailure(obj);
        zu.k kVar = ((CoroutineScope) this.f77670j).getCoroutineContext().get(d2.f77529e);
        kotlin.jvm.internal.e0.checkNotNull(kVar);
        d2 d2Var2 = (d2) kVar;
        d2Var2.acquire();
        try {
            kv.l lVar = this.f77671k;
            this.f77670j = d2Var2;
            this.f77669i = 1;
            Object objInvoke = lVar.invoke(this);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            d2Var = d2Var2;
            obj = objInvoke;
            d2Var.release();
            return obj;
        } catch (Throwable th4) {
            d2Var = d2Var2;
            th2 = th4;
            d2Var.release();
            throw th2;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((n1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
