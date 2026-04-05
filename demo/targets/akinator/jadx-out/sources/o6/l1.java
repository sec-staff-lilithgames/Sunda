package o6;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77940i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h1 f77941j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n6.b0 f77942k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n6.p f77943l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(h1 h1Var, n6.b0 b0Var, n6.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f77941j = h1Var;
        this.f77942k = b0Var;
        this.f77943l = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new l1(this.f77941j, this.f77942k, this.f77943l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        l1 l1Var;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77940i;
        n6.b0 b0Var = this.f77942k;
        h1 h1Var = this.f77941j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            Context context = h1Var.f77901b;
            v6.b0 workSpec = h1Var.getWorkSpec();
            x6.b bVar = h1Var.f77905f;
            this.f77940i = 1;
            l1Var = this;
            if (w6.f0.workForeground(context, workSpec, b0Var, this.f77943l, bVar, l1Var) != coroutine_suspended) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        l1Var = this;
        String str = n1.f77949a;
        n6.c0.get().debug(str, "Starting work for " + h1Var.getWorkSpec().f89055c);
        sh.n1 n1VarStartWork = b0Var.startWork();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(n1VarStartWork, "startWork(...)");
        l1Var.f77940i = 2;
        Object objAwaitWithin = n1.awaitWithin(n1VarStartWork, b0Var, this);
        return objAwaitWithin == coroutine_suspended ? coroutine_suspended : objAwaitWithin;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super n6.a0> dVar) {
        return ((l1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
