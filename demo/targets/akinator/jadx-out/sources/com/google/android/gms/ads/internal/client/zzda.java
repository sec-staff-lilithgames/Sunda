package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrj;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzda extends zzbam implements zzdb {
    public zzda() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzdn zzdlVar;
        switch (i10) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                zzban.zzh(parcel);
                zzf(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzban.zzh(parcel);
                zzg(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZza = zzban.zza(parcel);
                zzban.zzh(parcel);
                zzh(zZza);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzban.zzh(parcel);
                zzi(iObjectWrapperAsInterface, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzj(string3, iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i12 = zzban.zza;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzban.zzh(parcel);
                zzn(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbrj zzbrjVarZzf = zzbri.zzf(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzo(zzbrjVarZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbod zzbodVarZzc = zzboc.zzc(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzp(zzbodVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzq);
                return true;
            case 14:
                zzfv zzfvVar = (zzfv) zzban.zzb(parcel, zzfv.CREATOR);
                zzban.zzh(parcel);
                zzr(zzfvVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzdlVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdlVar = iInterfaceQueryLocalInterface instanceof zzdn ? (zzdn) iInterfaceQueryLocalInterface : new zzdl(strongBinder);
                }
                zzban.zzh(parcel);
                zzt(zzdlVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zZza2 = zzban.zza(parcel);
                zzban.zzh(parcel);
                zzu(zZza2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                zzban.zzh(parcel);
                zzv(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
