package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbwz extends zzbal implements zzbxb {
    public zzbwz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, parcelFileDescriptor);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzbaVar);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbxj zzbxjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, parcelFileDescriptor);
        zzban.zzc(parcelZza, zzbxjVar);
        zzdf(3, parcelZza);
    }
}
