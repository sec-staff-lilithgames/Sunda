package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbnz extends zzbam implements zzboa {
    public zzbnz() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzboa zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof zzboa ? (zzboa) iInterfaceQueryLocalInterface : new zzbny(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            zze();
        } else {
            if (i10 != 3) {
                return false;
            }
            String string = parcel.readString();
            zzban.zzh(parcel);
            zzf(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
