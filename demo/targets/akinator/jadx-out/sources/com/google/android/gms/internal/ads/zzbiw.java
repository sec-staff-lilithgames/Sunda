package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbiw extends zzbam implements zzbix {
    public zzbiw() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                IObjectWrapper iObjectWrapperZzb = zzb();
                parcel2.writeNoException();
                zzban.zze(parcel2, iObjectWrapperZzb);
                return true;
            case 3:
                String strZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 4:
                List listZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeList(listZzd);
                return true;
            case 5:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 6:
                zzbii zzbiiVarZzf = zzf();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbiiVarZzf);
                return true;
            case 7:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 8:
                double dZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzh);
                return true;
            case 9:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 10:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 11:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                zzban.zzd(parcel2, bundleZzk);
                return true;
            case 12:
                zzl();
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzed zzedVarZzm = zzm();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzedVarZzm);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzban.zzb(parcel, Bundle.CREATOR);
                zzban.zzh(parcel);
                zzn(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzban.zzb(parcel, Bundle.CREATOR);
                zzban.zzh(parcel);
                boolean zZzo = zzo(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzban.zzb(parcel, Bundle.CREATOR);
                zzban.zzh(parcel);
                zzp(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                zzbib zzbibVarZzq = zzq();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbibVarZzq);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperZzr = zzr();
                parcel2.writeNoException();
                zzban.zze(parcel2, iObjectWrapperZzr);
                return true;
            case 19:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            default:
                return false;
        }
    }
}
