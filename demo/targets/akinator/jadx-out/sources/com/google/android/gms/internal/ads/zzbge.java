package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzbge {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbge(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbge zza(String str, boolean z10) {
        return new zzbge(str, Boolean.valueOf(z10), 1);
    }

    public static zzbge zzb(String str, long j10) {
        return new zzbge(str, Long.valueOf(j10), 2);
    }

    public static zzbge zzc(String str, double d10) {
        return new zzbge(str, Double.valueOf(d10), 3);
    }

    public static zzbge zzd(String str, String str2) {
        return new zzbge("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzbhk zzbhkVarZza = zzbhm.zza();
        if (zzbhkVarZza != null) {
            int i10 = this.zzc - 1;
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? zzbhkVarZza.zzd(this.zza, (String) this.zzb) : zzbhkVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue()) : zzbhkVarZza.zzb(this.zza, ((Long) this.zzb).longValue()) : zzbhkVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbhm.zzb() != null) {
            zzbhm.zzb().zza();
        }
        return this.zzb;
    }
}
