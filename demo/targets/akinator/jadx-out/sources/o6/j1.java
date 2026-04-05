package o6;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import o6.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77932i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h1 f77933j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(h1 h1Var, zu.d dVar) {
        super(2, dVar);
        this.f77933j = h1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new j1(this.f77933j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object aVar;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77932i;
        h1 h1Var = this.f77933j;
        try {
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                CompletableJob completableJob = h1Var.f77914o;
                i1 i1Var = new i1(h1Var, null);
                this.f77932i = 1;
                obj = BuildersKt.withContext(completableJob, i1Var, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            aVar = (h1.b) obj;
        } catch (d1 e10) {
            aVar = new h1.b.c(e10.getReason());
        } catch (CancellationException unused) {
            aVar = new h1.b.a(null, 1, null);
        } catch (Throwable th2) {
            n6.c0.get().error(n1.f77949a, "Unexpected error in WorkerWrapper", th2);
            aVar = new h1.b.a(null, 1, null);
        }
        Object objRunInTransaction = h1Var.f77909j.runInTransaction(new com.google.firebase.messaging.m(4, aVar, h1Var));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(objRunInTransaction, "runInTransaction(...)");
        return objRunInTransaction;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Boolean> dVar) {
        return ((j1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
