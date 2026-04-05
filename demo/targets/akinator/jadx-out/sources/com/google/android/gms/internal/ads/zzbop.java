package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbop extends zzbal implements zzbor {
    public zzbop(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zze(zzbol zzbolVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbolVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzf(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzeVar);
        zzdf(3, parcelZza);
    }
}
