package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgex extends zzfrs {
    private final zzfzn zzb;

    public zzgex(Context context, Executor executor, zzfzn zzfznVar) {
        super(context, executor, new TaskCompletionSource().getTask(), false);
        this.zzb = zzfznVar;
    }

    private static Task zzh() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final Task zzb(int i10, long j10) {
        this.zzb.zzb(i10, j10, null, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final Task zzc(int i10, long j10, Exception exc) {
        this.zzb.zzb(i10, j10, exc, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final Task zze(int i10, String str) {
        this.zzb.zzb(i10, -1L, null, str);
        return zzh();
    }
}
