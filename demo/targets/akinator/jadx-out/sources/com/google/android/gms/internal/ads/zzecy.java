package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzecy {
    private final zzcjn zza;
    private final Context zzb;
    private final Executor zzc;

    public zzecy(zzcjn zzcjnVar, Context context, Executor executor) {
        this.zza = zzcjnVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        });
    }

    public final /* synthetic */ void zzb() {
        zzeda zzedaVarZzh = this.zza.zzh();
        zzedaVarZzh.zzb(this.zzb);
        zzedaVarZzh.zza().zza().zza();
    }
}
