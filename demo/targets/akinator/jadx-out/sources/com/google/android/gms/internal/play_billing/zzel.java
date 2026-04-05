package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzel extends zzen {
    public static zzeu zza(Object obj) {
        return new zzeo(obj);
    }

    public static zzeu zzb(zzeu zzeuVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzeuVar.isDone() ? zzeuVar : zzff.zzs(zzeuVar, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void zzc(zzeu zzeuVar, zzej zzejVar, Executor executor) {
        zzeuVar.zzb(new zzek(zzeuVar, zzejVar), executor);
    }
}
