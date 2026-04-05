package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhdh {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    public zzhdh(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    public static zzhdh zza(zzhdh zzhdhVar, zzhdg zzhdgVar) {
        zzhdh zzhdhVar2 = zzhdgVar.zza;
        long[] jArr = zzhdhVar.zza;
        long[] jArr2 = zzhdhVar2.zza;
        long[] jArr3 = zzhdgVar.zzb;
        zzhdq.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhdhVar.zzb;
        long[] jArr5 = zzhdhVar2.zzb;
        long[] jArr6 = zzhdhVar2.zzc;
        zzhdq.zze(jArr4, jArr5, jArr6);
        zzhdq.zze(zzhdhVar.zzc, jArr6, jArr3);
        return zzhdhVar;
    }

    public final byte[] zzb() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = this.zzc;
        zzhdq.zzf(jArr4, jArr14);
        zzhdq.zzf(jArr13, jArr4);
        zzhdq.zzf(jArr12, jArr13);
        zzhdq.zze(jArr5, jArr12, jArr14);
        zzhdq.zze(jArr6, jArr5, jArr4);
        zzhdq.zzf(jArr12, jArr6);
        zzhdq.zze(jArr7, jArr12, jArr5);
        zzhdq.zzf(jArr12, jArr7);
        zzhdq.zzf(jArr13, jArr12);
        zzhdq.zzf(jArr12, jArr13);
        zzhdq.zzf(jArr13, jArr12);
        zzhdq.zzf(jArr12, jArr13);
        zzhdq.zze(jArr8, jArr12, jArr7);
        zzhdq.zzf(jArr12, jArr8);
        zzhdq.zzf(jArr13, jArr12);
        for (int i10 = 2; i10 < 10; i10 += 2) {
            zzhdq.zzf(jArr12, jArr13);
            zzhdq.zzf(jArr13, jArr12);
        }
        zzhdq.zze(jArr9, jArr13, jArr8);
        zzhdq.zzf(jArr12, jArr9);
        zzhdq.zzf(jArr13, jArr12);
        for (int i11 = 2; i11 < 20; i11 += 2) {
            zzhdq.zzf(jArr12, jArr13);
            zzhdq.zzf(jArr13, jArr12);
        }
        zzhdq.zze(jArr12, jArr13, jArr9);
        zzhdq.zzf(jArr13, jArr12);
        zzhdq.zzf(jArr12, jArr13);
        for (int i12 = 2; i12 < 10; i12 += 2) {
            zzhdq.zzf(jArr13, jArr12);
            zzhdq.zzf(jArr12, jArr13);
        }
        zzhdq.zze(jArr10, jArr12, jArr8);
        zzhdq.zzf(jArr12, jArr10);
        zzhdq.zzf(jArr13, jArr12);
        for (int i13 = 2; i13 < 50; i13 += 2) {
            zzhdq.zzf(jArr12, jArr13);
            zzhdq.zzf(jArr13, jArr12);
        }
        zzhdq.zze(jArr11, jArr13, jArr10);
        zzhdq.zzf(jArr13, jArr11);
        zzhdq.zzf(jArr12, jArr13);
        for (int i14 = 2; i14 < 100; i14 += 2) {
            zzhdq.zzf(jArr13, jArr12);
            zzhdq.zzf(jArr12, jArr13);
        }
        zzhdq.zze(jArr13, jArr12, jArr11);
        zzhdq.zzf(jArr12, jArr13);
        zzhdq.zzf(jArr13, jArr12);
        for (int i15 = 2; i15 < 50; i15 += 2) {
            zzhdq.zzf(jArr12, jArr13);
            zzhdq.zzf(jArr13, jArr12);
        }
        zzhdq.zze(jArr12, jArr13, jArr10);
        zzhdq.zzf(jArr13, jArr12);
        zzhdq.zzf(jArr12, jArr13);
        zzhdq.zzf(jArr13, jArr12);
        zzhdq.zzf(jArr12, jArr13);
        zzhdq.zzf(jArr13, jArr12);
        zzhdq.zze(jArr, jArr13, jArr6);
        zzhdq.zze(jArr2, this.zza, jArr);
        zzhdq.zze(jArr3, this.zzb, jArr);
        byte[] bArrZzh = zzhdq.zzh(jArr3);
        bArrZzh[31] = (byte) ((zzhdj.zzf(jArr2) << 7) ^ bArrZzh[31]);
        return bArrZzh;
    }

    public zzhdh() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzhdh(zzhdg zzhdgVar) {
        this();
        zza(this, zzhdgVar);
    }

    public zzhdh(zzhdh zzhdhVar) {
        this.zza = Arrays.copyOf(zzhdhVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhdhVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhdhVar.zzc, 10);
    }
}
