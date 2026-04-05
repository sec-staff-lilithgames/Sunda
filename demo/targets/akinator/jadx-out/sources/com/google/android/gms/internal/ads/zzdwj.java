package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdwj extends zzdwn {
    private long zza;
    private int zzb;
    private byte zzc;

    @Override // com.google.android.gms.internal.ads.zzdwn
    public final zzdwn zza(long j10) {
        this.zza = j10;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdwn
    public final zzdwn zzb(int i10) {
        this.zzb = i10;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdwn
    public final zzdwo zzc() {
        if (this.zzc == 3) {
            return new zzdwk(this.zza, this.zzb, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb2.append(" id");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
