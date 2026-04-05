package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhvs extends zzhvp {
    private final OutputStream zzg;

    public zzhvs(OutputStream outputStream, int i10) {
        super(i10);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzH(int i10) throws IOException {
        if (this.zzb - this.zzc < i10) {
            zzI();
        }
    }

    private final void zzI() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzJ(int i10, int i11) throws IOException {
        zzs((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzK(int i10, int i11) throws IOException {
        zzH(20);
        zzd(i10 << 3);
        if (i11 >= 0) {
            zzd(i11);
        } else {
            zze(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzL(int i10, int i11) throws IOException {
        zzH(20);
        zzd(i10 << 3);
        zzd(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzM(int i10, int i11) throws IOException {
        zzH(14);
        zzd((i10 << 3) | 5);
        zzf(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzN(int i10, long j10) throws IOException {
        zzH(20);
        zzd(i10 << 3);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt, com.google.android.gms.internal.ads.zzhuz
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzw(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzh(int i10, long j10) throws IOException {
        zzH(18);
        zzd((i10 << 3) | 1);
        zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzi(int i10, boolean z10) throws IOException {
        zzH(11);
        zzd(i10 << 3);
        zzc(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzj(int i10, String str) throws IOException {
        zzs((i10 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzk(int i10, zzhvi zzhviVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzl(zzhviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzl(zzhvi zzhviVar) throws IOException {
        zzs(zzhviVar.zzc());
        zzhviVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzm(byte[] bArr, int i10, int i11) throws IOException {
        zzs(i11);
        zzw(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzn(int i10, zzhxz zzhxzVar) throws IOException {
        zzs(11);
        zzL(2, i10);
        zzs(26);
        zzp(zzhxzVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzo(int i10, zzhvi zzhviVar) throws IOException {
        zzs(11);
        zzL(2, i10);
        zzk(3, zzhviVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzp(zzhxz zzhxzVar) throws IOException {
        zzs(zzhxzVar.zzbr());
        zzhxzVar.zzdc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzq(byte b10) throws IOException {
        if (this.zzc == this.zzb) {
            zzI();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzr(int i10) throws IOException {
        if (i10 >= 0) {
            zzs(i10);
        } else {
            zzu(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzs(int i10) throws IOException {
        zzH(5);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzt(int i10) throws IOException {
        zzH(4);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzu(long j10) throws IOException {
        zzH(10);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzv(long j10) throws IOException {
        zzH(8);
        zzg(j10);
    }

    public final void zzw(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, i10, bArr2, i13, i14);
        int i15 = i10 + i14;
        this.zzc = i12;
        this.zzd += i14;
        zzI();
        int i16 = i11 - i14;
        if (i16 <= i12) {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.zzc = i16;
        } else {
            this.zzg.write(bArr, i15, i16);
        }
        this.zzd += i16;
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzx(String str) throws IOException {
        int iZzc;
        try {
            int length = str.length() * 3;
            int iZzA = zzhvt.zzA(length);
            int i10 = iZzA + length;
            int i11 = this.zzb;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iZzd = zzhzo.zzd(str, bArr, 0, length);
                zzs(iZzd);
                zzw(bArr, 0, iZzd);
                return;
            }
            if (i10 > i11 - this.zzc) {
                zzI();
            }
            int iZzA2 = zzhvt.zzA(str.length());
            int i12 = this.zzc;
            try {
                if (iZzA2 == iZzA) {
                    int i13 = i12 + iZzA2;
                    this.zzc = i13;
                    int iZzd2 = zzhzo.zzd(str, this.zza, i13, i11 - i13);
                    this.zzc = i12;
                    iZzc = (iZzd2 - i12) - iZzA2;
                    zzd(iZzc);
                    this.zzc = iZzd2;
                } else {
                    iZzc = zzhzo.zzc(str);
                    zzd(iZzc);
                    this.zzc = zzhzo.zzd(str, this.zza, this.zzc, iZzc);
                }
                this.zzd += iZzc;
            } catch (zzhzn e10) {
                this.zzd -= this.zzc - i12;
                this.zzc = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzhvr(e11);
            }
        } catch (zzhzn e12) {
            zzF(str, e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzy() throws IOException {
        if (this.zzc > 0) {
            zzI();
        }
    }
}
