package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbxw extends zzbal implements IInterface {
    public zzbxw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbxv zzbxvVar, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbxvVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdf(2, parcelZza);
    }
}
