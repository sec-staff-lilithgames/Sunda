package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzanu implements zzacl {
    private final zzem zza;
    private final zzeg zzb = new zzeg();
    private final int zzc;

    public zzanu(int i10, zzem zzemVar, int i11) {
        this.zzc = i10;
        this.zza = zzemVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final zzack zza(zzadb zzadbVar, long j10) throws IOException {
        int iZza;
        int iZza2;
        long jZzn = zzadbVar.zzn();
        int iMin = (int) Math.min(112800L, zzadbVar.zzo() - jZzn);
        zzeg zzegVar = this.zzb;
        zzegVar.zza(iMin);
        zzadbVar.zzi(zzegVar.zzi(), 0, iMin);
        int iZze = zzegVar.zze();
        long j11 = -1;
        long j12 = -9223372036854775807L;
        long j13 = -1;
        while (zzegVar.zzd() >= 188 && (iZza2 = (iZza = zzaog.zza(zzegVar.zzi(), zzegVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzaog.zzb(zzegVar, iZza, this.zzc);
            if (jZzb != C.TIME_UNSET) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j10) {
                    return j12 == C.TIME_UNSET ? zzack.zza(jZze, jZzn) : zzack.zzc(jZzn + j13);
                }
                j13 = iZza;
                if (100000 + jZze > j10) {
                    return zzack.zzc(jZzn + j13);
                }
                j12 = jZze;
            }
            zzegVar.zzh(iZza2);
            j11 = iZza2;
        }
        return j12 != C.TIME_UNSET ? zzack.zzb(j12, jZzn + j11) : zzack.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zzb() {
        byte[] bArr = zzep.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
