package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhyj {
    private static final zzhyj zza = new zzhyj();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzhys zzb = new zzhxq();

    private zzhyj() {
    }

    public static zzhyj zza() {
        return zza;
    }

    public final zzhyr zzb(Class cls) {
        zzhxb.zza(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzc;
        zzhyr zzhyrVarZza = (zzhyr) concurrentMap.get(cls);
        if (zzhyrVarZza == null) {
            zzhyrVarZza = this.zzb.zza(cls);
            zzhxb.zza(cls, "messageType");
            zzhyr zzhyrVar = (zzhyr) concurrentMap.putIfAbsent(cls, zzhyrVarZza);
            if (zzhyrVar != null) {
                return zzhyrVar;
            }
        }
        return zzhyrVarZza;
    }
}
