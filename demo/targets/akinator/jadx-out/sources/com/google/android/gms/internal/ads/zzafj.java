package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzafj extends zzacm {
    public zzafj(final zzadn zzadnVar, int i10, long j10, long j11) {
        long j12;
        Objects.requireNonNull(zzadnVar);
        zzacj zzacjVar = new zzacj() { // from class: com.google.android.gms.internal.ads.zzafh
            @Override // com.google.android.gms.internal.ads.zzacj
            public final /* synthetic */ long zza(long j13) {
                return zzadnVar.zzb(j13);
            }
        };
        zzafi zzafiVar = new zzafi(zzadnVar, i10, null);
        long jZza = zzadnVar.zza();
        long j13 = zzadnVar.zzj;
        int i11 = zzadnVar.zzd;
        if (i11 > 0) {
            j12 = ((i11 + zzadnVar.zzc) / 2) + 1;
        } else {
            int i12 = zzadnVar.zza;
            long j14 = 4096;
            if (i12 == zzadnVar.zzb && i12 > 0) {
                j14 = i12;
            }
            j12 = 64 + (((j14 * zzadnVar.zzg) * zzadnVar.zzh) / 8);
        }
        super(zzacjVar, zzafiVar, jZza, 0L, j13, j10, j11, j12, Math.max(6, zzadnVar.zzc));
    }
}
