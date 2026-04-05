package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzadi {
    public static boolean zza(zzeg zzegVar, zzadn zzadnVar, int i10, zzadh zzadhVar) {
        int iZzg = zzegVar.zzg();
        long jZzz = zzegVar.zzz();
        long j10 = jZzz >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        long j11 = jZzz >> 12;
        long j12 = jZzz >> 8;
        long j13 = jZzz >> 4;
        long j14 = jZzz >> 1;
        long j15 = jZzz & 1;
        int i11 = (int) (j13 & 15);
        if (i11 <= 7) {
            if (i11 != zzadnVar.zzg - 1) {
                return false;
            }
        } else if (i11 > 10 || zzadnVar.zzg != 2) {
            return false;
        }
        int i12 = (int) (j14 & 7);
        if ((i12 != 0 && i12 != zzadnVar.zzi) || j15 == 1 || !zzd(zzegVar, zzadnVar, z10, zzadhVar)) {
            return false;
        }
        long j16 = zzadhVar.zza;
        int iZzc = zzc(zzegVar, (int) (j11 & 15));
        long j17 = zzadnVar.zzj;
        boolean z11 = j17 == 0 || j16 + ((long) iZzc) >= j17;
        if (iZzc == -1) {
            return false;
        }
        if ((!z11 && iZzc < zzadnVar.zza) || iZzc > zzadnVar.zzb) {
            return false;
        }
        int i13 = zzadnVar.zze;
        int i14 = (int) (j12 & 15);
        if (i14 != 0) {
            if (i14 <= 11) {
                if (i14 != zzadnVar.zzf) {
                    return false;
                }
            } else if (i14 == 12) {
                if (zzegVar.zzs() * 1000 != i13) {
                    return false;
                }
            } else {
                if (i14 > 14) {
                    return false;
                }
                int iZzt = zzegVar.zzt();
                if (i14 == 14) {
                    iZzt *= 10;
                }
                if (iZzt != i13) {
                    return false;
                }
            }
        }
        if (zzegVar.zzs() != zzep.zzJ(zzegVar.zzi(), iZzg, zzegVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzegVar.zzd() != 0) {
            int iZzn = zzegVar.zzn();
            if ((iZzn & 128) != 0) {
                return false;
            }
            int i15 = (iZzn & 126) >> 1;
            if ((i15 >= 2 && i15 <= 7) || (i15 >= 13 && i15 <= 31)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + 57);
                sb2.append("Ignoring frame where first subframe has a reserved type: ");
                sb2.append(i15);
                zzdt.zzb("FlacFrameReader", sb2.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzadb zzadbVar, zzadn zzadnVar) throws IOException {
        zzadbVar.zzl();
        zzadbVar.zzk(1);
        byte[] bArr = new byte[1];
        zzadbVar.zzi(bArr, 0, 1);
        int i10 = bArr[0] & 1;
        boolean z10 = 1 == i10;
        zzadbVar.zzk(2);
        int i11 = 1 != i10 ? 6 : 7;
        zzeg zzegVar = new zzeg(i11);
        zzegVar.zzf(zzade.zzb(zzadbVar, zzegVar.zzi(), 0, i11));
        zzadbVar.zzl();
        zzadh zzadhVar = new zzadh();
        if (zzd(zzegVar, zzadnVar, z10, zzadhVar)) {
            return zzadhVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzeg zzegVar, int i10) {
        switch (i10) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return zzegVar.zzs() + 1;
            case 7:
                return zzegVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return NotificationCompat.FLAG_LOCAL_ONLY << (i10 - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzeg zzegVar, zzadn zzadnVar, boolean z10, zzadh zzadhVar) {
        try {
            long jZzO = zzegVar.zzO();
            if (!z10) {
                jZzO *= zzadnVar.zzb;
            }
            long j10 = zzadnVar.zzj;
            if (j10 != 0 && jZzO > j10) {
                return false;
            }
            zzadhVar.zza = jZzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
