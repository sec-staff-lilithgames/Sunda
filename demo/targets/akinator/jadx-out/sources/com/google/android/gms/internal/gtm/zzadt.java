package com.google.android.gms.internal.gtm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzadt {
    public static final /* synthetic */ int zza = 0;
    private static final zzadt zzb = new zzadt();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzady zzc = new zzadd();

    private zzadt() {
    }

    public static zzadt zza() {
        return zzb;
    }

    public final zzadx zzb(Class cls) {
        zzaco.zzc(cls, "messageType");
        zzadx zzadxVar = (zzadx) this.zzd.get(cls);
        if (zzadxVar != null) {
            return zzadxVar;
        }
        zzadx zzadxVarZza = this.zzc.zza(cls);
        zzaco.zzc(cls, "messageType");
        zzadx zzadxVar2 = (zzadx) this.zzd.putIfAbsent(cls, zzadxVarZza);
        return zzadxVar2 == null ? zzadxVarZza : zzadxVar2;
    }
}
