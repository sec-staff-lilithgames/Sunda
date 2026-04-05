package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgo extends zzgr {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzgo(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(i.a(length, i11, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzb(byte b10) throws IOException {
        int i10 = this.zzd;
        try {
            int i11 = i10 + 1;
            try {
                this.zzb[i10] = b10;
                this.zzd = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new zzgp(i10, this.zzc, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i11);
            this.zzd += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgp(this.zzd, this.zzc, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzd(int i10, boolean z10) throws IOException {
        zzt(i10 << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zze(int i10, zzgk zzgkVar) throws IOException {
        zzt((i10 << 3) | 2);
        zzt(zzgkVar.zzd());
        zzgkVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzf(int i10, int i11) throws IOException {
        zzt((i10 << 3) | 5);
        zzg(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzg(int i10) throws IOException {
        int i11 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
            this.zzd = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgp(i11, this.zzc, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzh(int i10, long j10) throws IOException {
        zzt((i10 << 3) | 1);
        zzi(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzi(long j10) throws IOException {
        int i10 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
            this.zzd = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgp(i10, this.zzc, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzj(int i10, int i11) throws IOException {
        zzt(i10 << 3);
        zzk(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzk(int i10) throws IOException {
        if (i10 >= 0) {
            zzt(i10);
        } else {
            zzv(i10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzl(byte[] bArr, int i10, int i11) throws IOException {
        zzc(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzm(int i10, zzim zzimVar, zzix zzixVar) throws IOException {
        zzt((i10 << 3) | 2);
        zzt(((zzfv) zzimVar).zze(zzixVar));
        zzixVar.zzi(zzimVar, this.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzn(int i10, zzim zzimVar) throws IOException {
        zzt(11);
        zzs(2, i10);
        zzt(26);
        zzt(zzimVar.zzk());
        zzimVar.zzJ(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzo(int i10, zzgk zzgkVar) throws IOException {
        zzt(11);
        zzs(2, i10);
        zze(3, zzgkVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzp(int i10, String str) throws IOException {
        zzt((i10 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws IOException {
        int i10 = this.zzd;
        try {
            int iZzz = zzgr.zzz(str.length() * 3);
            int iZzz2 = zzgr.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzt(zzjt.zzc(str));
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                this.zzd = zzjt.zzb(str, bArr, i11, this.zzc - i11);
                return;
            }
            int i12 = i10 + iZzz2;
            this.zzd = i12;
            int iZzb = zzjt.zzb(str, this.zzb, i12, this.zzc - i12);
            this.zzd = i10;
            zzt((iZzb - i10) - iZzz2);
            this.zzd = iZzb;
        } catch (zzjs e10) {
            this.zzd = i10;
            zzC(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgp(e11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzr(int i10, int i11) throws IOException {
        zzt((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzs(int i10, int i11) throws IOException {
        zzt(i10 << 3);
        zzt(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzt(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzgp(this.zzd, this.zzc, 1, e10);
            }
        }
        byte[] bArr2 = this.zzb;
        int i12 = this.zzd;
        this.zzd = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzu(int i10, long j10) throws IOException {
        zzt(i10 << 3);
        zzv(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgr
    public final void zzv(long j10) throws IOException {
        if (!zzgr.zzc || this.zzc - this.zzd < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzgp(this.zzd, this.zzc, 1, e10);
                }
            }
            byte[] bArr2 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i13 = this.zzd;
                this.zzd = i13 + 1;
                zzjq.zzn(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i14 = this.zzd;
            this.zzd = i14 + 1;
            zzjq.zzn(bArr4, i14, (byte) ((i12 | 128) & 255));
            j10 >>>= 7;
        }
    }
}
