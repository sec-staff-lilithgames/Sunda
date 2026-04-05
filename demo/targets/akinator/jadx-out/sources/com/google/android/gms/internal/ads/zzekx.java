package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzekx {
    private final zzfhg zza;
    private final zzdsv zzb;
    private final zzdvi zzc;

    public zzekx(zzfhg zzfhgVar, zzdsv zzdsvVar, zzdvi zzdviVar) {
        this.zza = zzfhgVar;
        this.zzb = zzdsvVar;
        this.zzc = zzdviVar;
    }

    public final void zza(zzffx zzffxVar, zzffu zzffuVar, int i10, zzeho zzehoVar, long j10) {
        zzdsu zzdsuVarZzc;
        zzdvh zzdvhVarZza = this.zzc.zza();
        zzdvhVarZza.zza(zzffxVar);
        zzdvhVarZza.zzb(zzffuVar);
        zzdvhVarZza.zzc("action", "adapter_status");
        zzdvhVarZza.zzc("adapter_l", String.valueOf(j10));
        zzdvhVarZza.zzc("sc", Integer.toString(i10));
        if (zzehoVar != null) {
            zzdvhVarZza.zzc("arec", Integer.toString(zzehoVar.zzb().zza));
            String strZza = this.zza.zza(zzehoVar.getMessage());
            if (strZza != null) {
                zzdvhVarZza.zzc("areec", strZza);
            }
        }
        zzdsv zzdsvVar = this.zzb;
        Iterator it = zzffuVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdsuVarZzc = null;
                break;
            } else {
                zzdsuVarZzc = zzdsvVar.zzc((String) it.next());
                if (zzdsuVarZzc != null) {
                    break;
                }
            }
        }
        if (zzdsuVarZzc != null) {
            zzdvhVarZza.zzc("ancn", zzdsuVarZzc.zza);
            zzbtx zzbtxVar = zzdsuVarZzc.zzb;
            if (zzbtxVar != null) {
                zzdvhVarZza.zzc("adapter_v", zzbtxVar.toString());
            }
            zzbtx zzbtxVar2 = zzdsuVarZzc.zzc;
            if (zzbtxVar2 != null) {
                zzdvhVarZza.zzc("adapter_sv", zzbtxVar2.toString());
            }
        }
        zzdvhVarZza.zzd();
    }
}
