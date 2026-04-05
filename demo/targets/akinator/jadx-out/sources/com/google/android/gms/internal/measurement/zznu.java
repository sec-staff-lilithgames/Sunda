package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zznu {
    public static final /* synthetic */ int zza = 0;
    private static final zznu zzb = new zznu();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzny zzc = new zznd();

    private zznu() {
    }

    public static zznu zza() {
        return zzb;
    }

    public final zznx zzb(Class cls) {
        zzmp.zza(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzd;
        zznx zznxVarZza = (zznx) concurrentMap.get(cls);
        if (zznxVarZza == null) {
            zznxVarZza = this.zzc.zza(cls);
            zzmp.zza(cls, "messageType");
            zznx zznxVar = (zznx) concurrentMap.putIfAbsent(cls, zznxVarZza);
            if (zznxVar != null) {
                return zznxVar;
            }
        }
        return zznxVarZza;
    }
}
