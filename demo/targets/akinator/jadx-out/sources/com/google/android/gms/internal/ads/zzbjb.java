package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbjb extends zzbam implements zzbjc {
    public zzbjb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbjc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof zzbjc ? (zzbjc) iInterfaceQueryLocalInterface : new zzbja(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                String string = parcel.readString();
                zzban.zzh(parcel);
                String strZze = zze(string);
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzban.zzh(parcel);
                zzbii zzbiiVarZzf = zzf(string2);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbiiVarZzf);
                return true;
            case 3:
                List<String> listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzg);
                return true;
            case 4:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzban.zzh(parcel);
                zzi(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzed zzedVarZzk = zzk();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzedVarZzk);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper iObjectWrapperZzm = zzm();
                parcel2.writeNoException();
                zzban.zze(parcel2, iObjectWrapperZzm);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                boolean zZzn = zzn(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzban.zze(parcel2, null);
                return true;
            case 12:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i12 = zzban.zza;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 13:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                int i13 = zzban.zza;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzq(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzr();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbif zzbifVarZzs = zzs();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbifVarZzs);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                boolean zZzt = zzt(iObjectWrapperAsInterface3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
