package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbjs extends zzbam implements zzbjt {
    public zzbjs() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbjt zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzbjt ? (zzbjt) iInterfaceQueryLocalInterface : new zzbjr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        com.google.android.gms.ads.internal.client.zzbx zzbxVarZzZ = com.google.android.gms.ads.internal.client.zzbw.zzZ(parcel.readStrongBinder());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        zzban.zzh(parcel);
        zze(zzbxVarZzZ, iObjectWrapperAsInterface);
        parcel2.writeNoException();
        return true;
    }
}
