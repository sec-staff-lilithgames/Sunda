package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbut extends zzbjl {
    final /* synthetic */ zzbuv zza;

    public /* synthetic */ zzbut(zzbuv zzbuvVar, byte[] bArr) {
        Objects.requireNonNull(zzbuvVar);
        this.zza = zzbuvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final void zze(zzbjc zzbjcVar, String str) {
        zzbuv zzbuvVar = this.zza;
        if (zzbuvVar.zze() == null) {
            return;
        }
        zzbuvVar.zze().onCustomClick(zzbuvVar.zzc(zzbjcVar), str);
    }
}
