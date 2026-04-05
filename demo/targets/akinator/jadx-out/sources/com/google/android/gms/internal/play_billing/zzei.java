package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzei extends zzeg implements zzeu {
    @Override // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(Runnable runnable, Executor executor) {
        zzd().zzb(runnable, executor);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg
    public /* bridge */ /* synthetic */ Future zzc() {
        throw null;
    }

    public abstract zzeu zzd();
}
