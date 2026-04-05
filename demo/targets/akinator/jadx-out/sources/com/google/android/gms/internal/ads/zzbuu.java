package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbuu extends zzbjo {
    final /* synthetic */ zzbuv zza;

    public /* synthetic */ zzbuu(zzbuv zzbuvVar, byte[] bArr) {
        Objects.requireNonNull(zzbuvVar);
        this.zza = zzbuvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zze(zzbjc zzbjcVar) {
        zzbuv zzbuvVar = this.zza;
        zzbuvVar.zzd().onCustomFormatAdLoaded(zzbuvVar.zzc(zzbjcVar));
    }
}
