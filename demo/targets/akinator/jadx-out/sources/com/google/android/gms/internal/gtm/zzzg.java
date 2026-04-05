package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzzg extends zzzd {
    private final OutputStream zzg;

    public zzzg(OutputStream outputStream, int i10) {
        super(i10);
        this.zzg = outputStream;
    }

    private final void zzG() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzH(int i10) throws IOException {
        if (this.zzb - this.zzc < i10) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzI() throws IOException {
        if (this.zzc > 0) {
            zzG();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzJ(byte b10) throws IOException {
        if (this.zzc == this.zzb) {
            zzG();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzK(int i10, boolean z10) throws IOException {
        zzH(11);
        zzf(i10 << 3);
        zzc(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzL(int i10, zzyx zzyxVar) throws IOException {
        zzu((i10 << 3) | 2);
        zzu(zzyxVar.zzd());
        zzyxVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi, com.google.android.gms.internal.gtm.zzyp
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzr(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzh(int i10, int i11) throws IOException {
        zzH(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzi(int i10) throws IOException {
        zzH(4);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzj(int i10, long j10) throws IOException {
        zzH(18);
        zzf((i10 << 3) | 1);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzk(long j10) throws IOException {
        zzH(8);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzl(int i10, int i11) throws IOException {
        zzH(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg(i11);
        }
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
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, 0, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        System.arraycopy(bArr, 0, this.zza, i13, i14);
        this.zzc = this.zzb;
        this.zzd += i14;
        zzG();
        int i15 = i11 - i14;
        if (i15 <= this.zzb) {
            System.arraycopy(bArr, i14, this.zza, 0, i15);
            this.zzc = i15;
        } else {
            this.zzg.write(bArr, i14, i15);
        }
        this.zzd += i15;
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzs(int i10, int i11) throws IOException {
        zzu((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzt(int i10, int i11) throws IOException {
        zzH(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzu(int i10) throws IOException {
        zzH(5);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzv(int i10, long j10) throws IOException {
        zzH(20);
        zzf(i10 << 3);
        zzg(j10);
    }

    @Override // com.google.android.gms.internal.gtm.zzzi
    public final void zzw(long j10) throws IOException {
        zzH(10);
        zzg(j10);
    }

    public final void zzx(String str) throws IOException {
        int iZzc;
        try {
            int length = str.length() * 3;
            int iZzC = zzzi.zzC(length);
            int i10 = iZzC + length;
            int i11 = this.zzb;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iZzb = zzaew.zzb(str, bArr, 0, length);
                zzu(iZzb);
                zzr(bArr, 0, iZzb);
                return;
            }
            if (i10 > i11 - this.zzc) {
                zzG();
            }
            int iZzC2 = zzzi.zzC(str.length());
            int i12 = this.zzc;
            try {
                if (iZzC2 == iZzC) {
                    int i13 = i12 + iZzC2;
                    this.zzc = i13;
                    int iZzb2 = zzaew.zzb(str, this.zza, i13, this.zzb - i13);
                    this.zzc = i12;
                    iZzc = (iZzb2 - i12) - iZzC2;
                    zzf(iZzc);
                    this.zzc = iZzb2;
                } else {
                    iZzc = zzaew.zzc(str);
                    zzf(iZzc);
                    this.zzc = zzaew.zzb(str, this.zza, this.zzc, iZzc);
                }
                this.zzd += iZzc;
            } catch (zzaev e10) {
                this.zzd -= this.zzc - i12;
                this.zzc = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzzf(e11);
            }
        } catch (zzaev e12) {
            zzE(str, e12);
        }
    }
}
