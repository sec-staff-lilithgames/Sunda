package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdss {
    private final zzdvi zza;

    public zzdss(zzdvi zzdviVar) {
        this.zza = zzdviVar;
    }

    public final boolean zza(zzfvg zzfvgVar) {
        if (zzfvgVar.zzj()) {
            zzdvh zzdvhVarZza = this.zza.zza();
            zzdvhVarZza.zzc("action", "aq_ad_closed");
            zzdvhVarZza.zzc("gqi", zzfvgVar.zza());
            zzdvhVarZza.zzc("aq_ad_duration", String.valueOf(zzfvgVar.zzb()));
            zzdvhVarZza.zzc("aq_ad_bounce_cnt", String.valueOf(zzfvgVar.zzc()));
            zzdvhVarZza.zzc("aq_time_away", String.valueOf(zzfvgVar.zzg()));
            return zzdvhVarZza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        }
        zzdvh zzdvhVarZza2 = this.zza.zza();
        zzdvhVarZza2.zzc("action", "aq_ad_kill");
        zzdvhVarZza2.zzc("gqi", zzfvgVar.zza());
        zzdvhVarZza2.zzc("aq_ad_duration", String.valueOf(zzfvgVar.zzb()));
        zzdvhVarZza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzfvgVar.zzc()));
        zzdvhVarZza2.zzc("aq_time_away", String.valueOf(zzfvgVar.zzg()));
        zzdvhVarZza2.zzc("aq_is_os_kill", String.valueOf(zzfvgVar.zze()));
        return zzdvhVarZza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
    }
}
