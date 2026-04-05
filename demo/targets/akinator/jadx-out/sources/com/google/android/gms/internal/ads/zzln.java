package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzln extends zzli {
    String zzS();

    default long zzT(long j10, long j11) {
        if (zze() == 1) {
            return (zzY() || zzZ()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    default boolean zzU(long j10) {
        return false;
    }

    void zzX(long j10, long j11) throws zzib;

    boolean zzY();

    boolean zzZ();

    int zza();

    zzlp zzb();

    void zzc(int i10, zzpc zzpcVar, zzdc zzdcVar);

    void zzcY() throws zzib;

    void zzcZ(zzv[] zzvVarArr, zzwk zzwkVar, long j10, long j11, zzuu zzuuVar) throws zzib;

    zzko zzd();

    zzwk zzda();

    boolean zzdb();

    int zze();

    void zzf(zzlq zzlqVar, zzv[] zzvVarArr, zzwk zzwkVar, long j10, boolean z10, boolean z11, long j11, long j12, zzuu zzuuVar) throws zzib;

    long zzk();

    void zzl();

    boolean zzm();

    void zzn() throws IOException;

    void zzo(zzbf zzbfVar);

    void zzp(long j10, boolean z10) throws zzib;

    void zzq();

    void zzr();

    void zzs();

    default void zzW() {
    }

    default void zzt() {
    }

    default void zzV(float f10, float f11) throws zzib {
    }
}
