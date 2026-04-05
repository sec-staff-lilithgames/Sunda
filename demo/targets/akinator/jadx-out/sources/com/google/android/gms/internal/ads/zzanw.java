package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzanw {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzem zza = new zzem(0);
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private final zzeg zzb = new zzeg();

    public zzanw(int i10) {
    }

    private final int zze(zzadb zzadbVar) {
        byte[] bArr = zzep.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzadbVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzadb zzadbVar, zzaea zzaeaVar, int i10) throws IOException {
        if (i10 <= 0) {
            zze(zzadbVar);
            return 0;
        }
        boolean z10 = this.zze;
        long j10 = C.TIME_UNSET;
        if (z10) {
            if (this.zzg == C.TIME_UNSET) {
                zze(zzadbVar);
                return 0;
            }
            if (this.zzd) {
                long j11 = this.zzf;
                if (j11 == C.TIME_UNSET) {
                    zze(zzadbVar);
                    return 0;
                }
                zzem zzemVar = this.zza;
                this.zzh = zzemVar.zzf(this.zzg) - zzemVar.zze(j11);
                zze(zzadbVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzadbVar.zzo());
            if (zzadbVar.zzn() != 0) {
                zzaeaVar.zza = 0L;
                return 1;
            }
            zzeg zzegVar = this.zzb;
            zzegVar.zza(iMin);
            zzadbVar.zzl();
            zzadbVar.zzi(zzegVar.zzi(), 0, iMin);
            int iZzg = zzegVar.zzg();
            int iZze = zzegVar.zze();
            while (true) {
                if (iZzg >= iZze) {
                    break;
                }
                if (zzegVar.zzi()[iZzg] == 71) {
                    long jZzb = zzaog.zzb(zzegVar, iZzg, i10);
                    if (jZzb != C.TIME_UNSET) {
                        j10 = jZzb;
                        break;
                    }
                }
                iZzg++;
            }
            this.zzf = j10;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzadbVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j12 = jZzo - iMin2;
        if (zzadbVar.zzn() != j12) {
            zzaeaVar.zza = j12;
            return 1;
        }
        zzeg zzegVar2 = this.zzb;
        zzegVar2.zza(iMin2);
        zzadbVar.zzl();
        zzadbVar.zzi(zzegVar2.zzi(), 0, iMin2);
        int iZzg2 = zzegVar2.zzg();
        int iZze2 = zzegVar2.zze();
        int i11 = iZze2 - 188;
        while (true) {
            if (i11 < iZzg2) {
                break;
            }
            byte[] bArrZzi = zzegVar2.zzi();
            int i12 = -4;
            int i13 = 0;
            while (true) {
                if (i12 > 4) {
                    break;
                }
                int i14 = (i12 * 188) + i11;
                if (i14 < iZzg2 || i14 >= iZze2 || bArrZzi[i14] != 71) {
                    i13 = 0;
                } else {
                    i13++;
                    if (i13 == 5) {
                        long jZzb2 = zzaog.zzb(zzegVar2, i11, i10);
                        if (jZzb2 != C.TIME_UNSET) {
                            j10 = jZzb2;
                            break;
                        }
                    }
                }
                i12++;
            }
            i11--;
        }
        this.zzg = j10;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzem zzd() {
        return this.zza;
    }
}
