package androidx.work;

import android.content.Context;
import av.e;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import n6.a0;
import n6.b0;
import n6.g;
import n6.h;
import n6.i;
import n6.o;
import n6.w;
import sh.n1;
import tu.f;
import tu.x0;
import w2.r;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends b0 {
    private final CoroutineDispatcher coroutineContext;
    private final WorkerParameters params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        e0.checkNotNullParameter(appContext, "appContext");
        e0.checkNotNullParameter(params, "params");
        this.params = params;
        this.coroutineContext = g.f75740e;
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, d<? super o> dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(d<? super a0> dVar);

    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(d<? super o> dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // n6.b0
    public final n1 getForegroundInfoAsync() {
        return w.launchFuture$default(getCoroutineContext().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), null, new h(this, null), 2, null);
    }

    @Override // n6.b0
    public final void onStopped() {
        super.onStopped();
    }

    public final Object setForeground(o oVar, d<? super x0> dVar) throws Throwable {
        n1 foregroundAsync = setForegroundAsync(oVar);
        e0.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(...)");
        Object objAwait = r.await(foregroundAsync, dVar);
        return objAwait == e.getCOROUTINE_SUSPENDED() ? objAwait : x0.f87415a;
    }

    public final Object setProgress(b bVar, d<? super x0> dVar) throws Throwable {
        n1 progressAsync = setProgressAsync(bVar);
        e0.checkNotNullExpressionValue(progressAsync, "setProgressAsync(...)");
        Object objAwait = r.await(progressAsync, dVar);
        return objAwait == e.getCOROUTINE_SUSPENDED() ? objAwait : x0.f87415a;
    }

    @Override // n6.b0
    public final n1 startWork() {
        m coroutineContext = !e0.areEqual(getCoroutineContext(), g.f75740e) ? getCoroutineContext() : this.params.getWorkerContext();
        e0.checkNotNull(coroutineContext);
        return w.launchFuture$default(coroutineContext.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)), null, new i(this, null), 2, null);
    }

    @f
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
