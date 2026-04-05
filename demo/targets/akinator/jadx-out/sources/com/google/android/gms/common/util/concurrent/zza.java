package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zza implements Runnable {
    private final Runnable zza;

    public zza(Runnable runnable, int i10) {
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.zza.run();
    }
}
