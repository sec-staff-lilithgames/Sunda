package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzesu implements zzeya {
    private final zzgus zza;
    private final zzdtd zzb;
    private final String zzc;
    private final zzfgn zzd;

    public zzesu(zzgus zzgusVar, zzdtd zzdtdVar, zzfgn zzfgnVar, String str) {
        this.zza = zzgusVar;
        this.zzb = zzdtdVar;
        this.zzd = zzfgnVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzest
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 17;
    }

    public final /* synthetic */ zzesv zzc() {
        zzfgn zzfgnVar = this.zzd;
        zzdtd zzdtdVar = this.zzb;
        return new zzesv(zzdtdVar.zzb(zzfgnVar.zzg, this.zzc), zzdtdVar.zzc());
    }
}
