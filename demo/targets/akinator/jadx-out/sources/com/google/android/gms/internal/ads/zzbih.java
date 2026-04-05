package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbih extends zzbam implements zzbii {
    public zzbih() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbii zzh(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof zzbii ? (zzbii) iInterfaceQueryLocalInterface : new zzbig(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                IObjectWrapper iObjectWrapperZzb = zzb();
                parcel2.writeNoException();
                zzban.zze(parcel2, iObjectWrapperZzb);
                return true;
            case 2:
                Uri uriZzc = zzc();
                parcel2.writeNoException();
                zzban.zzd(parcel2, uriZzc);
                return true;
            case 3:
                double dZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzd);
                return true;
            case 4:
                int iZze = zze();
                parcel2.writeNoException();
                parcel2.writeInt(iZze);
                return true;
            case 5:
                int iZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeInt(iZzf);
                return true;
            case 6:
                Map mapZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeMap(mapZzg);
                return true;
            default:
                return false;
        }
    }
}
