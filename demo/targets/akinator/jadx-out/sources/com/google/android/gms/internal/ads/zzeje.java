package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzeje implements zzdjl {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final n1 zzc;
    private final zzffu zzd;
    private final zzcgy zze;
    private final zzfgn zzf;
    private final zzbma zzg;
    private final boolean zzh;
    private final zzegj zzi;
    private final zzdvi zzj;

    public zzeje(Context context, VersionInfoParcel versionInfoParcel, n1 n1Var, zzffu zzffuVar, zzcgy zzcgyVar, zzfgn zzfgnVar, boolean z10, zzbma zzbmaVar, zzegj zzegjVar, zzdvi zzdviVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = n1Var;
        this.zzd = zzffuVar;
        this.zze = zzcgyVar;
        this.zzf = zzfgnVar;
        this.zzg = zzbmaVar;
        this.zzh = z10;
        this.zzi = zzegjVar;
        this.zzj = zzdviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjl
    public final void zza(boolean z10, Context context, zzczb zzczbVar) {
        zzdhx zzdhxVar = (zzdhx) zzgui.zzt(this.zzc);
        zzcgy zzcgyVar = this.zze;
        zzcgyVar.zzag(true);
        boolean z11 = this.zzh;
        boolean zZzc = z11 ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzM = com.google.android.gms.ads.internal.util.zzs.zzM(this.zza);
        boolean z12 = z11 && this.zzg.zzd();
        float fZze = z11 ? this.zzg.zze() : 0.0f;
        zzffu zzffuVar = this.zzd;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, zZzM, z12, fZze, -1, z10, zzffuVar.zzO, false);
        if (zzczbVar != null) {
            zzczbVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdja zzdjaVarZzj = zzdhxVar.zzj();
        int i10 = zzffuVar.zzQ;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str = zzffuVar.zzB;
        zzffz zzffzVar = zzffuVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdjaVarZzj, null, zzcgyVar, i10, versionInfoParcel, str, zzlVar, zzffzVar.zzb, zzffzVar.zza, this.zzf.zzg, zzczbVar, zzffuVar.zzb() ? this.zzi : null, zzcgyVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdjl
    public final zzffu zzb() {
        return this.zzd;
    }
}
