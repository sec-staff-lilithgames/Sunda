package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbyl;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbyw;
import com.google.android.gms.internal.ads.zzbzc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfq extends zzbyn {
    private static void zzu(final zzbyv zzbyvVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbyv zzbyvVar2 = zzbyvVar;
                if (zzbyvVar2 != null) {
                    try {
                        zzbyvVar2.zzf(1);
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzc(zzm zzmVar, zzbyv zzbyvVar) throws RemoteException {
        zzu(zzbyvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzd(zzm zzmVar, zzbyv zzbyvVar) throws RemoteException {
        zzu(zzbyvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final Bundle zzg() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final boolean zzi() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final String zzj() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final zzbyl zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final zzea zzm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final String zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final long zzq() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zze(zzbyr zzbyrVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzf(zzdq zzdqVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzh(zzbzc zzbzcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzo(zzdt zzdtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzp(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzr(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzs(zzbyw zzbywVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z10) {
    }
}
