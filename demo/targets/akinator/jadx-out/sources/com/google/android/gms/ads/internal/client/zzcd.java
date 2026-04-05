package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzcd extends zzbam implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzft zzftVar = (zzft) zzban.zzb(parcel, zzft.CREATOR);
            zzban.zzh(parcel);
            zze(zzftVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzft zzftVar2 = (zzft) zzban.zzb(parcel, zzft.CREATOR);
            zzban.zzh(parcel);
            zzf(zzftVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
