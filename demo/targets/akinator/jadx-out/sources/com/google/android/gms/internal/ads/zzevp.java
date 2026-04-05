package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzevp implements zzeya {
    private final zzgus zza;
    private final zzdyo zzb;

    public zzevp(zzgus zzgusVar, zzdyo zzdyoVar) {
        this.zza = zzgusVar;
        this.zzb = zzdyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevo
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 23;
    }

    public final /* synthetic */ zzevq zzc() {
        zzdyo zzdyoVar = this.zzb;
        return new zzevq(zzdyoVar.zzg(), zzdyoVar.zzd(), com.google.android.gms.ads.internal.zzt.zzo().zzk(), zzdyoVar.zzq(), zzdyoVar.zzm());
    }
}
