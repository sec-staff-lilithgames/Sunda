package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzwe {
    private final zzyv zza;
    private final zzeg zzb = new zzeg(32);
    private zzwd zzc;
    private zzwd zzd;
    private zzwd zze;
    private long zzf;

    public zzwe(zzyv zzyvVar) {
        this.zza = zzyvVar;
        zzwd zzwdVar = new zzwd(0L, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.zzc = zzwdVar;
        this.zzd = zzwdVar;
        this.zze = zzwdVar;
    }

    private final int zzi(int i10) {
        zzwd zzwdVar = this.zze;
        if (zzwdVar.zzc == null) {
            zzyt zzytVarZza = this.zza.zza();
            zzwd zzwdVar2 = new zzwd(this.zze.zzb, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            zzwdVar.zzc = zzytVarZza;
            zzwdVar.zzd = zzwdVar2;
        }
        return Math.min(i10, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i10) {
        long j10 = this.zzf + i10;
        this.zzf = j10;
        zzwd zzwdVar = this.zze;
        if (j10 == zzwdVar.zzb) {
            this.zze = zzwdVar.zzd;
        }
    }

    private static zzwd zzk(zzwd zzwdVar, zzhh zzhhVar, zzwf zzwfVar, zzeg zzegVar) {
        zzwd zzwdVarZzm;
        if (zzhhVar.zzk()) {
            long j10 = zzwfVar.zzb;
            int iZzt = 1;
            zzegVar.zza(1);
            zzwd zzwdVarZzm2 = zzm(zzwdVar, j10, zzegVar.zzi(), 1);
            long j11 = j10 + 1;
            byte b10 = zzegVar.zzi()[0];
            int i10 = b10 & 128;
            int i11 = b10 & AbstractJsonLexerKt.TC_INVALID;
            zzhe zzheVar = zzhhVar.zzb;
            byte[] bArr = zzheVar.zza;
            if (bArr == null) {
                zzheVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = i10 != 0;
            zzwdVarZzm = zzm(zzwdVarZzm2, j11, zzheVar.zza, i11);
            long j12 = j11 + i11;
            if (z10) {
                zzegVar.zza(2);
                zzwdVarZzm = zzm(zzwdVarZzm, j12, zzegVar.zzi(), 2);
                j12 += 2;
                iZzt = zzegVar.zzt();
            }
            int i12 = iZzt;
            int[] iArr = zzheVar.zzd;
            if (iArr == null || iArr.length < i12) {
                iArr = new int[i12];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzheVar.zze;
            if (iArr3 == null || iArr3.length < i12) {
                iArr3 = new int[i12];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i13 = i12 * 6;
                zzegVar.zza(i13);
                zzwdVarZzm = zzm(zzwdVarZzm, j12, zzegVar.zzi(), i13);
                j12 += i13;
                zzegVar.zzh(0);
                for (int i14 = 0; i14 < i12; i14++) {
                    iArr2[i14] = zzegVar.zzt();
                    iArr4[i14] = zzegVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwfVar.zza - ((int) (j12 - zzwfVar.zzb));
            }
            zzael zzaelVar = zzwfVar.zzc;
            String str = zzep.zza;
            zzheVar.zza(i12, iArr2, iArr4, zzaelVar.zzb, zzheVar.zza, zzaelVar.zza, zzaelVar.zzc, zzaelVar.zzd);
            long j13 = zzwfVar.zzb;
            int i15 = (int) (j12 - j13);
            zzwfVar.zzb = j13 + i15;
            zzwfVar.zza -= i15;
        } else {
            zzwdVarZzm = zzwdVar;
        }
        if (!zzhhVar.zze()) {
            zzhhVar.zzj(zzwfVar.zza);
            return zzl(zzwdVarZzm, zzwfVar.zzb, zzhhVar.zzc, zzwfVar.zza);
        }
        zzegVar.zza(4);
        zzwd zzwdVarZzm3 = zzm(zzwdVarZzm, zzwfVar.zzb, zzegVar.zzi(), 4);
        int iZzH = zzegVar.zzH();
        zzwfVar.zzb += 4;
        zzwfVar.zza -= 4;
        zzhhVar.zzj(iZzH);
        zzwd zzwdVarZzl = zzl(zzwdVarZzm3, zzwfVar.zzb, zzhhVar.zzc, iZzH);
        zzwfVar.zzb += iZzH;
        int i16 = zzwfVar.zza - iZzH;
        zzwfVar.zza = i16;
        ByteBuffer byteBuffer = zzhhVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i16) {
            zzhhVar.zzf = ByteBuffer.allocate(i16);
        } else {
            zzhhVar.zzf.clear();
        }
        return zzl(zzwdVarZzl, zzwfVar.zzb, zzhhVar.zzf, zzwfVar.zza);
    }

    private static zzwd zzl(zzwd zzwdVar, long j10, ByteBuffer byteBuffer, int i10) {
        zzwd zzwdVarZzn = zzn(zzwdVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (zzwdVarZzn.zzb - j10));
            byteBuffer.put(zzwdVarZzn.zzc.zza, zzwdVarZzn.zzb(j10), iMin);
            i10 -= iMin;
            j10 += iMin;
            if (j10 == zzwdVarZzn.zzb) {
                zzwdVarZzn = zzwdVarZzn.zzd;
            }
        }
        return zzwdVarZzn;
    }

    private static zzwd zzm(zzwd zzwdVar, long j10, byte[] bArr, int i10) {
        zzwd zzwdVarZzn = zzn(zzwdVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (zzwdVarZzn.zzb - j10));
            System.arraycopy(zzwdVarZzn.zzc.zza, zzwdVarZzn.zzb(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += iMin;
            if (j10 == zzwdVarZzn.zzb) {
                zzwdVarZzn = zzwdVarZzn.zzd;
            }
        }
        return zzwdVarZzn;
    }

    private static zzwd zzn(zzwd zzwdVar, long j10) {
        while (j10 >= zzwdVar.zzb) {
            zzwdVar = zzwdVar.zzd;
        }
        return zzwdVar;
    }

    public final void zza() {
        zzwd zzwdVar = this.zzc;
        if (zzwdVar.zzc != null) {
            this.zza.zzc(zzwdVar);
            zzwdVar.zzc();
        }
        this.zzc.zza(0L, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        zzwd zzwdVar2 = this.zzc;
        this.zzd = zzwdVar2;
        this.zze = zzwdVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zzhh zzhhVar, zzwf zzwfVar) {
        this.zzd = zzk(this.zzd, zzhhVar, zzwfVar, this.zzb);
    }

    public final void zzd(zzhh zzhhVar, zzwf zzwfVar) {
        zzk(this.zzd, zzhhVar, zzwfVar, this.zzb);
    }

    public final void zze(long j10) {
        zzwd zzwdVar;
        if (j10 != -1) {
            while (true) {
                zzwdVar = this.zzc;
                if (j10 < zzwdVar.zzb) {
                    break;
                }
                this.zza.zzb(zzwdVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzwdVar.zza) {
                this.zzd = zzwdVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i10, boolean z10) throws IOException {
        int iZzi = zzi(i10);
        zzwd zzwdVar = this.zze;
        int iZza = zzjVar.zza(zzwdVar.zzc.zza, zzwdVar.zzb(this.zzf), iZzi);
        if (iZza != -1) {
            zzj(iZza);
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzeg zzegVar, int i10) {
        while (i10 > 0) {
            int iZzi = zzi(i10);
            zzwd zzwdVar = this.zze;
            zzegVar.zzm(zzwdVar.zzc.zza, zzwdVar.zzb(this.zzf), iZzi);
            i10 -= iZzi;
            zzj(iZzi);
        }
    }
}
