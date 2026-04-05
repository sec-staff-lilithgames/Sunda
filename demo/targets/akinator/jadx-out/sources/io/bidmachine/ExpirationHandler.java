package io.bidmachine;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class ExpirationHandler {
    private final long expirationTimeMs;
    private final a expiredTask;
    private final AtomicBoolean isExpireTrackerSubscribed;
    private final TaskScheduler taskScheduler;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Listener {
        void onExpired();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface TaskScheduler {
        void cancelTask(tr.b bVar);

        void scheduleTask(tr.b bVar, long j10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends tr.b {

        /* renamed from: c, reason: collision with root package name */
        public final WeakReference f59827c;

        public a(Listener listener) {
            this.f59827c = new WeakReference(listener);
        }

        @Override // tr.b
        public void runTask() {
            Listener listener = (Listener) this.f59827c.get();
            if (listener != null) {
                listener.onExpired();
            }
        }
    }

    public ExpirationHandler(long j10, Listener listener) {
        this(j10, listener, new f2());
    }

    public TaskScheduler getTaskScheduler() {
        return this.taskScheduler;
    }

    public void start() {
        if (this.expirationTimeMs <= 0 || !this.isExpireTrackerSubscribed.compareAndSet(false, true)) {
            return;
        }
        this.taskScheduler.scheduleTask(this.expiredTask, this.expirationTimeMs);
    }

    public void stop() {
        this.isExpireTrackerSubscribed.set(false);
        this.taskScheduler.cancelTask(this.expiredTask);
    }

    public ExpirationHandler(long j10, Listener listener, TaskScheduler taskScheduler) {
        this.expiredTask = new a(listener);
        this.expirationTimeMs = j10;
        this.taskScheduler = taskScheduler;
        this.isExpireTrackerSubscribed = new AtomicBoolean(false);
    }
}
