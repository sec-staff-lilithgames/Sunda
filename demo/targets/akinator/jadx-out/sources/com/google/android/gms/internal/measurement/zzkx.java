package com.google.android.gms.internal.measurement;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzkx {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i10, zzkw zzkwVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzb(b10, bArr, i11, zzkwVar);
        }
        zzkwVar.zza = b10;
        return i11;
    }

    public static int zzb(int i10, byte[] bArr, int i11, zzkw zzkwVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzkwVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & AbstractJsonLexerKt.TC_INVALID) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzkwVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & AbstractJsonLexerKt.TC_INVALID) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzkwVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & AbstractJsonLexerKt.TC_INVALID) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzkwVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & AbstractJsonLexerKt.TC_INVALID) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzkwVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zzc(byte[] bArr, int i10, zzkw zzkwVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzkwVar.zzb = j10;
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
        zzkwVar.zzb = j11;
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

    public static int zzf(byte[] bArr, int i10, zzkw zzkwVar) throws zzmr {
        int i11;
        int iZza = zza(bArr, i10, zzkwVar);
        int i12 = zzkwVar.zza;
        if (i12 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            zzkwVar.zzc = "";
            return iZza;
        }
        int i13 = zzos.zza;
        int length = bArr.length;
        if ((((length - iZza) - i12) | iZza | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZza), Integer.valueOf(i12)));
        }
        int i14 = iZza + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (iZza < i14) {
            byte b10 = bArr[iZza];
            if (!zzoq.zza(b10)) {
                break;
            }
            iZza++;
            cArr[i15] = (char) b10;
            i15++;
        }
        int i16 = i15;
        while (iZza < i14) {
            int i17 = iZza + 1;
            byte b11 = bArr[iZza];
            if (zzoq.zza(b11)) {
                cArr[i16] = (char) b11;
                i16++;
                iZza = i17;
                while (iZza < i14) {
                    byte b12 = bArr[iZza];
                    if (zzoq.zza(b12)) {
                        iZza++;
                        cArr[i16] = (char) b12;
                        i16++;
                    }
                }
            } else {
                if (b11 < -32) {
                    if (i17 >= i14) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    iZza += 2;
                    zzoq.zzb(b11, bArr[i17], cArr, i16);
                } else if (b11 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    int i18 = iZza + 2;
                    iZza += 3;
                    zzoq.zzc(b11, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new zzmr("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i17];
                    int i19 = iZza + 3;
                    byte b14 = bArr[iZza + 2];
                    iZza += 4;
                    zzoq.zzd(b11, b13, b14, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i11;
            }
        }
        zzkwVar.zzc = new String(cArr, 0, i16);
        return i14;
    }

    public static int zzg(byte[] bArr, int i10, zzkw zzkwVar) throws zzmr {
        int iZza = zza(bArr, i10, zzkwVar);
        int i11 = zzkwVar.zza;
        if (i11 < 0) {
            throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iZza) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zzkwVar.zzc = zzlh.zzb;
            return iZza;
        }
        zzkwVar.zzc = zzlh.zzh(bArr, iZza, i11);
        return iZza + i11;
    }

    public static int zzh(zznx zznxVar, byte[] bArr, int i10, int i11, zzkw zzkwVar) throws IOException {
        Object objZza = zznxVar.zza();
        int iZzj = zzj(objZza, zznxVar, bArr, i10, i11, zzkwVar);
        zznxVar.zzj(objZza);
        zzkwVar.zzc = objZza;
        return iZzj;
    }

    public static int zzi(zznx zznxVar, byte[] bArr, int i10, int i11, int i12, zzkw zzkwVar) throws IOException {
        Object objZza = zznxVar.zza();
        int iZzk = zzk(objZza, zznxVar, bArr, i10, i11, i12, zzkwVar);
        zznxVar.zzj(objZza);
        zzkwVar.zzc = objZza;
        return iZzk;
    }

    public static int zzj(Object obj, zznx zznxVar, byte[] bArr, int i10, int i11, zzkw zzkwVar) throws IOException {
        int iZzb = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzb = zzb(i12, bArr, iZzb, zzkwVar);
            i12 = zzkwVar.zza;
        }
        int i13 = iZzb;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zzkwVar.zze + 1;
        zzkwVar.zze = i14;
        zzq(i14);
        int i15 = i13 + i12;
        zznxVar.zzi(obj, bArr, i13, i15, zzkwVar);
        zzkwVar.zze--;
        zzkwVar.zzc = obj;
        return i15;
    }

    public static int zzk(Object obj, zznx zznxVar, byte[] bArr, int i10, int i11, int i12, zzkw zzkwVar) throws IOException {
        int i13 = zzkwVar.zze + 1;
        zzkwVar.zze = i13;
        zzq(i13);
        int iZzh = ((zznp) zznxVar).zzh(obj, bArr, i10, i11, i12, zzkwVar);
        zzkwVar.zze--;
        zzkwVar.zzc = obj;
        return iZzh;
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzmo zzmoVar, zzkw zzkwVar) {
        zzmg zzmgVar = (zzmg) zzmoVar;
        int iZza = zza(bArr, i11, zzkwVar);
        zzmgVar.zzh(zzkwVar.zza);
        while (iZza < i12) {
            int iZza2 = zza(bArr, iZza, zzkwVar);
            if (i10 != zzkwVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zzkwVar);
            zzmgVar.zzh(zzkwVar.zza);
        }
        return iZza;
    }

    public static int zzm(byte[] bArr, int i10, zzmo zzmoVar, zzkw zzkwVar) throws IOException {
        zzmg zzmgVar = (zzmg) zzmoVar;
        int iZza = zza(bArr, i10, zzkwVar);
        int i11 = zzkwVar.zza + iZza;
        while (iZza < i11) {
            iZza = zza(bArr, iZza, zzkwVar);
            zzmgVar.zzh(zzkwVar.zza);
        }
        if (iZza == i11) {
            return iZza;
        }
        throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zznx zznxVar, int i10, byte[] bArr, int i11, int i12, zzmo zzmoVar, zzkw zzkwVar) throws IOException {
        int iZzh = zzh(zznxVar, bArr, i11, i12, zzkwVar);
        zzmoVar.add(zzkwVar.zzc);
        while (iZzh < i12) {
            int iZza = zza(bArr, iZzh, zzkwVar);
            if (i10 != zzkwVar.zza) {
                break;
            }
            iZzh = zzh(zznxVar, bArr, iZza, i12, zzkwVar);
            zzmoVar.add(zzkwVar.zzc);
        }
        return iZzh;
    }

    public static int zzo(int i10, byte[] bArr, int i11, int i12, zzoj zzojVar, zzkw zzkwVar) throws zzmr {
        if ((i10 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzc = zzc(bArr, i11, zzkwVar);
            zzojVar.zzk(i10, Long.valueOf(zzkwVar.zzb));
            return iZzc;
        }
        if (i13 == 1) {
            zzojVar.zzk(i10, Long.valueOf(zze(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZza = zza(bArr, i11, zzkwVar);
            int i14 = zzkwVar.zza;
            if (i14 < 0) {
                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iZza) {
                throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                zzojVar.zzk(i10, zzlh.zzb);
            } else {
                zzojVar.zzk(i10, zzlh.zzh(bArr, iZza, i14));
            }
            return iZza + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzmr("Protocol message contained an invalid tag (zero).");
            }
            zzojVar.zzk(i10, Integer.valueOf(zzd(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzoj zzojVarZzb = zzoj.zzb();
        int i16 = zzkwVar.zze + 1;
        zzkwVar.zze = i16;
        zzq(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iZza2 = zza(bArr, i11, zzkwVar);
            int i18 = zzkwVar.zza;
            if (i18 == i15) {
                i17 = i18;
                i11 = iZza2;
                break;
            }
            i11 = zzo(i18, bArr, iZza2, i12, zzojVarZzb, zzkwVar);
            i17 = i18;
        }
        zzkwVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zzmr("Failed to parse the message.");
        }
        zzojVar.zzk(i10, zzojVarZzb);
        return i11;
    }

    public static int zzp(int i10, byte[] bArr, int i11, int i12, zzkw zzkwVar) throws zzmr {
        if ((i10 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzc(bArr, i11, zzkwVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zza(bArr, i11, zzkwVar) + zzkwVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zza(bArr, i11, zzkwVar);
            i15 = zzkwVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zzp(i15, bArr, i11, i12, zzkwVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zzmr("Failed to parse the message.");
        }
        return i11;
    }

    private static void zzq(int i10) throws zzmr {
        if (i10 >= zzb) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
