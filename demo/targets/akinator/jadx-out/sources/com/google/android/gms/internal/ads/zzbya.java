package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import ao.kwoC.zAQQWzBxnS;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbya extends zzbam implements zzbyb {
    public static zzbyb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(zAQQWzBxnS.YukIrmEwQB);
        return iInterfaceQueryLocalInterface instanceof zzbyb ? (zzbyb) iInterfaceQueryLocalInterface : new zzbxz(iBinder);
    }
}
