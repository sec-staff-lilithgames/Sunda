package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfpi {
    private final String zza;
    private final String zzb;

    private zzfpi(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfpi zza(String str, String str2) {
        zzfqs.zzc(str, "Name is null or empty");
        zzfqs.zzc(str2, "Version is null or empty");
        return new zzfpi(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
