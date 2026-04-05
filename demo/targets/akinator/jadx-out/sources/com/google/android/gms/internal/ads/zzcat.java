package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcat extends zzbal implements zzcav {
    public zzcat(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final zzcas zze(IObjectWrapper iObjectWrapper, zzbrj zzbrjVar, int i10) throws RemoteException {
        zzcas zzcaqVar;
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbrjVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(2, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzcaqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcaqVar = iInterfaceQueryLocalInterface instanceof zzcas ? (zzcas) iInterfaceQueryLocalInterface : new zzcaq(strongBinder);
        }
        parcelZzde.recycle();
        return zzcaqVar;
    }
}
