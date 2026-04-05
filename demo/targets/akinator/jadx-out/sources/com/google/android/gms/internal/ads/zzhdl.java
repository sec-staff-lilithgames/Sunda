package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhdl {
    static final long[] zza;
    static final long[] zzb;
    static final long[] zzc;
    static final zzhde[][] zzd;
    static final zzhde[] zze;
    private static final BigInteger zzf;
    private static final BigInteger zzg;
    private static final BigInteger zzh;
    private static final BigInteger zzi;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        zzf = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        zzg = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        zzh = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        zzi = bigIntegerModPow;
        zzhdk zzhdkVar = new zzhdk(null);
        zzhdkVar.zzd(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract));
        BigInteger bigIntegerZzc = zzhdkVar.zzc();
        BigInteger bigIntegerMultiply = bigIntegerZzc.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerZzc.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        zzhdkVar.zzb(bigIntegerModPow2);
        zza = zzhdq.zzg(zzb(bigIntegerMod));
        zzb = zzhdq.zzg(zzb(bigIntegerMod2));
        zzc = zzhdq.zzg(zzb(bigIntegerModPow));
        zzd = (zzhde[][]) Array.newInstance((Class<?>) zzhde.class, 32, 8);
        zzhdk zzhdkVarZza = zzhdkVar;
        for (int i10 = 0; i10 < 32; i10++) {
            zzhdk zzhdkVarZza2 = zzhdkVarZza;
            for (int i11 = 0; i11 < 8; i11++) {
                zzd[i10][i11] = zzc(zzhdkVarZza2);
                zzhdkVarZza2 = zza(zzhdkVarZza2, zzhdkVarZza);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                zzhdkVarZza = zza(zzhdkVarZza, zzhdkVarZza);
            }
        }
        zzhdk zzhdkVarZza3 = zza(zzhdkVar, zzhdkVar);
        zze = new zzhde[8];
        for (int i13 = 0; i13 < 8; i13++) {
            zze[i13] = zzc(zzhdkVar);
            zzhdkVar = zza(zzhdkVar, zzhdkVarZza3);
        }
    }

    private static zzhdk zza(zzhdk zzhdkVar, zzhdk zzhdkVar2) {
        zzhdk zzhdkVar3 = new zzhdk(null);
        BigInteger bigIntegerMultiply = zzg.multiply(zzhdkVar.zza().multiply(zzhdkVar2.zza()).multiply(zzhdkVar.zzc()).multiply(zzhdkVar2.zzc()));
        BigInteger bigInteger = zzf;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = zzhdkVar.zza().multiply(zzhdkVar2.zzc()).add(zzhdkVar2.zza().multiply(zzhdkVar.zzc()));
        BigInteger bigInteger2 = BigInteger.ONE;
        zzhdkVar3.zzb(bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        zzhdkVar3.zzd(zzhdkVar.zzc().multiply(zzhdkVar2.zzc()).add(zzhdkVar.zza().multiply(zzhdkVar2.zza())).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        return zzhdkVar3;
    }

    private static byte[] zzb(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }

    private static zzhde zzc(zzhdk zzhdkVar) {
        BigInteger bigIntegerAdd = zzhdkVar.zzc().add(zzhdkVar.zza());
        BigInteger bigInteger = zzf;
        return new zzhde(zzhdq.zzg(zzb(bigIntegerAdd.mod(bigInteger))), zzhdq.zzg(zzb(zzhdkVar.zzc().subtract(zzhdkVar.zza()).mod(bigInteger))), zzhdq.zzg(zzb(zzh.multiply(zzhdkVar.zza()).multiply(zzhdkVar.zzc()).mod(bigInteger))));
    }
}
