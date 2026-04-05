package t3;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f86290b;

    public j(Handler handler) {
        this.f86290b = (Handler) w3.i.checkNotNull(handler);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Runnable runnable2 = (Runnable) w3.i.checkNotNull(runnable);
        Handler handler = this.f86290b;
        if (handler.post(runnable2)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
