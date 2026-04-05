package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhvc extends zzhvg {
    private final int zzc;
    private final int zzd;

    public zzhvc(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzhvi.zzA(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzhvg, com.google.android.gms.internal.ads.zzhvi
    public final byte zza(int i10) {
        zzhvi.zzz(i10, this.zzd);
        return ((zzhvg) this).zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhvg, com.google.android.gms.internal.ads.zzhvi
    public final byte zzb(int i10) {
        return ((zzhvg) this).zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzhvg, com.google.android.gms.internal.ads.zzhvi
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhvg
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhvg, com.google.android.gms.internal.ads.zzhvi
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(((zzhvg) this).zza, this.zzc + i10, bArr, i11, i12);
    }
}
