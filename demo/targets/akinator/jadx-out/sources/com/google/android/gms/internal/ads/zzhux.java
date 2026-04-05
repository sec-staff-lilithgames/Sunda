package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhux {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i10, zzhuw zzhuwVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzb(b10, bArr, i11, zzhuwVar);
        }
        zzhuwVar.zza = b10;
        return i11;
    }

    public static int zzb(int i10, byte[] bArr, int i11, zzhuw zzhuwVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzhuwVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & AbstractJsonLexerKt.TC_INVALID) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzhuwVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & AbstractJsonLexerKt.TC_INVALID) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzhuwVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & AbstractJsonLexerKt.TC_INVALID) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzhuwVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & AbstractJsonLexerKt.TC_INVALID) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzhuwVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zzc(byte[] bArr, int i10, zzhuw zzhuwVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzhuwVar.zzb = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & AbstractJsonLexerKt.TC_INVALID) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & AbstractJsonLexerKt.TC_INVALID) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        zzhuwVar.zzb = j11;
        return i12;
    }

    public static int zzd(byte[] bArr, int i10) {
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static long zze(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    public static int zzf(byte[] bArr, int i10, zzhuw zzhuwVar) throws zzhxd {
        int iZza = zza(bArr, i10, zzhuwVar);
        int i11 = zzhuwVar.zza;
        if (i11 < 0) {
            throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            zzhuwVar.zzc = "";
            return iZza;
        }
        zzhuwVar.zzc = zzhzo.zzf(bArr, iZza, i11);
        return iZza + i11;
    }

    public static int zzg(byte[] bArr, int i10, zzhuw zzhuwVar) throws zzhxd {
        int iZza = zza(bArr, i10, zzhuwVar);
        int i11 = zzhuwVar.zza;
        if (i11 < 0) {
            throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZza) {
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zzhuwVar.zzc = zzhvi.zzb;
            return iZza;
        }
        zzhuwVar.zzc = zzhvi.zzr(bArr, iZza, i11);
        return iZza + i11;
    }

    public static int zzh(zzhyr zzhyrVar, byte[] bArr, int i10, int i11, zzhuw zzhuwVar) throws IOException {
        Object objZza = zzhyrVar.zza();
        int iZzj = zzj(objZza, zzhyrVar, bArr, i10, i11, zzhuwVar);
        zzhyrVar.zzk(objZza);
        zzhuwVar.zzc = objZza;
        return iZzj;
    }

    public static int zzi(zzhyr zzhyrVar, byte[] bArr, int i10, int i11, int i12, zzhuw zzhuwVar) throws IOException {
        Object objZza = zzhyrVar.zza();
        int iZzk = zzk(objZza, zzhyrVar, bArr, i10, i11, i12, zzhuwVar);
        zzhyrVar.zzk(objZza);
        zzhuwVar.zzc = objZza;
        return iZzk;
    }

    public static int zzj(Object obj, zzhyr zzhyrVar, byte[] bArr, int i10, int i11, zzhuw zzhuwVar) throws IOException {
        int iZzb = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzb = zzb(i12, bArr, iZzb, zzhuwVar);
            i12 = zzhuwVar.zza;
        }
        int i13 = iZzb;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zzhuwVar.zze + 1;
        zzhuwVar.zze = i14;
        zzq(i14);
        int i15 = i13 + i12;
        zzhyrVar.zzj(obj, bArr, i13, i15, zzhuwVar);
        zzhuwVar.zze--;
        zzhuwVar.zzc = obj;
        return i15;
    }

    public static int zzk(Object obj, zzhyr zzhyrVar, byte[] bArr, int i10, int i11, int i12, zzhuw zzhuwVar) throws IOException {
        int i13 = zzhuwVar.zze + 1;
        zzhuwVar.zze = i13;
        zzq(i13);
        int iZzi = ((zzhyc) zzhyrVar).zzi(obj, bArr, i10, i11, i12, zzhuwVar);
        zzhuwVar.zze--;
        zzhuwVar.zzc = obj;
        return iZzi;
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzhxa zzhxaVar, zzhuw zzhuwVar) {
        zzhwp zzhwpVar = (zzhwp) zzhxaVar;
        int iZza = zza(bArr, i11, zzhuwVar);
        zzhwpVar.zzi(zzhuwVar.zza);
        while (iZza < i12) {
            int iZza2 = zza(bArr, iZza, zzhuwVar);
            if (i10 != zzhuwVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzhuwVar);
            zzhwpVar.zzi(zzhuwVar.zza);
        }
        return iZza;
    }

    public static int zzm(byte[] bArr, int i10, zzhxa zzhxaVar, zzhuw zzhuwVar) throws IOException {
        zzhwp zzhwpVar = (zzhwp) zzhxaVar;
        int iZza = zza(bArr, i10, zzhuwVar);
        int i11 = zzhuwVar.zza + iZza;
        while (iZza < i11) {
            iZza = zza(bArr, iZza, zzhuwVar);
            zzhwpVar.zzi(zzhuwVar.zza);
        }
        if (iZza == i11) {
            return iZza;
        }
        throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zzhyr zzhyrVar, int i10, byte[] bArr, int i11, int i12, zzhxa zzhxaVar, zzhuw zzhuwVar) throws IOException {
        int iZzh = zzh(zzhyrVar, bArr, i11, i12, zzhuwVar);
        zzhxaVar.add(zzhuwVar.zzc);
        while (iZzh < i12) {
            int iZza = zza(bArr, iZzh, zzhuwVar);
            if (i10 != zzhuwVar.zza) {
                break;
            }
            iZzh = zzh(zzhyrVar, bArr, iZza, i12, zzhuwVar);
            zzhxaVar.add(zzhuwVar.zzc);
        }
        return iZzh;
    }

    public static int zzo(int i10, byte[] bArr, int i11, int i12, zzhzd zzhzdVar, zzhuw zzhuwVar) throws zzhxd {
        if ((i10 >>> 3) == 0) {
            throw new zzhxd("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzc = zzc(bArr, i11, zzhuwVar);
            zzhzdVar.zzk(i10, Long.valueOf(zzhuwVar.zzb));
            return iZzc;
        }
        if (i13 == 1) {
            zzhzdVar.zzk(i10, Long.valueOf(zze(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZza = zza(bArr, i11, zzhuwVar);
            int i14 = zzhuwVar.zza;
            if (i14 < 0) {
                throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iZza) {
                throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                zzhzdVar.zzk(i10, zzhvi.zzb);
            } else {
                zzhzdVar.zzk(i10, zzhvi.zzr(bArr, iZza, i14));
            }
            return iZza + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzhxd("Protocol message contained an invalid tag (zero).");
            }
            zzhzdVar.zzk(i10, Integer.valueOf(zzd(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzhzd zzhzdVarZzb = zzhzd.zzb();
        int i16 = zzhuwVar.zze + 1;
        zzhuwVar.zze = i16;
        zzq(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iZza2 = zza(bArr, i11, zzhuwVar);
            int i18 = zzhuwVar.zza;
            if (i18 == i15) {
                i17 = i18;
                i11 = iZza2;
                break;
            }
            i11 = zzo(i18, bArr, iZza2, i12, zzhzdVarZzb, zzhuwVar);
            i17 = i18;
        }
        zzhuwVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zzhxd("Failed to parse the message.");
        }
        zzhzdVar.zzk(i10, zzhzdVarZzb);
        return i11;
    }

    public static int zzp(int i10, byte[] bArr, int i11, int i12, zzhuw zzhuwVar) throws zzhxd {
        if ((i10 >>> 3) == 0) {
            throw new zzhxd("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzc(bArr, i11, zzhuwVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zza(bArr, i11, zzhuwVar) + zzhuwVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzhxd("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zza(bArr, i11, zzhuwVar);
            i15 = zzhuwVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zzp(i15, bArr, i11, i12, zzhuwVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zzhxd("Failed to parse the message.");
        }
        return i11;
    }

    private static void zzq(int i10) throws zzhxd {
        if (i10 >= zzb) {
            throw new zzhxd("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
