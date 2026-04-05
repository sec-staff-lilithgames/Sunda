package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbjh extends zzbal implements zzbjj {
    public zzbjh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zze(zzbiz zzbizVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbizVar);
        zzdf(1, parcelZza);
    }
}
