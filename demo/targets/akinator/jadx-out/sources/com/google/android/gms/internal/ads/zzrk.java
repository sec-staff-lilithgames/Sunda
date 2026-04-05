package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzrk implements zzqe {
    final /* synthetic */ zzrl zza;

    public /* synthetic */ zzrk(zzrl zzrlVar, byte[] bArr) {
        Objects.requireNonNull(zzrlVar);
        this.zza = zzrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zza() {
        zzlm zzlmVarZzaY = this.zza.zzaY();
        if (zzlmVarZzaY != null) {
            zzlmVarZzaY.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzb(Exception exc) {
        zzdt.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaw().zzi(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqe
    public final void zzc(zzqb zzqbVar) {
        this.zza.zzaw().zzl(zzqbVar);
    }
}
