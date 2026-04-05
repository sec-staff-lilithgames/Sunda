package androidx.work;

import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e0;
import n6.a0;
import n6.b0;
import n6.c1;
import n6.g1;
import n6.o;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class Worker extends b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(workerParams, "workerParams");
    }

    public abstract a0 doWork();

    public o getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // n6.b0
    public n1 getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        e0.checkNotNullExpressionValue(backgroundExecutor, "getBackgroundExecutor(...)");
        return g1.access$future(backgroundExecutor, new c1(this, 1));
    }

    @Override // n6.b0
    public final n1 startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        e0.checkNotNullExpressionValue(backgroundExecutor, "getBackgroundExecutor(...)");
        return g1.access$future(backgroundExecutor, new c1(this, 0));
    }
}
