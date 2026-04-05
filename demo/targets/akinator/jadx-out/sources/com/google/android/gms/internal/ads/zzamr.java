package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzamr {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;

    public zzamr(int i10) {
    }

    public final void zza() {
        this.zze = false;
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzb(int i10, int i11) {
        if (this.zze) {
            int i12 = this.zza - i11;
            this.zza = i12;
            if (this.zzb != 0 || i10 != 181) {
                this.zze = false;
                return true;
            }
            this.zzb = i12;
        } else if (i10 == 179) {
            this.zze = true;
        }
        zzc(zzd, 0, 3);
        return false;
    }

    public final void zzc(byte[] bArr, int i10, int i11) {
        if (this.zze) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i13 = this.zza + i12;
            if (length < i13) {
                this.zzc = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.zzc, this.zza, i12);
            this.zza += i12;
        }
    }
}
