package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfpm implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfpn zzb;

    public zzfpm(zzfpn zzfpnVar, float f10) {
        this.zza = f10;
        Objects.requireNonNull(zzfpnVar);
        this.zzb = zzfpnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
