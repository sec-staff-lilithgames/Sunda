package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbva extends zzbam implements zzbvb {
    public zzbva() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbvb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof zzbvb ? (zzbvb) iInterfaceQueryLocalInterface : new zzbuz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                Intent intent = (Intent) zzban.zzb(parcel, Intent.CREATOR);
                zzban.zzh(parcel);
                zze(intent);
                break;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzban.zzh(parcel);
                zzf(iObjectWrapperAsInterface, string, string2);
                break;
            case 3:
                zzg();
                break;
            case 4:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzh(iObjectWrapperAsInterface2);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzi(strArrCreateStringArray, iArrCreateIntArray, iObjectWrapperAsInterface3);
                break;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzban.zzb(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
                zzban.zzh(parcel);
                zzj(iObjectWrapperAsInterface4, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
