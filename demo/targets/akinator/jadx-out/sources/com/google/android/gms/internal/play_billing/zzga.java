package com.google.android.gms.internal.play_billing;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzga {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i10, zzfz zzfzVar) throws zzhr {
        int iZzh = zzh(bArr, i10, zzfzVar);
        int i11 = zzfzVar.zza;
        if (i11 < 0) {
            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZzh) {
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zzfzVar.zzc = zzgk.zzb;
            return iZzh;
        }
        zzfzVar.zzc = zzgk.zzj(bArr, iZzh, i11);
        return iZzh + i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzc(zzix zzixVar, byte[] bArr, int i10, int i11, int i12, zzfz zzfzVar) throws IOException {
        Object objZze = zzixVar.zze();
        int iZzl = zzl(objZze, zzixVar, bArr, i10, i11, i12, zzfzVar);
        zzixVar.zzf(objZze);
        zzfzVar.zzc = objZze;
        return iZzl;
    }

    public static int zzd(zzix zzixVar, byte[] bArr, int i10, int i11, zzfz zzfzVar) throws IOException {
        Object objZze = zzixVar.zze();
        int iZzm = zzm(objZze, zzixVar, bArr, i10, i11, zzfzVar);
        zzixVar.zzf(objZze);
        zzfzVar.zzc = objZze;
        return iZzm;
    }

    public static int zze(zzix zzixVar, int i10, byte[] bArr, int i11, int i12, zzho zzhoVar, zzfz zzfzVar) throws IOException {
        int iZzd = zzd(zzixVar, bArr, i11, i12, zzfzVar);
        zzhoVar.add(zzfzVar.zzc);
        while (iZzd < i12) {
            int iZzh = zzh(bArr, iZzd, zzfzVar);
            if (i10 != zzfzVar.zza) {
                break;
            }
            iZzd = zzd(zzixVar, bArr, iZzh, i12, zzfzVar);
            zzhoVar.add(zzfzVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i10, zzho zzhoVar, zzfz zzfzVar) throws IOException {
        zzhl zzhlVar = (zzhl) zzhoVar;
        int iZzh = zzh(bArr, i10, zzfzVar);
        int i11 = zzfzVar.zza + iZzh;
        while (iZzh < i11) {
            iZzh = zzh(bArr, iZzh, zzfzVar);
            zzhlVar.zzg(zzfzVar.zza);
        }
        if (iZzh == i11) {
            return iZzh;
        }
        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i10, byte[] bArr, int i11, int i12, zzjk zzjkVar, zzfz zzfzVar) throws zzhr {
        if ((i10 >>> 3) == 0) {
            throw new zzhr("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzk = zzk(bArr, i11, zzfzVar);
            zzjkVar.zzj(i10, Long.valueOf(zzfzVar.zzb));
            return iZzk;
        }
        if (i13 == 1) {
            zzjkVar.zzj(i10, Long.valueOf(zzn(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzh = zzh(bArr, i11, zzfzVar);
            int i14 = zzfzVar.zza;
            if (i14 < 0) {
                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iZzh) {
                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                zzjkVar.zzj(i10, zzgk.zzb);
            } else {
                zzjkVar.zzj(i10, zzgk.zzj(bArr, iZzh, i14));
            }
            return iZzh + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzhr("Protocol message contained an invalid tag (zero).");
            }
            zzjkVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzjk zzjkVarZzf = zzjk.zzf();
        int i16 = zzfzVar.zze + 1;
        zzfzVar.zze = i16;
        zzo(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iZzh2 = zzh(bArr, i11, zzfzVar);
            int i18 = zzfzVar.zza;
            if (i18 == i15) {
                i17 = i18;
                i11 = iZzh2;
                break;
            }
            i11 = zzg(i18, bArr, iZzh2, i12, zzjkVarZzf, zzfzVar);
            i17 = i18;
        }
        zzfzVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zzhr("Failed to parse the message.");
        }
        zzjkVar.zzj(i10, zzjkVarZzf);
        return i11;
    }

    public static int zzh(byte[] bArr, int i10, zzfz zzfzVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzi(b10, bArr, i11, zzfzVar);
        }
        zzfzVar.zza = b10;
        return i11;
    }

    public static int zzi(int i10, byte[] bArr, int i11, zzfz zzfzVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzfzVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & AbstractJsonLexerKt.TC_INVALID) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzfzVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & AbstractJsonLexerKt.TC_INVALID) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzfzVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & AbstractJsonLexerKt.TC_INVALID) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzfzVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & AbstractJsonLexerKt.TC_INVALID) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzfzVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zzj(int i10, byte[] bArr, int i11, int i12, zzho zzhoVar, zzfz zzfzVar) {
        zzhl zzhlVar = (zzhl) zzhoVar;
        int iZzh = zzh(bArr, i11, zzfzVar);
        zzhlVar.zzg(zzfzVar.zza);
        while (iZzh < i12) {
            int iZzh2 = zzh(bArr, iZzh, zzfzVar);
            if (i10 != zzfzVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzfzVar);
            zzhlVar.zzg(zzfzVar.zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i10, zzfz zzfzVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzfzVar.zzb = j10;
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
        zzfzVar.zzb = j11;
        return i12;
    }

    public static int zzl(Object obj, zzix zzixVar, byte[] bArr, int i10, int i11, int i12, zzfz zzfzVar) throws IOException {
        int i13 = zzfzVar.zze + 1;
        zzfzVar.zze = i13;
        zzo(i13);
        int iZzc = ((zzip) zzixVar).zzc(obj, bArr, i10, i11, i12, zzfzVar);
        zzfzVar.zze--;
        zzfzVar.zzc = obj;
        return iZzc;
    }

    public static int zzm(Object obj, zzix zzixVar, byte[] bArr, int i10, int i11, zzfz zzfzVar) throws IOException {
        int iZzi = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzi = zzi(i12, bArr, iZzi, zzfzVar);
            i12 = zzfzVar.zza;
        }
        int i13 = iZzi;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zzfzVar.zze + 1;
        zzfzVar.zze = i14;
        zzo(i14);
        int i15 = i13 + i12;
        zzixVar.zzh(obj, bArr, i13, i15, zzfzVar);
        zzfzVar.zze--;
        zzfzVar.zzc = obj;
        return i15;
    }

    public static long zzn(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    private static void zzo(int i10) throws zzhr {
        if (i10 >= zzb) {
            throw new zzhr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
