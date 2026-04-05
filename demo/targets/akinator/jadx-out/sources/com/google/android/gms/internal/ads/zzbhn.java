package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzbhn implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzbhn zza = new zzbhn();

    private /* synthetic */ zzbhn() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        return iInterfaceQueryLocalInterface instanceof zzbhp ? (zzbhp) iInterfaceQueryLocalInterface : new zzbhp(iBinder);
    }
}
