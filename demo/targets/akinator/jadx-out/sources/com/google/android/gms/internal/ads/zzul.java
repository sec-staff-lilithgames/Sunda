package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzul {
    private static final AtomicLong zza = new AtomicLong();

    public zzul(long j10, zzgf zzgfVar, Uri uri, Map map, long j11, long j12, long j13) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }

    public zzul(long j10, zzgf zzgfVar, long j11) {
        Uri uri = zzgfVar.zza;
    }
}
