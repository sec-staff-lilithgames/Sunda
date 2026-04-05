package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbp extends zzbam implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzm zzmVar = (zzm) zzban.zzb(parcel, zzm.CREATOR);
            zzban.zzh(parcel);
            zze(zzmVar);
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else if (i10 == 3) {
            boolean zZzg = zzg();
            parcel2.writeNoException();
            int i12 = zzban.zza;
            parcel2.writeInt(zZzg ? 1 : 0);
        } else if (i10 == 4) {
            String strZzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(strZzh);
        } else {
            if (i10 != 5) {
                return false;
            }
            zzm zzmVar2 = (zzm) zzban.zzb(parcel, zzm.CREATOR);
            int i13 = parcel.readInt();
            zzban.zzh(parcel);
            zzi(zzmVar2, i13);
            parcel2.writeNoException();
        }
        return true;
    }
}
