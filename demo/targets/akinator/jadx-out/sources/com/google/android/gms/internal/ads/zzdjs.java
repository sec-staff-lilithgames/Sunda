package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdjs implements zzctr {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzifw zzd;
    private final zzdma zze;

    public zzdjs(Map map, Map map2, Map map3, zzifw zzifwVar, zzdma zzdmaVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzifwVar;
        this.zze = zzdmaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctr
    public final zzehk zza(int i10, String str) {
        zzehk zzehkVarZza;
        zzehk zzehkVar = (zzehk) this.zza.get(str);
        if (zzehkVar != null) {
            return zzehkVar;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            zzejq zzejqVar = (zzejq) this.zzc.get(str);
            if (zzejqVar != null) {
                return zzctw.zza(zzejqVar);
            }
            zzehkVarZza = (zzehk) this.zzb.get(str);
            if (zzehkVarZza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zzehkVarZza = ((zzctr) this.zzd.zzb()).zza(i10, str)) == null) {
            return null;
        }
        return zzctw.zzb(zzehkVarZza);
    }
}
