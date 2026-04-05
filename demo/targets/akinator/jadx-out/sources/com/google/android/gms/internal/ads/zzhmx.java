package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhmx {
    public static final zzhmx zza = new zzhmx("NIST_P256", zzhdn.zza);
    public static final zzhmx zzb = new zzhmx("NIST_P384", zzhdn.zzb);
    public static final zzhmx zzc = new zzhmx("NIST_P521", zzhdn.zzc);
    private final String zzd;
    private final ECParameterSpec zze;

    private zzhmx(String str, ECParameterSpec eCParameterSpec) {
        this.zzd = str;
        this.zze = eCParameterSpec;
    }

    public final String toString() {
        return this.zzd;
    }

    public final ECParameterSpec zza() {
        return this.zze;
    }
}
