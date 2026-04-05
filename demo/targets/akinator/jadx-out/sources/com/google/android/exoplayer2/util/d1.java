package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d1 implements d {
    @Override // com.google.android.exoplayer2.util.d
    public z createHandler(Looper looper, Handler.Callback callback) {
        return new f1(new Handler(looper, callback));
    }

    @Override // com.google.android.exoplayer2.util.d
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.exoplayer2.util.d
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.exoplayer2.util.d
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // com.google.android.exoplayer2.util.d
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.google.android.exoplayer2.util.d
    public void onThreadBlocked() {
    }
}
