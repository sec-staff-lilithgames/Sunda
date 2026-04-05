package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g2 implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f6580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f6581c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f6582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f6583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f6584g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Mutex f6585h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kv.p f6586i;

    public g2(i0 i0Var, kotlin.jvm.internal.b1 b1Var, CoroutineScope coroutineScope, i0 i0Var2, CancellableContinuationImpl cancellableContinuationImpl, Mutex mutex, kv.p pVar) {
        this.f6580b = i0Var;
        this.f6581c = b1Var;
        this.f6582e = coroutineScope;
        this.f6583f = i0Var2;
        this.f6584g = cancellableContinuationImpl;
        this.f6585h = mutex;
        this.f6586i = pVar;
    }

    @Override // androidx.lifecycle.v0
    public final void onStateChanged(b1 b1Var, i0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(b1Var, "<unused var>");
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        i0 i0Var = this.f6580b;
        kotlin.jvm.internal.b1 b1Var2 = this.f6581c;
        if (event == i0Var) {
            b1Var2.f71816b = BuildersKt__Builders_commonKt.launch$default(this.f6582e, null, null, new f2(this.f6585h, this.f6586i, null), 3, null);
            return;
        }
        if (event == this.f6583f) {
            Job job = (Job) b1Var2.f71816b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            b1Var2.f71816b = null;
        }
        if (event == i0.ON_DESTROY) {
            int i10 = tu.z.f87419c;
            this.f6584g.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
        }
    }
}
