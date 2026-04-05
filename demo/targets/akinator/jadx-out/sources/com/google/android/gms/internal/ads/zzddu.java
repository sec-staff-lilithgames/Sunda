package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzddu implements zzdbu {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzby)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznT)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final synchronized void zzdU(zzfgf zzfgfVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbz)).booleanValue()) {
            try {
                zzffx zzffxVar = zzfgfVar.zzb.zzb;
                this.zza = zzffxVar.zzc;
                this.zzb = zzffxVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdT(zzbxj zzbxjVar) {
    }
}
