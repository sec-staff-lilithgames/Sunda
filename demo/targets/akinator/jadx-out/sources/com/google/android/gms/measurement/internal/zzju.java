package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzju extends zzay {
    final /* synthetic */ zzlj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzju(zzlj zzljVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        final zzlj zzljVarZzj = this.zza.zzu.zzj();
        Objects.requireNonNull(zzljVarZzj);
        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IllegalStateException {
                zzljVarZzj.zzw();
            }
        }).start();
    }
}
