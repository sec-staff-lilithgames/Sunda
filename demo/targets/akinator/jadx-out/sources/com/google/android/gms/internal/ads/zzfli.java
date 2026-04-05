package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfli implements zzguf {
    final /* synthetic */ zzflm zza;
    final /* synthetic */ zzflc zzb;
    final /* synthetic */ boolean zzc;

    public zzfli(zzflm zzflmVar, zzflc zzflcVar, boolean z10) {
        this.zza = zzflmVar;
        this.zzb = zzflcVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        zzflc zzflcVar = this.zzb;
        if (zzflcVar.zzb()) {
            zzflm zzflmVar = this.zza;
            zzflcVar.zzj(th2);
            zzflcVar.zzd(false);
            zzflmVar.zza(zzflcVar);
            if (this.zzc) {
                zzflmVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zzb(Object obj) {
        zzflc zzflcVar = this.zzb;
        zzflcVar.zzd(true);
        zzflm zzflmVar = this.zza;
        zzflmVar.zza(zzflcVar);
        if (this.zzc) {
            zzflmVar.zzh();
        }
    }
}
