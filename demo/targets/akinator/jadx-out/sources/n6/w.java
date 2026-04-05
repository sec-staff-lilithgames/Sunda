package n6;

import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineStart;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {
    public static final <V> n1 executeAsync(Executor executor, String debugTag, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(debugTag, "debugTag");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        n1 future = w2.o.getFuture(new ao.q0(executor, 12, debugTag, block));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(future, "getFuture(...)");
        return future;
    }

    public static final <T> n1 launchFuture(zu.m context, CoroutineStart start, kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        n1 future = w2.o.getFuture(new ao.q0(context, 13, start, block));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(future, "getFuture(...)");
        return future;
    }

    public static /* synthetic */ n1 launchFuture$default(zu.m mVar, CoroutineStart coroutineStart, kv.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = zu.n.f98854b;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return launchFuture(mVar, coroutineStart, pVar);
    }
}
