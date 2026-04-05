package com.google.android.gms.internal.ads;

import e3.g;
import j1.o2;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzci {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzci(int i10, int i11, float f10, float f11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = i10 / i12;
        this.zzf = i10 / 400;
        int i13 = i10 / 65;
        this.zzg = i13;
        int i14 = i13 + i13;
        this.zzh = i14;
        this.zzi = new short[i14];
        int i15 = i14 * i11;
        this.zzj = new short[i15];
        this.zzl = new short[i15];
        this.zzn = new short[i15];
    }

    private final short[] zzg(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.zzb;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private final void zzh(short[] sArr, int i10, int i11) {
        short[] sArrZzg = zzg(this.zzl, this.zzm, i11);
        this.zzl = sArrZzg;
        int i12 = this.zzm;
        int i13 = this.zzb;
        System.arraycopy(sArr, i10 * i13, sArrZzg, i12 * i13, i11 * i13);
        this.zzm += i11;
    }

    private final void zzi(short[] sArr, int i10, int i11) {
        int i12;
        for (int i13 = 0; i13 < this.zzh / i11; i13++) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = this.zzb;
                i12 = i16 * i11;
                if (i14 < i12) {
                    i15 += sArr[o2.B(i13, i12, i16 * i10, i14)];
                    i14++;
                }
            }
            this.zzi[i13] = (short) (i15 / i12);
        }
    }

    private final int zzj(short[] sArr, int i10, int i11, int i12) {
        int i13 = 1;
        int i14 = 255;
        int i15 = 0;
        int i16 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i11; i17++) {
                int i18 = this.zzb * i10;
                iAbs += Math.abs(sArr[i18 + i17] - sArr[(i18 + i11) + i17]);
            }
            int i19 = iAbs * i15;
            int i20 = i13 * i11;
            if (i19 < i20) {
                i13 = iAbs;
            }
            if (i19 < i20) {
                i15 = i11;
            }
            int i21 = iAbs * i14;
            int i22 = i16 * i11;
            if (i21 > i22) {
                i16 = iAbs;
            }
            if (i21 > i22) {
                i14 = i11;
            }
            i11++;
        }
        this.zzu = i13 / i15;
        this.zzv = i16 / i14;
        return i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzk() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzci.zzk():void");
    }

    private static void zzl(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) g.e(sArr3[i17], i19, (i10 - i19) * sArr2[i16], i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    public final int zza() {
        int i10 = this.zzk * this.zzb;
        return i10 + i10;
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.zzb;
        int i11 = iRemaining / i10;
        int i12 = i11 * i10;
        short[] sArrZzg = zzg(this.zzj, this.zzk, i11);
        this.zzj = sArrZzg;
        shortBuffer.get(sArrZzg, this.zzk * i10, (i12 + i12) / 2);
        this.zzk += i11;
        zzk();
    }

    public final void zzc(ShortBuffer shortBuffer) {
        zzgmd.zzh(this.zzm >= 0);
        int iRemaining = shortBuffer.remaining();
        int i10 = this.zzb;
        int iMin = Math.min(iRemaining / i10, this.zzm);
        int i11 = iMin * i10;
        shortBuffer.put(this.zzl, 0, i11);
        int i12 = this.zzm - iMin;
        this.zzm = i12;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, i11, sArr, 0, i12 * i10);
    }

    public final void zzd() {
        int i10 = this.zzk;
        int i11 = this.zzr;
        int i12 = this.zzm;
        float f10 = this.zzc;
        float f11 = this.zzd;
        int i13 = i12 + ((int) (((((((i10 - i11) / (f10 / f11)) + i11) + this.zzw) + this.zzo) / (this.zze * f11)) + 0.5d));
        this.zzw = 0.0d;
        int i14 = this.zzh;
        int i15 = i14 + i14;
        this.zzj = zzg(this.zzj, i10, i10 + i15);
        int i16 = 0;
        while (true) {
            int i17 = this.zzb;
            if (i16 >= i15 * i17) {
                break;
            }
            this.zzj[(i17 * i10) + i16] = 0;
            i16++;
        }
        this.zzk += i15;
        zzk();
        if (this.zzm > i13) {
            this.zzm = Math.max(i13, 0);
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zze() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = 0.0d;
    }

    public final int zzf() {
        zzgmd.zzh(this.zzm >= 0);
        int i10 = this.zzm * this.zzb;
        return i10 + i10;
    }
}
