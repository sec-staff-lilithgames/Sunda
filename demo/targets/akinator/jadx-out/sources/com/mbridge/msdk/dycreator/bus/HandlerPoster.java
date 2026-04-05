package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class HandlerPoster extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f40174a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40175b;

    /* renamed from: c, reason: collision with root package name */
    private final EventBus f40176c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f40177d;

    public HandlerPoster(EventBus eventBus, Looper looper, int i10) {
        super(looper);
        this.f40176c = eventBus;
        this.f40175b = i10;
        this.f40174a = new PendingPostQueue();
    }

    public void a(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f40174a.a(pendingPostA);
                if (!this.f40177d) {
                    this.f40177d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost pendingPostA = this.f40174a.a();
                if (pendingPostA == null) {
                    synchronized (this) {
                        pendingPostA = this.f40174a.a();
                        if (pendingPostA == null) {
                            this.f40177d = false;
                            return;
                        }
                    }
                }
                this.f40176c.a(pendingPostA);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f40175b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f40177d = true;
        } catch (Throwable th2) {
            this.f40177d = false;
            throw th2;
        }
    }
}
