package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzcar extends zzbam implements zzcas {
    public zzcar() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcas zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzcas ? (zzcas) iInterfaceQueryLocalInterface : new zzcaq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzcap zzcanVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcaw zzcawVar = (zzcaw) zzban.zzb(parcel, zzcaw.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcanVar = iInterfaceQueryLocalInterface instanceof zzcap ? (zzcap) iInterfaceQueryLocalInterface : new zzcan(strongBinder);
                }
                zzban.zzh(parcel);
                zze(iObjectWrapperAsInterface, zzcawVar, zzcanVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzf(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                parcel2.writeNoException();
                zzban.zze(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                parcel2.writeNoException();
                zzban.zze(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvx zzbvxVarZzb = zzbvw.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzg(arrayListCreateTypedArrayList, iObjectWrapperAsInterface3, zzbvxVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvx zzbvxVarZzb2 = zzbvw.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzh(arrayListCreateTypedArrayList2, iObjectWrapperAsInterface4, zzbvxVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbwa zzbwaVar = (zzbwa) zzban.zzb(parcel, zzbwa.CREATOR);
                zzban.zzh(parcel);
                zzi(zzbwaVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzj(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvx zzbvxVarZzb3 = zzbvw.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzk(arrayListCreateTypedArrayList3, iObjectWrapperAsInterface6, zzbvxVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvx zzbvxVarZzb4 = zzbvw.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzl(arrayListCreateTypedArrayList4, iObjectWrapperAsInterface7, zzbvxVarZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                IObjectWrapper iObjectWrapperZzm = zzm(iObjectWrapperAsInterface8, iObjectWrapperAsInterface9, string, iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                zzban.zze(parcel2, iObjectWrapperZzm);
                return true;
            default:
                return false;
        }
    }
}
