package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzacn {
    public static void zza(long j10, zzeg zzegVar, zzaem[] zzaemVarArr) {
        int iZzB;
        while (true) {
            if (zzegVar.zzd() <= 1) {
                return;
            }
            int iZzc = zzc(zzegVar);
            int iZzc2 = zzc(zzegVar);
            int iZzg = zzegVar.zzg() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzegVar.zzd()) {
                zzdt.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzg = zzegVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzs = zzegVar.zzs();
                int iZzt = zzegVar.zzt();
                if (iZzt == 49) {
                    iZzB = zzegVar.zzB();
                    iZzt = 49;
                } else {
                    iZzB = 0;
                }
                int iZzs2 = zzegVar.zzs();
                if (iZzt == 47) {
                    zzegVar.zzk(1);
                    iZzt = 47;
                }
                boolean z10 = iZzs == 181 && (iZzt == 49 || iZzt == 47) && iZzs2 == 3;
                if (iZzt == 49) {
                    z10 &= iZzB == 1195456820;
                }
                if (z10) {
                    zzb(j10, zzegVar, zzaemVarArr);
                }
            }
            zzegVar.zzh(iZzg);
        }
    }

    public static void zzb(long j10, zzeg zzegVar, zzaem[] zzaemVarArr) {
        int iZzs = zzegVar.zzs();
        if ((iZzs & 64) != 0) {
            int i10 = iZzs & 31;
            zzegVar.zzk(1);
            int iZzg = zzegVar.zzg();
            for (zzaem zzaemVar : zzaemVarArr) {
                int i11 = i10 * 3;
                zzegVar.zzh(iZzg);
                zzaemVar.zzz(zzegVar, i11);
                zzgmd.zzh(j10 != C.TIME_UNSET);
                zzaemVar.zzx(j10, 1, i11, 0, null);
            }
        }
    }

    private static int zzc(zzeg zzegVar) {
        int i10 = 0;
        while (zzegVar.zzd() != 0) {
            int iZzs = zzegVar.zzs();
            i10 += iZzs;
            if (iZzs != 255) {
                return i10;
            }
        }
        return -1;
    }
}
