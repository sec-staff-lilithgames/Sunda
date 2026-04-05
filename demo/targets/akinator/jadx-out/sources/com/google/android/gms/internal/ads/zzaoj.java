package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaoj implements zzaok {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzadd zzc;
    private final zzaem zzd;
    private final zzaoo zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzeg zzh;
    private final int zzi;
    private final zzv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaoj(zzadd zzaddVar, zzaem zzaemVar, zzaoo zzaooVar) throws zzat {
        this.zzc = zzaddVar;
        this.zzd = zzaemVar;
        this.zze = zzaooVar;
        int iMax = Math.max(1, zzaooVar.zzc / 10);
        this.zzi = iMax;
        zzeg zzegVar = new zzeg(zzaooVar.zzf);
        zzegVar.zzu();
        int iZzu = zzegVar.zzu();
        this.zzf = iZzu;
        int i10 = zzaooVar.zzb;
        int i11 = zzaooVar.zzd;
        int iA = a.b.a(i11 - (i10 * 4), 8, zzaooVar.zze * i10, 1);
        if (iZzu != iA) {
            throw zzat.zzb(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(iA, iZzu, "Expected frames per block: ", "; got: ", new StringBuilder(String.valueOf(iA).length() + 34 + String.valueOf(iZzu).length())), null);
        }
        String str = zzep.zza;
        int i12 = ((iMax + iZzu) - 1) / iZzu;
        this.zzg = new byte[i11 * i12];
        this.zzh = new zzeg((iZzu + iZzu) * i10 * i12);
        int i13 = ((zzaooVar.zzc * zzaooVar.zzd) * 8) / iZzu;
        zzt zztVar = new zzt();
        zztVar.zzm(MimeTypes.AUDIO_RAW);
        zztVar.zzh(i13);
        zztVar.zzi(i13);
        zztVar.zzn((iMax + iMax) * i10);
        zztVar.zzE(zzaooVar.zzb);
        zztVar.zzF(zzaooVar.zzc);
        zztVar.zzG(2);
        this.zzj = zztVar.zzM();
    }

    private final void zzd(int i10) {
        long jZzt = this.zzl + zzep.zzt(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int iZzf = zzf(i10);
        this.zzd.zzx(jZzt, 1, iZzf, this.zzm - iZzf, null);
        this.zzn += i10;
        this.zzm -= iZzf;
    }

    private final int zze(int i10) {
        int i11 = this.zze.zzb;
        return i10 / (i11 + i11);
    }

    private final int zzf(int i10) {
        return (i10 + i10) * this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaok
    public final void zza(long j10) {
        this.zzk = 0;
        this.zzl = j10;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaok
    public final void zzb(int i10, long j10) {
        this.zzc.zzw(new zzaor(this.zze, this.zzf, i10, j10));
        this.zzd.zzu(this.zzj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzaok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadb r25, long r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoj.zzc(com.google.android.gms.internal.ads.zzadb, long):boolean");
    }
}
