package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzguz {
    public static Executor zza() {
        return zzgtx.INSTANCE;
    }

    public static zzgus zzb(ExecutorService executorService) {
        return executorService instanceof zzgus ? (zzgus) executorService : executorService instanceof ScheduledExecutorService ? new zzguy((ScheduledExecutorService) executorService) : new zzguu(executorService);
    }

    public static zzgut zzc(ScheduledExecutorService scheduledExecutorService) {
        return new zzguy(scheduledExecutorService);
    }

    public static Executor zzd(final Executor executor, final zzgtb zzgtbVar) {
        executor.getClass();
        return executor == zzgtx.INSTANCE ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.zzguv
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzguz.zzf(executor, zzgtbVar, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzf(Executor executor, zzgtb zzgtbVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e10) {
            zzgtbVar.zzb(e10);
        }
    }
}
