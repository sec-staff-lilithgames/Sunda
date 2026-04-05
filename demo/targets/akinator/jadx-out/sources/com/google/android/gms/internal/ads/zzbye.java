package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbye extends zzbal implements zzbyg {
    public zzbye(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final void zzf(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final void zzk(IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zzc(parcelZza, zzbyhVar);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final void zzm(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i10);
        zzdf(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(13, parcelZza);
    }
}
