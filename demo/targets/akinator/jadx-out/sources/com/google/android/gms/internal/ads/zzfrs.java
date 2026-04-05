package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzfrs {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfrs(Context context, Executor executor, Task task, boolean z10) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z10;
    }

    public static zzfrs zza(final Context context, Executor executor, boolean z10) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z10) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfro
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    taskCompletionSource.setResult(zzfto.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    taskCompletionSource.setResult(zzfto.zzc());
                }
            });
        }
        return new zzfrs(context, executor, taskCompletionSource.getTask(), z10);
    }

    public static void zzg(int i10) {
        zzf = i10;
    }

    private final Task zzh(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfrr.zza);
        }
        Context context = this.zzb;
        final zzati zzatiVarZza = zzatm.zza();
        zzatiVarZza.zza(context.getPackageName());
        zzatiVarZza.zzb(j10);
        zzatiVarZza.zzg(zzf);
        if (exc != null) {
            int i11 = zzgna.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzatiVarZza.zzc(stringWriter.toString());
            zzatiVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzatiVarZza.zze(str2);
        }
        if (str != null) {
            zzatiVarZza.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfrp
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i12 = i10;
                zzftn zzftnVarZza = ((zzfto) task.getResult()).zza(((zzatm) zzatiVarZza.zzbu()).zzaN());
                zzftnVarZza.zzc(i12);
                zzftnVarZza.zza();
                return Boolean.TRUE;
            }
        });
    }

    public Task zzb(int i10, long j10) {
        return zzh(i10, j10, null, null, null, null);
    }

    public Task zzc(int i10, long j10, Exception exc) {
        return zzh(i10, j10, exc, null, null, null);
    }

    public final Task zzd(int i10, long j10, String str, Map map) {
        return zzh(i10, j10, null, str, null, null);
    }

    public Task zze(int i10, String str) {
        return zzh(i10, 0L, null, null, null, str);
    }

    public final Task zzf(int i10, long j10, String str) {
        return zzh(i10, j10, null, null, null, str);
    }
}
