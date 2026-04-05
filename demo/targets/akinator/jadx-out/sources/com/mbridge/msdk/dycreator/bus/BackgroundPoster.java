package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class BackgroundPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f40151a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f40152b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f40153c;

    public BackgroundPoster(EventBus eventBus) {
        this.f40153c = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f40151a.a(pendingPostA);
                if (!this.f40152b) {
                    this.f40152b = true;
                    EventBus.f40154n.execute(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    PendingPost pendingPostA = this.f40151a.a(1000);
                    if (pendingPostA == null) {
                        synchronized (this) {
                            pendingPostA = this.f40151a.a();
                            if (pendingPostA == null) {
                                this.f40152b = false;
                                this.f40152b = false;
                                return;
                            }
                        }
                    }
                    this.f40153c.a(pendingPostA);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f40152b = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f40152b = false;
                throw th2;
            }
        }
    }
}
