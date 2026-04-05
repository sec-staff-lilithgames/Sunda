package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzxc extends zzxe {
    public zzxc(zzbg zzbgVar, int[] iArr, int i10, zzza zzzaVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, zzdc zzdcVar) {
        super(zzbgVar, iArr, 0);
        zzgpe.zzq(list);
    }

    public static /* synthetic */ zzgpe zzd(zzyj[] zzyjVarArr) {
        int i10;
        int i11;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                break;
            }
            zzyj zzyjVar = zzyjVarArr[i13];
            if (zzyjVar == null || zzyjVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i14 = zzgpe.zzd;
                zzgpb zzgpbVar = new zzgpb();
                zzgpbVar.zzf(new zzxa(0L, 0L));
                arrayList.add(zzgpbVar);
            }
            i13++;
        }
        long[][] jArr2 = new long[2][];
        for (int i15 = 0; i15 < 2; i15++) {
            zzyj zzyjVar2 = zzyjVarArr[i15];
            if (zzyjVar2 == null) {
                jArr2[i15] = new long[0];
            } else {
                int[] iArr = zzyjVar2.zzb;
                jArr2[i15] = new long[iArr.length];
                for (int i16 = 0; i16 < iArr.length; i16++) {
                    long j10 = zzyjVar2.zza.zza(iArr[i16]).zzj;
                    long[] jArr3 = jArr2[i15];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr3[i16] = j10;
                }
                Arrays.sort(jArr2[i15]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i17 = 0; i17 < 2; i17++) {
            long[] jArr5 = jArr2[i17];
            jArr4[i17] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzgpz zzgpzVarZza = zzgqt.zzc(zzgqy.zzb()).zzb(2).zza();
        int i18 = 0;
        while (i18 < 2) {
            int length = jArr2[i18].length;
            if (length <= i10) {
                i11 = i12;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i19 = i12;
                while (true) {
                    long[] jArr6 = jArr2[i18];
                    double dLog = 0.0d;
                    if (i19 >= jArr6.length) {
                        break;
                    }
                    int i20 = i12;
                    long[][] jArr7 = jArr2;
                    long j11 = jArr6[i19];
                    if (j11 != -1) {
                        dLog = Math.log(j11);
                    }
                    dArr[i19] = dLog;
                    i19++;
                    i12 = i20;
                    jArr2 = jArr7;
                }
                i11 = i12;
                jArr = jArr2;
                int i21 = length - 1;
                double d10 = dArr[i21] - dArr[i11];
                int i22 = i11;
                while (i22 < i21) {
                    double d11 = dArr[i22];
                    i22++;
                    zzgpzVarZza.zze(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i22]) * 0.5d) - dArr[i11]) / d10), Integer.valueOf(i18));
                    i10 = i10;
                }
            }
            i18++;
            i12 = i11;
            jArr2 = jArr;
            i10 = i10;
        }
        int i23 = i12;
        long[][] jArr8 = jArr2;
        zzgpe zzgpeVarZzq = zzgpe.zzq(zzgpzVarZza.zzt());
        for (int i24 = i23; i24 < zzgpeVarZzq.size(); i24++) {
            int iIntValue = ((Integer) zzgpeVarZzq.get(i24)).intValue();
            int i25 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i25;
            jArr4[iIntValue] = jArr8[iIntValue][i25];
            zzi(arrayList, jArr4);
        }
        for (int i26 = i23; i26 < 2; i26++) {
            if (arrayList.get(i26) != null) {
                long j12 = jArr4[i26];
                jArr4[i26] = j12 + j12;
            }
        }
        zzi(arrayList, jArr4);
        zzgpb zzgpbVar2 = new zzgpb();
        while (i23 < arrayList.size()) {
            zzgpb zzgpbVar3 = (zzgpb) arrayList.get(i23);
            zzgpbVar2.zzf(zzgpbVar3 == null ? zzgpe.zzi() : zzgpbVar3.zzi());
            i23++;
        }
        return zzgpbVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzgpb zzgpbVar = (zzgpb) list.get(i11);
            if (zzgpbVar != null) {
                zzgpbVar.zzf(new zzxa(j10, jArr[i11]));
            }
        }
    }
}
