package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.internal.ads.zzbos;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzep extends com.google.android.gms.ads.preload.zzb {
    public zzep(Context context) {
        super(context, AdFormat.INTERSTITIAL);
    }

    public final InterstitialAd zza(String str) {
        zzbx zzbxVarZzo;
        try {
            zzbxVarZzo = this.zza.zzo(str);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            zzbxVarZzo = null;
        }
        if (zzbxVarZzo == null) {
            return null;
        }
        return new zzbos(zzj(), zzbxVarZzo);
    }
}
