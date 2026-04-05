package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbri extends zzbam implements zzbrj {
    public zzbri() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbrj zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbrj ? (zzbrj) iInterfaceQueryLocalInterface : new zzbrh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            zzban.zzh(parcel);
            zzbrm zzbrmVarZzb = zzb(string);
            parcel2.writeNoException();
            zzban.zze(parcel2, zzbrmVarZzb);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            zzban.zzh(parcel);
            boolean zZzc = zzc(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzc ? 1 : 0);
        } else if (i10 == 3) {
            String string3 = parcel.readString();
            zzban.zzh(parcel);
            zzbti zzbtiVarZze = zze(string3);
            parcel2.writeNoException();
            zzban.zze(parcel2, zzbtiVarZze);
        } else {
            if (i10 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzban.zzh(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzd ? 1 : 0);
        }
        return true;
    }
}
