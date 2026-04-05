package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbju extends zzbal implements zzbjw {
    public zzbju(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zze(zzbkc zzbkcVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbkcVar);
        zzdf(1, parcelZza);
    }
}
