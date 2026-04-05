package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcrb extends zzbcm {
    private final zzcra zza;
    private final com.google.android.gms.ads.internal.client.zzbx zzb;
    private final zzfbu zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaY)).booleanValue();
    private final zzdvi zze;

    public zzcrb(zzcra zzcraVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar, zzfbu zzfbuVar, zzdvi zzdviVar) {
        this.zza = zzcraVar;
        this.zzb = zzbxVar;
        this.zzc = zzfbuVar;
        this.zze = zzdviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final com.google.android.gms.ads.internal.client.zzbx zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zzf(IObjectWrapper iObjectWrapper, zzbcu zzbcuVar) {
        try {
            this.zzc.zzp(zzbcuVar);
            this.zza.zzb((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbcuVar, this.zzd);
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final com.google.android.gms.ads.internal.client.zzea zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhm)).booleanValue()) {
            return this.zza.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zzh(boolean z10) {
        this.zzd = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdtVar.zzf()) {
                    this.zze.zzb();
                }
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e10);
            }
            this.zzc.zzr(zzdtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final String zzj() {
        try {
            return this.zzb.zzu();
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final long zzk() {
        zzcra zzcraVar = this.zza;
        if (zzcraVar == null || zzcraVar.zzo() == null) {
            return 0L;
        }
        return zzcraVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zzl(long j10) {
        zzcra zzcraVar = this.zza;
        if (zzcraVar == null || zzcraVar.zzo() == null) {
            return;
        }
        zzcraVar.zzo().zzb(j10);
    }
}
