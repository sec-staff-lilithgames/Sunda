package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbho {
    private final Context zza;

    public zzbho(Context context) {
        this.zza = context;
    }

    public final void zza(zzbwl zzbwlVar) {
        try {
            ((zzbhp) com.google.android.gms.ads.internal.util.client.zzs.zza(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbhn.zza)).zze(zzbwlVar);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
        } catch (com.google.android.gms.ads.internal.util.client.zzr e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
        }
    }
}
