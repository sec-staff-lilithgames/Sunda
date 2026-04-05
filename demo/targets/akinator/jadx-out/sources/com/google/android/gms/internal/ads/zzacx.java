package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzacx implements zzaem {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaem
    public final int zzv(zzj zzjVar, int i10, boolean z10, int i11) throws IOException {
        int iZza = zzjVar.zza(this.zza, 0, Math.min(4096, i10));
        if (iZza != -1) {
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzw(zzeg zzegVar, int i10, int i11) {
        zzegVar.zzk(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzu(zzv zzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzx(long j10, int i10, int i11, int i12, zzael zzaelVar) {
    }
}
