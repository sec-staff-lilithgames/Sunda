package mr;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface c {
    void cancel(Runnable runnable);

    default void execute(Runnable task) throws Throwable {
        e0.checkNotNullParameter(task, "task");
        schedule(task, 0L);
    }

    default boolean executeSafely(Runnable task) {
        Boolean bool;
        e0.checkNotNullParameter(task, "task");
        try {
            execute(task);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return e0.areEqual(bool, Boolean.TRUE);
    }

    void schedule(Runnable runnable, long j10) throws Throwable;

    default void schedule(Runnable task, long j10, TimeUnit timeUnit) throws Throwable {
        e0.checkNotNullParameter(task, "task");
        e0.checkNotNullParameter(timeUnit, "timeUnit");
        schedule(task, timeUnit.toMillis(j10));
    }

    default boolean scheduleSafely(Runnable task, long j10) {
        Boolean bool;
        e0.checkNotNullParameter(task, "task");
        try {
            schedule(task, j10);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return e0.areEqual(bool, Boolean.TRUE);
    }

    default boolean scheduleSafely(Runnable task, long j10, TimeUnit timeUnit) {
        Boolean bool;
        e0.checkNotNullParameter(task, "task");
        e0.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            schedule(task, j10, timeUnit);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return e0.areEqual(bool, Boolean.TRUE);
    }
}
