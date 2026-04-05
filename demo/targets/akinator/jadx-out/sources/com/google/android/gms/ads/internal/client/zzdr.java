package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzban;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdr extends zzbal implements zzdt {
    public zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zztVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }
}
