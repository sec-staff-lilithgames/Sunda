package com.google.android.gms.internal.ads;

import e3.g;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfm {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i10) {
        int i11;
        synchronized (zzc) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        int i14 = i12 + 1;
                        if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12 = i14;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i13) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = zzd[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i20 = i19 + 1;
                bArr[i19] = 0;
                i16 = i19 + 2;
                bArr[i20] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i11 - i16);
        }
        return i11;
    }

    public static int zzb(zzv zzvVar) {
        String str = zzvVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            return 1;
        }
        return (Objects.equals(str, "video/hevc") || zzas.zze(zzvVar.zzk, "video/hevc")) ? 2 : 0;
    }

    public static boolean zzc(byte[] bArr, int i10, int i11, zzv zzvVar) {
        String str = zzvVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) != 0) {
                return true;
            }
            int i12 = b10 & 31;
            return (i12 == 1 || i12 == 9 || i12 == 14) ? false : true;
        }
        if (Objects.equals(str, "video/hevc")) {
            zzfa zzfaVarZzk = zzk(new zzfn(bArr, 4, i11 + 4));
            int i13 = zzfaVarZzk.zza;
            if (i13 == 35) {
                return false;
            }
            return (i13 <= 14 && i13 % 2 == 0 && zzfaVarZzk.zzc == zzvVar.zzF + (-1)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0187 A[PHI: r2
      0x0187: PHI (r2v30 int) = (r2v4 int), (r2v3 int) binds: [B:92:0x018d, B:88:0x0183] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018b A[PHI: r2
      0x018b: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v31 int) binds: [B:78:0x016f, B:80:0x0173, B:82:0x0177, B:84:0x017b, B:86:0x017f, B:89:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfl zzd(byte[] r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfm.zzd(byte[], int, int):com.google.android.gms.internal.ads.zzfl");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x05f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfj zze(byte[] r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 2155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfm.zze(byte[], int, int):com.google.android.gms.internal.ads.zzfj");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzfg zzf(byte[] r36, int r37, int r38, com.google.android.gms.internal.ads.zzfj r39) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfm.zzf(byte[], int, int, com.google.android.gms.internal.ads.zzfj):com.google.android.gms.internal.ads.zzfg");
    }

    public static zzfk zzg(byte[] bArr, int i10, int i11) {
        zzfn zzfnVar = new zzfn(bArr, 4, i11);
        int iZzg = zzfnVar.zzg();
        int iZzg2 = zzfnVar.zzg();
        zzfnVar.zza();
        return new zzfk(iZzg, iZzg2, zzfnVar.zze());
    }

    public static int zzh(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        zzgmd.zzh(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            zzi(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            zzi(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            zzi(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    zzi(zArr);
                    return i15;
                }
                i14 = i15;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static void zzi(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String zzj(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i11 = zzgpe.zzd;
                zzgpb zzgpbVar = new zzgpb();
                int i12 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i12 >= length2) {
                        break;
                    }
                    int iZzh = zzh(bArr, i12, length2, zArr);
                    if (iZzh != length2) {
                        zzgpbVar.zzf(Integer.valueOf(iZzh));
                    }
                    i12 = iZzh + 3;
                }
                zzgpe zzgpeVarZzi = zzgpbVar.zzi();
                for (int i13 = 0; i13 < zzgpeVarZzi.size(); i13++) {
                    if (((Integer) zzgpeVarZzi.get(i13)).intValue() + 3 < length) {
                        zzfn zzfnVar = new zzfn(bArr, ((Integer) zzgpeVarZzi.get(i13)).intValue() + 3, length);
                        zzfa zzfaVarZzk = zzk(zzfnVar);
                        if (zzfaVarZzk.zza == 33 && zzfaVarZzk.zzb == 0) {
                            zzfnVar.zzb(4);
                            int iZzf = zzfnVar.zzf(3);
                            zzfnVar.zza();
                            zzfb zzfbVarZzl = zzl(zzfnVar, true, iZzf, null);
                            return zzdd.zzb(zzfbVarZzl.zza, zzfbVarZzl.zzb, zzfbVarZzl.zzc, zzfbVarZzl.zzd, zzfbVarZzl.zze, zzfbVarZzl.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static zzfa zzk(zzfn zzfnVar) {
        zzfnVar.zza();
        return new zzfa(zzfnVar.zzf(6), zzfnVar.zzf(6), zzfnVar.zzf(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzfb zzl(com.google.android.gms.internal.ads.zzfn r18, boolean r19, int r20, com.google.android.gms.internal.ads.zzfb r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.zzf(r2)
            boolean r7 = r0.zze()
            r8 = 5
            int r8 = r0.zzf(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.zze()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.zzf(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.zza
            boolean r7 = r2.zzb
            int r8 = r2.zzc
            int r10 = r2.zzd
            int[] r4 = r2.zze
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.zzf(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.zze()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.zze()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.zzb(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.zzb(r5)
        L79:
            com.google.android.gms.internal.ads.zzfb r11 = new com.google.android.gms.internal.ads.zzfb
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfm.zzl(com.google.android.gms.internal.ads.zzfn, boolean, int, com.google.android.gms.internal.ads.zzfb):com.google.android.gms.internal.ads.zzfb");
    }

    private static int zzm(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return g.B(i12, i13, i14, i10);
    }

    private static int zzn(int i10, int i11, int i12, int i13) {
        return g.B(i12, i13, i11 == 1 ? 2 : 1, i10);
    }

    private static void zzo(zzfn zzfnVar) {
        int iZzg = zzfnVar.zzg() + 1;
        zzfnVar.zzb(8);
        for (int i10 = 0; i10 < iZzg; i10++) {
            zzfnVar.zzg();
            zzfnVar.zzg();
            zzfnVar.zza();
        }
        zzfnVar.zzb(20);
    }
}
