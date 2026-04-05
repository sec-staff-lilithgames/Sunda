package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfsz extends zzbal implements IInterface {
    public zzfsz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfsx zze(zzfsv zzfsvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzfsvVar);
        Parcel parcelZzde = zzde(1, parcelZza);
        zzfsx zzfsxVar = (zzfsx) zzban.zzb(parcelZzde, zzfsx.CREATOR);
        parcelZzde.recycle();
        return zzfsxVar;
    }

    public final void zzf(zzfss zzfssVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzfssVar);
        zzdf(2, parcelZza);
    }

    public final zzftg zzg(zzfte zzfteVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzfteVar);
        Parcel parcelZzde = zzde(3, parcelZza);
        zzftg zzftgVar = (zzftg) zzban.zzb(parcelZzde, zzftg.CREATOR);
        parcelZzde.recycle();
        return zzftgVar;
    }
}
