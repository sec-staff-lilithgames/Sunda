package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaje {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzaeh zza(zzadb zzadbVar) throws IOException {
        return zzc(zzadbVar, true, false);
    }

    public static zzaeh zzb(zzadb zzadbVar, boolean z10) throws IOException {
        return zzc(zzadbVar, false, z10);
    }

    private static zzaeh zzc(zzadb zzadbVar, boolean z10, boolean z11) throws IOException {
        zzaeh zzaehVar;
        long j10;
        zzeg zzegVar;
        int i10;
        int i11;
        long j11;
        int i12;
        int i13;
        int[] iArr;
        long jZzo = zzadbVar.zzo();
        long j12 = -1;
        long j13 = 4096;
        if (jZzo != -1 && jZzo <= 4096) {
            j13 = jZzo;
        }
        zzeg zzegVar2 = new zzeg(64);
        int i14 = (int) j13;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i16 < i14) {
            zzegVar2.zza(8);
            if (!zzadbVar.zzh(zzegVar2.zzi(), i15, 8, true)) {
                break;
            }
            long jZzz = zzegVar2.zzz();
            int iZzB = zzegVar2.zzB();
            if (jZzz == 1) {
                j10 = j12;
                zzadbVar.zzi(zzegVar2.zzi(), 8, 8);
                i10 = 16;
                zzegVar2.zzf(16);
                jZzz = zzegVar2.zzD();
                zzegVar = zzegVar2;
            } else {
                j10 = j12;
                if (jZzz == 0) {
                    long jZzo2 = zzadbVar.zzo();
                    if (jZzo2 != j10) {
                        jZzz = (jZzo2 - zzadbVar.zzm()) + 8;
                    }
                }
                zzegVar = zzegVar2;
                i10 = 8;
            }
            long j14 = jZzz;
            zzaehVar = null;
            long j15 = i10;
            if (j14 < j15) {
                i11 = 1;
                if (iZzB == 1718773093) {
                    if (i10 == 8) {
                        j14 = 8;
                        iZzB = 1718773093;
                    } else {
                        iZzB = 1718773093;
                    }
                }
                return new zzahy(iZzB, j14, i10);
            }
            i11 = 1;
            i16 += i10;
            if (iZzB == 1836019574) {
                i14 += (int) j14;
                if (jZzo != -1 && i14 > jZzo) {
                    i14 = (int) jZzo;
                }
                zzegVar2 = zzegVar;
                j12 = j10;
                i15 = 0;
            } else {
                if (iZzB == 1953653099 || iZzB == 1835297121 || iZzB == 1835626086) {
                    j11 = jZzo;
                    i12 = 0;
                } else {
                    if (iZzB == 1836019558 || iZzB == 1836475768) {
                        i15 = i11;
                        break;
                    }
                    i17 |= (iZzB == 1835295092 ? 0 : i11) ^ 1;
                    if (iZzB == 1937007212) {
                        if (j14 > 1000000) {
                            i15 = 0;
                            break;
                        }
                        iZzB = 1937007212;
                    }
                    j11 = jZzo;
                    if ((i16 + j14) - j15 >= i14) {
                        i15 = 0;
                        break;
                    }
                    int i18 = (int) (j14 - j15);
                    i16 += i18;
                    if (iZzB != 1718909296) {
                        i12 = 0;
                        if (i18 != 0) {
                            zzadbVar.zzk(i18);
                        }
                    } else {
                        if (i18 < 8) {
                            return new zzahy(1718909296, i18, 8);
                        }
                        zzegVar.zza(i18);
                        i12 = 0;
                        zzadbVar.zzi(zzegVar.zzi(), 0, i18);
                        int iZzB2 = zzegVar.zzB();
                        int i19 = (zzd(iZzB2, z11) ? 1 : 0) | i17;
                        zzegVar.zzk(4);
                        int iZzd = zzegVar.zzd() / 4;
                        if (i19 == 0 && iZzd > 0) {
                            iArr = new int[iZzd];
                            int i20 = 0;
                            while (true) {
                                if (i20 >= iZzd) {
                                    i13 = i19;
                                    break;
                                }
                                int iZzB3 = zzegVar.zzB();
                                iArr[i20] = iZzB3;
                                if (zzd(iZzB3, z11)) {
                                    i13 = i11;
                                    break;
                                }
                                i20++;
                            }
                        } else {
                            i13 = i19;
                            iArr = null;
                        }
                        if (i13 == 0) {
                            return new zzajj(iZzB2, iArr);
                        }
                        i17 = i13;
                    }
                }
                i15 = i12;
                zzegVar2 = zzegVar;
                jZzo = j11;
                j12 = j10;
            }
        }
        zzaehVar = null;
        return i17 == 0 ? zzaja.zza : z10 != i15 ? i15 != 0 ? zzais.zza : zzais.zzb : zzaehVar;
    }

    private static boolean zzd(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579) {
            if (z10) {
                return true;
            }
            i10 = 1751476579;
        }
        int[] iArr = zza;
        for (int i11 = 0; i11 < 29; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }
}
