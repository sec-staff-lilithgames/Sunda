package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzrn extends zzch {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zzrn() {
        byte[] bArr = zzep.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final void zzs(boolean z10) {
        int i10;
        int length;
        int i11 = this.zzk;
        int length2 = this.zzi.length;
        if (i11 != length2) {
            if (!z10) {
                return;
            } else {
                z10 = true;
            }
        }
        if (this.zzh == 0) {
            if (z10) {
                zzu(i11, 3);
                length = i11;
            } else {
                zzgmd.zzh(i11 >= (length2 >> 1));
                length = this.zzi.length >> 1;
                zzu(length, 0);
            }
            i10 = length;
        } else {
            int i12 = length2 >> 1;
            int i13 = i11 - i12;
            if (z10) {
                int iZzt = zzt(i13) + (this.zzi.length >> 1);
                zzu(iZzt, 2);
                int i14 = i12 + i13;
                i10 = iZzt;
                length = i14;
            } else {
                int iZzt2 = zzt(i13);
                zzu(iZzt2, 1);
                i10 = iZzt2;
                length = i13;
            }
        }
        if (length % this.zzd != 0) {
            throw new IllegalStateException(zzgmu.zzd("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        zzgmd.zzh(i11 >= i10);
        this.zzk -= length;
        int i15 = this.zzj + length;
        this.zzj = i15;
        this.zzj = i15 % this.zzi.length;
        this.zzh = (i10 / this.zzd) + this.zzh;
        this.zzg += (length - i10) / r2;
    }

    private final int zzt(int i10) {
        int iZzw = ((zzw(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzgmd.zzh(iZzw >= 0);
        int iMin = (int) Math.min((i10 * 0.2f) + 0.5f, iZzw);
        int i11 = this.zzd;
        return (iMin / i11) * i11;
    }

    private final void zzu(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            return;
        }
        zzgmd.zza(this.zzk >= i10);
        if (i11 == 2) {
            int i13 = this.zzj;
            int i14 = this.zzk;
            int i15 = i13 + i14;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i15 <= length) {
                System.arraycopy(bArr, i15 - i10, this.zzl, 0, i10);
            } else {
                int i16 = i14 - (length - i13);
                if (i16 >= i10) {
                    System.arraycopy(bArr, i16 - i10, this.zzl, 0, i10);
                } else {
                    int i17 = i10 - i16;
                    System.arraycopy(bArr, length - i17, this.zzl, 0, i17);
                    System.arraycopy(this.zzi, 0, this.zzl, i17, i16);
                }
            }
        } else {
            int i18 = this.zzj;
            int i19 = i18 + i10;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i19 <= length2) {
                System.arraycopy(bArr2, i18, this.zzl, 0, i10);
            } else {
                int i20 = length2 - i18;
                System.arraycopy(bArr2, i18, this.zzl, 0, i20);
                System.arraycopy(this.zzi, 0, this.zzl, i20, i10 - i20);
            }
        }
        zzgmd.zzd(i10 % this.zzd == 0, "sizeToOutput is not aligned to frame size: %s", i10);
        zzgmd.zzh(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzgmd.zzd(i10 % this.zzd == 0, "byteOutput size is not aligned to frame size %s", i10);
        if (i11 != 3) {
            for (int i21 = 0; i21 < i10; i21 += 2) {
                int i22 = i21 + 1;
                int iZzv = zzv(bArr3[i22], bArr3[i21]);
                if (i11 == 0) {
                    i12 = ((((i21 * 1000) / (i10 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i12 = 10;
                    if (i11 == 2) {
                        i12 = 10 + (((90000 * i21) / (i10 - 1)) / 1000);
                    }
                }
                int i23 = (iZzv * i12) / 100;
                if (i23 >= 32767) {
                    bArr3[i21] = -1;
                    bArr3[i22] = AbstractJsonLexerKt.TC_INVALID;
                } else if (i23 <= -32768) {
                    bArr3[i21] = 0;
                    bArr3[i22] = -128;
                } else {
                    bArr3[i21] = (byte) (i23 & 255);
                    bArr3[i22] = (byte) (i23 >> 8);
                }
            }
        }
        zzk(i10).put(bArr3, 0, i10).flip();
    }

    private static int zzv(byte b10, byte b11) {
        return (b10 << 8) | (b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    private final int zzw(long j10) {
        return (int) ((j10 * this.zzb.zzb) / 1000000);
    }

    private static final boolean zzx(byte b10, byte b11) {
        return Math.abs(zzv(b10, b11)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzch, com.google.android.gms.internal.ads.zzcg
    public final boolean zzc() {
        return super.zzc() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzd(ByteBuffer byteBuffer) {
        int iLimit;
        int i10;
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzl()) {
            if (this.zzf != 0) {
                zzgmd.zzh(this.zzj < this.zzi.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i11 = this.zzd;
                            iLimit = (iPosition2 / i11) * i11;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i12 = this.zzj;
                int i13 = this.zzk;
                int i14 = i12 + i13;
                int length = this.zzi.length;
                if (i14 < length) {
                    i10 = length - i14;
                } else {
                    i14 = i13 - (length - i12);
                    i10 = i12 - i14;
                }
                int iMin = Math.min(iPosition3, i10);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.zzi, i14, iMin);
                int i15 = this.zzk + iMin;
                this.zzk = i15;
                zzgmd.zzh(i15 <= this.zzi.length);
                boolean z10 = iLimit < iLimit2 && iPosition3 < i10;
                zzs(z10);
                if (z10) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.zzi.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i16 = this.zzd;
                            iPosition = a.b.A(iLimit4, i16, i16, i16);
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    zzk(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzcd zzm(zzcd zzcdVar) throws zzcf {
        if (zzcdVar.zzd == 2) {
            return zzcdVar.zzb == -1 ? zzcd.zza : zzcdVar;
        }
        throw new zzcf("Unhandled input format:", zzcdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzn() {
        if (this.zzk > 0) {
            zzs(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzo() {
        if (zzc()) {
            int i10 = this.zzb.zzc;
            this.zzd = i10 + i10;
            int iZzw = zzw(100000L) / 2;
            int i11 = this.zzd;
            int i12 = (iZzw / i11) * i11;
            int i13 = i12 + i12;
            if (this.zzi.length != i13) {
                this.zzi = new byte[i13];
                this.zzl = new byte[i13];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzp() {
        this.zze = false;
        byte[] bArr = zzep.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final void zzq(boolean z10) {
        this.zze = z10;
    }

    public final long zzr() {
        return this.zzg;
    }
}
