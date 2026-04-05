package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzenj {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdsy zzb;

    public zzenj(zzdsy zzdsyVar) {
        this.zzb = zzdsyVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e10);
        }
    }

    public final zzbti zzb(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbti) concurrentHashMap.get(str);
        }
        return null;
    }
}
