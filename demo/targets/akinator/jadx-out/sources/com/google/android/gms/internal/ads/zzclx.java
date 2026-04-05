package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzclx implements zzedh {
    private final zzckz zza;
    private final zzclw zzb;
    private zzebo zzc;

    public /* synthetic */ zzclx(zzckz zzckzVar, zzclw zzclwVar, byte[] bArr) {
        this.zza = zzckzVar;
        this.zzb = zzclwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    public final zzedi zza() {
        zzifp.zzc(this.zzc, zzebo.class);
        return new zzcly(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    public final /* bridge */ /* synthetic */ zzedh zzb(zzebo zzeboVar) {
        this.zzc = zzeboVar;
        return this;
    }
}
