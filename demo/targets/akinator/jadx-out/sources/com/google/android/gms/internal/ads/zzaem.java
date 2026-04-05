package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzaem {
    void zzu(zzv zzvVar);

    int zzv(zzj zzjVar, int i10, boolean z10, int i11) throws IOException;

    void zzw(zzeg zzegVar, int i10, int i11);

    void zzx(long j10, int i10, int i11, int i12, zzael zzaelVar);

    default int zzy(zzj zzjVar, int i10, boolean z10) throws IOException {
        return zzv(zzjVar, i10, z10, 0);
    }

    default void zzz(zzeg zzegVar, int i10) {
        zzw(zzegVar, i10, 0);
    }
}
