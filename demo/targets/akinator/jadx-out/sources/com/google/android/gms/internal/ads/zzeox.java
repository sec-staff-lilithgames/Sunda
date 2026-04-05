package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeox implements com.google.android.gms.ads.internal.client.zza, zzdgv {
    private com.google.android.gms.ads.internal.client.zzbh zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbh zzbhVar = this.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzb();
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception at onAdClicked.", e10);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zza = zzbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final synchronized void zzdV() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final synchronized void zzdz() {
        com.google.android.gms.ads.internal.client.zzbh zzbhVar = this.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzb();
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }
}
