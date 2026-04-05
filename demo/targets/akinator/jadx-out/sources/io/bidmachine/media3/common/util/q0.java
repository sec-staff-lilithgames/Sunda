package io.bidmachine.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 implements g {
    @Override // io.bidmachine.media3.common.util.g
    public v createHandler(Looper looper, Handler.Callback callback) {
        return new s0(new Handler(looper, callback));
    }

    @Override // io.bidmachine.media3.common.util.g
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // io.bidmachine.media3.common.util.g
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // io.bidmachine.media3.common.util.g
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // io.bidmachine.media3.common.util.g
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.bidmachine.media3.common.util.g
    public void onThreadBlocked() {
    }
}
