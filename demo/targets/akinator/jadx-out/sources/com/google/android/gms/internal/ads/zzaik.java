package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaik {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzep.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i10) {
        return (i10 >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        r26 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0cd6  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0cd8  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0e6a  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0ed3  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0efe  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List zzb(com.google.android.gms.internal.ads.zzeu r88, com.google.android.gms.internal.ads.zzads r89, long r90, com.google.android.gms.internal.ads.zzq r92, boolean r93, boolean r94, com.google.android.gms.internal.ads.zzglu r95, boolean r96) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 3853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zzb(com.google.android.gms.internal.ads.zzeu, com.google.android.gms.internal.ads.zzads, long, com.google.android.gms.internal.ads.zzq, boolean, boolean, com.google.android.gms.internal.ads.zzglu, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzap zzc(com.google.android.gms.internal.ads.zzev r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zzc(com.google.android.gms.internal.ads.zzev):com.google.android.gms.internal.ads.zzap");
    }

    public static zzey zzd(zzeg zzegVar) {
        long jZzD;
        long jZzD2;
        zzegVar.zzh(8);
        if (zza(zzegVar.zzB()) == 0) {
            jZzD = zzegVar.zzz();
            jZzD2 = zzegVar.zzz();
        } else {
            jZzD = zzegVar.zzD();
            jZzD2 = zzegVar.zzD();
        }
        return new zzey(jZzD, jZzD2, zzegVar.zzz());
    }

    public static zzap zze(zzeu zzeuVar) {
        zzes zzesVar;
        zzev zzevVarZzc = zzeuVar.zzc(1751411826);
        zzev zzevVarZzc2 = zzeuVar.zzc(1801812339);
        zzev zzevVarZzc3 = zzeuVar.zzc(1768715124);
        if (zzevVarZzc != null && zzevVarZzc2 != null && zzevVarZzc3 != null && zzi(zzevVarZzc.zza) == 1835299937) {
            zzeg zzegVar = zzevVarZzc2.zza;
            zzegVar.zzh(12);
            int iZzB = zzegVar.zzB();
            String[] strArr = new String[iZzB];
            for (int i10 = 0; i10 < iZzB; i10++) {
                int iZzB2 = zzegVar.zzB();
                zzegVar.zzk(4);
                strArr[i10] = zzegVar.zzK(iZzB2 - 8, StandardCharsets.UTF_8);
            }
            zzeg zzegVar2 = zzevVarZzc3.zza;
            zzegVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzegVar2.zzd() > 8) {
                int iZzB3 = zzegVar2.zzB() + zzegVar2.zzg();
                int iZzB4 = zzegVar2.zzB() - 1;
                if (iZzB4 < 0 || iZzB4 >= iZzB) {
                    com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.s(new StringBuilder(String.valueOf(iZzB4).length() + 41), "Skipped metadata with unknown key index: ", iZzB4, "BoxParsers");
                } else {
                    String str = strArr[iZzB4];
                    while (true) {
                        int iZzg = zzegVar2.zzg();
                        if (iZzg >= iZzB3) {
                            zzesVar = null;
                            break;
                        }
                        int iZzB5 = zzegVar2.zzB();
                        if (zzegVar2.zzB() == 1684108385) {
                            int iZzB6 = zzegVar2.zzB();
                            int iZzB7 = zzegVar2.zzB();
                            int i11 = iZzB5 - 16;
                            byte[] bArr = new byte[i11];
                            zzegVar2.zzm(bArr, 0, i11);
                            zzesVar = new zzes(str, bArr, iZzB7, iZzB6);
                            break;
                        }
                        zzegVar2.zzh(iZzg + iZzB5);
                    }
                    if (zzesVar != null) {
                        arrayList.add(zzesVar);
                    }
                }
                zzegVar2.zzh(iZzB3);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzeg zzegVar) {
        int iZzg = zzegVar.zzg();
        zzegVar.zzk(4);
        if (zzegVar.zzB() != 1751411826) {
            iZzg += 4;
        }
        zzegVar.zzh(iZzg);
    }

    private static zzap zzh(zzeg zzegVar) {
        short sZzv = zzegVar.zzv();
        zzegVar.zzk(2);
        String strZzK = zzegVar.zzK(sZzv, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzK.lastIndexOf(43), strZzK.lastIndexOf(45));
        try {
            return new zzap(C.TIME_UNSET, new zzex(Float.parseFloat(strZzK.substring(0, iMax)), Float.parseFloat(strZzK.substring(iMax, strZzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzi(zzeg zzegVar) {
        zzegVar.zzh(16);
        return zzegVar.zzB();
    }

    private static String zzj(byte[] bArr, int i10, int i11) {
        zzgmd.zzh(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i12 = 0; i12 < bArr.length - 3; i12 += 4) {
            int iZze = zzgst.zze(bArr[i12], bArr[i12 + 1], bArr[i12 + 2], bArr[i12 + 3]);
            String str = zzep.zza;
            int i13 = ((iZze >> 8) & 255) - 128;
            int i14 = (iZze >> 16) & 255;
            int i15 = (iZze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i15 * 17790) / 10000) + i14, 255)) | (Math.max(0, Math.min(((i13 * 14075) / 10000) + i14, 255)) << 16) | (Math.max(0, Math.min((i14 - ((i15 * 3455) / 10000)) - ((i13 * 7169) / 10000), 255)) << 8))));
        }
        String strZzd = zzglx.zzd(arrayList, ", ");
        StringBuilder sb2 = new StringBuilder(o2.C(o2.C(String.valueOf(i10).length() + 7, 10, String.valueOf(i11)), 1, strZzd));
        sb2.append("size: ");
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        return a.b.o(sb2, "\npalette: ", strZzd, "\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzi zzk(com.google.android.gms.internal.ads.zzeg r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zzk(com.google.android.gms.internal.ads.zzeg):com.google.android.gms.internal.ads.zzi");
    }

    private static zzi zzl(zzeg zzegVar) {
        zzh zzhVar = new zzh();
        byte[] bArrZzi = zzegVar.zzi();
        zzef zzefVar = new zzef(bArrZzi, bArrZzi.length);
        zzefVar.zzf(zzegVar.zzg() * 8);
        zzefVar.zzo(1);
        int iZzj = zzefVar.zzj(8);
        for (int i10 = 0; i10 < iZzj; i10++) {
            zzefVar.zzo(1);
            int iZzj2 = zzefVar.zzj(8);
            for (int i11 = 0; i11 < iZzj2; i11++) {
                zzefVar.zzh(6);
                boolean zZzi = zzefVar.zzi();
                zzefVar.zzg();
                zzefVar.zzo(11);
                zzefVar.zzh(4);
                int iZzj3 = zzefVar.zzj(4) + 8;
                zzhVar.zze(iZzj3);
                zzhVar.zzf(iZzj3);
                zzefVar.zzo(1);
                if (zZzi) {
                    int iZzj4 = zzefVar.zzj(8);
                    int iZzj5 = zzefVar.zzj(8);
                    zzefVar.zzo(1);
                    boolean zZzi2 = zzefVar.zzi();
                    zzhVar.zza(zzi.zzb(iZzj4));
                    zzhVar.zzb(true != zZzi2 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(iZzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair zzn(zzeu zzeuVar) {
        zzev zzevVarZzc = zzeuVar.zzc(1701606260);
        if (zzevVarZzc == null) {
            return null;
        }
        zzeg zzegVar = zzevVarZzc.zza;
        zzegVar.zzh(8);
        int iZza = zza(zzegVar.zzB());
        int iZzH = zzegVar.zzH();
        long[] jArr = new long[iZzH];
        long[] jArr2 = new long[iZzH];
        for (int i10 = 0; i10 < iZzH; i10++) {
            jArr[i10] = iZza == 1 ? zzegVar.zzJ() : zzegVar.zzz();
            jArr2[i10] = iZza == 1 ? zzegVar.zzD() : zzegVar.zzB();
            if (zzegVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzegVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzo(com.google.android.gms.internal.ads.zzeg r38, int r39, int r40, int r41, int r42, java.lang.String r43, boolean r44, com.google.android.gms.internal.ads.zzq r45, com.google.android.gms.internal.ads.zzaig r46, int r47) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zzo(com.google.android.gms.internal.ads.zzeg, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzq, com.google.android.gms.internal.ads.zzaig, int):void");
    }

    private static zzaib zzp(zzeg zzegVar, int i10) {
        zzegVar.zzh(i10 + 12);
        zzegVar.zzk(1);
        zzs(zzegVar);
        zzegVar.zzk(2);
        int iZzs = zzegVar.zzs();
        if ((iZzs & 128) != 0) {
            zzegVar.zzk(2);
        }
        if ((iZzs & 64) != 0) {
            zzegVar.zzk(zzegVar.zzs());
        }
        if ((iZzs & 32) != 0) {
            zzegVar.zzk(2);
        }
        zzegVar.zzk(1);
        zzs(zzegVar);
        String strZzf = zzas.zzf(zzegVar.zzs());
        if (MimeTypes.AUDIO_MPEG.equals(strZzf) || MimeTypes.AUDIO_DTS.equals(strZzf) || MimeTypes.AUDIO_DTS_HD.equals(strZzf)) {
            return new zzaib(strZzf, null, -1L, -1L);
        }
        zzegVar.zzk(4);
        long jZzz = zzegVar.zzz();
        long jZzz2 = zzegVar.zzz();
        zzegVar.zzk(1);
        int iZzs2 = zzs(zzegVar);
        long j10 = jZzz2;
        byte[] bArr = new byte[iZzs2];
        zzegVar.zzm(bArr, 0, iZzs2);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new zzaib(strZzf, bArr, j10, jZzz > 0 ? jZzz : -1L);
    }

    private static zzahz zzq(zzeg zzegVar, int i10) {
        zzegVar.zzh(i10 + 8);
        zzegVar.zzk(4);
        return new zzahz(zzegVar.zzz(), zzegVar.zzz());
    }

    private static Pair zzr(zzeg zzegVar, int i10, int i11) throws zzat {
        Integer num;
        zzajg zzajgVar;
        Pair pairCreate;
        int i12;
        int i13;
        Integer num2;
        boolean z10;
        int iZzg = zzegVar.zzg();
        while (iZzg - i10 < i11) {
            zzegVar.zzh(iZzg);
            int iZzB = zzegVar.zzB();
            zzade.zza(iZzB > 0, "childAtomSize must be positive");
            if (zzegVar.zzB() == 1936289382) {
                int i14 = iZzg + 8;
                int i15 = 0;
                int i16 = -1;
                Integer numValueOf = null;
                String strZzK = null;
                while (i14 - iZzg < iZzB) {
                    zzegVar.zzh(i14);
                    int iZzB2 = zzegVar.zzB();
                    int iZzB3 = zzegVar.zzB();
                    if (iZzB3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzegVar.zzB());
                    } else if (iZzB3 == 1935894637) {
                        zzegVar.zzk(4);
                        strZzK = zzegVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (iZzB3 == 1935894633) {
                        i16 = i14;
                        i15 = iZzB2;
                    }
                    i14 += iZzB2;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(strZzK) || C.CENC_TYPE_cbc1.equals(strZzK) || C.CENC_TYPE_cens.equals(strZzK) || C.CENC_TYPE_cbcs.equals(strZzK)) {
                    zzade.zza(numValueOf != null, "frma atom is mandatory");
                    zzade.zza(i16 != -1, "schi atom is mandatory");
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = numValueOf;
                            zzajgVar = null;
                            break;
                        }
                        zzegVar.zzh(i17);
                        int iZzB4 = zzegVar.zzB();
                        if (zzegVar.zzB() == 1952804451) {
                            int iZza = zza(zzegVar.zzB());
                            zzegVar.zzk(1);
                            if (iZza == 0) {
                                zzegVar.zzk(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int iZzs = zzegVar.zzs();
                                i12 = iZzs & 15;
                                i13 = (iZzs & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            if (zzegVar.zzs() == 1) {
                                num2 = numValueOf;
                                z10 = true;
                            } else {
                                num2 = numValueOf;
                                z10 = false;
                            }
                            int iZzs2 = zzegVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzegVar.zzm(bArr2, 0, 16);
                            if (z10 && iZzs2 == 0) {
                                int iZzs3 = zzegVar.zzs();
                                byte[] bArr3 = new byte[iZzs3];
                                zzegVar.zzm(bArr3, 0, iZzs3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzajgVar = new zzajg(z10, strZzK, iZzs2, bArr2, i13, i12, bArr);
                        } else {
                            i17 += iZzB4;
                        }
                    }
                    zzade.zza(zzajgVar != null, "tenc atom is mandatory");
                    String str = zzep.zza;
                    pairCreate = Pair.create(num, zzajgVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzg += iZzB;
        }
        return null;
    }

    private static int zzs(zzeg zzegVar) {
        int iZzs = zzegVar.zzs();
        int i10 = iZzs & 127;
        while ((iZzs & 128) == 128) {
            iZzs = zzegVar.zzs();
            i10 = (i10 << 7) | (iZzs & 127);
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04dc A[PHI: r28
      0x04dc: PHI (r28v8 long) = (r28v0 long), (r28v0 long), (r28v10 long), (r28v10 long), (r28v10 long), (r28v10 long) binds: [B:153:0x0433, B:155:0x0437, B:157:0x046e, B:159:0x0474, B:161:0x047a, B:163:0x0481] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzaji zzg(com.google.android.gms.internal.ads.zzajf r42, com.google.android.gms.internal.ads.zzeu r43, com.google.android.gms.internal.ads.zzads r44, boolean r45) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zzg(com.google.android.gms.internal.ads.zzajf, com.google.android.gms.internal.ads.zzeu, com.google.android.gms.internal.ads.zzads, boolean):com.google.android.gms.internal.ads.zzaji");
    }
}
