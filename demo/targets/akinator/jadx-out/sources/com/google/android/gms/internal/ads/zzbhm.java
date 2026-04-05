package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbhm {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbhk zza() {
        return (zzbhk) zza.get();
    }

    public static zzbhl zzb() {
        return (zzbhl) zzb.get();
    }

    public static void zzc(zzbhk zzbhkVar) {
        zza.set(zzbhkVar);
    }
}
