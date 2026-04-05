package dr;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface d {
    void cancel(Runnable runnable);

    void execute(Runnable runnable);

    default void schedule(Runnable runnable, long j10) {
        schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    void schedule(Runnable runnable, long j10, TimeUnit timeUnit);
}
