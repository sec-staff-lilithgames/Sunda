package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzel extends zzar implements IInterface {
    public zzel(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    public final void zze() throws RemoteException {
        zzl(2, zza());
    }

    public final void zzf(Map map, long j10, String str, List list) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeMap(map);
        parcelZza.writeLong(j10);
        parcelZza.writeString(str);
        parcelZza.writeTypedList(list);
        zzl(1, parcelZza);
    }
}
