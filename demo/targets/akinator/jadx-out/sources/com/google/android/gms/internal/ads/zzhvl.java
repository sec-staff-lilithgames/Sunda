package com.google.android.gms.internal.ads;

import b0.e2;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhvl extends zzhvn {
    private final InputStream zza;
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    public /* synthetic */ zzhvl(InputStream inputStream, int i10, byte[] bArr) {
        super(null);
        this.zzm = Integer.MAX_VALUE;
        byte[] bArr2 = zzhxb.zzb;
        this.zza = inputStream;
        this.zzg = new byte[4096];
        this.zzh = 0;
        this.zzj = 0;
        this.zzl = 0;
    }

    private final void zzN() {
        int i10 = this.zzh + this.zzi;
        this.zzh = i10;
        int i11 = this.zzl + i10;
        int i12 = this.zzm;
        if (i11 <= i12) {
            this.zzi = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzi = i13;
        this.zzh = i10 - i13;
    }

    private final void zzO(int i10) throws IOException {
        if (zzP(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.zzl) - this.zzj) {
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzhxd("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzP(int i10) throws IOException {
        int i11 = this.zzj;
        int i12 = i11 + i10;
        int i13 = this.zzh;
        if (i12 <= i13) {
            throw new IllegalStateException(e2.n(new StringBuilder(String.valueOf(i10).length() + 66), "refillBuffer() called when ", i10, " bytes were already available in buffer"));
        }
        int i14 = this.zzl;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.zzm) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.zzg;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.zzl + i11;
            this.zzl = i14;
            i13 = this.zzh - i11;
            this.zzh = i13;
            this.zzj = 0;
        }
        try {
            int i15 = this.zza.read(this.zzg, i13, Math.min(4096 - i13, (Integer.MAX_VALUE - i14) - i13));
            if (i15 != 0 && i15 >= -1 && i15 <= 4096) {
                if (i15 <= 0) {
                    return false;
                }
                this.zzh += i15;
                zzN();
                return this.zzh >= i10 || zzP(i10);
            }
            String strValueOf = String.valueOf(this.zza.getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + strValueOf.length() + 39 + 41);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(i15);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        } catch (zzhxd e10) {
            e10.zza();
            throw e10;
        }
    }

    private final byte[] zzQ(int i10, boolean z10) throws IOException {
        byte[] bArrZzR = zzR(i10);
        if (bArrZzR != null) {
            return bArrZzR;
        }
        int i11 = this.zzj;
        int i12 = this.zzh;
        int i13 = i12 - i11;
        this.zzl += i12;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> listZzS = zzS(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzg, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] zzR(int i10) throws IOException {
        if (i10 == 0) {
            return zzhxb.zzb;
        }
        int i11 = this.zzl;
        int i12 = this.zzj;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw new zzhxd("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i14 = this.zzm;
        if (i13 > i14) {
            zzE((i14 - i11) - i12);
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.zzh - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.zza.available()) {
                    return null;
                }
            } catch (zzhxd e10) {
                e10.zza();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzg, this.zzj, bArr, 0, i15);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i15 < i10) {
            try {
                int i17 = this.zza.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += i17;
                i15 += i17;
            } catch (zzhxd e11) {
                e11.zza();
                throw e11;
            }
        }
        return bArr;
    }

    private final List zzS(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.zza.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final void zzA(int i10) {
        this.zzm = i10;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final boolean zzB() throws IOException {
        return this.zzj == this.zzh && !zzP(1);
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final int zzC() {
        return this.zzl + this.zzj;
    }

    public final byte zzD() throws IOException {
        if (this.zzj == this.zzh) {
            zzO(1);
        }
        byte[] bArr = this.zzg;
        int i10 = this.zzj;
        this.zzj = i10 + 1;
        return bArr[i10];
    }

    public final void zzE(int i10) throws IOException {
        int i11 = this.zzh;
        int i12 = this.zzj;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzj = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.zzl;
        int i15 = i14 + i12;
        int i16 = this.zzm;
        if (i15 + i10 > i16) {
            zzE((i16 - i14) - i12);
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i15;
        this.zzh = 0;
        this.zzj = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                try {
                    long jSkip = this.zza.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        String strValueOf = String.valueOf(this.zza.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb2.append(strValueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(jSkip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (zzhxd e10) {
                    e10.zza();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.zzl += i13;
                zzN();
                throw th2;
            }
        }
        this.zzl += i13;
        zzN();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.zzh;
        int i18 = i17 - this.zzj;
        this.zzj = i17;
        zzO(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.zzh;
            if (i19 <= i20) {
                this.zzj = i19;
                return;
            } else {
                i18 += i20;
                this.zzj = i20;
                zzO(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzk = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzk = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzhxd("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final void zzb(int i10) throws zzhxd {
        if (this.zzk != i10) {
            throw new zzhxd("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final boolean zzc(int i10) throws IOException {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzh - this.zzj < 10) {
                while (i12 < 10) {
                    if (zzD() < 0) {
                        i12++;
                    }
                }
                throw new zzhxd("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zzg;
                int i13 = this.zzj;
                this.zzj = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw new zzhxd("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            zzE(8);
            return true;
        }
        if (i11 == 2) {
            zzE(zzu());
            return true;
        }
        if (i11 == 3) {
            zzJ();
            zzb(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            zzI();
            return false;
        }
        if (i11 != 5) {
            throw new zzhxc("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final boolean zzk() throws IOException {
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final String zzl() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i10 = this.zzh;
            int i11 = this.zzj;
            if (iZzu <= i10 - i11) {
                String str = new String(this.zzg, i11, iZzu, zzhxb.zza);
                this.zzj += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzu > this.zzh) {
            return new String(zzQ(iZzu, false), zzhxb.zza);
        }
        zzO(iZzu);
        String str2 = new String(this.zzg, this.zzj, iZzu, zzhxb.zza);
        this.zzj += iZzu;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final String zzm() throws IOException {
        byte[] bArrZzQ;
        int iZzu = zzu();
        int i10 = this.zzj;
        int i11 = this.zzh;
        if (iZzu <= i11 - i10 && iZzu > 0) {
            bArrZzQ = this.zzg;
            this.zzj = i10 + iZzu;
        } else {
            if (iZzu == 0) {
                return "";
            }
            if (iZzu < 0) {
                throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i10 = 0;
            if (iZzu <= i11) {
                zzO(iZzu);
                bArrZzQ = this.zzg;
                this.zzj = iZzu;
            } else {
                bArrZzQ = zzQ(iZzu, false);
            }
        }
        return zzhzo.zzf(bArrZzQ, i10, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final zzhvi zzn() throws IOException {
        int iZzu = zzu();
        int i10 = this.zzh;
        int i11 = this.zzj;
        if (iZzu <= i10 - i11 && iZzu > 0) {
            zzhvi zzhviVarZzr = zzhvi.zzr(this.zzg, i11, iZzu);
            this.zzj += iZzu;
            return zzhviVarZzr;
        }
        if (iZzu == 0) {
            return zzhvi.zzb;
        }
        if (iZzu < 0) {
            throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzR = zzR(iZzu);
        if (bArrZzR != null) {
            return zzhvi.zzr(bArrZzR, 0, bArrZzR.length);
        }
        int i12 = this.zzj;
        int i13 = this.zzh;
        int i14 = i13 - i12;
        this.zzl += i13;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> listZzS = zzS(iZzu - i14);
        byte[] bArr = new byte[iZzu];
        System.arraycopy(this.zzg, i12, bArr, 0, i14);
        for (byte[] bArr2 : listZzS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        zzhvi zzhviVar = zzhvi.zzb;
        return new zzhvg(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final int zzs() throws IOException {
        return zzhvn.zzK(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final long zzt() throws IOException {
        return zzhvn.zzL(zzv());
    }

    public final int zzu() throws IOException {
        int i10;
        int i11 = this.zzj;
        int i12 = this.zzh;
        if (i12 != i11) {
            byte[] bArr = this.zzg;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzj = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.zzj = i14;
                return i10;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j10;
        long j11;
        int i10 = this.zzj;
        int i11 = this.zzh;
        if (i11 != i10) {
            byte[] bArr = this.zzg;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzj = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            long j12 = (-2080896) ^ i18;
                            i13 = i17;
                            j10 = j12;
                        } else {
                            i15 = i10 + 5;
                            long j13 = (bArr[i17] << 28) ^ i18;
                            if (j13 >= 0) {
                                j10 = j13 ^ 266354560;
                            } else {
                                i13 = i10 + 6;
                                long j14 = (bArr[i15] << 35) ^ j13;
                                if (j14 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    int i19 = i10 + 7;
                                    long j15 = j14 ^ (bArr[i13] << 42);
                                    if (j15 >= 0) {
                                        j10 = j15 ^ 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j14 = j15 ^ (bArr[i19] << 49);
                                        if (j14 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i19 = i10 + 9;
                                            long j16 = (j14 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                i13 = i10 + 10;
                                                if (bArr[i19] >= 0) {
                                                    j10 = j16;
                                                }
                                            } else {
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    i13 = i19;
                                }
                                j10 = j14 ^ j11;
                            }
                        }
                    }
                    i13 = i15;
                }
                this.zzj = i13;
                return j10;
            }
        }
        return zzw();
    }

    public final long zzw() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & AbstractJsonLexerKt.TC_INVALID) << i10;
            if ((zzD() & 128) == 0) {
                return j10;
            }
        }
        throw new zzhxd("CodedInputStream encountered a malformed varint.");
    }

    public final int zzx() throws IOException {
        int i10 = this.zzj;
        if (this.zzh - i10 < 4) {
            zzO(4);
            i10 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i10 + 4;
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final long zzy() throws IOException {
        int i10 = this.zzj;
        if (this.zzh - i10 < 8) {
            zzO(8);
            i10 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i10 + 8;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 2];
        long j12 = bArr[i10 + 3];
        return ((bArr[i10 + 6] & 255) << 48) | (j10 & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 7] & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final int zzz(int i10) throws zzhxd {
        if (i10 < 0) {
            throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.zzl + this.zzj + i10;
        if (i11 < 0) {
            throw new zzhxd("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzm;
        if (i11 > i12) {
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i11;
        zzN();
        return i12;
    }
}
