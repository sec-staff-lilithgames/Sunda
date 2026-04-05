package io.bidmachine.media3.common.util;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Executor f60693a;

    public static synchronized Executor get() {
        try {
            if (f60693a == null) {
                f60693a = a1.newSingleThreadExecutor("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f60693a;
    }

    public static synchronized void set(Executor executor) {
        f60693a = executor;
    }
}
