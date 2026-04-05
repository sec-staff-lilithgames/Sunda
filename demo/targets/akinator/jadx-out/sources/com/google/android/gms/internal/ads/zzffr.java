package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzffr extends zzbxx {
    private final zzffh zza;
    private final zzfey zzb;
    private final zzfgg zzc;
    private zzdri zzd;
    private boolean zze = false;

    public zzffr(zzffh zzffhVar, zzfey zzfeyVar, zzfgg zzfggVar) {
        this.zza = zzffhVar;
        this.zzb = zzfeyVar;
        this.zzc = zzfggVar;
    }

    private final synchronized boolean zzy() {
        zzdri zzdriVar = this.zzd;
        if (zzdriVar != null) {
            if (!zzdriVar.zze()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbeu.zzgd)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzbxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzbyc r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzgb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L62
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzcbj r2 = com.google.android.gms.ads.internal.zzt.zzh()     // Catch: java.lang.Throwable -> L20
            r2.zzg(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzbel r0 = com.google.android.gms.internal.ads.zzbeu.zzgd     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbes r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.zzffa r0 = new com.google.android.gms.internal.ads.zzffa     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.zzd = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzffh r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzm r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzffp r3 = new com.google.android.gms.internal.ads.zzffp     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.zza(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffr.zzb(com.google.android.gms.internal.ads.zzbyc):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzc() throws RemoteException {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzd(zzbyb zzbybVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzbybVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final boolean zze() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzh() throws RemoteException {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized String zzl() throws RemoteException {
        zzdri zzdriVar = this.zzd;
        if (zzdriVar == null || zzdriVar.zzn() == null) {
            return null;
        }
        return zzdriVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzn(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzcbVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzffq(this, zzcbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final Bundle zzo() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdri zzdriVar = this.zzd;
        return zzdriVar != null ? zzdriVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        try {
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (iObjectWrapper != null) {
                    Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                    if (objUnwrap instanceof Activity) {
                        activity = (Activity) objUnwrap;
                    }
                }
                this.zzd.zza(this.zze, activity);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzq(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized void zzr(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final boolean zzs() {
        zzdri zzdriVar = this.zzd;
        return zzdriVar != null && zzdriVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzt() throws RemoteException {
        zzdri zzdriVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhm)).booleanValue() && (zzdriVar = this.zzd) != null) {
            return zzdriVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzu(zzbxw zzbxwVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzp(zzbxwVar);
    }

    public final /* synthetic */ zzfgg zzv() {
        return this.zzc;
    }

    public final /* synthetic */ zzdri zzw() {
        return this.zzd;
    }

    public final /* synthetic */ void zzx(zzdri zzdriVar) {
        this.zzd = zzdriVar;
    }
}
