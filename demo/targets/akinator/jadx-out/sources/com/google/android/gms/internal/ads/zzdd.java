package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.regex.Pattern;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdd {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static String zza(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String zzb(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        int i14;
        Object[] objArr = {zzc[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(true != z10 ? 'L' : 'H'), Integer.valueOf(i13)};
        String str = zzep.zza;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i15 = 6;
        while (true) {
            if (i15 <= 0) {
                break;
            }
            int i16 = i15 - 1;
            if (iArr[i16] != 0) {
                break;
            }
            i15 = i16;
        }
        for (i14 = 0; i14 < i15; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static String zzc(byte[] bArr) {
        int length = bArr.length;
        zzgmd.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b10 = bArr[0];
        zzgmd.zzd(b10 == 1, "Invalid APV CSD version: %s", b10);
        byte b11 = bArr[5];
        byte b12 = bArr[6];
        byte b13 = bArr[7];
        String str = zzep.zza;
        Locale locale = Locale.US;
        StringBuilder sbF = i.f(b11, b12, "apv1.apvf", ".apvl", ".apvb");
        sbF.append((int) b13);
        return sbF.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x03fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair zzd(com.google.android.gms.internal.ads.zzv r26) {
        /*
            Method dump skipped, instructions count: 2060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdd.zzd(com.google.android.gms.internal.ads.zzv):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair zze(java.lang.String r8, java.lang.String[] r9, com.google.android.gms.internal.ads.zzi r10) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdd.zze(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.zzi):android.util.Pair");
    }

    public static byte[] zzf(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }
}
