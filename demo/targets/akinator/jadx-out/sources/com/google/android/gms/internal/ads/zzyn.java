package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzyn {
    private final int[] zza;
    private final zzwv[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzwv zze;

    public zzyn(String[] strArr, int[] iArr, zzwv[] zzwvVarArr, int[] iArr2, int[][][] iArr3, zzwv zzwvVar) {
        this.zza = iArr;
        this.zzb = zzwvVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzwvVar;
    }

    public final int zza(int i10) {
        return this.zza[i10];
    }

    public final zzwv zzb(int i10) {
        return this.zzb[i10];
    }

    public final int zzc(int i10, int i11, int i12) {
        return this.zzd[i10][i11][i12];
    }

    public final int zzd(int i10, int i11, boolean z10) {
        zzwv[] zzwvVarArr = this.zzb;
        int i12 = zzwvVarArr[i10].zza(i11).zza;
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            if ((this.zzd[i10][i11][i15] & 7) == 4) {
                iArr[i14] = i15;
                i14++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
        String str = null;
        int i16 = 0;
        int iMin = 16;
        boolean z11 = false;
        while (i13 < iArrCopyOf.length) {
            String str2 = zzwvVarArr[i10].zza(i11).zza(iArrCopyOf[i13]).zzo;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z11 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.zzd[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z11 ? Math.min(iMin, this.zzc[i10]) : iMin;
    }

    public final zzwv zze() {
        return this.zze;
    }
}
