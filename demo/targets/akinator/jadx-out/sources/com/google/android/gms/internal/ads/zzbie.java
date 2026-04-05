package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbie extends zzbam implements zzbif {
    public zzbie() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbjq zzbjqVar;
        switch (i10) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzf(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperZzg = zzg();
                parcel2.writeNoException();
                zzban.zze(parcel2, iObjectWrapperZzg);
                return true;
            case 5:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 6:
                float fZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzi);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzed zzedVarZzj = zzj();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzedVarZzj);
                return true;
            case 8:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                int i12 = zzban.zza;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbjqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbjqVar = iInterfaceQueryLocalInterface instanceof zzbjq ? (zzbjq) iInterfaceQueryLocalInterface : new zzbjq(strongBinder);
                }
                zzban.zzh(parcel);
                zzm(zzbjqVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i13 = zzban.zza;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
