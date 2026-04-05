package bw;

import b0.e2;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b {
    public static final void access$log(Logger logger, a aVar, c cVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.getName$okhttp());
        sb2.append(' ');
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        e0.checkNotNullExpressionValue(str2, "format(...)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(aVar.getName());
        logger.fine(sb2.toString());
    }

    public static final String formatDuration(long j10) {
        String strG;
        if (j10 <= -999500000) {
            strG = a.b.g((j10 - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ", new StringBuilder());
        } else if (j10 <= -999500) {
            strG = a.b.g((j10 - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j10 <= 0) {
            strG = a.b.g((j10 - 500) / 1000, " µs", new StringBuilder());
        } else if (j10 < 999500) {
            strG = a.b.g((j10 + 500) / 1000, " µs", new StringBuilder());
        } else if (j10 < 999500000) {
            strG = a.b.g((j10 + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strG = a.b.g((j10 + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ", new StringBuilder());
        }
        return e2.m("%6s", "format(...)", 1, new Object[]{strG});
    }

    public static final <T> T logElapsed(Logger logger, a task, c queue, kv.a block) {
        long jNanoTime;
        e0.checkNotNullParameter(logger, "<this>");
        e0.checkNotNullParameter(task, "task");
        e0.checkNotNullParameter(queue, "queue");
        e0.checkNotNullParameter(block, "block");
        boolean zIsLoggable = logger.isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.getTaskRunner$okhttp().getBackend().nanoTime();
            access$log(logger, task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T t10 = (T) block.invoke();
            b0.finallyStart(1);
            if (zIsLoggable) {
                access$log(logger, task, queue, "finished run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            b0.finallyEnd(1);
            return t10;
        } catch (Throwable th2) {
            b0.finallyStart(1);
            if (zIsLoggable) {
                access$log(logger, task, queue, "failed a run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            b0.finallyEnd(1);
            throw th2;
        }
    }

    public static final void taskLog(Logger logger, a task, c queue, kv.a messageBlock) {
        e0.checkNotNullParameter(logger, "<this>");
        e0.checkNotNullParameter(task, "task");
        e0.checkNotNullParameter(queue, "queue");
        e0.checkNotNullParameter(messageBlock, "messageBlock");
        if (logger.isLoggable(Level.FINE)) {
            access$log(logger, task, queue, (String) messageBlock.invoke());
        }
    }
}
