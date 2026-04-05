package a2;

import android.content.Context;
import android.view.View;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f3538i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f3539j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f3540k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p0.n3 f3541l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.b1 f3542m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f6 f3543n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f3544o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(kotlin.jvm.internal.b1 b1Var, p0.n3 n3Var, androidx.lifecycle.b1 b1Var2, f6 f6Var, View view, zu.d dVar) {
        super(2, dVar);
        this.f3540k = b1Var;
        this.f3541l = n3Var;
        this.f3542m = b1Var2;
        this.f3543n = f6Var;
        this.f3544o = view;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        e6 e6Var = new e6(this.f3540k, this.f3541l, this.f3542m, this.f3543n, this.f3544o, dVar);
        e6Var.f3539j = obj;
        return e6Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th2;
        Job job;
        Job jobLaunch$default;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f3538i;
        f6 f6Var = this.f3543n;
        androidx.lifecycle.b1 b1Var = this.f3542m;
        try {
            if (r12 == 0) {
                tu.a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f3539j;
                try {
                    b4 b4Var = (b4) this.f3540k.f71816b;
                    if (b4Var != null) {
                        Context applicationContext = this.f3544o.getContext().getApplicationContext();
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                        StateFlow stateFlowAccess$getAnimationScaleFlowFor = i6.access$getAnimationScaleFlowFor(applicationContext);
                        b4Var.setScaleFactor(((Number) stateFlowAccess$getAnimationScaleFlowFor.getValue()).floatValue());
                        jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new d6(stateFlowAccess$getAnimationScaleFlowFor, b4Var, null), 3, null);
                    } else {
                        jobLaunch$default = null;
                    }
                    p0.n3 n3Var = this.f3541l;
                    this.f3539j = jobLaunch$default;
                    this.f3538i = 1;
                    r12 = jobLaunch$default;
                    if (n3Var.runRecomposeAndApplyChanges(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    job = null;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    b1Var.getLifecycle().removeObserver(f6Var);
                    throw th2;
                }
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Job job2 = (Job) this.f3539j;
                tu.a0.throwOnFailure(obj);
                r12 = job2;
            }
            if (r12 != 0) {
                Job.DefaultImpls.cancel$default((Job) r12, (CancellationException) null, 1, (Object) null);
            }
            b1Var.getLifecycle().removeObserver(f6Var);
            return tu.x0.f87415a;
        } catch (Throwable th4) {
            th2 = th4;
            job = r12;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((e6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
