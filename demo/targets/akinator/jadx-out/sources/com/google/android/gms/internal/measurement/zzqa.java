package com.google.android.gms.internal.measurement;

import mh.e3;
import mh.v2;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzqa implements v2 {
    private static final zzqa zza = new zzqa();
    private final v2 zzb = e3.ofInstance(new zzqc());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @Override // mh.v2
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzqb get() {
        return (zzqb) this.zzb.get();
    }
}
