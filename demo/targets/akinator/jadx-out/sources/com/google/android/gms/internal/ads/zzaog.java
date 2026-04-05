package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaog {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzeg zzegVar, int i10, int i11) {
        zzegVar.zzh(i10);
        if (zzegVar.zzd() < 5) {
            return C.TIME_UNSET;
        }
        int iZzB = zzegVar.zzB();
        if ((8388608 & iZzB) != 0 || ((iZzB >> 8) & 8191) != i11 || (iZzB & 32) == 0 || zzegVar.zzs() < 7 || zzegVar.zzd() < 7 || (zzegVar.zzs() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        zzegVar.zzm(bArr, 0, 6);
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = bArr[3] & 255;
        return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((bArr[4] & 255) >> 7);
    }
}
