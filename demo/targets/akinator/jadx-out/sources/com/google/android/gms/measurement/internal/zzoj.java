package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzoj extends zzay {
    final /* synthetic */ zzok zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzoj(zzok zzokVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zzokVar);
        this.zza = zzokVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        zzok zzokVar = this.zza;
        zzokVar.zzd();
        zzokVar.zzu.zzaV().zzk().zza("Starting upload from DelayedRunnable");
        zzokVar.zzg.zzM();
    }
}
