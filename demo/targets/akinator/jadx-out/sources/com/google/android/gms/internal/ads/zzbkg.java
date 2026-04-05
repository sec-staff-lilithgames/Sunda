package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbkg extends zzbjl {
    final /* synthetic */ zzbki zza;

    public /* synthetic */ zzbkg(zzbki zzbkiVar, byte[] bArr) {
        Objects.requireNonNull(zzbkiVar);
        this.zza = zzbkiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final void zze(zzbjc zzbjcVar, String str) {
        zzbki zzbkiVar = this.zza;
        if (zzbkiVar.zzd() == null) {
            return;
        }
        zzbkiVar.zzd().zzc(zzbkiVar.zze(zzbjcVar), str);
    }
}
