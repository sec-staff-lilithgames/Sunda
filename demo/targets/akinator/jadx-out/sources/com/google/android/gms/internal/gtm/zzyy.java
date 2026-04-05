package com.google.android.gms.internal.gtm;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzyy extends zzzb {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    public /* synthetic */ zzyy(byte[] bArr, int i10, int i11, boolean z10, zzza zzzaVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = i11;
        this.zzh = 0;
    }

    private final void zzJ() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = this.zzj;
        if (i10 <= i11) {
            this.zzg = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzg = i12;
        this.zzf = i10 - i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final void zzA(int i10) {
        this.zzj = i10;
        zzJ();
    }

    public final void zzB(int i10) throws IOException {
        if (i10 >= 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (i10 <= i11 - i12) {
                this.zzh = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final boolean zzC() throws IOException {
        return this.zzh == this.zzf;
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
            if (this.zzf - this.zzh < 10) {
                while (i12 < 10) {
                    if (zza() < 0) {
                        i12++;
                    }
                }
                throw new zzacq("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zze;
                int i13 = this.zzh;
                this.zzh = i13 + 1;
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
        int i10 = this.zzh;
        if (i10 == this.zzf) {
            throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 1;
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
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final int zze(int i10) throws zzacq {
        if (i10 < 0) {
            throw new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + this.zzh;
        if (i11 < 0) {
            throw new zzacq("Failed to parse the message.");
        }
        int i12 = this.zzj;
        if (i11 > i12) {
            throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = i11;
        zzJ();
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
        int i10 = this.zzh;
        if (this.zzf - i10 < 4) {
            throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 4;
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final int zzj() throws IOException {
        int i10;
        int i11 = this.zzh;
        int i12 = this.zzf;
        if (i12 != i11) {
            byte[] bArr = this.zze;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzh = i13;
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
                this.zzh = i14;
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
            this.zzi = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzi = iZzj;
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
        int i10 = this.zzh;
        if (this.zzf - i10 < 8) {
            throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 8;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 2];
        long j12 = bArr[i10 + 3];
        return ((bArr[i10 + 6] & 255) << 48) | (j10 & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 7] & 255) << 56);
    }

    public final long zzr() throws IOException {
        long j10;
        long j11;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzh = i12;
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
                this.zzh = i13;
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
        if (iZzj > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzj <= i10 - i11) {
                zzyx zzyxVarZzj = zzyx.zzj(this.zze, i11, iZzj);
                this.zzh += iZzj;
                return zzyxVarZzj;
            }
        }
        if (iZzj == 0) {
            return zzyx.zzb;
        }
        if (iZzj > 0) {
            int i12 = this.zzf;
            int i13 = this.zzh;
            if (iZzj <= i12 - i13) {
                int i14 = iZzj + i13;
                this.zzh = i14;
                return new zzyv(Arrays.copyOfRange(this.zze, i13, i14));
            }
        }
        if (iZzj <= 0) {
            throw new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzj <= i10 - i11) {
                String str = new String(this.zze, i11, iZzj, zzaco.zza);
                this.zzh += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final String zzy() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzj <= i10 - i11) {
                String strZzd = zzaew.zzd(this.zze, i11, iZzj);
                this.zzh += iZzj;
                return strZzd;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw new zzacq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzacq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.gtm.zzzb
    public final void zzz(int i10) throws zzacq {
        if (this.zzi != i10) {
            throw new zzacq("Protocol message end-group tag did not match expected tag.");
        }
    }
}
