package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbrq extends zzbal implements zzbrs {
    public zzbrq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final IObjectWrapper zze() throws RemoteException {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzde(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }
}
