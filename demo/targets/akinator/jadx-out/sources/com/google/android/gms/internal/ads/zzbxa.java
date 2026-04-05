package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbxa extends zzbam implements zzbxb {
    public zzbxa() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzban.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzban.zzh(parcel);
            zze(parcelFileDescriptor);
        } else if (i10 == 2) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzban.zzb(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            zzban.zzh(parcel);
            zzf(zzbaVar);
        } else {
            if (i10 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzban.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbxj zzbxjVar = (zzbxj) zzban.zzb(parcel, zzbxj.CREATOR);
            zzban.zzh(parcel);
            zzg(parcelFileDescriptor2, zzbxjVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
