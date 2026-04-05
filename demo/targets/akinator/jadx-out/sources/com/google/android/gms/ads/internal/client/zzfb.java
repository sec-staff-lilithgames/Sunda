package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbyx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfb extends com.google.android.gms.ads.preload.zzb {
    public zzfb(Context context) {
        super(context, AdFormat.REWARDED);
    }

    public final RewardedAd zza(String str) {
        zzbyo zzbyoVarZzq;
        try {
            zzbyoVarZzq = this.zza.zzq(str);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            zzbyoVarZzq = null;
        }
        if (zzbyoVarZzq == null) {
            return null;
        }
        return new zzbyx(zzj(), zzbyoVarZzq);
    }
}
