package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Locale;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzze extends zzzi {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzze(byte[] bArr, int i10, int i11) {
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

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzJ(byte b10) throws IOException {
        int i10 = this.zzc;
        try {
            int i11 = i10 + 1;
            try {
                this.zza[i10] = b10;
                this.zzc = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new zzzf(i10, this.zzb, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzK(int i10, boolean z10) throws IOException {
        zzu(i10 << 3);
        zzJ(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzL(int i10, zzyx zzyxVar) throws IOException {
        zzu((i10 << 3) | 2);
        zzu(zzyxVar.zzd());
        zzyxVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi, com.google.android.gms.internal.gtm.zzyp
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zze(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zza, this.zzc, i11);
            this.zzc += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzzf(this.zzc, this.zzb, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzh(int i10, int i11) throws IOException {
        zzu((i10 << 3) | 5);
        zzi(i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzi(int i10) throws IOException {
        int i11 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.zzc = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzzf(i11, this.zzb, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzj(int i10, long j10) throws IOException {
        zzu((i10 << 3) | 1);
        zzk(j10);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzk(long j10) throws IOException {
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
            throw new zzzf(i10, this.zzb, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzl(int i10, int i11) throws IOException {
        zzu(i10 << 3);
        zzm(i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzm(int i10) throws IOException {
        if (i10 >= 0) {
            zzu(i10);
        } else {
            zzw(i10);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzn(int i10, zzadl zzadlVar, zzadx zzadxVar) throws IOException {
        zzu((i10 << 3) | 2);
        zzu(((zzyh) zzadlVar).zzQ(zzadxVar));
        zzadxVar.zzj(zzadlVar, this.zze);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzo(int i10, zzadl zzadlVar) throws IOException {
        zzu(11);
        zzt(2, i10);
        zzu(26);
        zzu(zzadlVar.zzY());
        zzadlVar.zzax(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzp(int i10, zzyx zzyxVar) throws IOException {
        zzu(11);
        zzt(2, i10);
        zzL(3, zzyxVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzq(int i10, String str) throws IOException {
        zzu((i10 << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) throws IOException {
        int i10 = this.zzc;
        try {
            int iZzC = zzzi.zzC(str.length() * 3);
            int iZzC2 = zzzi.zzC(str.length());
            if (iZzC2 != iZzC) {
                zzu(zzaew.zzc(str));
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = zzaew.zzb(str, bArr, i11, this.zzb - i11);
                return;
            }
            int i12 = i10 + iZzC2;
            this.zzc = i12;
            int iZzb = zzaew.zzb(str, this.zza, i12, this.zzb - i12);
            this.zzc = i10;
            zzu((iZzb - i10) - iZzC2);
            this.zzc = iZzb;
        } catch (zzaev e10) {
            this.zzc = i10;
            zzE(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzzf(e11);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzs(int i10, int i11) throws IOException {
        zzu((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzt(int i10, int i11) throws IOException {
        zzu(i10 << 3);
        zzu(i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzu(int i10) throws IOException {
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
                    throw new zzzf(i12, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new zzzf(i12, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.zza[i12] = (byte) i10;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzv(int i10, long j10) throws IOException {
        zzu(i10 << 3);
        zzw(j10);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzw(long j10) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zzc;
        if (!zzzi.zzb || this.zzb - i11 < 10) {
            int i12 = i11;
            while ((j10 & (-128)) != 0) {
                try {
                    int i13 = i12 + 1;
                    try {
                        this.zza[i12] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i12 = i13;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i12 = i13;
                        throw new zzzf(i12, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i12 + 1;
            try {
                this.zza[i12] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i12 = i10;
                throw new zzzf(i12, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                zzaet.zzn(this.zza, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            zzaet.zzn(this.zza, i11, (byte) j10);
        }
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzI() {
    }
}
