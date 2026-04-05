package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzftv extends zzfub {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    public final zzfub zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    public final zzfub zzb(boolean z10) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    public final zzfuc zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzftw(this.zza, false, this.zzc, null, null, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb2.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    public final zzfub zzd(int i10) {
        this.zzc = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    public final zzfub zze(int i10) {
        this.zzd = 1;
        return this;
    }
}
