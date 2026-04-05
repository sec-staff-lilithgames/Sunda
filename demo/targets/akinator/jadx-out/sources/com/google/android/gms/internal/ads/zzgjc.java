package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgjc implements zzguf {
    final /* synthetic */ zzgjb zza;

    public zzgjc(zzgjd zzgjdVar, zzgjb zzgjbVar) {
        this.zza = zzgjbVar;
        Objects.requireNonNull(zzgjdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        zzgjb zzgjbVar = this.zza;
        zzgjbVar.zzb(th2);
        zzgjbVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}
