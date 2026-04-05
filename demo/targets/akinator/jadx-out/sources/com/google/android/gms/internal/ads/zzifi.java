package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzifi implements zzifh, zzifb {
    private static final zzifi zza = new zzifi(null);
    private final Object zzb;

    private zzifi(Object obj) {
        this.zzb = obj;
    }

    public static zzifh zza(Object obj) {
        zzifp.zza(obj, "instance cannot be null");
        return new zzifi(obj);
    }

    public static zzifh zzc(Object obj) {
        return obj == null ? zza : new zzifi(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final Object zzb() {
        return this.zzb;
    }
}
