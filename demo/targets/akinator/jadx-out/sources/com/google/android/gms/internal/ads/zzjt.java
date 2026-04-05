package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzjt implements zzkt {
    private final Object zza;
    private zzbf zzb;

    public zzjt(Object obj, zzup zzupVar) {
        this.zza = obj;
        this.zzb = zzupVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkt
    public final zzbf zzb() {
        return this.zzb;
    }

    public final void zzc(zzbf zzbfVar) {
        this.zzb = zzbfVar;
    }
}
