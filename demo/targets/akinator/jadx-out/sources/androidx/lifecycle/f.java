package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final m f6564a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.p f6565b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6566c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineScope f6567d;

    /* renamed from: e, reason: collision with root package name */
    public final kv.a f6568e;

    /* renamed from: f, reason: collision with root package name */
    public Job f6569f;

    /* renamed from: g, reason: collision with root package name */
    public Job f6570g;

    public f(m liveData, kv.p block, long j10, CoroutineScope scope, kv.a onDone) {
        kotlin.jvm.internal.e0.checkNotNullParameter(liveData, "liveData");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(onDone, "onDone");
        this.f6564a = liveData;
        this.f6565b = block;
        this.f6566c = j10;
        this.f6567d = scope;
        this.f6568e = onDone;
    }

    public final void cancel() {
        if (this.f6570g != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        this.f6570g = BuildersKt__Builders_commonKt.launch$default(this.f6567d, Dispatchers.getMain().getImmediate(), null, new d(this, null), 2, null);
    }

    public final void maybeRun() {
        Job job = this.f6570g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f6570g = null;
        if (this.f6569f != null) {
            return;
        }
        this.f6569f = BuildersKt__Builders_commonKt.launch$default(this.f6567d, null, null, new e(this, null), 3, null);
    }
}
