package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhew {
    private static final zzhew zza = new zzhew();
    private static final zzhev zzb = new zzhev(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzhew zza() {
        return zza;
    }

    public final zzhen zzb() {
        zzhen zzhenVar = (zzhen) this.zzc.get();
        return zzhenVar == null ? zzb : zzhenVar;
    }
}
