package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfky implements zzdga, zzcze, zzdge {
    private final zzflm zza;
    private final zzflc zzb;

    public zzfky(Context context, zzflm zzflmVar) {
        this.zza = zzflmVar;
        this.zzb = zzflc.zzn(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zza() {
        if (((Boolean) zzbgn.zzd.zze()).booleanValue()) {
            zzflm zzflmVar = this.zza;
            zzflc zzflcVar = this.zzb;
            zzflcVar.zzd(true);
            zzflmVar.zza(zzflcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzh() {
        if (((Boolean) zzbgn.zzd.zze()).booleanValue()) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcze
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbgn.zzd.zze()).booleanValue()) {
            zzflm zzflmVar = this.zza;
            zzflc zzflcVar = this.zzb;
            zzflcVar.zzk(zzeVar.zza().toString());
            zzflcVar.zzd(false);
            zzflmVar.zza(zzflcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzg() {
    }
}
