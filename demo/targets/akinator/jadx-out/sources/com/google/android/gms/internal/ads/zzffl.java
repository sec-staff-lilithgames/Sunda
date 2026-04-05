package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzffl extends zzbyn {
    private final zzffh zza;
    private final zzfey zzb;
    private final String zzc;
    private final zzfgg zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzaxa zzg;
    private final zzdvi zzh;
    private zzdri zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaV)).booleanValue();

    public zzffl(String str, zzffh zzffhVar, Context context, zzfey zzfeyVar, zzfgg zzfggVar, VersionInfoParcel versionInfoParcel, zzaxa zzaxaVar, zzdvi zzdviVar) {
        this.zzc = str;
        this.zza = zzffhVar;
        this.zzb = zzfeyVar;
        this.zzd = zzfggVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzaxaVar;
        this.zzh = zzdviVar;
    }

    private final synchronized void zzx(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbyv zzbyvVar, int i10) throws RemoteException {
        try {
            if (!zzmVar.zzb()) {
                boolean z10 = false;
                if (((Boolean) zzbgs.zzk.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmi)).booleanValue()) {
                        z10 = true;
                    }
                }
                if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmj)).intValue() || !z10) {
                    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
                }
            }
            zzfey zzfeyVar = this.zzb;
            zzfeyVar.zzh(zzbyvVar);
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzL(this.zze) && zzmVar.zzs == null) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
                zzfeyVar.zzdN(zzfhp.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzffa zzffaVar = new zzffa(null);
            zzffh zzffhVar = this.zza;
            zzffhVar.zzj(i10);
            zzffhVar.zza(zzmVar, this.zzc, zzffaVar, new zzffk(this));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzk(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbyv zzbyvVar) throws RemoteException {
        zzx(zzmVar, zzbyvVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbyv zzbyvVar) throws RemoteException {
        zzx(zzmVar, zzbyvVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zze(zzbyr zzbyrVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzbyrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (zzdqVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzffj(this, zzdqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final Bundle zzg() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdri zzdriVar = this.zzi;
        return zzdriVar != null ? zzdriVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzh(zzbzc zzbzcVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfgg zzfggVar = this.zzd;
        zzfggVar.zza = zzbzcVar.zza;
        zzfggVar.zzb = zzbzcVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final boolean zzi() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdri zzdriVar = this.zzi;
        return (zzdriVar == null || zzdriVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized String zzj() throws RemoteException {
        zzdri zzdriVar = this.zzi;
        if (zzdriVar == null || zzdriVar.zzn() == null) {
            return null;
        }
        return zzdriVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded can not be shown before loaded");
            this.zzb.zzj(zzfhp.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdk)).booleanValue()) {
                this.zzg.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzi.zza(z10, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final zzbyl zzl() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdri zzdriVar = this.zzi;
        if (zzdriVar != null) {
            return zzdriVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final com.google.android.gms.ads.internal.client.zzea zzm() {
        zzdri zzdriVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhm)).booleanValue() && (zzdriVar = this.zzi) != null) {
            return zzdriVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final String zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdtVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzb.zzl(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzp(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized long zzq() {
        zzdri zzdriVar = this.zzi;
        if (zzdriVar == null || zzdriVar.zzo() == null) {
            return 0L;
        }
        return zzdriVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final synchronized void zzr(long j10) {
        zzdri zzdriVar = this.zzi;
        if (zzdriVar == null || zzdriVar.zzo() == null) {
            return;
        }
        zzdriVar.zzo().zzb(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzs(zzbyw zzbywVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbywVar);
    }

    public final /* synthetic */ zzfgg zzu() {
        return this.zzd;
    }

    public final /* synthetic */ zzdri zzv() {
        return this.zzi;
    }

    public final /* synthetic */ void zzw(zzdri zzdriVar) {
        this.zzi = zzdriVar;
    }
}
