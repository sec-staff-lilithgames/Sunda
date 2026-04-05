package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgjr extends zzgkt {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzgkt
    public final zzgkt zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgkt
    public final zzgkt zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgkt
    public final zzgku zzc() {
        return new zzgjs(this.zza, this.zzb, null);
    }
}
