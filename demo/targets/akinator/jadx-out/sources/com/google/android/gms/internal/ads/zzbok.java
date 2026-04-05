package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbok extends zzbam implements zzbol {
    public zzbok() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzboo zzbomVar;
        if (i10 == 3) {
            com.google.android.gms.ads.internal.client.zzed zzedVarZzb = zzb();
            parcel2.writeNoException();
            zzban.zze(parcel2, zzedVarZzb);
            return true;
        }
        if (i10 == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 5) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbomVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbomVar = iInterfaceQueryLocalInterface instanceof zzboo ? (zzboo) iInterfaceQueryLocalInterface : new zzbom(strongBinder);
            }
            zzban.zzh(parcel);
            zzd(iObjectWrapperAsInterface, zzbomVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 6) {
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzban.zzh(parcel);
            zze(iObjectWrapperAsInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 7) {
            return false;
        }
        zzbif zzbifVarZzf = zzf();
        parcel2.writeNoException();
        zzban.zze(parcel2, zzbifVarZzf);
        return true;
    }
}
