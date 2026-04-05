package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbyj extends zzbal implements zzbyl {
    public zzbyj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbyl
    public final String zze() throws RemoteException {
        Parcel parcelZzde = zzde(1, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbyl
    public final int zzf() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        int i10 = parcelZzde.readInt();
        parcelZzde.recycle();
        return i10;
    }
}
