package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzepb extends com.google.android.gms.ads.internal.client.zzbw {
    private final com.google.android.gms.ads.internal.client.zzr zza;
    private final Context zzb;
    private final zzfdy zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final zzeot zzf;
    private final zzfey zzg;
    private final zzaxa zzh;
    private final zzdvi zzi;
    private zzdhw zzj;
    private boolean zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaV)).booleanValue();

    public zzepb(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzfdy zzfdyVar, zzeot zzeotVar, zzfey zzfeyVar, VersionInfoParcel versionInfoParcel, zzaxa zzaxaVar, zzdvi zzdviVar) {
        this.zza = zzrVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfdyVar;
        this.zzf = zzeotVar;
        this.zzg = zzfeyVar;
        this.zze = versionInfoParcel;
        this.zzh = zzaxaVar;
        this.zzi = zzdviVar;
    }

    private final synchronized boolean zzN() {
        zzdhw zzdhwVar = this.zzj;
        if (zzdhwVar != null) {
            if (!zzdhwVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzA() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzB() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(zzbyb zzbybVar) {
        this.zzg.zzn(zzbybVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzed zzF() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(com.google.android.gms.ads.internal.client.zzeh zzehVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(zzbcq zzbcqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzK(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z10;
    }

    public final /* synthetic */ zzdhw zzL() {
        return this.zzj;
    }

    public final /* synthetic */ void zzM(zzdhw zzdhwVar) {
        this.zzj = zzdhwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdtVar.zzf()) {
                this.zzi.zzb();
            }
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzf.zzo(zzdtVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
        this.zzf.zzp(zzbnVar);
        zze(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzR(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(GalEuEfxjome.AYcVNCwQ);
            this.zzf.zzj(zzfhp.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdk)).booleanValue()) {
                this.zzh.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.zzf.zzq(zzcvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzT(long j10) {
        zzdhw zzdhwVar = this.zzj;
        if (zzdhwVar == null || zzdhwVar.zzo() == null) {
            return;
        }
        zzdhwVar.zzo().zzb(j10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized long zzU() {
        zzdhw zzdhwVar = this.zzj;
        if (zzdhwVar == null || zzdhwVar.zzo() == null) {
            return 0L;
        }
        return zzdhwVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzY(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzb() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzc() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdhw zzdhwVar = this.zzj;
        if (zzdhwVar != null) {
            zzdhwVar.zzl().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzd() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzN();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzdW(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzl(zzbkVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zze(com.google.android.gms.ads.internal.client.zzm r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.zzb()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.zzbge r0 = com.google.android.gms.internal.ads.zzbgs.zzi     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbel r0 = com.google.android.gms.internal.ads.zzbeu.zzmi     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r2.zzd(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2f
        L2b:
            r0 = r1
            goto L2f
        L2d:
            r6 = move-exception
            goto L95
        L2f:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r5.zze     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.clientJarVersion     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbel r3 = com.google.android.gms.internal.ads.zzbeu.zzmj     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbes r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.zzd(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L47
            if (r0 != 0) goto L4c
        L47:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L2d
        L4c:
            com.google.android.gms.ads.internal.zzt.zzc()     // Catch: java.lang.Throwable -> L2d
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L2d
            boolean r2 = com.google.android.gms.ads.internal.util.zzs.zzL(r0)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            if (r2 == 0) goto L70
            com.google.android.gms.ads.internal.client.zzc r2 = r6.zzs     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L70
            int r6 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzeot r6 = r5.zzf     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L93
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfhp.zzd(r0, r3, r3)     // Catch: java.lang.Throwable -> L2d
            r6.zzdN(r0)     // Catch: java.lang.Throwable -> L2d
            goto L93
        L70:
            boolean r2 = r5.zzN()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L93
            boolean r1 = r6.zzf     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfhk.zzb(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r5.zzj = r3     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfdy r0 = r5.zzc     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r5.zzd     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.ads.internal.client.zzr r2 = r5.zza     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfdr r3 = new com.google.android.gms.internal.ads.zzfdr     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzepa r2 = new com.google.android.gms.internal.ads.zzepa     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r0.zza(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L93:
            monitor-exit(r5)
            return r1
        L95:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzepb.zze(com.google.android.gms.ads.internal.client.zzm):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzf() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdhw zzdhwVar = this.zzj;
        if (zzdhwVar != null) {
            zzdhwVar.zzl().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzg() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdhw zzdhwVar = this.zzj;
        if (zzdhwVar != null) {
            zzdhwVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzi(com.google.android.gms.ads.internal.client.zzco zzcoVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzn(zzcoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzj(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzk() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzl() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitial can not be shown before loaded.");
            this.zzf.zzj(zzfhp.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdk)).booleanValue()) {
                this.zzh.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzm() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzr zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzp(zzbvr zzbvrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzq(zzbvu zzbvuVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzr() {
        zzdhw zzdhwVar = this.zzj;
        if (zzdhwVar == null || zzdhwVar.zzn() == null) {
            return null;
        }
        return zzdhwVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzs() {
        zzdhw zzdhwVar = this.zzj;
        if (zzdhwVar == null || zzdhwVar.zzn() == null) {
            return null;
        }
        return zzdhwVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzt() {
        zzdhw zzdhwVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhm)).booleanValue() && (zzdhwVar = this.zzj) != null) {
            return zzdhwVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzu() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzco zzv() {
        return this.zzf.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk zzw() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzx(zzbfp zzbfpVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzc(zzbfpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzz(boolean z10) {
    }
}
