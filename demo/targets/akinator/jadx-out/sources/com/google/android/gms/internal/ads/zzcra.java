package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcra extends zzcto {
    private final zzcgy zzc;
    private final int zzd;
    private final Context zze;
    private final zzcqo zzf;
    private final zzdjl zzg;
    private final zzdfz zzh;
    private final zzczb zzi;
    private final boolean zzj;
    private final zzcbn zzk;
    private final zzdvi zzl;
    private boolean zzm;

    public zzcra(zzctn zzctnVar, Context context, zzcgy zzcgyVar, int i10, zzcqo zzcqoVar, zzdjl zzdjlVar, zzdfz zzdfzVar, zzczb zzczbVar, zzcbn zzcbnVar, zzdvi zzdviVar) {
        super(zzctnVar);
        this.zzm = false;
        this.zzc = zzcgyVar;
        this.zze = context;
        this.zzd = i10;
        this.zzf = zzcqoVar;
        this.zzg = zzdjlVar;
        this.zzh = zzdfzVar;
        this.zzi = zzczbVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzga)).booleanValue();
        this.zzk = zzcbnVar;
        this.zzl = zzdviVar;
    }

    public final void zza(zzbch zzbchVar) {
        zzcgy zzcgyVar = this.zzc;
        if (zzcgyVar != null) {
            zzcgyVar.zzay(zzbchVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.content.Context] */
    public final void zzb(Activity activity, zzbcu zzbcuVar, boolean z10) throws RemoteException {
        zzcgy zzcgyVar;
        zzffu zzffuVarZzC;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zze;
        }
        boolean z11 = this.zzj;
        if (z11) {
            this.zzh.zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdjl zzdjlVar = this.zzg;
        if (!com.google.android.gms.ads.internal.util.zzs.zzS(zzdjlVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzox)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzR(activity2, this.zzb, this.zzl);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaT)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzK(activity2)) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaU)).booleanValue()) {
                        new zzfsc(activity2.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzs().zza()).zza(this.zza.zzb.zzb.zzb);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmT)).booleanValue() && (zzcgyVar = this.zzc) != null && (zzffuVarZzC = zzcgyVar.zzC()) != null && zzffuVarZzC.zzar && zzffuVarZzC.zzas != this.zzk.zzj()) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The app open consent form has been shown.");
            this.zzi.zzc(zzfhp.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzm) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App open interstitial ad is already visible.");
            this.zzi.zzc(zzfhp.zzd(10, null, null));
        }
        if (this.zzm) {
            return;
        }
        try {
            zzdjlVar.zza(z10, activity2, this.zzi);
            if (z11) {
                this.zzh.zzb();
            }
            this.zzm = true;
        } catch (zzdjk e10) {
            this.zzi.zzd(e10);
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcto
    public final void zzd() {
        super.zzd();
        zzcgy zzcgyVar = this.zzc;
        if (zzcgyVar != null) {
            zzcgyVar.destroy();
        }
    }

    public final void zze(long j10, int i10) {
        this.zzf.zza(j10, i10);
    }
}
