package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzahw {
    public final zzadw zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzahw(zzadw zzadwVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.zza = new zzadw(zzadwVar);
        this.zzb = j10;
        this.zzc = j11;
        this.zzf = jArr;
        this.zzd = i10;
        this.zze = i11;
    }

    public static zzahw zza(zzadw zzadwVar, zzeg zzegVar) {
        long[] jArr;
        int i10;
        int i11;
        int iZzB = zzegVar.zzB();
        int iZzH = (iZzB & 1) != 0 ? zzegVar.zzH() : -1;
        long jZzz = (iZzB & 2) != 0 ? zzegVar.zzz() : -1L;
        if ((iZzB & 4) == 4) {
            jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = zzegVar.zzs();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iZzB & 8) != 0) {
            zzegVar.zzk(4);
        }
        if (zzegVar.zzd() >= 24) {
            zzegVar.zzk(21);
            int iZzx = zzegVar.zzx();
            i11 = iZzx & 4095;
            i10 = iZzx >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new zzahw(zzadwVar, iZzH, jZzz, jArr2, i10, i11);
    }

    public final long zzb() {
        long j10 = this.zzb;
        if (j10 == -1 || j10 == 0) {
            return C.TIME_UNSET;
        }
        return zzep.zzr((j10 * r4.zzg) - 1, this.zza.zzd);
    }
}
