package com.google.android.gms.internal.gtm;

import java.lang.Thread;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbt implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzbu zza;

    public zzbt(zzbu zzbuVar) {
        this.zza = zzbuVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        zzeo zzeoVarZzn = this.zza.zzn();
        if (zzeoVarZzn != null) {
            zzeoVarZzn.zzJ("Job execution failed", th2);
        }
    }
}
