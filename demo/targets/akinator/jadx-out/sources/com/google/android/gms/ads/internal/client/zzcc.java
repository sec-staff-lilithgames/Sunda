package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzban;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcc extends zzbal implements zzce {
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(zzft zzftVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzftVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(zzft zzftVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzftVar);
        zzdf(2, parcelZza);
    }
}
