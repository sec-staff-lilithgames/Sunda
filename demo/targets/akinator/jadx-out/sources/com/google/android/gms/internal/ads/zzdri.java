package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdri extends zzcto {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdjl zze;
    private final zzdfz zzf;
    private final zzczb zzg;
    private final zzdai zzh;
    private final zzcuj zzi;
    private final zzbyl zzj;
    private final zzfsc zzk;
    private final zzfgh zzl;
    private final zzdvi zzm;
    private boolean zzn;

    public zzdri(zzctn zzctnVar, Context context, zzcgy zzcgyVar, zzdjl zzdjlVar, zzdfz zzdfzVar, zzczb zzczbVar, zzdai zzdaiVar, zzcuj zzcujVar, zzffu zzffuVar, zzfsc zzfscVar, zzfgh zzfghVar, zzdvi zzdviVar) {
        super(zzctnVar);
        this.zzn = false;
        this.zzc = context;
        this.zze = zzdjlVar;
        this.zzd = new WeakReference(zzcgyVar);
        this.zzf = zzdfzVar;
        this.zzg = zzczbVar;
        this.zzh = zzdaiVar;
        this.zzi = zzcujVar;
        this.zzk = zzfscVar;
        zzbyh zzbyhVar = zzffuVar.zzl;
        this.zzj = new zzbzf(zzbyhVar != null ? zzbyhVar.zza : "", zzbyhVar != null ? zzbyhVar.zzb : 1);
        this.zzl = zzfghVar;
        this.zzm = zzdviVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcgy zzcgyVar = (zzcgy) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhk)).booleanValue()) {
                if (!this.zzn && zzcgyVar != null) {
                    zzcbv.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrh
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcgyVar.destroy();
                        }
                    });
                }
            } else if (zzcgyVar != null) {
                zzcgyVar.destroy();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context] */
    public final boolean zza(boolean z10, Activity activity) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdjl zzdjlVar = this.zze;
        if (!com.google.android.gms.ads.internal.util.zzs.zzS(zzdjlVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzox)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzR(this.zzc, this.zzb, this.zzm);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaT)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc)) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaU)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzn) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The rewarded ad have been showed.");
            this.zzg.zzc(zzfhp.zzd(10, null, null));
            return false;
        }
        this.zzn = true;
        zzdfz zzdfzVar = this.zzf;
        zzdfzVar.zza();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            zzdjlVar.zza(z10, activity2, this.zzg);
            zzdfzVar.zzb();
            return true;
        } catch (zzdjk e10) {
            this.zzg.zzd(e10);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final zzbyl zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzl();
    }

    public final boolean zzf() {
        zzcgy zzcgyVar = (zzcgy) this.zzd.get();
        return (zzcgyVar == null || zzcgyVar.zzaB()) ? false : true;
    }

    public final Bundle zzg() {
        return this.zzh.zzb();
    }

    public final zzfgh zzh() {
        return this.zzl;
    }
}
