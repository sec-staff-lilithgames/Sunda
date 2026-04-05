package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbm extends zzbam implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzb();
        } else {
            if (i10 != 2) {
                return false;
            }
            zze zzeVar = (zze) zzban.zzb(parcel, zze.CREATOR);
            zzban.zzh(parcel);
            zzc(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
