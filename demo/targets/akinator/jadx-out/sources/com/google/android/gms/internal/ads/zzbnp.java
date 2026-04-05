package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbnp extends zzbal implements IInterface {
    public zzbnp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbnj zzbnjVar, zzbno zzbnoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzbnjVar);
        zzban.zze(parcelZza, zzbnoVar);
        zzdg(2, parcelZza);
    }
}
