package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcw extends zzbal implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final zzbrj getAdapterCreator() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        zzbrj zzbrjVarZzf = zzbri.zzf(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbrjVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final zzfc getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzde = zzde(1, zza());
        zzfc zzfcVar = (zzfc) zzban.zzb(parcelZzde, zzfc.CREATOR);
        parcelZzde.recycle();
        return zzfcVar;
    }
}
