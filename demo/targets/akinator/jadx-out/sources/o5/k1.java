package o5;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77612i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77613j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y0 f77614k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f77615l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.p f77616m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(y0 y0Var, CancellableContinuationImpl cancellableContinuationImpl, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f77614k = y0Var;
        this.f77615l = cancellableContinuationImpl;
        this.f77616m = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        k1 k1Var = new k1(this.f77614k, this.f77615l, this.f77616m, dVar);
        k1Var.f77613j = obj;
        return k1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        zu.d dVar;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77612i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            zu.k kVar = ((CoroutineScope) this.f77613j).getCoroutineContext().get(zu.f.f98853b);
            kotlin.jvm.internal.e0.checkNotNull(kVar);
            zu.m mVarAccess$createTransactionContext = o1.access$createTransactionContext(this.f77614k, (zu.g) kVar);
            int i11 = tu.z.f87419c;
            CancellableContinuationImpl cancellableContinuationImpl = this.f77615l;
            this.f77613j = cancellableContinuationImpl;
            this.f77612i = 1;
            obj = BuildersKt.withContext(mVarAccess$createTransactionContext, this.f77616m, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            dVar = cancellableContinuationImpl;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = (zu.d) this.f77613j;
            tu.a0.throwOnFailure(obj);
        }
        dVar.resumeWith(tu.z.m7131constructorimpl(obj));
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((k1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
