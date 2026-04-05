package w6;

import android.content.Context;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import kotlinx.coroutines.CoroutineScope;
import sh.n1;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class e0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f90402i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n6.b0 f90403j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v6.b0 f90404k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n6.p f90405l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f90406m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(n6.b0 b0Var, v6.b0 b0Var2, n6.p pVar, Context context, zu.d dVar) {
        super(2, dVar);
        this.f90403j = b0Var;
        this.f90404k = b0Var2;
        this.f90405l = pVar;
        this.f90406m = context;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new e0(this.f90403j, this.f90404k, this.f90405l, this.f90406m, dVar);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Void> dVar) {
        return ((e0) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.f90404k.f89055c;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f90402i;
        n6.b0 b0Var = this.f90403j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            n1 foregroundInfoAsync = b0Var.getForegroundInfoAsync();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(foregroundInfoAsync, "getForegroundInfoAsync(...)");
            this.f90402i = 1;
            obj = o6.n1.awaitWithin(foregroundInfoAsync, b0Var, this);
            if (obj != coroutine_suspended) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException(PtLatqAYjEFT.sbocFSd);
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        n6.o oVar = (n6.o) obj;
        if (oVar == null) {
            throw new IllegalStateException(a.b.l("Worker was marked important (", str, ") but did not provide ForegroundInfo"));
        }
        String str2 = f0.f90408a;
        n6.c0.get().debug(str2, "Updating notification for " + str);
        n1 foregroundAsync = this.f90405l.setForegroundAsync(this.f90406m, b0Var.getId(), oVar);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(...)");
        this.f90402i = 2;
        Object objAwait = w2.r.await(foregroundAsync, this);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }
}
