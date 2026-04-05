package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcsi implements zzczi {
    private final zzcgy zza;
    private final zzdvi zzb;
    private final zzffu zzc;

    public zzcsi(zzcgy zzcgyVar, zzdvi zzdviVar, zzffu zzffuVar) {
        this.zza = zzcgyVar;
        this.zzb = zzdviVar;
        this.zzc = zzffuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczi
    public final void zzdw() {
        zzcgy zzcgyVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznV)).booleanValue() || (zzcgyVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzcgyVar.zzE()) ? "0" : "1";
        zzdvh zzdvhVarZza = this.zzb.zza();
        zzdvhVarZza.zzc("action", "hcp");
        zzdvhVarZza.zzc("hcp", str);
        zzdvhVarZza.zzb(this.zzc);
        zzdvhVarZza.zzd();
    }
}
