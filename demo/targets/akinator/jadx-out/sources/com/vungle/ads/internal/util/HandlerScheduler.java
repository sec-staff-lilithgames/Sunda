package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HandlerScheduler {
    private final Handler handler = new Handler(Looper.getMainLooper());

    private final long calculateTime(long j10) {
        return SystemClock.uptimeMillis() + j10;
    }

    public final void cancel(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        this.handler.removeCallbacksAndMessages(tag);
    }

    public final void cancelAll() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void schedule(Runnable runnable, String tag, long j10) {
        e0.checkNotNullParameter(runnable, "runnable");
        e0.checkNotNullParameter(tag, "tag");
        this.handler.postAtTime(runnable, tag, calculateTime(j10));
    }

    public final void schedule(Runnable runnable, long j10) {
        e0.checkNotNullParameter(runnable, "runnable");
        this.handler.postAtTime(runnable, calculateTime(j10));
    }
}
