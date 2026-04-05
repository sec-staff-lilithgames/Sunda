package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcje extends Thread {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzcjf zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcje(zzcjf zzcjfVar, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.zza = runnable2;
        Objects.requireNonNull(zzcjfVar);
        this.zzb = zzcjfVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.zzb.zza());
        this.zza.run();
    }
}
