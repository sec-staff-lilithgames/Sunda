package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhdp {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzhdp(Map map, Map map2, byte[] bArr) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzhdo zza() {
        return new zzhdo(null);
    }

    public final Enum zzb(Object obj) throws GeneralSecurityException {
        Enum r02 = (Enum) this.zzb.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum r32) throws GeneralSecurityException {
        Object obj = this.zza.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}
