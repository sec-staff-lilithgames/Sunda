package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbdh extends zzbal implements IInterface {
    public zzbdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbdc zze(zzbdf zzbdfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzbdfVar);
        Parcel parcelZzde = zzde(1, parcelZza);
        zzbdc zzbdcVar = (zzbdc) zzban.zzb(parcelZzde, zzbdc.CREATOR);
        parcelZzde.recycle();
        return zzbdcVar;
    }

    public final zzbdc zzf(zzbdf zzbdfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzbdfVar);
        Parcel parcelZzde = zzde(2, parcelZza);
        zzbdc zzbdcVar = (zzbdc) zzban.zzb(parcelZzde, zzbdc.CREATOR);
        parcelZzde.recycle();
        return zzbdcVar;
    }

    public final long zzg(zzbdf zzbdfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzbdfVar);
        Parcel parcelZzde = zzde(3, parcelZza);
        long j10 = parcelZzde.readLong();
        parcelZzde.recycle();
        return j10;
    }
}
