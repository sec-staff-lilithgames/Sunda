package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbcn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeo extends com.google.android.gms.ads.preload.zzb {
    public zzeo(Context context) {
        super(context, AdFormat.APP_OPEN_AD);
    }

    public final AppOpenAd zza(String str) {
        zzbcn zzbcnVarZzp;
        try {
            zzbcnVarZzp = this.zza.zzp(str);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            zzbcnVarZzp = null;
        }
        if (zzbcnVarZzp == null) {
            return null;
        }
        return new zzbcj(zzbcnVarZzp);
    }
}
