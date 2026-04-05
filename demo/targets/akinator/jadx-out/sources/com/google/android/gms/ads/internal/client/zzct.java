package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzban;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzct extends zzbal implements zzcv {
    public zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final void zzb(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzeVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final void zzc() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final void zzd() throws RemoteException {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final void zze() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final void zzf() throws RemoteException {
        zzdf(5, zza());
    }
}
