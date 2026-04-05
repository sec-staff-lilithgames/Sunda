package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaoq {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzadb zzadbVar) throws IOException {
        zzeg zzegVar = new zzeg(8);
        int i10 = zzaop.zza(zzadbVar, zzegVar).zza;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        zzadbVar.zzi(zzegVar.zzi(), 0, 4);
        zzegVar.zzh(0);
        int iZzB = zzegVar.zzB();
        if (iZzB == 1463899717) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB).length() + 23);
        sb2.append("Unsupported form type: ");
        sb2.append(iZzB);
        zzdt.zze("WavHeaderReader", sb2.toString());
        return false;
    }

    public static zzaoo zzb(zzadb zzadbVar) throws IOException {
        byte[] bArr;
        int i10;
        byte[] bArr2;
        zzeg zzegVar = new zzeg(16);
        long j10 = zzd(1718449184, zzadbVar, zzegVar).zzb;
        zzgmd.zzh(j10 >= 16);
        zzadbVar.zzi(zzegVar.zzi(), 0, 16);
        zzegVar.zzh(0);
        int iZzu = zzegVar.zzu();
        int iZzu2 = zzegVar.zzu();
        int iZzI = zzegVar.zzI();
        int iZzI2 = zzegVar.zzI();
        int iZzu3 = zzegVar.zzu();
        int iZzu4 = zzegVar.zzu();
        int i11 = ((int) j10) - 16;
        if (i11 > 0) {
            bArr = new byte[i11];
            zzadbVar.zzi(bArr, 0, i11);
            if (iZzu == 65534) {
                if (i11 == 24) {
                    zzeg zzegVar2 = new zzeg(bArr);
                    zzegVar2.zzu();
                    int iZzu5 = zzegVar2.zzu();
                    if (iZzu5 != 0 && iZzu5 != iZzu4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzu4).length() + String.valueOf(iZzu5).length() + 33 + 19);
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(iZzu5, iZzu4, "validBits ( ", ")  != bitsPerSample( ", sb2);
                        sb2.append(") are not supported");
                        throw zzat.zzc(sb2.toString());
                    }
                    int iZzI3 = zzegVar2.zzI();
                    if ((iZzI3 >> 18) != 0) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzI3).length() + 21);
                        sb3.append("invalid channel mask ");
                        sb3.append(iZzI3);
                        throw zzat.zzc(sb3.toString());
                    }
                    if (iZzI3 != 0 && Integer.bitCount(iZzI3) != iZzu2) {
                        int iBitCount = Integer.bitCount(iZzI3);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(iBitCount).length() + 46 + String.valueOf(iZzI3).length());
                        sb4.append("invalid number of channels (");
                        sb4.append(iBitCount);
                        sb4.append(") in channel mask ");
                        sb4.append(iZzI3);
                        throw zzat.zzc(sb4.toString());
                    }
                    iZzu = zzegVar2.zzu();
                    byte[] bArr3 = new byte[14];
                    zzegVar2.zzm(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                        throw zzat.zzc("invalid wav format extension guid");
                    }
                } else {
                    bArr2 = bArr;
                    i10 = 65534;
                }
            }
            zzadbVar.zzf((int) (zzadbVar.zzm() - zzadbVar.zzn()));
            return new zzaoo(i10, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
        }
        bArr = zzep.zzb;
        i10 = iZzu;
        bArr2 = bArr;
        zzadbVar.zzf((int) (zzadbVar.zzm() - zzadbVar.zzn()));
        return new zzaoo(i10, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
    }

    public static Pair zzc(zzadb zzadbVar) throws IOException {
        zzadbVar.zzl();
        zzaop zzaopVarZzd = zzd(1684108385, zzadbVar, new zzeg(8));
        zzadbVar.zzf(8);
        return Pair.create(Long.valueOf(zzadbVar.zzn()), Long.valueOf(zzaopVarZzd.zzb));
    }

    private static zzaop zzd(int i10, zzadb zzadbVar, zzeg zzegVar) throws IOException {
        zzaop zzaopVarZza = zzaop.zza(zzadbVar, zzegVar);
        while (true) {
            int i11 = zzaopVarZza.zza;
            if (i11 == i10) {
                return zzaopVarZza;
            }
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.s(new StringBuilder(String.valueOf(i11).length() + 28), "Ignoring unknown WAV chunk: ", i11, "WavHeaderReader");
            long j10 = zzaopVarZza.zzb;
            long j11 = 8 + j10;
            if ((1 & j10) != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i11);
                throw zzat.zzc(sb2.toString());
            }
            zzadbVar.zzf((int) j11);
            zzaopVarZza = zzaop.zza(zzadbVar, zzegVar);
        }
    }
}
