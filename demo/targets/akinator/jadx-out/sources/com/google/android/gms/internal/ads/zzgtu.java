package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgtu extends zzgtv {
    final /* synthetic */ zzgtw zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgtu(zzgtw zzgtwVar, Callable callable, Executor executor) {
        super(zzgtwVar, executor);
        Objects.requireNonNull(zzgtwVar);
        this.zza = zzgtwVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgtv
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    public final String zzc() {
        return this.zzc.toString();
    }
}
