package w6;

import androidx.work.impl.WorkDatabase;
import n6.j0;
import n6.n0;
import n6.t0;
import o6.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {
    public static final j0 pruneWork(WorkDatabase workDatabase, androidx.work.a configuration, x6.b executor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workDatabase, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
        t0 tracer = configuration.getTracer();
        x6.a serialTaskExecutor = executor.getSerialTaskExecutor();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(serialTaskExecutor, "getSerialTaskExecutor(...)");
        return n0.launchOperation(tracer, "PruneWork", serialTaskExecutor, new v0(workDatabase, 15));
    }
}
