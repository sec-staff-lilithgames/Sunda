package o5;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e2 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f77542b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f77543c;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f77544e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f77545f;

    public e2(Executor executor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
        this.f77542b = executor;
        this.f77543c = new ArrayDeque();
        this.f77545f = new Object();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        kotlin.jvm.internal.e0.checkNotNullParameter(command, "command");
        synchronized (this.f77545f) {
            this.f77543c.offer(new im.k(27, command, this));
            if (this.f77544e == null) {
                scheduleNext();
            }
        }
    }

    public final void scheduleNext() {
        synchronized (this.f77545f) {
            Object objPoll = this.f77543c.poll();
            Runnable runnable = (Runnable) objPoll;
            this.f77544e = runnable;
            if (objPoll != null) {
                this.f77542b.execute(runnable);
            }
        }
    }
}
