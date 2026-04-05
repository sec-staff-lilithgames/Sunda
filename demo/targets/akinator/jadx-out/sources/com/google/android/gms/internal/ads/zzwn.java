package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzwn {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzwn(int i10) {
        this(0, new Random());
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final int zzb(int i10) {
        int i11 = this.zzc[i10] + 1;
        int[] iArr = this.zzb;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public final int zzc(int i10) {
        int i11 = this.zzc[i10] - 1;
        if (i11 >= 0) {
            return this.zzb[i11];
        }
        return -1;
    }

    public final int zzd() {
        int[] iArr = this.zzb;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int zze() {
        int[] iArr = this.zzb;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final zzwn zzf(int i10, int i11) {
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int i12 = 0;
        while (i12 < i11) {
            Random random = this.zza;
            iArr[i12] = random.nextInt(this.zzb.length + 1);
            int i13 = i12 + 1;
            int iNextInt = random.nextInt(i13);
            iArr2[i12] = iArr2[iNextInt];
            iArr2[iNextInt] = i12;
            i12 = i13;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.zzb;
        int[] iArr4 = new int[iArr3.length + i11];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iArr3.length + i11; i16++) {
            if (i14 >= i11 || i15 != iArr[i14]) {
                int i17 = i15 + 1;
                int i18 = iArr3[i15];
                iArr4[i16] = i18;
                if (i18 >= 0) {
                    iArr4[i16] = i18 + i11;
                }
                i15 = i17;
            } else {
                iArr4[i16] = iArr2[i14];
                i14++;
            }
        }
        return new zzwn(iArr4, new Random(this.zza.nextLong()));
    }

    public final zzwn zzg(int i10, int i11) {
        int[] iArr = this.zzb;
        int[] iArr2 = new int[iArr.length - i11];
        int i12 = 0;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 < 0 || i14 >= i11) {
                int i15 = i13 - i12;
                if (i14 >= 0) {
                    i14 -= i11;
                }
                iArr2[i15] = i14;
            } else {
                i12++;
            }
        }
        return new zzwn(iArr2, new Random(this.zza.nextLong()));
    }

    public final zzwn zzh() {
        return new zzwn(0, new Random(this.zza.nextLong()));
    }

    private zzwn(int i10, Random random) {
        this(new int[0], random);
    }

    private zzwn(int[] iArr, Random random) {
        this.zzb = iArr;
        this.zza = random;
        this.zzc = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.zzc[iArr[i10]] = i10;
        }
    }
}
