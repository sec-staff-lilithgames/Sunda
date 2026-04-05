package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzheu {
    private static final zzheu zzb = new zzheu();
    private final Map zza = new HashMap();

    public static zzheu zza() {
        return zzb;
    }

    public final synchronized void zzb(zzhet zzhetVar, Class cls) throws GeneralSecurityException {
        try {
            Map map = this.zza;
            zzhet zzhetVar2 = (zzhet) map.get(cls);
            if (zzhetVar2 != null && !zzhetVar2.equals(zzhetVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, zzhetVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
