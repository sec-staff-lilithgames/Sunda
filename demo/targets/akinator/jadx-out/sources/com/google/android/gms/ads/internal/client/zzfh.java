package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfh extends zzbp {
    final /* synthetic */ zzfi zza;

    public /* synthetic */ zzfh(zzfi zzfiVar, byte[] bArr) {
        Objects.requireNonNull(zzfiVar);
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zze(zzm zzmVar) throws RemoteException {
        zzi(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final String zzf() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final boolean zzg() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final String zzh() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzm zzmVar, int i10) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzfg(this));
    }
}
