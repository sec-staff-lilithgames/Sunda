package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbiy extends zzbam implements zzbiz {
    public zzbiy() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
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
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 9:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                zzban.zzd(parcel2, bundleZzi);
                return true;
            case 10:
                zzj();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzed zzedVarZzk = zzk();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzedVarZzk);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzban.zzb(parcel, Bundle.CREATOR);
                zzban.zzh(parcel);
                zzl(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzban.zzb(parcel, Bundle.CREATOR);
                zzban.zzh(parcel);
                boolean zZzm = zzm(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzm ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzban.zzb(parcel, Bundle.CREATOR);
                zzban.zzh(parcel);
                zzn(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbib zzbibVarZzo = zzo();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbibVarZzo);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperZzp = zzp();
                parcel2.writeNoException();
                zzban.zze(parcel2, iObjectWrapperZzp);
                return true;
            case 17:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            default:
                return false;
        }
    }
}
