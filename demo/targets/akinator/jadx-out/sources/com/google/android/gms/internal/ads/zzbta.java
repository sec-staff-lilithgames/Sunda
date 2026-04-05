package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbta extends zzbal implements zzbtc {
    public zzbta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zze(zzbry zzbryVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbryVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzeVar);
        zzdf(3, parcelZza);
    }
}
