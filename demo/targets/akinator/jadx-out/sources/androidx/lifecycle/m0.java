package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f6663a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f6664b;

    /* renamed from: c, reason: collision with root package name */
    public final u f6665c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f6666d;

    public m0(k0 lifecycle, j0 minState, u dispatchQueue, Job parentJob) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lifecycle, "lifecycle");
        kotlin.jvm.internal.e0.checkNotNullParameter(minState, "minState");
        kotlin.jvm.internal.e0.checkNotNullParameter(dispatchQueue, "dispatchQueue");
        kotlin.jvm.internal.e0.checkNotNullParameter(parentJob, "parentJob");
        this.f6663a = lifecycle;
        this.f6664b = minState;
        this.f6665c = dispatchQueue;
        l0 l0Var = new l0(0, this, parentJob);
        this.f6666d = l0Var;
        if (lifecycle.getCurrentState() != j0.f6614b) {
            lifecycle.addObserver(l0Var);
        } else {
            Job.DefaultImpls.cancel$default(parentJob, (CancellationException) null, 1, (Object) null);
            finish();
        }
    }

    public final void finish() {
        this.f6663a.removeObserver(this.f6666d);
        this.f6665c.finish();
    }
}
