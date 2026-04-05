package com.google.android.gms.analytics;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzm extends FutureTask {
    final /* synthetic */ zzn zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzn zznVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.zza = zznVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zza.zza.zzf;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        } else if (Log.isLoggable("GAv4", 6)) {
            Log.e("GAv4", "MeasurementExecutor: job failed with ".concat(String.valueOf(th2)));
        }
        super.setException(th2);
    }
}
