package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzec extends zzbam implements zzed {
    public zzec() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzed zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof zzed ? (zzed) iInterfaceQueryLocalInterface : new zzeb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzeg zzeeVar;
        switch (i10) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZza = zzban.zza(parcel);
                zzban.zzh(parcel);
                zzg(zZza);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzh = zzh();
                parcel2.writeNoException();
                int i12 = zzban.zza;
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 5:
                int iZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeInt(iZzi);
                return true;
            case 6:
                float fZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzj);
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzeeVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzeeVar = iInterfaceQueryLocalInterface instanceof zzeg ? (zzeg) iInterfaceQueryLocalInterface : new zzee(strongBinder);
                }
                zzban.zzh(parcel);
                zzl(zzeeVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float fZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzm);
                return true;
            case 10:
                boolean zZzn = zzn();
                parcel2.writeNoException();
                int i13 = zzban.zza;
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                zzeg zzegVarZzo = zzo();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzegVarZzo);
                return true;
            case 12:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i14 = zzban.zza;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 13:
                zzq();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
