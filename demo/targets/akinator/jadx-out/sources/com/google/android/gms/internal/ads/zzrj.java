package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzrj implements zzqo {
    public zzrj(zzri zzriVar) {
    }

    public static int zza(int i10, int i11, int i12) {
        return zzgst.zza(((i10 * i11) * i12) / 1000000);
    }

    public static final int zzb(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = 250000;
        if (i12 == 0) {
            int iZza = zza(250000, i14, i13);
            int iZza2 = zza(750000, i14, i13);
            String str = zzep.zza;
            return Math.max(iZza, Math.min(i10 * 4, iZza2));
        }
        if (i12 == 1) {
            return zzgst.zza((zzc(i11) * 50000000) / 1000000);
        }
        if (i11 == 5) {
            i16 = 500000;
        } else if (i11 == 8) {
            i16 = 1000000;
            i11 = 8;
        }
        return zzgst.zza((i16 * (i15 != -1 ? zzgsm.zzb(i15, 8, RoundingMode.CEILING) : zzc(i11))) / 1000000);
    }

    private static int zzc(int i10) {
        int iZzf = zzade.zzf(i10);
        zzgmd.zzh(iZzf != -2147483647);
        return iZzf;
    }
}
