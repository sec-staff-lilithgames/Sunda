package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzexw implements zzeya {
    private final zzgus zza;
    private final Context zzb;

    public zzexw(zzgus zzgusVar, Context context) {
        this.zza = zzgusVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzexv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 37;
    }

    public final /* synthetic */ zzexu zzc() {
        return new zzexu(com.google.android.gms.ads.internal.util.zzac.zzb(this.zzb, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgH)));
    }
}
