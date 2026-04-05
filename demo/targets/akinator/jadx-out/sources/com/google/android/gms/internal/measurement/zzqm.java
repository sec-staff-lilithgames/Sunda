package com.google.android.gms.internal.measurement;

import mh.e3;
import mh.v2;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzqm implements v2 {
    private static final zzqm zza = new zzqm();
    private final v2 zzb = e3.ofInstance(new zzqo());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @SideEffectFree
    public static long zzb() {
        return zza.get().zzb();
    }

    @SideEffectFree
    public static double zzc() {
        return zza.get().zzc();
    }

    @SideEffectFree
    public static long zzd() {
        return zza.get().zzd();
    }

    @SideEffectFree
    public static long zze() {
        return zza.get().zze();
    }

    @SideEffectFree
    public static String zzf() {
        return zza.get().zzf();
    }

    @Override // mh.v2
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzqn get() {
        return (zzqn) this.zzb.get();
    }
}
