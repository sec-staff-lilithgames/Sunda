package com.google.android.gms.internal.gtm;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzyz extends zzzb {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzyz(InputStream inputStream, int i10, zzza zzzaVar) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        byte[] bArr = zzaco.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzJ(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.zze.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzK() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    private final void zzL(int i10) throws IOException {
        if (zzM(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzacq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final boolean zzM(int i10) throws IOException {
        int i11 = this.zzi;
        int i12 = i11 + i10;
        int i13 = this.zzg;
        if (i12 <= i13) {
            throw new IllegalStateException(o2.k(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.zzk;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.zzl) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.zzk + i11;
            this.zzk = i14;
            i13 = this.zzg - i11;
            this.zzg = i13;
            this.zzi = 0;
        }
        try {
            int i15 = this.zze.read(this.zzf, i13, Math.min(4096 - i13, (Integer.MAX_VALUE - i14) - i13));
            if (i15 == 0 || i15 < -1 || i15 > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
            }
            if (i15 <= 0) {
                return false;
            }
            this.zzg += i15;
            zzK();
            if (this.zzg >= i10) {
                return true;
            }
            return zzM(i10);
        } catch (zzacq e10) {
            e10.zza();
            throw e10;
        }
    }

    private final byte[] zzN(int i10, boolean z10) throws IOException {
        byte[] bArrZzO = zzO(i10);
        if (bArrZzO != null) {
            return bArrZzO;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzJ = zzJ(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] zzO(int i10) throws IOException {
        if (i10 == 0) {
            return zzaco.zzb;
        }
        int i11 = this.zzk;
        int i12 = this.zzi;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw new zzacq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.zzl;
        if (i13 > i14) {
            zzB((i14 - i11) - i12);
            throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.zzg - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.zze.available()) {
                    return null;
                }
            } catch (zzacq e10) {
                e10.zza();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i15 < i10) {
            try {
                int i17 = this.zze.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i17;
                i15 += i17;
            } catch (zzacq e11) {
                e11.zza();
                throw e11;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final void zzA(int i10) {
        this.zzl = i10;
        zzK();
    }

    public final void zzB(int i10) throws IOException {
        int i11 = this.zzg;
        int i12 = this.zzi;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzi = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.zzk;
        int i15 = i14 + i12;
        int i16 = this.zzl;
        if (i15 + i10 > i16) {
            zzB((i16 - i14) - i12);
            throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i15;
        this.zzg = 0;
        this.zzi = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                try {
                    long jSkip = this.zze.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (zzacq e10) {
                    e10.zza();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.zzk += i13;
                zzK();
                throw th2;
            }
        }
        this.zzk += i13;
        zzK();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.zzg;
        int i18 = i17 - this.zzi;
        this.zzi = i17;
        zzL(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.zzg;
            if (i19 <= i20) {
                this.zzi = i19;
                return;
            } else {
                i18 += i20;
                this.zzi = i20;
                zzL(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final boolean zzC() throws IOException {
        return this.zzi == this.zzg && !zzM(1);
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final boolean zzE(int i10) throws IOException {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i12 < 10) {
                    if (zza() < 0) {
                        i12++;
                    }
                }
                throw new zzacq("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zzf;
                int i13 = this.zzi;
                this.zzi = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw new zzacq("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            zzB(8);
            return true;
        }
        if (i11 == 2) {
            zzB(zzj());
            return true;
        }
        if (i11 == 3) {
            zzI();
            zzz(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        if (i11 != 5) {
            throw new zzacp("Protocol message tag had invalid wire type.");
        }
        zzB(4);
        return true;
    }

    public final byte zza() throws IOException {
        if (this.zzi == this.zzg) {
            zzL(1);
        }
        byte[] bArr = this.zzf;
        int i10 = this.zzi;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final int zze(int i10) throws zzacq {
        if (i10 < 0) {
            throw new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.zzk + this.zzi + i10;
        if (i11 < 0) {
            throw new zzacq("Failed to parse the message.");
        }
        int i12 = this.zzl;
        if (i11 > i12) {
            throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i11;
        zzK();
        return i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzL(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final int zzj() throws IOException {
        int i10;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zzf;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzi = i13;
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
                this.zzi = i14;
                return i10;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final int zzl() throws IOException {
        return zzzb.zzF(zzj());
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzj = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw new zzacq("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzL(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 2];
        long j12 = bArr[i10 + 3];
        return ((bArr[i10 + 6] & 255) << 48) | (j10 & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 7] & 255) << 56);
    }

    public final long zzr() throws IOException {
        long j10;
        long j11;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzi = i12;
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
                this.zzi = i13;
                return j10;
            }
        }
        return zzs();
    }

    public final long zzs() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & AbstractJsonLexerKt.TC_INVALID) << i10;
            if ((zza() & 128) == 0) {
                return j10;
            }
        }
        throw new zzacq("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final long zzu() throws IOException {
        return zzzb.zzG(zzr());
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final zzyx zzw() throws IOException {
        int iZzj = zzj();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (iZzj <= i10 - i11 && iZzj > 0) {
            zzyx zzyxVarZzj = zzyx.zzj(this.zzf, i11, iZzj);
            this.zzi += iZzj;
            return zzyxVarZzj;
        }
        if (iZzj == 0) {
            return zzyx.zzb;
        }
        if (iZzj < 0) {
            throw new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzO = zzO(iZzj);
        if (bArrZzO != null) {
            return zzyx.zzj(bArrZzO, 0, bArrZzO.length);
        }
        int i12 = this.zzi;
        int i13 = this.zzg;
        int i14 = i13 - i12;
        this.zzk += i13;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzJ = zzJ(iZzj - i14);
        byte[] bArr = new byte[iZzj];
        System.arraycopy(this.zzf, i12, bArr, 0, i14);
        for (byte[] bArr2 : listZzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        return new zzyv(bArr);
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzj <= i10 - i11) {
                String str = new String(this.zzf, i11, iZzj, zzaco.zza);
                this.zzi += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzj > this.zzg) {
            return new String(zzN(iZzj, false), zzaco.zza);
        }
        zzL(iZzj);
        String str2 = new String(this.zzf, this.zzi, iZzj, zzaco.zza);
        this.zzi += iZzj;
        return str2;
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final String zzy() throws IOException {
        byte[] bArrZzN;
        int iZzj = zzj();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (iZzj <= i11 - i10 && iZzj > 0) {
            bArrZzN = this.zzf;
            this.zzi = i10 + iZzj;
        } else {
            if (iZzj == 0) {
                return "";
            }
            if (iZzj < 0) {
                throw new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i10 = 0;
            if (iZzj <= i11) {
                zzL(iZzj);
                bArrZzN = this.zzf;
                this.zzi = iZzj;
            } else {
                bArrZzN = zzN(iZzj, false);
            }
        }
        return zzaew.zzd(bArrZzN, i10, iZzj);
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final void zzz(int i10) throws zzacq {
        if (this.zzj != i10) {
            throw new zzacq("Protocol message end-group tag did not match expected tag.");
        }
    }
}
