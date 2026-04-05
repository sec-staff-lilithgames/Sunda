package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfnx implements zzbbo {
    final /* synthetic */ zzfnz zza;

    public zzfnx(zzfnz zzfnzVar) {
        Objects.requireNonNull(zzfnzVar);
        this.zza = zzfnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbo
    public final void zza(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzy)).booleanValue()) {
            this.zza.zzj(z10);
        }
    }
}
