package androidx.lifecycle;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f6734i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6735j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k0 f6736k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j0 f6737l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.p f6738m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(k0 k0Var, j0 j0Var, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f6736k = k0Var;
        this.f6737l = j0Var;
        this.f6738m = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        x1 x1Var = new x1(this.f6736k, this.f6737l, this.f6738m, dVar);
        x1Var.f6735j = obj;
        return x1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        m0 m0Var;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f6734i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0Var = (m0) this.f6735j;
            try {
                tu.a0.throwOnFailure(obj);
                m0Var.finish();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                m0Var.finish();
                throw th;
            }
        }
        tu.a0.throwOnFailure(obj);
        Job job = (Job) ((CoroutineScope) this.f6735j).getCoroutineContext().get(Job.Key);
        if (job == null) {
            throw new IllegalStateException("when[State] methods should have a parent job");
        }
        w1 w1Var = new w1();
        m0 m0Var2 = new m0(this.f6736k, this.f6737l, w1Var.f6726e, job);
        try {
            kv.p pVar = this.f6738m;
            this.f6735j = m0Var2;
            this.f6734i = 1;
            obj = BuildersKt.withContext(w1Var, pVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            m0Var = m0Var2;
            m0Var.finish();
            return obj;
        } catch (Throwable th3) {
            th = th3;
            m0Var = m0Var2;
            m0Var.finish();
            throw th;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((x1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
