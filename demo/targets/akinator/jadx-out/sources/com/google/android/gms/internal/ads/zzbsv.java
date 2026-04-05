package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbsv extends zzbam implements zzbsw {
    public zzbsv() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzban.zzh(parcel);
            zze(iObjectWrapperAsInterface);
        } else if (i10 == 2) {
            String string = parcel.readString();
            zzban.zzh(parcel);
            zzf(string);
        } else if (i10 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzban.zzh(parcel);
            zzg(zzeVar);
        } else {
            if (i10 != 4) {
                return false;
            }
            zzbrs zzbrsVarZzb = zzbrr.zzb(parcel.readStrongBinder());
            zzban.zzh(parcel);
            zzh(zzbrsVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
