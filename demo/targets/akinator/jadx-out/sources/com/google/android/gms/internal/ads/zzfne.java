package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfne implements zzguf {
    final /* synthetic */ zzflc zza;
    final /* synthetic */ zzflm zzb;
    final /* synthetic */ zzdbd zzc;
    final /* synthetic */ zzfng zzd;

    public zzfne(zzfng zzfngVar, zzflc zzflcVar, zzflm zzflmVar, zzdbd zzdbdVar) {
        this.zza = zzflcVar;
        this.zzb = zzflmVar;
        this.zzc = zzdbdVar;
        Objects.requireNonNull(zzfngVar);
        this.zzd = zzfngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        zzflc zzflcVar = this.zza;
        if (zzflcVar == null) {
            return;
        }
        zzflcVar.zzd(false);
        zzflm zzflmVar = this.zzb;
        if (zzflmVar != null) {
            zzflmVar.zza(zzflcVar);
            zzflmVar.zzh();
        } else {
            zzfng zzfngVar = this.zzd;
            zzfngVar.zze().zzb(zzflcVar.zzm());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    @Override // com.google.android.gms.internal.ads.zzguf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfne.zzb(java.lang.Object):void");
    }
}
