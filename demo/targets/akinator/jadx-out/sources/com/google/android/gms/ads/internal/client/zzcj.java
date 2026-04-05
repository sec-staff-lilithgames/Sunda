package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbyo;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzcj extends zzbam implements zzck {
    public zzcj() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzce zzccVar = null;
        zzch zzcfVar = null;
        switch (i10) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzft.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzccVar = iInterfaceQueryLocalInterface instanceof zzce ? (zzce) iInterfaceQueryLocalInterface : new zzcc(strongBinder);
                }
                zzban.zzh(parcel);
                zze(arrayListCreateTypedArrayList, zzccVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                zzban.zzh(parcel);
                boolean zZzf = zzf(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzf ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                zzban.zzh(parcel);
                zzbyo zzbyoVarZzg = zzg(string2);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbyoVarZzg);
                return true;
            case 4:
                String string3 = parcel.readString();
                zzban.zzh(parcel);
                boolean zZzh = zzh(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                zzban.zzh(parcel);
                zzbcn zzbcnVarZzi = zzi(string4);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbcnVarZzi);
                return true;
            case 6:
                String string5 = parcel.readString();
                zzban.zzh(parcel);
                boolean zZzj = zzj(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzj ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                zzban.zzh(parcel);
                zzbx zzbxVarZzk = zzk(string6);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbxVarZzk);
                return true;
            case 8:
                zzbri.zzf(parcel.readStrongBinder());
                zzban.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                zzft zzftVar = (zzft) zzban.zzb(parcel, zzft.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    zzcfVar = iInterfaceQueryLocalInterface2 instanceof zzch ? (zzch) iInterfaceQueryLocalInterface2 : new zzcf(strongBinder2);
                }
                zzban.zzh(parcel);
                boolean zZzm = zzm(string7, zzftVar, zzcfVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzm ? 1 : 0);
                return true;
            case 10:
                int i12 = parcel.readInt();
                String string8 = parcel.readString();
                zzban.zzh(parcel);
                boolean zZzn = zzn(i12, string8);
                parcel2.writeNoException();
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                zzban.zzh(parcel);
                zzbx zzbxVarZzo = zzo(string9);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbxVarZzo);
                return true;
            case 12:
                String string10 = parcel.readString();
                zzban.zzh(parcel);
                zzbcn zzbcnVarZzp = zzp(string10);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbcnVarZzp);
                return true;
            case 13:
                String string11 = parcel.readString();
                zzban.zzh(parcel);
                zzbyo zzbyoVarZzq = zzq(string11);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbyoVarZzq);
                return true;
            case 14:
                int i13 = parcel.readInt();
                String string12 = parcel.readString();
                zzban.zzh(parcel);
                zzft zzftVarZzr = zzr(i13, string12);
                parcel2.writeNoException();
                zzban.zzd(parcel2, zzftVarZzr);
                return true;
            case 15:
                int i14 = parcel.readInt();
                zzban.zzh(parcel);
                Bundle bundleZzs = zzs(i14);
                parcel2.writeNoException();
                zzban.zzd(parcel2, bundleZzs);
                return true;
            case 16:
                int i15 = parcel.readInt();
                String string13 = parcel.readString();
                zzban.zzh(parcel);
                int iZzt = zzt(i15, string13);
                parcel2.writeNoException();
                parcel2.writeInt(iZzt);
                return true;
            case 17:
                int i16 = parcel.readInt();
                String string14 = parcel.readString();
                zzban.zzh(parcel);
                boolean zZzu = zzu(i16, string14);
                parcel2.writeNoException();
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 18:
                int i17 = parcel.readInt();
                zzban.zzh(parcel);
                zzv(i17);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
