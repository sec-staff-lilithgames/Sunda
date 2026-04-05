package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbsu extends zzbal implements zzbsw {
    public zzbsu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzeVar);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzh(zzbrs zzbrsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbrsVar);
        zzdf(4, parcelZza);
    }
}
