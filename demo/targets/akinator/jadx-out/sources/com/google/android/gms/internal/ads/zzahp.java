package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzahp implements zzahu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzahp(long[] jArr, long[] jArr2, long j10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10 == C.TIME_UNSET ? zzep.zzq(jArr2[jArr2.length - 1]) : j10;
    }

    public static zzahp zzd(long j10, zzagt zzagtVar, long j11) {
        int length = zzagtVar.zzd.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += zzagtVar.zzb + r0[i12];
            j12 += zzagtVar.zzc + zzagtVar.zze[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new zzahp(jArr, jArr2, j11);
    }

    private static Pair zzh(long j10, long[] jArr, long[] jArr2) {
        int iZzm = zzep.zzm(jArr, j10, true, true);
        long j11 = jArr[iZzm];
        long j12 = jArr2[iZzm];
        int i10 = iZzm + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final zzaeb zzc(long j10) {
        String str = zzep.zza;
        Pair pairZzh = zzh(zzep.zzp(Math.max(0L, Math.min(j10, this.zzc))), this.zzb, this.zza);
        zzaee zzaeeVar = new zzaee(zzep.zzq(((Long) pairZzh.first).longValue()), ((Long) pairZzh.second).longValue());
        return new zzaeb(zzaeeVar, zzaeeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zze(long j10) {
        return zzep.zzq(((Long) zzh(j10, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final long zzf() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final int zzg() {
        return -2147483647;
    }
}
