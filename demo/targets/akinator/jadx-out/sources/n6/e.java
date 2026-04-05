package n6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {
    public static final Executor access$asExecutor(zu.m mVar) {
        zu.g gVar = mVar != null ? (zu.g) mVar.get(zu.f.f98853b) : null;
        CoroutineDispatcher coroutineDispatcher = gVar instanceof CoroutineDispatcher ? (CoroutineDispatcher) gVar : null;
        if (coroutineDispatcher != null) {
            return ExecutorsKt.asExecutor(coroutineDispatcher);
        }
        return null;
    }

    public static final Executor access$createDefaultExecutor(boolean z10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new c(z10));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        return executorServiceNewFixedThreadPool;
    }

    public static final t0 access$createDefaultTracer() {
        return new d();
    }
}
