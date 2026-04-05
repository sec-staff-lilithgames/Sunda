package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbcs extends zzbal implements zzbcu {
    public zzbcs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbcu
    public final void zzc() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbcu
    public final void zzd() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbcu
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzeVar);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcu
    public final void zzf() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbcu
    public final void zzg() throws RemoteException {
        zzdf(5, zza());
    }
}
