package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzkl {
    default void zza(zzpc zzpcVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void zzb(zzkk zzkkVar, zzwv zzwvVar, zzyk[] zzykVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void zzc(zzpc zzpcVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void zzd(zzpc zzpcVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    zzyv zze(zzpc zzpcVar);

    default long zzf(zzpc zzpcVar) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default boolean zzg(zzpc zzpcVar) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean zzh(zzkk zzkkVar) {
        long j10 = zzkkVar.zzd;
        throw null;
    }

    default boolean zzi(zzkk zzkkVar) {
        zzbf zzbfVar = zzkkVar.zzb;
        throw null;
    }

    default boolean zzj(zzpc zzpcVar, zzbf zzbfVar, zzuu zzuuVar, long j10) {
        zzdt.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
