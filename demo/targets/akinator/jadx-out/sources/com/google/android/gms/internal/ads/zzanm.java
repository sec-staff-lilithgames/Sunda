package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzanm {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzem zza = new zzem(0);
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private final zzeg zzb = new zzeg();

    public static long zze(zzeg zzegVar) {
        int iZzg = zzegVar.zzg();
        if (zzegVar.zzd() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        zzegVar.zzm(bArr, 0, 9);
        zzegVar.zzh(iZzg);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return C.TIME_UNSET;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return C.TIME_UNSET;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return C.TIME_UNSET;
        }
        long j10 = b10;
        long j11 = b11;
        long j12 = (248 & j11) >> 3;
        long j13 = (j11 & 3) << 13;
        return j13 | ((bArr[1] & 255) << 20) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (j12 << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
    }

    private final int zzf(zzadb zzadbVar) {
        byte[] bArr = zzep.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzadbVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzem zzb() {
        return this.zza;
    }

    public final int zzc(zzadb zzadbVar, zzaea zzaeaVar) throws IOException {
        boolean z10 = this.zze;
        long j10 = C.TIME_UNSET;
        if (!z10) {
            long jZzo = zzadbVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j11 = jZzo - iMin;
            if (zzadbVar.zzn() != j11) {
                zzaeaVar.zza = j11;
                return 1;
            }
            zzeg zzegVar = this.zzb;
            zzegVar.zza(iMin);
            zzadbVar.zzl();
            zzadbVar.zzi(zzegVar.zzi(), 0, iMin);
            int iZzg = zzegVar.zzg();
            int iZze = zzegVar.zze() - 4;
            while (true) {
                if (iZze < iZzg) {
                    break;
                }
                if (zzg(zzegVar.zzi(), iZze) == 442) {
                    zzegVar.zzh(iZze + 4);
                    long jZze = zze(zzegVar);
                    if (jZze != C.TIME_UNSET) {
                        j10 = jZze;
                        break;
                    }
                }
                iZze--;
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        }
        if (this.zzg == C.TIME_UNSET) {
            zzf(zzadbVar);
            return 0;
        }
        if (this.zzd) {
            long j12 = this.zzf;
            if (j12 == C.TIME_UNSET) {
                zzf(zzadbVar);
                return 0;
            }
            zzem zzemVar = this.zza;
            this.zzh = zzemVar.zzf(this.zzg) - zzemVar.zze(j12);
            zzf(zzadbVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzadbVar.zzo());
        if (zzadbVar.zzn() != 0) {
            zzaeaVar.zza = 0L;
            return 1;
        }
        zzeg zzegVar2 = this.zzb;
        zzegVar2.zza(iMin2);
        zzadbVar.zzl();
        zzadbVar.zzi(zzegVar2.zzi(), 0, iMin2);
        int iZzg2 = zzegVar2.zzg();
        int iZze2 = zzegVar2.zze();
        while (true) {
            if (iZzg2 >= iZze2 - 3) {
                break;
            }
            if (zzg(zzegVar2.zzi(), iZzg2) == 442) {
                zzegVar2.zzh(iZzg2 + 4);
                long jZze2 = zze(zzegVar2);
                if (jZze2 != C.TIME_UNSET) {
                    j10 = jZze2;
                    break;
                }
            }
            iZzg2++;
        }
        this.zzf = j10;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
