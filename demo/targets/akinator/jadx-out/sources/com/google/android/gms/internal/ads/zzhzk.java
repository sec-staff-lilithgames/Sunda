package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhzk {
    public static /* synthetic */ boolean zza(byte b10) {
        return b10 >= 0;
    }

    public static /* synthetic */ boolean zzb(byte b10) {
        return b10 < -32;
    }

    public static /* synthetic */ boolean zzc(byte b10) {
        return b10 < -16;
    }

    public static /* synthetic */ void zzd(byte b10, byte b11, char[] cArr, int i10) throws zzhxd {
        if (b10 < -62 || zzg(b11)) {
            throw new zzhxd("Protocol message had invalid UTF-8.");
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & Utf8.REPLACEMENT_BYTE));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void zze(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.ads.zzhxd {
        /*
            boolean r0 = zzg(r3)
            if (r0 != 0) goto L2c
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L2c
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L2c
            r2 = r1
        L16:
            boolean r0 = zzg(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            com.google.android.gms.internal.ads.zzhxd r2 = new com.google.android.gms.internal.ads.zzhxd
            java.lang.String r3 = "Protocol message had invalid UTF-8."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhzk.zze(byte, byte, byte, char[], int):void");
    }

    public static /* synthetic */ void zzf(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzhxd {
        if (!zzg(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !zzg(b12) && !zzg(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & Utf8.REPLACEMENT_BYTE) << 12) | ((b12 & Utf8.REPLACEMENT_BYTE) << 6) | (b13 & Utf8.REPLACEMENT_BYTE);
                cArr[i10] = (char) ((i11 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i10 + 1] = (char) ((i11 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw new zzhxd("Protocol message had invalid UTF-8.");
    }

    private static boolean zzg(byte b10) {
        return b10 > -65;
    }
}
