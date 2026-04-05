package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzlk extends zzlm {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzlk(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(i.a(length, i11, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zza(int i10, int i11) throws IOException {
        zzr((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzb(int i10, int i11) throws IOException {
        zzr(i10 << 3);
        zzq(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzc(int i10, int i11) throws IOException {
        zzr(i10 << 3);
        zzr(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzd(int i10, int i11) throws IOException {
        zzr((i10 << 3) | 5);
        zzs(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zze(int i10, long j10) throws IOException {
        zzr(i10 << 3);
        zzt(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzf(int i10, long j10) throws IOException {
        zzr((i10 << 3) | 1);
        zzu(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzg(int i10, boolean z10) throws IOException {
        zzr(i10 << 3);
        zzp(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzh(int i10, String str) throws IOException {
        zzr((i10 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzi(int i10, zzlh zzlhVar) throws IOException {
        zzr((i10 << 3) | 2);
        zzj(zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzj(zzlh zzlhVar) throws IOException {
        zzr(zzlhVar.zzc());
        zzlhVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzk(byte[] bArr, int i10, int i11) throws IOException {
        zzr(i11);
        zzv(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzl(int i10, zznm zznmVar, zznx zznxVar) throws IOException {
        zzr((i10 << 3) | 2);
        zzr(((zzks) zznmVar).zzcd(zznxVar));
        zznxVar.zzf(zznmVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzm(int i10, zznm zznmVar) throws IOException {
        zzr(11);
        zzc(2, i10);
        zzr(26);
        zzo(zznmVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzn(int i10, zzlh zzlhVar) throws IOException {
        zzr(11);
        zzc(2, i10);
        zzi(3, zzlhVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzo(zznm zznmVar) throws IOException {
        zzr(zznmVar.zzcn());
        zznmVar.zzcB(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzp(byte b10) throws IOException {
        int i10 = this.zze;
        try {
            int i11 = i10 + 1;
            try {
                this.zzc[i10] = b10;
                this.zze = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new zzll(i10, this.zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzq(int i10) throws IOException {
        if (i10 >= 0) {
            zzr(i10);
        } else {
            zzt(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzr(int i10) throws IOException {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.zze;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.zzc[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new zzll(i12, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new zzll(i12, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.zzc[i12] = (byte) i10;
        this.zze = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzs(int i10) throws IOException {
        int i11 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.zze = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzll(i11, this.zzd, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzt(long j10) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z10 = zzlm.zzd;
        int i11 = this.zze;
        if (!z10 || this.zzd - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.zzc[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new zzll(i11, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.zzc[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new zzll(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                zzop.zzp(this.zzc, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            zzop.zzp(this.zzc, i11, (byte) j10);
        }
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzu(long j10) throws IOException {
        int i10 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.zze = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzll(i10, this.zzd, 8, e10);
        }
    }

    public final void zzv(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i11);
            this.zze += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzll(this.zze, this.zzd, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzw(byte[] bArr, int i10, int i11) throws IOException {
        zzv(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzx(String str) throws IOException {
        int i10 = this.zze;
        try {
            int iZzz = zzlm.zzz(str.length() * 3);
            int iZzz2 = zzlm.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzr(zzos.zzb(str));
                byte[] bArr = this.zzc;
                int i11 = this.zze;
                this.zze = zzos.zzc(str, bArr, i11, this.zzd - i11);
                return;
            }
            int i12 = i10 + iZzz2;
            this.zze = i12;
            int iZzc = zzos.zzc(str, this.zzc, i12, this.zzd - i12);
            this.zze = i10;
            zzr((iZzc - i10) - iZzz2);
            this.zze = iZzc;
        } catch (zzor e10) {
            this.zze = i10;
            zzF(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzll(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final int zzy() {
        return this.zzd - this.zze;
    }
}
