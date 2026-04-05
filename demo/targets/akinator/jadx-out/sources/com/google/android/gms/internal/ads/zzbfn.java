package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbfn extends zzbal implements zzbfp {
    public zzbfn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfp
    public final void zze(zzbfm zzbfmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbfmVar);
        zzdf(1, parcelZza);
    }
}
