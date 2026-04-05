package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbxc extends zzbal implements IInterface {
    public zzbxc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(String str, zzbwt zzbwtVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzban.zzc(parcelZza, zzbwtVar);
        zzdf(1, parcelZza);
    }

    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzbaVar);
        zzdf(2, parcelZza);
    }
}
