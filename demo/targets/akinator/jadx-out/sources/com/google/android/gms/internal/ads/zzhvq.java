package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhvq extends zzhvt {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzhvq(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(i.a(length, i11, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzJ(int i10, int i11) throws IOException {
        zzs((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzK(int i10, int i11) throws IOException {
        zzs(i10 << 3);
        zzr(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzL(int i10, int i11) throws IOException {
        zzs(i10 << 3);
        zzs(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzM(int i10, int i11) throws IOException {
        zzs((i10 << 3) | 5);
        zzt(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzN(int i10, long j10) throws IOException {
        zzs(i10 << 3);
        zzu(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt, com.google.android.gms.internal.ads.zzhuz
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzw(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzh(int i10, long j10) throws IOException {
        zzs((i10 << 3) | 1);
        zzv(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzi(int i10, boolean z10) throws IOException {
        zzs(i10 << 3);
        zzq(z10 ? (byte) 1 : (byte) 0);
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
        int i10 = this.zzc;
        try {
            int i11 = i10 + 1;
            try {
                this.zza[i10] = b10;
                this.zzc = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new zzhvr(i10, this.zzb, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
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
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.zzc;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.zza[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new zzhvr(i12, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new zzhvr(i12, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.zza[i12] = (byte) i10;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzt(int i10) throws IOException {
        int i11 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.zzc = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzhvr(i11, this.zzb, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzu(long j10) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z10 = zzhvt.zzb;
        int i11 = this.zzc;
        if (!z10 || this.zzb - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.zza[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new zzhvr(i11, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.zza[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new zzhvr(i11, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                zzhzj.zzp(this.zza, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            zzhzj.zzp(this.zza, i11, (byte) j10);
        }
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzv(long j10) throws IOException {
        int i10 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.zzc = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzhvr(i10, this.zzb, 8, e10);
        }
    }

    public final void zzw(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.zza, this.zzc, i11);
            this.zzc += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzhvr(this.zzc, this.zzb, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzx(String str) throws IOException {
        int i10 = this.zzc;
        try {
            int iZzA = zzhvt.zzA(str.length() * 3);
            int iZzA2 = zzhvt.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzs(zzhzo.zzc(str));
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = zzhzo.zzd(str, bArr, i11, this.zzb - i11);
                return;
            }
            int i12 = i10 + iZzA2;
            this.zzc = i12;
            int iZzd = zzhzo.zzd(str, this.zza, i12, this.zzb - i12);
            this.zzc = i10;
            zzs((iZzd - i10) - iZzA2);
            this.zzc = iZzd;
        } catch (zzhzn e10) {
            this.zzc = i10;
            zzF(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzhvr(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhvt
    public final void zzy() {
    }
}
