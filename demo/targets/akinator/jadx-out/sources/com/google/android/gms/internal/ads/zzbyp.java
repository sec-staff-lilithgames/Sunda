package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbyp extends zzbal implements zzbyr {
    public zzbyp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zze() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzf() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzg(zzbyl zzbylVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbylVar);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzh(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdf(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzeVar);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzj() throws RemoteException {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzk() throws RemoteException {
        zzdf(7, zza());
    }
}
