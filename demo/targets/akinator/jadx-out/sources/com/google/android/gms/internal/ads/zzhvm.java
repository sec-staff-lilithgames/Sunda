package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhvm extends zzhvn {
    public static final /* synthetic */ int zza = 0;
    private final ByteBuffer zzg;
    private final long zzh;
    private long zzi;
    private long zzj;
    private final long zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    public /* synthetic */ zzhvm(ByteBuffer byteBuffer, boolean z10, byte[] bArr) {
        super(null);
        this.zzn = Integer.MAX_VALUE;
        this.zzg = byteBuffer.duplicate();
        long jZzs = zzhzj.zzs(byteBuffer);
        this.zzh = jZzs;
        this.zzi = byteBuffer.limit() + jZzs;
        long jPosition = jZzs + byteBuffer.position();
        this.zzj = jPosition;
        this.zzk = jPosition;
    }

    private final void zzN() {
        long j10 = this.zzi + this.zzl;
        this.zzi = j10;
        int i10 = (int) (j10 - this.zzk);
        int i11 = this.zzn;
        if (i10 <= i11) {
            this.zzl = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzl = i12;
        this.zzi = j10 - i12;
    }

    private final int zzO() {
        return (int) (this.zzi - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final void zzA(int i10) {
        this.zzn = i10;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final boolean zzB() throws IOException {
        return this.zzj == this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final int zzC() {
        return (int) (this.zzj - this.zzk);
    }

    public final byte zzD() throws IOException {
        long j10 = this.zzj;
        if (j10 == this.zzi) {
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 1 + j10;
        return zzhzj.zzr(j10);
    }

    public final void zzE(int i10) throws IOException {
        if (i10 >= 0 && i10 <= zzO()) {
            this.zzj += i10;
        } else {
            if (i10 >= 0) {
                throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzm = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzm = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzhxd("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final void zzb(int i10) throws zzhxd {
        if (this.zzm != i10) {
            throw new zzhxd("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final boolean zzc(int i10) throws IOException {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (zzO() < 10) {
                while (i12 < 10) {
                    if (zzD() < 0) {
                        i12++;
                    }
                }
                throw new zzhxd("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                long j10 = this.zzj;
                this.zzj = 1 + j10;
                if (zzhzj.zzr(j10) < 0) {
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
        if (iZzu <= 0 || iZzu > zzO()) {
            if (iZzu == 0) {
                return "";
            }
            if (iZzu < 0) {
                throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzu];
        long j10 = iZzu;
        zzhzj.zzq(this.zzj, bArr, 0L, j10);
        String str = new String(bArr, zzhxb.zza);
        this.zzj += j10;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final String zzm() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0 && iZzu <= zzO()) {
            String strZze = zzhzo.zze(this.zzg, (int) (this.zzj - this.zzh), iZzu);
            this.zzj += iZzu;
            return strZze;
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu <= 0) {
            throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final zzhvi zzn() throws IOException {
        int iZzu = zzu();
        if (iZzu <= 0 || iZzu > zzO()) {
            if (iZzu == 0) {
                return zzhvi.zzb;
            }
            if (iZzu < 0) {
                throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzu];
        long j10 = iZzu;
        zzhzj.zzq(this.zzj, bArr, 0L, j10);
        this.zzj += j10;
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (com.google.android.gms.internal.ads.zzhzj.zzr(r3) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzu() throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.zzj
            long r2 = r9.zzi
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L92
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = com.google.android.gms.internal.ads.zzhzj.zzr(r0)
            if (r4 < 0) goto L16
            r9.zzj = r2
            return r4
        L16:
            long r5 = r9.zzi
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L92
            r5 = 2
            long r5 = r5 + r0
            byte r2 = com.google.android.gms.internal.ads.zzhzj.zzr(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhzj.zzr(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L3e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r5 = r3
            goto L8f
        L3e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhzj.zzr(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhzj.zzr(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhzj.zzr(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhzj.zzr(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhzj.zzr(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = com.google.android.gms.internal.ads.zzhzj.zzr(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = com.google.android.gms.internal.ads.zzhzj.zzr(r3)
            if (r0 < 0) goto L92
        L8b:
            r0 = r2
            goto L8f
        L8d:
            r0 = r2
            goto L3c
        L8f:
            r9.zzj = r5
            return r0
        L92:
            long r0 = r9.zzw()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhvm.zzu():int");
    }

    public final long zzv() throws IOException {
        long j10;
        long j11;
        int i10;
        long j12 = this.zzj;
        if (this.zzi != j12) {
            long j13 = 1 + j12;
            byte bZzr = zzhzj.zzr(j12);
            if (bZzr >= 0) {
                this.zzj = j13;
                return bZzr;
            }
            if (this.zzi - j13 >= 9) {
                long j14 = 2 + j12;
                int iZzr = (zzhzj.zzr(j13) << 7) ^ bZzr;
                if (iZzr >= 0) {
                    long j15 = 3 + j12;
                    int iZzr2 = iZzr ^ (zzhzj.zzr(j14) << 14);
                    if (iZzr2 >= 0) {
                        j10 = iZzr2 ^ 16256;
                    } else {
                        j14 = 4 + j12;
                        int iZzr3 = iZzr2 ^ (zzhzj.zzr(j15) << 21);
                        if (iZzr3 < 0) {
                            i10 = (-2080896) ^ iZzr3;
                        } else {
                            j15 = 5 + j12;
                            long jZzr = (zzhzj.zzr(j14) << 28) ^ iZzr3;
                            if (jZzr < 0) {
                                long j16 = 6 + j12;
                                long jZzr2 = (zzhzj.zzr(j15) << 35) ^ jZzr;
                                if (jZzr2 >= 0) {
                                    j14 = j12 + 7;
                                    long jZzr3 = jZzr2 ^ (zzhzj.zzr(j16) << 42);
                                    if (jZzr3 >= 0) {
                                        j10 = 4363953127296L ^ jZzr3;
                                    } else {
                                        j16 = 8 + j12;
                                        jZzr2 = jZzr3 ^ (zzhzj.zzr(j14) << 49);
                                        if (jZzr2 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            j14 = j12 + 9;
                                            long jZzr4 = (jZzr2 ^ (zzhzj.zzr(j16) << 56)) ^ 71499008037633920L;
                                            if (jZzr4 < 0) {
                                                long j17 = j12 + 10;
                                                if (zzhzj.zzr(j14) >= 0) {
                                                    j14 = j17;
                                                }
                                            }
                                            j10 = jZzr4;
                                        }
                                    }
                                    this.zzj = j14;
                                    return j10;
                                }
                                j11 = -34093383808L;
                                j10 = j11 ^ jZzr2;
                                j14 = j16;
                                this.zzj = j14;
                                return j10;
                            }
                            j10 = 266354560 ^ jZzr;
                        }
                    }
                    j14 = j15;
                    this.zzj = j14;
                    return j10;
                }
                i10 = iZzr ^ (-128);
                j10 = i10;
                this.zzj = j14;
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
        long j10 = this.zzj;
        if (this.zzi - j10 < 4) {
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 4 + j10;
        int iZzr = zzhzj.zzr(j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int iZzr2 = zzhzj.zzr(1 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int iZzr3 = zzhzj.zzr(2 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((zzhzj.zzr(j10 + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (iZzr2 << 8) | iZzr | (iZzr3 << 16);
    }

    public final long zzy() throws IOException {
        long j10 = this.zzj;
        if (this.zzi - j10 < 8) {
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 8 + j10;
        long jZzr = zzhzj.zzr(j10);
        long jZzr2 = zzhzj.zzr(1 + j10);
        long jZzr3 = zzhzj.zzr(2 + j10);
        long jZzr4 = zzhzj.zzr(3 + j10);
        long jZzr5 = zzhzj.zzr(4 + j10);
        return ((zzhzj.zzr(j10 + 7) & 255) << 56) | (jZzr & 255) | ((jZzr2 & 255) << 8) | ((jZzr3 & 255) << 16) | ((jZzr4 & 255) << 24) | ((jZzr5 & 255) << 32) | ((zzhzj.zzr(5 + j10) & 255) << 40) | ((zzhzj.zzr(6 + j10) & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzhvn
    public final int zzz(int i10) throws zzhxd {
        if (i10 < 0) {
            throw new zzhxd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzC = i10 + zzC();
        int i11 = this.zzn;
        if (iZzC > i11) {
            throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzn = iZzC;
        zzN();
        return i11;
    }
}
