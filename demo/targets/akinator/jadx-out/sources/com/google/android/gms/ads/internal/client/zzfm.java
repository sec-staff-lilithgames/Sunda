package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbrj;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfm extends zzda {
    private zzbod zza;

    public final /* synthetic */ void zzb() {
        zzbod zzbodVar = this.zza;
        if (zzbodVar != null) {
            try {
                zzbodVar.zzb(Collections.EMPTY_LIST);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onComplete event.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zze() throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final float zzk() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final boolean zzl() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzm() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(zzbod zzbodVar) throws RemoteException {
        this.zza = zzbodVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzq() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzf(float f10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzg(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzh(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbrj zzbrjVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(zzfv zzfvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(zzdn zzdnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzv(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }
}
