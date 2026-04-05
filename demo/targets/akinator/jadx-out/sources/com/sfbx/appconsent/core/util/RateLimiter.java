package com.sfbx.appconsent.core.util;

import com.sfbx.appconsent.core.model.DurationUnit;
import com.sfbx.appconsent.core.provider.TimeoutProvider;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RateLimiter {
    public static final Companion Companion = new Companion(null);
    private static final String tag = "RateLimiter";
    private final long timeout;
    private final TimeoutProvider timeoutProvider;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public RateLimiter(int i10, DurationUnit timeUnit, TimeoutProvider timeoutProvider) {
        e0.checkNotNullParameter(timeUnit, "timeUnit");
        e0.checkNotNullParameter(timeoutProvider, "timeoutProvider");
        this.timeoutProvider = timeoutProvider;
        this.timeout = ExtensionKt.getTimeInMillis(i10, timeUnit);
    }

    public static /* synthetic */ boolean shouldFetch$default(RateLimiter rateLimiter, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return rateLimiter.shouldFetch(str, z10);
    }

    public final synchronized boolean isTimeOver(String key) {
        e0.checkNotNullParameter(key, "key");
        Long l9 = this.timeoutProvider.getTimeouts().get(key);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (l9 != null) {
            if (jCurrentTimeMillis - l9.longValue() <= this.timeout) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void reset(String key) {
        e0.checkNotNullParameter(key, "key");
        this.timeoutProvider.remove(key);
    }

    public final synchronized boolean shouldFetch(String key, boolean z10) {
        boolean z11;
        e0.checkNotNullParameter(key, "key");
        if (isTimeOver(key) || z10) {
            this.timeoutProvider.setTimeout(key, System.currentTimeMillis());
            z11 = true;
        } else {
            z11 = false;
        }
        return z11;
    }
}
