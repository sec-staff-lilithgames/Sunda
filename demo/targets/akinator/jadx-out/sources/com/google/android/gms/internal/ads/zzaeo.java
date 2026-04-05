package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaeo {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzaeo(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final boolean zza() {
        int i10 = (this.zza[this.zzc] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.zzd;
        zzc(1);
        return 1 == (i10 & 1);
    }

    public final int zzb(int i10) {
        int i11 = this.zzc;
        int i12 = 8 - this.zzd;
        int i13 = i11 + 1;
        byte[] bArr = this.zza;
        int iMin = Math.min(i10, i12);
        int i14 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.zzd) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i14 |= (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << iMin;
            iMin += 8;
            i13++;
        }
        int i15 = i14 & ((-1) >>> (32 - i10));
        zzc(i10);
        return i15;
    }

    public final void zzc(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.zzc + i12;
        this.zzc = i13;
        int i14 = (i10 - (i12 * 8)) + this.zzd;
        this.zzd = i14;
        if (i14 > 7) {
            i13++;
            this.zzc = i13;
            i14 -= 8;
            this.zzd = i14;
        }
        boolean z10 = false;
        if (i13 >= 0 && (i13 < (i11 = this.zzb) || (i13 == i11 && i14 == 0))) {
            z10 = true;
        }
        zzgmd.zzh(z10);
    }

    public final int zzd() {
        return (this.zzc * 8) + this.zzd;
    }
}
