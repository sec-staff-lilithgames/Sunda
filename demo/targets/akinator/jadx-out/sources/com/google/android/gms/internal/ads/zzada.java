package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzada {
    boolean zza(zzadb zzadbVar) throws IOException;

    default List zzb() {
        return zzgpe.zzi();
    }

    void zzc(zzadd zzaddVar);

    int zzd(zzadb zzadbVar, zzaea zzaeaVar) throws IOException;

    void zze(long j10, long j11);

    @SideEffectFree
    default zzada zzf() {
        return this;
    }
}
