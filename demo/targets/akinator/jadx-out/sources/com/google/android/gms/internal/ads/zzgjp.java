package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgjp extends zzgkq {
    private int zza;
    private String zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final zzgkq zza(int i10) {
        this.zza = i10;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final zzgkq zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final zzgkq zzc(int i10) {
        this.zzc = i10;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final zzgkr zzd() {
        if (this.zzd == 3) {
            return new zzgjq(this.zza, this.zzb, this.zzc, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb2.append(" statusCode");
        }
        if ((this.zzd & 2) == 0) {
            sb2.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
