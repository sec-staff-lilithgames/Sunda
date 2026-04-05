package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdrf implements zzbmp {
    private final zzczv zza;
    private final zzbyh zzb;
    private final String zzc;
    private final String zzd;

    public zzdrf(zzczv zzczvVar, zzffu zzffuVar) {
        this.zza = zzczvVar;
        this.zzb = zzffuVar.zzl;
        this.zzc = zzffuVar.zzj;
        this.zzd = zzffuVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zza() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzb(zzbyh zzbyhVar) {
        int i10;
        String str;
        zzbyh zzbyhVar2 = this.zzb;
        if (zzbyhVar2 != null) {
            zzbyhVar = zzbyhVar2;
        }
        if (zzbyhVar != null) {
            str = zzbyhVar.zza;
            i10 = zzbyhVar.zzb;
        } else {
            i10 = 1;
            str = "";
        }
        this.zza.zze(new zzbxs(str, i10), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzc() {
        this.zza.zzf();
    }
}
