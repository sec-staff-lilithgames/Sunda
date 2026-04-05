package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbxz extends zzbal implements zzbyb {
    public zzbxz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zze() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzf() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzg() throws RemoteException {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzh() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzi(zzbxv zzbxvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbxvVar);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzj() throws RemoteException {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzk(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzl() throws RemoteException {
        zzdf(8, zza());
    }
}
