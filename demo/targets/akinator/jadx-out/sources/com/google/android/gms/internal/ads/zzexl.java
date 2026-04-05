package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzexl implements zzexy {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzexl(String str, String str2, String str3, String str4, Long l9) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l9;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcxq) obj).zza;
        zzfhc.zze(bundle, "gmp_app_id", this.zza);
        zzfhc.zze(bundle, "fbs_aiid", this.zzb);
        zzfhc.zze(bundle, "fbs_aeid", this.zzc);
        zzfhc.zze(bundle, "apm_id_origin", this.zzd);
        Long l9 = this.zze;
        if (l9 != null) {
            bundle.putLong("sai_timeout", l9.longValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhc.zze(((zzcxq) obj).zzb, "fbs_aeid", this.zzc);
    }
}
