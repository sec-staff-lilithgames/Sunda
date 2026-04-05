package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbdj extends zzcca {
    final /* synthetic */ zzbdp zza;

    public zzbdj(zzbdp zzbdpVar) {
        Objects.requireNonNull(zzbdpVar);
        this.zza = zzbdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcca, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        this.zza.zzb();
        return super.cancel(z10);
    }
}
