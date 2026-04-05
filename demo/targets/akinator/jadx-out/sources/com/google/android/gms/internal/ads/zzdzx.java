package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdzx implements zzdbu, zzdhh, zzdac {
    private final Context zza;
    private final zzdvi zzb;

    public zzdzx(Context context, zzdvi zzdviVar) {
        this.zza = context;
        this.zzb = zzdviVar;
    }

    private final void zzf(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfi)).booleanValue()) {
            zzcbv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc(context);
                }
            });
        }
    }

    public final /* synthetic */ void zzc(Context context) {
        com.google.android.gms.ads.internal.zzt.zzn().zza(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfl)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdT(zzbxj zzbxjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfk)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdac
    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfm)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdU(zzfgf zzfgfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zze(String str) {
    }
}
